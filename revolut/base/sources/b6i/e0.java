package b6i;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends gim.c {
    public Object[] A;
    public /* synthetic */ Object B;
    public final /* synthetic */ com.revolut.feature_move_money.impl.amount.c C;
    public int D;
    public Set u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k1j.d f12775w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public io3.l f12776x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Set f12777y;
    public Object[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature_move_money.impl.amount.c cVar, gim.c cVar2) {
        super(cVar2);
        this.C = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return com.revolut.feature_move_money.impl.amount.c.J2(this.C, null, this);
    }
}
