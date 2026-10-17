package dcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class w0 {
    public abstract void a();

    public abstract ocl.a b();

    public abstract void c(ocl.a aVar);

    public void d(ocl.a settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        a();
        c(settings);
    }
}
