package q6i;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature_move_money.api.model.OrderMode;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ a0 B;
    public int C;
    public x5i.a u;
    public x5i.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OrderMode f242646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TransferAvailability f242647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CompositeClause f242648y;
    public CompositeClause z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.B = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, null, null, null, null, null, this);
    }
}
