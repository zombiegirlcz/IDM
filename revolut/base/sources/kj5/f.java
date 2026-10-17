package kj5;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public wk5.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.receive_widget.impl.ui.customize.c f184296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184297x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f184296w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184297x |= Integer.MIN_VALUE;
        return com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.J2(this.f184296w, null, null, this);
    }
}
