package hve;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public TopUpMethodsContext u;
    public com.revolut.domain.models.topup.methods.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f155824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f155825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f155826y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, gim.c cVar) {
        super(cVar);
        this.f155825x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f155824w = obj2;
        this.f155826y |= Integer.MIN_VALUE;
        return o.a(this.f155825x, null, null, this);
    }
}
