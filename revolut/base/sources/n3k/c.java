package n3k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import mga.r;
import z1k.o;
import z1k.p;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public dj0.d A;
    public n9l.a B;
    public r C;
    public boolean D;
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ g G;
    public int H;
    public RemittanceTransferData u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f212171w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dj0.d f212172x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dj0.d f212173y;
    public Clause z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.G = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.F = obj2;
        this.H |= Integer.MIN_VALUE;
        return this.G.d(this);
    }
}
