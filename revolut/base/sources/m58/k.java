package m58;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.c {
    public int A;
    public dj0.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountId f202862w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public io3.d f202863x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f202864y;
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.withdraw.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.joint.impl.ui.withdraw.b bVar, gim.c cVar) {
        super(cVar);
        this.z = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f202864y = obj2;
        this.A |= Integer.MIN_VALUE;
        return com.revolut.feature.joint.impl.ui.withdraw.b.I2(this.z, this);
    }
}
