package q6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.c {
    public Object[] A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ a0 D;
    public int E;
    public x5i.a u;
    public x5i.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CreditCardInterest f242643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Clause f242644x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Clause f242645y;
    public Object[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.D = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, null, null, this);
    }
}
