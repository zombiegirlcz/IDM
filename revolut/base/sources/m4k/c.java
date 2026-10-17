package m4k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import mga.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public Clause A;
    public dj0.d B;
    public z3l.a C;
    public d0 D;
    public dj0.d E;
    public boolean F;
    public boolean G;
    public /* synthetic */ Object H;
    public final /* synthetic */ g I;
    public int J;
    public BankTransferData u;
    public kq2.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public kq2.f f202747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dj0.d f202748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n9l.a f202749y;
    public dj0.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.I = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.H = obj2;
        this.J |= Integer.MIN_VALUE;
        return this.I.d(this);
    }
}
