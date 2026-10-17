package uye;

import com.revolut.feature.topup_screen.api.model.StoredMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.c {
    public StoredMethod u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f284311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f284313y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, gim.c cVar) {
        super(cVar);
        this.f284312x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f284311w = obj2;
        this.f284313y |= Integer.MIN_VALUE;
        return this.f284312x.L2(null, null, this);
    }
}
