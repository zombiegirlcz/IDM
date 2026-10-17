package az0;

import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;

/* JADX INFO: loaded from: classes20.dex */
public final class y0 extends gim.c {
    public QrCodeAppearance.Layer u;
    public Integer v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w0 f11377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11378y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(w0 w0Var, gim.c cVar) {
        super(cVar);
        this.f11377x = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f11376w = obj2;
        this.f11378y |= Integer.MIN_VALUE;
        return this.f11377x.m(null, null, null, this);
    }
}
