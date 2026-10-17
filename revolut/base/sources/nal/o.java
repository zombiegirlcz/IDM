package nal;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.c {
    public kotlin.jvm.internal.q u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.shared.feature.suspicious_transaction.impl.flow.a f213938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f213939x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f213938w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f213939x |= Integer.MIN_VALUE;
        return com.revolut.shared.feature.suspicious_transaction.impl.flow.a.P2(this.f213938w, null, null, this);
    }
}
