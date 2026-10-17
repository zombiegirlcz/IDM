package kf9;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public jf0.c u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f183329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f183330x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f183331y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f183330x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f183329w = obj2;
        this.f183331y |= Integer.MIN_VALUE;
        return c.b(this.f183330x, null, false, this);
    }
}
