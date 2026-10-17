package pij;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m1 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tij.m f236565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb4.t f236566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uij.d f236567c;
    public final tij.a d;
    public final tij.r e;
    public final cej.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f236568g;

    public m1(tij.s subscriptionsItemsBuilder, tij.m slotsAndBannersMapper, tb4.t currentDeviceResolver, ugc.a giftRecipientNameResolver, uij.d planOfferItemsBuilder, tij.a activeSubscriptionsItemsMapper, tij.r deviceDropDownSelectorBuilder, cej.b mobilePlansFeatureAvailabilityInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(subscriptionsItemsBuilder, "subscriptionsItemsBuilder");
        Intrinsics.checkNotNullParameter(slotsAndBannersMapper, "slotsAndBannersMapper");
        Intrinsics.checkNotNullParameter(currentDeviceResolver, "currentDeviceResolver");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        Intrinsics.checkNotNullParameter(planOfferItemsBuilder, "planOfferItemsBuilder");
        Intrinsics.checkNotNullParameter(activeSubscriptionsItemsMapper, "activeSubscriptionsItemsMapper");
        Intrinsics.checkNotNullParameter(deviceDropDownSelectorBuilder, "deviceDropDownSelectorBuilder");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f236565a = slotsAndBannersMapper;
        this.f236566b = currentDeviceResolver;
        this.f236567c = planOfferItemsBuilder;
        this.d = activeSubscriptionsItemsMapper;
        this.e = deviceDropDownSelectorBuilder;
        this.f = mobilePlansFeatureAvailabilityInteractor;
        this.f236568g = featureToggleInteractor;
    }

    public static n6 a(List list) {
        return m6.c(n6.Companion, gj7.b.q(list) ? new TextLocalisedClause(R$string.esim_subscriptions_actions_add_more_data, null, null, 14) : new TextLocalisedClause(R$string.esim_subscriptions_actions_get_data_plan, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, w.GET_PLAN, 508);
    }

    public static final List b(m1 m1Var, v vVar, Data esimHomeBanners, Data portabilityChecklistSlots) {
        tij.m mVar = m1Var.f236565a;
        Data esimSubscriptions = vVar.f236579a;
        Data userCompany = vVar.k;
        Data onlyManualInstallationAvailable = vVar.f236585l;
        Intrinsics.checkNotNullParameter(portabilityChecklistSlots, "portabilityChecklistSlots");
        Intrinsics.checkNotNullParameter(esimHomeBanners, "esimHomeBanners");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(onlyManualInstallationAvailable, "onlyManualInstallationAvailable");
        Intrinsics.checkNotNullParameter(esimSubscriptions, "esimSubscriptions");
        return !((jte.d) mVar.f271559a).c(EsimApi$Toggles.EsimMobilePlans.f100179c) ? tij.m.a(mVar, userCompany, onlyManualInstallationAvailable, esimSubscriptions, esimHomeBanners) : (List) iii.c.f(portabilityChecklistSlots, new tif.g(2), new kwg.c(esimHomeBanners, mVar, userCompany, onlyManualInstallationAvailable, esimSubscriptions, 2), new kwg.f(esimHomeBanners, mVar, userCompany, onlyManualInstallationAvailable, esimSubscriptions, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022e  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r26) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pij.m1.c(cli.j):cli.o");
    }
}
