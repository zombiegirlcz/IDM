package mde;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f204555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f204556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f204557y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f204556x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204555w = obj2;
        this.f204557y |= Integer.MIN_VALUE;
        return this.f204556x.f(this, null, null);
    }
}
