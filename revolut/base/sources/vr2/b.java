package vr2;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f291461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f291461w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f291462x |= Integer.MIN_VALUE;
        return this.f291461w.b(null, null, false, this);
    }
}
