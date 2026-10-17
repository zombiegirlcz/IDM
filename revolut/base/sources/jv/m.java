package jv;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f178711w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, gim.c cVar) {
        super(cVar);
        this.v = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f178711w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
