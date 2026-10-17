package jid;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ p B;
    public int C;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f174442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f174443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f174444y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.B = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, null, this);
    }
}
