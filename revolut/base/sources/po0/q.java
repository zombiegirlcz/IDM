package po0;

import com.revolut.core.ui_kit.background.BlurredImageBackgroundView;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends gim.c {
    public n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BlurredImageBackgroundView f237859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f237860x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(BlurredImageBackgroundView blurredImageBackgroundView, gim.c cVar) {
        super(cVar);
        this.f237859w = blurredImageBackgroundView;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f237860x |= Integer.MIN_VALUE;
        return BlurredImageBackgroundView.a(this.f237859w, null, null, this);
    }
}
