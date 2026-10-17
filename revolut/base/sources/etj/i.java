package etj;

import com.revolut.feature.subaccount.api.models.Subaccount;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public Subaccount u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f129423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129424x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, gim.c cVar) {
        super(cVar);
        this.f129423w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129424x |= Integer.MIN_VALUE;
        return this.f129423w.j(null, this);
    }
}
