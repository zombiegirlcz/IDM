package h6i;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ b9k.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f149735w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(b9k.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f149735w |= Integer.MIN_VALUE;
        return this.v.o(null, null, this);
    }
}
