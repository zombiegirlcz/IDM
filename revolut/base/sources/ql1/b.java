package ql1;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kdh.b f247035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f247036x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kdh.b bVar, gim.c cVar) {
        super(cVar);
        this.f247035w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f247036x |= Integer.MIN_VALUE;
        return this.f247035w.k0(false, this);
    }
}
