package c52;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.c {
    public TransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21384w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21385x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, gim.c cVar) {
        super(cVar);
        this.f21384w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f21385x |= Integer.MIN_VALUE;
        return r.f3(this.f21384w, null, this);
    }
}
