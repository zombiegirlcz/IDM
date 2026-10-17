package buf;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.c {
    public ManualTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f18831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18832x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, gim.c cVar) {
        super(cVar);
        this.f18831w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f18832x |= Integer.MIN_VALUE;
        return this.f18831w.a(null, this);
    }
}
