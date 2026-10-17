package vr4;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public final /* synthetic */ f A;
    public int B;
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f291477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f291479y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.A = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, this);
    }
}
