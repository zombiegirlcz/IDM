package kye;

/* JADX INFO: loaded from: classes8.dex */
public final class s3 extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w3 f190833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f190834x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(w3 w3Var, gim.c cVar) {
        super(cVar);
        this.f190833w = w3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f190834x |= Integer.MIN_VALUE;
        return this.f190833w.a(null, null, this);
    }
}
