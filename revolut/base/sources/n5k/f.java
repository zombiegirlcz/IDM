package n5k;

import com.revolut.feature.retail.savings.api.domain.interactors.SavingsDisclaimersClickAction;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public SavingsDisclaimersClickAction u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f212629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212630x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, gim.c cVar) {
        super(cVar);
        this.f212629w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212630x |= Integer.MIN_VALUE;
        return this.f212629w.c3(null, this);
    }
}
