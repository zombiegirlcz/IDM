package bq;

/* JADX INFO: loaded from: classes.dex */
public final class e extends gim.c {
    public f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f17649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17650x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f17649w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f17650x |= Integer.MIN_VALUE;
        return this.f17649w.P(null, this);
    }
}
