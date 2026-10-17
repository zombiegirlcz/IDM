package tz1;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f275740w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f275741x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f275740w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f275741x |= Integer.MIN_VALUE;
        return this.f275740w.b(null, this);
    }
}
