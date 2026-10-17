package qh2;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f246442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f246443x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.f246442w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f246443x |= Integer.MIN_VALUE;
        return o.a(this.f246442w, this);
    }
}
