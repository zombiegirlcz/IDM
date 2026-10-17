package fp5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoWithdrawFeatureConfig;
import com.revolut.feature.crypto.withdraw.api.navigation.WithdrawFinishBehavior;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;
import wk5.n;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137051a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f137052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CompositeCommand f137053c;
    public final /* synthetic */ CryptoAddress d;
    public final /* synthetic */ xi0.b e;

    public /* synthetic */ c(f fVar, CryptoAddress cryptoAddress, xi0.b bVar, CompositeCommand compositeCommand) {
        this.f137052b = fVar;
        this.d = cryptoAddress;
        this.e = bVar;
        this.f137053c = compositeCommand;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f137051a) {
            case 0:
                List currenciesForAddressType = (List) obj2;
                Intrinsics.checkNotNullParameter(currenciesForAddressType, "currenciesForAddressType");
                boolean zIsEmpty = currenciesForAddressType.isEmpty();
                f fVar = this.f137052b;
                if (zIsEmpty) {
                    ufm.b bVarM = d0.m(((ik5.g) fVar.d).a());
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                xi0.b bVar = this.e;
                if (bVar == null) {
                    bVar = null;
                } else if (!currenciesForAddressType.contains(bVar)) {
                    bVar = (xi0.b) zhm.d0.b0(currenciesForAddressType);
                }
                return new i(fVar.f137060c.k(), new fjj.b(new c(fVar, this.f137053c, this.d, bVar), 13), 1);
            default:
                n validation = (n) obj2;
                Intrinsics.checkNotNullParameter(validation, "validation");
                return validation == n.RESTRICTED ? ((ik5.g) this.f137052b.d).a() : new FeatureCommand(new CryptoWithdrawFeatureConfig.Withdraw(new WithdrawFinishBehavior.Navigate(this.f137053c), this.d.f71059a, this.e));
        }
    }

    public /* synthetic */ c(f fVar, CompositeCommand compositeCommand, CryptoAddress cryptoAddress, xi0.b bVar) {
        this.f137052b = fVar;
        this.f137053c = compositeCommand;
        this.d = cryptoAddress;
        this.e = bVar;
    }
}
