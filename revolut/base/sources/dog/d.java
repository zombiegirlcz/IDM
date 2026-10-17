package dog;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.user_declarations.shared.flows.pep.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f116563w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.user_declarations.shared.flows.pep.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f116563w |= Integer.MIN_VALUE;
        return com.revolut.feature.user_declarations.shared.flows.pep.a.I2(this.v, null, this);
    }
}
