package opf;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.c {
    public Object A;
    public Object B;
    public Object C;
    public AccountId D;
    public /* synthetic */ Object E;
    public final /* synthetic */ z F;
    public int G;
    public SavingsAccountDetails u;
    public AccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f227648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f227649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f227650y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, gim.c cVar) {
        super(cVar);
        this.F = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        return this.F.j(null, null, this);
    }
}
