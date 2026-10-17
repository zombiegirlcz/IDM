package zkm;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f323101a;

    static {
        try {
            f323101a = nkm.y.J(nkm.t.c(Arrays.asList(new tkm.b()).iterator()));
        } catch (Throwable th10) {
            throw new ServiceConfigurationError(th10.getMessage(), th10);
        }
    }
}
