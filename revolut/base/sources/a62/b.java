package a62;

import a26.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f1533l;

    public b(d provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f1533l = provider;
    }

    public final boolean Z2(Throwable throwable, Function0 onFinish) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        z zVarA = this.f1533l.a(throwable);
        if (zVarA == null) {
            return false;
        }
        n.j2(this, L2(new y0(null, zVarA, false, 5)), null, new q(this, onFinish, (Continuation) null, 5), 3);
        return true;
    }
}
