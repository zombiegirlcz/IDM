package r7i;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f252240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JuniorInfo f252241c;
    public final /* synthetic */ AccountWrapper d;
    public final /* synthetic */ SavingsAccountDetails e;
    public final /* synthetic */ x5i.d f;

    public /* synthetic */ q(s sVar, JuniorInfo juniorInfo, AccountWrapper accountWrapper, SavingsAccountDetails savingsAccountDetails, x5i.d dVar, int i) {
        this.f252239a = i;
        this.f252240b = sVar;
        this.f252241c = juniorInfo;
        this.d = accountWrapper;
        this.e = savingsAccountDetails;
        this.f = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean toggleEnabled = (Boolean) obj2;
        switch (this.f252239a) {
            case 0:
                Intrinsics.checkNotNullParameter(toggleEnabled, "toggleEnabled");
                if (!toggleEnabled.booleanValue()) {
                    ufm.b bVarM = d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                s sVar = this.f252240b;
                JuniorInfo juniorInfo = this.f252241c;
                return new ufm.i(sVar.c(juniorInfo), new r4j.b(new q(sVar, juniorInfo, this.d, this.e, this.f, 1), 13), 0);
            default:
                Intrinsics.checkNotNullParameter(toggleEnabled, "accountChecksPassed");
                s sVar2 = this.f252240b;
                sVar2.getClass();
                JuniorInfo juniorInfo2 = this.f252241c;
                AccountWrapper accountWrapper = this.d;
                boolean zB = s.b(juniorInfo2, accountWrapper);
                SavingsAccountDetails savingsAccountDetails = this.e;
                boolean zC = opg.c.c(savingsAccountDetails.f86460a);
                boolean z = juniorInfo2.e;
                boolean zB2 = ((c8i.b) sVar2.f).b(savingsAccountDetails, accountWrapper, this.f);
                if (!zC || !toggleEnabled.booleanValue() || !zB || !z || !zB2) {
                    ufm.b bVarM2 = d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                return m70.a.g(rd0.e.c(sVar2.d.b(juniorInfo2.f99454a, juniorInfo2.f, w4l.j.f294644c), kotlin.coroutines.g.f186406a), null, new r6d.h(8), 1).firstOrError();
        }
    }
}
