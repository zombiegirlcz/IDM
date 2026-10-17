package af;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3816a;

    public j(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3816a = sharedPreferences;
        File file = new File(ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String str = "Error creating file in no backup dir: " + e.getMessage();
            }
        }
    }

    public synchronized void a() {
        try {
            long j2 = this.f3816a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f3816a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f3816a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f3816a.edit().putStringSet(key, hashSet).putLong("fire-count", j2 - 1).commit();
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = this.f3816a.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f3816a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strD = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strD)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strD);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f3816a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(a.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f3816a.edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th10) {
            throw th10;
        }
        return arrayList;
    }

    public synchronized String d(long j2) {
        return new Date(j2).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f3816a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it8 = ((Set) entry.getValue()).iterator();
                while (it8.hasNext()) {
                    if (str.equals((String) it8.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public synchronized void f(String str) {
        try {
            String strE = e(str);
            if (strE == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f3816a.getStringSet(strE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f3816a.edit().remove(strE).commit();
            } else {
                this.f3816a.edit().putStringSet(strE, hashSet).commit();
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public synchronized boolean g(long j2) {
        if (!this.f3816a.contains("fire-global")) {
            this.f3816a.edit().putLong("fire-global", j2).commit();
            return true;
        }
        long j3 = this.f3816a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j3).equals(d(j2))) {
                return false;
            }
            this.f3816a.edit().putLong("fire-global", j2).commit();
            return true;
        }
    }

    public synchronized void h(long j2, String str) {
        String strD = d(j2);
        if (this.f3816a.getString("last-used-date", "").equals(strD)) {
            String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            i(str, strD);
            return;
        }
        long j3 = this.f3816a.getLong("fire-count", 0L);
        if (j3 + 1 == 30) {
            a();
            j3 = this.f3816a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f3816a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f3816a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", strD).commit();
    }

    public synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f3816a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f3816a.edit().putStringSet(str, hashSet).commit();
    }

    public j(Context context, String str) {
        this.f3816a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }
}
