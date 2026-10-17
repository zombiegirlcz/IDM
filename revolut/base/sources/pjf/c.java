package pjf;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f236745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236746x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f236745w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f236746x |= Integer.MIN_VALUE;
        return this.f236745w.b(this);
    }
}
