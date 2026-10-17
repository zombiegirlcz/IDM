package njk;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ fdi.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f216598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fdi.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f216598w |= Integer.MIN_VALUE;
        return fdi.c.c(this.v, this);
    }
}
