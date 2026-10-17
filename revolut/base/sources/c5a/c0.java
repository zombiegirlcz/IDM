package c5a;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21486w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f21486w |= Integer.MIN_VALUE;
        return com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.I2(this.v, null, this);
    }
}
