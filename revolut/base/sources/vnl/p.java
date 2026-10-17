package vnl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends yji.n implements l {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bjl.f f290830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z1 f290831m;

    public p(bjl.f otpContentInteractor) {
        Intrinsics.checkNotNullParameter(otpContentInteractor, "otpContentInteractor");
        this.f290830l = otpContentInteractor;
        this.f290831m = ta6.a.a(1);
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, ((xjl.e) this.f290830l).f306555b.d, null, new o(this, null, 0), 3);
    }
}
