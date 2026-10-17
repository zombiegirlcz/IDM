package skf;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f263940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f263941x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f263940w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f263941x |= Integer.MIN_VALUE;
        return this.f263940w.c(null, null, this);
    }
}
