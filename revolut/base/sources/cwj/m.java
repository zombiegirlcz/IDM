package cwj;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.flow.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f109842w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.retail.feature.impl.userauth.flow.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f109842w |= Integer.MIN_VALUE;
        return this.v.N2(this);
    }
}
