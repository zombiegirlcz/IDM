package vw3;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public String u;
    public f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f292619w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f292620x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f292621y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f292620x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f292619w = obj2;
        this.f292621y |= Integer.MIN_VALUE;
        return this.f292620x.a(null, this);
    }
}
