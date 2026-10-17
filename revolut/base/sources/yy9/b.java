package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f317868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317869x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f317868w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317869x |= Integer.MIN_VALUE;
        return this.f317868w.a(null, this);
    }
}
