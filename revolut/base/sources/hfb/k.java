package hfb;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.reverywhere.impl.onboarding.a f151797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f151798x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.retail.reverywhere.impl.onboarding.a aVar, gim.c cVar) {
        super(cVar);
        this.f151797w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f151798x |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.reverywhere.impl.onboarding.a.J2(this.f151797w, this);
    }
}
