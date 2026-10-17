package ahf;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ z C;
    public int D;
    public boolean u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5095y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, gim.c cVar) {
        super(cVar);
        this.C = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return z.I2(this.C, false, this);
    }
}
