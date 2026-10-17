package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends gim.c {
    public final /* synthetic */ v A;
    public int B;
    public String u;
    public v6d.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v f182853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f182854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f182855y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, gim.c cVar) {
        super(cVar);
        this.A = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.e(null, this);
    }
}
