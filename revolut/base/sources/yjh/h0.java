package yjh;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends gim.c {
    public WealthAction u;
    public k0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f314477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k0 f314478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f314479y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.f314478x = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f314477w = obj2;
        this.f314479y |= Integer.MIN_VALUE;
        return this.f314478x.e3(null, null, this);
    }
}
