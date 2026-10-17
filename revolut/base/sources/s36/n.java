package s36;

import xhf.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.c {
    public d1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f259441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f259442x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.f259441w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f259442x |= Integer.MIN_VALUE;
        return this.f259441w.a(null, null, this);
    }
}
