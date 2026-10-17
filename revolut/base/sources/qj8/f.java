package qj8;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f246778w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f246779x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f246780y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, gim.c cVar) {
        super(cVar);
        this.f246779x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f246778w = obj2;
        this.f246780y |= Integer.MIN_VALUE;
        return this.f246779x.b(null, null, null, this);
    }
}
