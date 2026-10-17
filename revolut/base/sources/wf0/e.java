package wf0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f296877w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f296878x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f296877w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f296878x |= Integer.MIN_VALUE;
        return this.f296877w.a(null, this);
    }
}
