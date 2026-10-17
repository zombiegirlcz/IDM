package ve3;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ ugc.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288110w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ugc.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f288110w |= Integer.MIN_VALUE;
        return this.v.h(this);
    }
}
