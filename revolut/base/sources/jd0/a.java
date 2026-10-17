package jd0;

import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static final nd0.a a(String str) {
        Locale locale = Locale.ROOT;
        String strR = p.a.r(locale, "ROOT", str, locale, "toLowerCase(...)");
        int iHashCode = strR.hashCode();
        if (iHashCode != -1422950650) {
            if (iHashCode != -1219769254) {
                if (iHashCode == -341328904 && strR.equals("resolved")) {
                    return nd0.a.RESOLVED;
                }
            } else if (strR.equals("subscribed")) {
                return nd0.a.SUBSCRIBED;
            }
        } else if (strR.equals("active")) {
            return nd0.a.ACTIVE;
        }
        return nd0.a.UNKNOWN;
    }
}
