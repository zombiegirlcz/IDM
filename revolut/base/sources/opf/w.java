package opf;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.feature.transfer.core.models.SourceAccount;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ z B;
    public int C;
    public SourceAccount.Pocket u;
    public CurrencyFilteringPolicy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f227643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public io3.l f227644x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public io3.d f227645y;
    public AccountId z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, gim.c cVar) {
        super(cVar);
        this.B = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.h(null, null, null, this);
    }
}
