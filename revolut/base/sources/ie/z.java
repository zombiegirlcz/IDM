package ie;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f160582g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f160583h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cfm.c f160584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f160585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160586c;
    public final df.e d;
    public final u e;
    public c f;

    public z(Context context, String str, df.e eVar, u uVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f160585b = context;
        this.f160586c = str;
        this.d = eVar;
        this.e = uVar;
        this.f160584a = new cfm.c(1);
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f160582g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final y b(boolean z) {
        String str;
        je.d.c();
        df.e eVar = this.d;
        String str2 = null;
        if (z) {
            try {
                str = ((df.a) Tasks.await(((df.d) eVar).d(), 10000L, TimeUnit.MILLISECONDS)).f113718a;
            } catch (Exception e) {
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((df.d) eVar).c(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
        }
        return new y(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f;
        if (cVar != null && (cVar.f160513b != null || !this.e.a())) {
            return this.f;
        }
        fe.c cVar2 = fe.c.f134428a;
        cVar2.e("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f160585b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar2.e("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            y yVarB = b(false);
            cVar2.e("Fetched Firebase Installation ID: " + yVarB.f160580a);
            if (yVarB.f160580a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                yVarB = new y(str, null);
            }
            if (Objects.equals(yVarB.f160580a, string)) {
                this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), yVarB.f160580a, yVarB.f160581b);
            } else {
                this.f = new c(a(sharedPreferences, yVarB.f160580a), yVarB.f160580a, yVarB.f160581b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        cVar2.e("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        cfm.c cVar = this.f160584a;
        Context context = this.f160585b;
        synchronized (cVar) {
            try {
                if (cVar.f23762b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    cVar.f23762b = installerPackageName;
                }
                str = "".equals(cVar.f23762b) ? null : cVar.f23762b;
            } finally {
            }
        }
        return str;
    }
}
