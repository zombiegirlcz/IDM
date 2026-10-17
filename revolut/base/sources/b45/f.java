package b45;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ h B;
    public int C;
    public io3.d u;
    public fo3.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x35.h f12172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12173x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dj0.d f12174y;
    public x35.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(null, null, this);
    }
}
