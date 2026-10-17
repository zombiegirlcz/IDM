package kj5;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.crypto.receive_widget.impl.ui.customize.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184295w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184295w |= Integer.MIN_VALUE;
        return com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.I2(this.v, null, this);
    }
}
