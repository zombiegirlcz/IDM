package gd8;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f143104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f143105x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, gim.c cVar) {
        super(cVar);
        this.f143104w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f143105x |= Integer.MIN_VALUE;
        return this.f143104w.a(null, this);
    }
}
