package mz3;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f210679w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, gim.c cVar) {
        super(cVar);
        this.v = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f210679w |= Integer.MIN_VALUE;
        return this.v.b(null, null, null, null, null, this);
    }
}
