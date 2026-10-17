package ke;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f182929a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f182930b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f182931c;

    public e(int i) {
        this.f182931c = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strA = a(this.f182931c, str);
        if (this.f182929a.size() >= this.f182930b && !this.f182929a.containsKey(strA)) {
            String str3 = "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f182930b;
            return false;
        }
        String strA2 = a(this.f182931c, str2);
        String str4 = (String) this.f182929a.get(strA);
        if (str4 == null ? strA2 == null : str4.equals(strA2)) {
            return false;
        }
        HashMap map = this.f182929a;
        if (str2 == null) {
            strA2 = "";
        }
        map.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f182931c, str);
                if (this.f182929a.size() < this.f182930b || this.f182929a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f182929a.put(strA, str2 == null ? "" : a(this.f182931c, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                String str3 = "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f182930b;
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
