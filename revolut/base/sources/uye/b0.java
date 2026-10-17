package uye;

import com.revolut.feature.topup_screen.common.TopUpTarget;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends gim.c {
    public int A;
    public String u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TopUpTarget f284259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f284260x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f284261y;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, gim.c cVar) {
        super(cVar);
        this.z = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f284261y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.W2(null, null, null, null, this);
    }
}
