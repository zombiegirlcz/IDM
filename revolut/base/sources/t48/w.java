package t48;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f267939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, gim.c cVar) {
        super(cVar);
        this.v = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f267939w |= Integer.MIN_VALUE;
        return y.B2(this.v, this);
    }
}
