package o6i;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f222609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f222610x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f222609w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f222610x |= Integer.MIN_VALUE;
        return this.f222609w.c(null, this);
    }
}
