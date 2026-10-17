package xq3;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public bs3.h u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f308061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f308062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f308063y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f308062x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f308061w = obj2;
        this.f308063y |= Integer.MIN_VALUE;
        return this.f308062x.c(null, null, this);
    }
}
