package vg6;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f288774w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288775x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gim.c cVar) {
        super(cVar);
        this.f288774w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f288775x |= Integer.MIN_VALUE;
        return this.f288774w.a(null, this);
    }
}
