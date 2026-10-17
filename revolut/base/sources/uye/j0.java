package uye;

import com.revolut.domain.models.topup.mcy.McyTopUpMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.c {
    public dj0.d u;
    public McyTopUpMethod v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f284290w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284291x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f284292y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, gim.c cVar) {
        super(cVar);
        this.f284291x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f284290w = obj2;
        this.f284292y |= Integer.MIN_VALUE;
        return this.f284291x.d3(null, null, this);
    }
}
