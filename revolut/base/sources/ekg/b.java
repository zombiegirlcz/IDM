package ekg;

import com.revolut.feature.uipersonalisation.api.models.AppTheme;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public AppTheme u;
    public AppTheme v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f127150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f127151x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f127152y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, gim.c cVar) {
        super(cVar);
        this.f127151x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127150w = obj2;
        this.f127152y |= Integer.MIN_VALUE;
        return this.f127151x.d(null, null, this);
    }
}
