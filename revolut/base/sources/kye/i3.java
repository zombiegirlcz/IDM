package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class i3 extends gim.c {
    public dj0.d u;
    public SelectedMethod v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f190746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k3 f190747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f190748y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, gim.c cVar) {
        super(cVar);
        this.f190747x = k3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f190746w = obj2;
        this.f190748y |= Integer.MIN_VALUE;
        return this.f190747x.W2(null, null, this);
    }
}
