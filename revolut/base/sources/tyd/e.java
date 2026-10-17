package tyd;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f275558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f275559x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f275558w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f275559x |= Integer.MIN_VALUE;
        return this.f275558w.e(null, this);
    }
}
