package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 extends gim.c {
    public SelectedMethod.StoredMethod.Card u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f190879x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k3 k3Var, gim.c cVar) {
        super(cVar);
        this.f190878w = k3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f190879x |= Integer.MIN_VALUE;
        return k3.K2(this.f190878w, null, null, null, this);
    }
}
