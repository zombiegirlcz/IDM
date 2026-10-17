package eq5;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f128288w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, gim.c cVar) {
        super(cVar);
        this.v = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f128288w |= Integer.MIN_VALUE;
        return this.v.N2(null, this);
    }
}
