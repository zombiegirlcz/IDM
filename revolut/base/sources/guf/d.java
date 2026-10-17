package guf;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f146905w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, gim.c cVar) {
        super(cVar);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f146905w |= Integer.MIN_VALUE;
        return this.v.b(null, this, null, null);
    }
}
