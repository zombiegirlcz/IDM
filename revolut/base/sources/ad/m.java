package ad;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes17.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f3202a = new CopyOnWriteArrayList();

    public static gd.c a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (gd.c cVar : f3202a) {
            synchronized (cVar) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(j6.a.q("No KMS client does support: ", str));
    }
}
