package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h2 extends aii.m implements aii.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo0.f f181097b;

    public h2(et0.z bubbleAnimationController) {
        Intrinsics.checkNotNullParameter(bubbleAnimationController, "bubbleAnimationController");
        this.f181097b = bubbleAnimationController;
    }

    @Override // aii.f
    public final bki.a a() {
        return new fmc.z(this.f181097b);
    }
}
