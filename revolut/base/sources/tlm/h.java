package tlm;

import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f272133a = new d(r0.g(), r0.g(), r0.g(), r0.g(), r0.g(), false);

    public static final d a(e module, d module2) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(module2, "other");
        f fVar = new f();
        Intrinsics.checkNotNullParameter(module, "module");
        module.a(fVar);
        Intrinsics.checkNotNullParameter(module2, "module");
        module2.a(fVar);
        return fVar.a();
    }
}
