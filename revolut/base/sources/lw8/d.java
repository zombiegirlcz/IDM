package lw8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public ly8.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f200427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f200428x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f200427w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f200428x |= Integer.MIN_VALUE;
        return this.f200427w.a(null, this);
    }
}
