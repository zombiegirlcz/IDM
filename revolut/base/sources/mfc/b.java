package mfc;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public ya1.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f204986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f204987x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f204986w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f204987x |= Integer.MIN_VALUE;
        return this.f204986w.c(null, this);
    }
}
