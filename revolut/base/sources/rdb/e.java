package rdb;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f253398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f253399x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, gim.c cVar) {
        super(cVar);
        this.f253398w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f253399x |= Integer.MIN_VALUE;
        return this.f253398w.b(null, 0, this);
    }
}
