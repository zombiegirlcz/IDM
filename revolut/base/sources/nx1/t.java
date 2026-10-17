package nx1;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.c {
    public n02.b u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f220081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f220082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f220083y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, gim.c cVar) {
        super(cVar);
        this.f220082x = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f220081w = obj2;
        this.f220083y |= Integer.MIN_VALUE;
        return this.f220082x.g(null, null, null, this);
    }
}
