package zkm;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tkm.e f323119a;

    static {
        String property;
        int i = v.f323125a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it8 = nkm.y.J(nkm.t.c(Arrays.asList(new tkm.a()).iterator())).iterator();
            if (it8.hasNext()) {
                next = it8.next();
                if (it8.hasNext()) {
                    ((tkm.a) next).getClass();
                    do {
                        ((tkm.a) it8.next()).getClass();
                    } while (it8.hasNext());
                }
            }
            if (((tkm.a) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f323119a = new tkm.e(tkm.f.b(mainLooper));
        } catch (Throwable th10) {
            throw new ServiceConfigurationError(th10.getMessage(), th10);
        }
    }
}
