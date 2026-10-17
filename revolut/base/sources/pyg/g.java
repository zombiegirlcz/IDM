package pyg;

import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v9j.a f240833l;

    public g(v9j.a cryptoDisclaimerControllerModelExtension) {
        Intrinsics.checkNotNullParameter(cryptoDisclaimerControllerModelExtension, "cryptoDisclaimerControllerModelExtension");
        this.f240833l = cryptoDisclaimerControllerModelExtension;
    }

    @Override // pyg.a
    public final void Z2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.d;
        if (!(obj2 instanceof e)) {
            this.f240833l.Z2(clickData);
            Unit unit = Unit.f186387a;
            return;
        }
        e eVar = (e) obj2;
        if (eVar.equals(d.f240832a)) {
            A2(u0.c(DisclosuresFeatureConfig.TradingDisclosuresFeatureConfig.f95197a));
        } else if (eVar.equals(b.f240830a)) {
            A2(u0.c(DisclosuresFeatureConfig.CommoditiesDisclosuresFeatureConfig.f95194a));
        } else {
            if (!(eVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(new ExternalDestination.Browser(((c) obj2).f240831a, null));
        }
    }
}
