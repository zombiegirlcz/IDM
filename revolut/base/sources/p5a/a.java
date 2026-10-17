package p5a;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public jq9.b u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f233049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f233050x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f233051y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f233050x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233049w = obj2;
        this.f233051y |= Integer.MIN_VALUE;
        return this.f233050x.a(null, null, this);
    }
}
