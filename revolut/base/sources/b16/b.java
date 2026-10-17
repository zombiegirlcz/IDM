package b16;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public ui0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f11731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11732x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f11731w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f11732x |= Integer.MIN_VALUE;
        return this.f11731w.b(null, this);
    }
}
