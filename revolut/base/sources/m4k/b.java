package m4k;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import l5k.j;
import mga.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public l5k.c A;
    public dj0.d B;
    public d0 C;
    public dj0.d D;
    public Clause E;
    public l5k.b F;
    public dj0.d G;
    public dj0.d H;
    public j I;
    public AccountId J;
    public boolean K;
    public /* synthetic */ Object L;
    public final /* synthetic */ g M;
    public int N;
    public BankTransferData u;
    public kq2.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public kq2.f f202744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l5k.c f202745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l5k.c f202746y;
    public l5k.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, gim.c cVar) {
        super(cVar);
        this.M = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.L = obj2;
        this.N |= Integer.MIN_VALUE;
        return this.M.e(this);
    }
}
