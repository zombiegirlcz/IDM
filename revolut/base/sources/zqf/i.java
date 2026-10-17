package zqf;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f324482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f324483x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f324482w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f324483x |= Integer.MIN_VALUE;
        return k.y2(this.f324482w, null, this);
    }
}
