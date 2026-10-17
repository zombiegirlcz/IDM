package d8e;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a f112223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112224x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f112223w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f112224x |= Integer.MIN_VALUE;
        return com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a.O2(this.f112223w, this);
    }
}
