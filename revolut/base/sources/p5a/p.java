package p5a;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.c {
    public String u;
    public jq9.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f233086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f233087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f233088y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, gim.c cVar) {
        super(cVar);
        this.f233087x = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233086w = obj2;
        this.f233088y |= Integer.MIN_VALUE;
        return this.f233087x.b(null, this);
    }
}
