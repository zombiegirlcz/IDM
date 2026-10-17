package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.c {
    public String u;
    public v6d.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f182838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f182839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f182840y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.f182839x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f182838w = obj2;
        this.f182840y |= Integer.MIN_VALUE;
        return this.f182839x.h(null, null, this);
    }
}
