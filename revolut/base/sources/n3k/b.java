package n3k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import l5k.j;
import mga.r;
import z1k.p;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public Object A;
    public l5k.c B;
    public dj0.d C;
    public dj0.d D;
    public j E;
    public r F;
    public /* synthetic */ Object G;
    public final /* synthetic */ g H;
    public int I;
    public RemittanceTransferData u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z1k.j f212168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Clause f212169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f212170y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, gim.c cVar) {
        super(cVar);
        this.H = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.G = obj2;
        this.I |= Integer.MIN_VALUE;
        return this.H.e(this);
    }
}
