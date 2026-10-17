package nwc;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreenContract$InputData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wtc.c1;
import wtc.d1;
import wtc.e1;
import wtc.g0;
import wtc.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends oki.h implements l {
    public final elb.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u0 f219830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c1 f219831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f219832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r10.q f219833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g0 f219834t;
    public final y u;

    public p(WealthProtectionScreenContract$InputData inputData, elb.b savingsFeatureConfigInteractor, u0 wealthProtectionFeatureChangeInteractor, c1 wealthProtectionUpdateFeatureInteractor, j60.a bottomExpandableDialogControllerExtension, r10.q userRegisteredIdentitiesInteractor, g0 streetModeInteractor, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthProtectionFeatureChangeInteractor, "wealthProtectionFeatureChangeInteractor");
        Intrinsics.checkNotNullParameter(wealthProtectionUpdateFeatureInteractor, "wealthProtectionUpdateFeatureInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsFeatureConfigInteractor;
        this.f219830p = wealthProtectionFeatureChangeInteractor;
        this.f219831q = wealthProtectionUpdateFeatureInteractor;
        this.f219832r = bottomExpandableDialogControllerExtension;
        this.f219833s = userRegisteredIdentitiesInteractor;
        this.f219834t = streetModeInteractor;
        this.u = mra.d.b(this, new g(inputData.f85774a, new Data(null, null, true, 3, null), null, null), stateMapper, new o(), false, 8);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.o.a(w4l.j.f294644c), null, null, new n(this, continuation, 0), 3);
        r10.q qVar = this.f219833s;
        if (qVar.E()) {
            yji.l.a1(this, r10.q.m0(qVar, do3.f.BANKING, null, 6), null, null, new n(this, continuation, 1), 3);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        WealthProtectionFeatureState enabled;
        Iterator it8;
        y yVar = this.u;
        WealthProtectionFeaturesState featureStates = ((g) ((j2) yVar.f22677a).getValue()).f219820a;
        u0 u0Var = this.f219830p;
        HashMap cachedChangedFeatures = u0Var.f299910a;
        ((e1) this.f219831q).getClass();
        Intrinsics.checkNotNullParameter(cachedChangedFeatures, "cachedChangedFeatures");
        Intrinsics.checkNotNullParameter(featureStates, "featureStates");
        if (!cachedChangedFeatures.isEmpty()) {
            WealthProtectionFeatureState transfers = featureStates.f;
            WealthProtectionFeatureState wealthProtectionFeatureState = featureStates.f85449a;
            WealthProtectionFeatureState wealthProtectionFeatureState2 = featureStates.f85450b;
            WealthProtectionFeatureState wealthProtectionFeatureState3 = featureStates.f85451c;
            WealthProtectionFeatureState wealthProtectionFeatureState4 = featureStates.d;
            WealthProtectionFeatureState crypto = featureStates.e;
            WealthProtectionFeatureState cardPayments = featureStates.f85452g;
            WealthProtectionFeatureState savings = wealthProtectionFeatureState;
            WealthProtectionFeatureState pockets = wealthProtectionFeatureState2;
            WealthProtectionFeatureState stocks = wealthProtectionFeatureState3;
            WealthProtectionFeatureState commodities = wealthProtectionFeatureState4;
            for (Iterator it9 = cachedChangedFeatures.entrySet().iterator(); it9.hasNext(); it9 = it8) {
                Map.Entry entry = (Map.Entry) it9.next();
                qtc.k kVar = (qtc.k) entry.getKey();
                WealthProtectionFeatureDetails wealthProtectionFeatureDetails = (WealthProtectionFeatureDetails) entry.getValue();
                if (wealthProtectionFeatureDetails instanceof WealthProtectionFeatureDetails.Disabled) {
                    WealthProtectionFeatureDetails.Disabled disabled = (WealthProtectionFeatureDetails.Disabled) wealthProtectionFeatureDetails;
                    enabled = new WealthProtectionFeatureState.Visible.Disabled(disabled.f85438b, disabled.f85439c, disabled.d);
                    it8 = it9;
                } else {
                    if (!(wealthProtectionFeatureDetails instanceof WealthProtectionFeatureDetails.Enabled)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WealthProtectionFeatureDetails.Enabled enabled2 = (WealthProtectionFeatureDetails.Enabled) wealthProtectionFeatureDetails;
                    it8 = it9;
                    enabled = new WealthProtectionFeatureState.Visible.Enabled(enabled2.f85441b, enabled2.f85442c, enabled2.d, enabled2.e);
                }
                switch (d1.f299863a[kVar.ordinal()]) {
                    case 1:
                        savings = enabled;
                        break;
                    case 2:
                        pockets = enabled;
                        break;
                    case 3:
                        stocks = enabled;
                        break;
                    case 4:
                        commodities = enabled;
                        break;
                    case 5:
                        crypto = enabled;
                        break;
                    case 6:
                        transfers = enabled;
                        break;
                    case 7:
                        cardPayments = enabled;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            Intrinsics.checkNotNullParameter(savings, "savings");
            Intrinsics.checkNotNullParameter(pockets, "pockets");
            Intrinsics.checkNotNullParameter(stocks, "stocks");
            Intrinsics.checkNotNullParameter(commodities, "commodities");
            Intrinsics.checkNotNullParameter(crypto, "crypto");
            Intrinsics.checkNotNullParameter(transfers, "transfers");
            Intrinsics.checkNotNullParameter(cardPayments, "cardPayments");
            WealthProtectionFeatureState wealthProtectionFeatureState5 = crypto;
            featureStates = new WealthProtectionFeaturesState(savings, pockets, stocks, commodities, wealthProtectionFeatureState5, transfers, cardPayments);
        }
        H2(yVar, new nrd.g(featureStates, 21));
        u0Var.f299910a.clear();
        yji.l.b1(this, nim.a.v(this.f219834t.e(), new nuc.n(19)), null, new n(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
