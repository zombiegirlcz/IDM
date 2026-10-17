package uye;

import com.revolut.feature.topup_screen.common.TopUpTarget;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends gim.c {
    public dj0.d u;
    public TopUpTarget v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f284266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f284268y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, gim.c cVar) {
        super(cVar);
        this.f284267x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f284266w = obj2;
        this.f284268y |= Integer.MIN_VALUE;
        return this.f284267x.X2(null, null, null, this);
    }
}
