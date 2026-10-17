package icc;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.c {
    public jf0.c u;
    public Boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f160234w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f160235x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f160236y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f160235x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f160234w = obj2;
        this.f160236y |= Integer.MIN_VALUE;
        return this.f160235x.e(null, this);
    }
}
