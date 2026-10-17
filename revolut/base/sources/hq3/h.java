package hq3;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public DropOutConfig.Action u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f154594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f154595x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, gim.c cVar) {
        super(cVar);
        this.f154594w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f154595x |= Integer.MIN_VALUE;
        return this.f154594w.A2(null, this);
    }
}
