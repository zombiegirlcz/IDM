package h23;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public m23.b u;
    public e13.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f148642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f148643x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f148644y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f148644y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f148643x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f148644y.d(null, null, false, this);
    }
}
