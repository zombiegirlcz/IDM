package kej;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public a u;
    public pej.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f183093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f183094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f183095y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f183094x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f183093w = obj2;
        this.f183095y |= Integer.MIN_VALUE;
        return this.f183094x.a(null, null, this);
    }
}
