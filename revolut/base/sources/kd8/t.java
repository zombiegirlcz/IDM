package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f182851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f182852x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, gim.c cVar) {
        super(cVar);
        this.f182851w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f182852x |= Integer.MIN_VALUE;
        return this.f182851w.d(null, this);
    }
}
