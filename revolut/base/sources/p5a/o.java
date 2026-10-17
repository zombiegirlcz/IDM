package p5a;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f233084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f233085x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, gim.c cVar) {
        super(cVar);
        this.f233084w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f233085x |= Integer.MIN_VALUE;
        return this.f233084w.a(null, this);
    }
}
