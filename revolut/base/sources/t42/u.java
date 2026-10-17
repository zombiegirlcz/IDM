package t42;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends gim.c {
    public TransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c f267868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267869x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f267868w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267869x |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.I2(this.f267868w, this);
    }
}
