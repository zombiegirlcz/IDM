package s36;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.c {
    public List u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f259437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k18.c f259438x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f259439y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(k18.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f259438x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259437w = obj2;
        this.f259439y |= Integer.MIN_VALUE;
        return k18.c.c(this.f259438x, null, null, this);
    }
}
