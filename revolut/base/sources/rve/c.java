package rve;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ d B;
    public int C;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f257759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f257760x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f257761y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.B = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, null, this);
    }
}
