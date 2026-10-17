package oh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f225271l;

    public b(d provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f225271l = provider;
    }

    public final boolean Z2(Throwable throwable, Function0 onFinish) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        z zVarA = this.f225271l.a(throwable);
        if (zVarA == null) {
            return false;
        }
        n.j2(this, L2(new y0(null, zVarA, false, 5)), null, new o4a.b(this, onFinish, null, 6), 3);
        return true;
    }
}
