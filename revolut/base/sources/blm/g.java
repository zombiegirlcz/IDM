package blm;

import java.util.Arrays;
import java.util.ServiceConfigurationError;
import nkm.t;
import nkm.y;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f16753a;

    static {
        try {
            f16753a = (c[]) y.J(t.c(Arrays.asList(new c[0]).iterator())).toArray(new c[0]);
        } catch (Throwable th10) {
            throw new ServiceConfigurationError(th10.getMessage(), th10);
        }
    }

    public static final f a(Publisher publisher) {
        return new f(publisher, kotlin.coroutines.g.f186406a, -2, ukm.f.SUSPEND);
    }
}
