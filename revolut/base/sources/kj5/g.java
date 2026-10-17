package kj5;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public String u;
    public wk5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f184298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f184299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.receive_widget.impl.ui.customize.c f184300y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f184300y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f184299x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.K2(this.f184300y, null, null, null, this);
    }
}
