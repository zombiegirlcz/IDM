package vg6;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ p C;
    public int D;
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f288778y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.C = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, this);
    }
}
