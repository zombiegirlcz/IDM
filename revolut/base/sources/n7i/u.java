package n7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k7i.i C;
    public int D;
    public BalanceWrapper u;
    public x5i.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f213149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k7i.i f213150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213151y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k7i.i iVar, gim.c cVar) {
        super(cVar);
        this.C = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.h(null, null, null, this);
    }
}
