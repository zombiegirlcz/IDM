package nyb;

import com.revolut.data.network.models.privacy_settings.PrivacySettingsDto;
import com.revolut.data.network.models.security.SettingDescriptionDto;
import com.revolut.data.network.services.PrivacySettingsService;
import com.revolut.domain.models.security_settings.SecuritySettingType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b31.a f220781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.k f220782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qxb.c f220783c;

    public e0(b31.a privacySettingsRepository, eub.k revPointsPersonalisationAvailabilityInteractor, qxb.c revPointsPersonalisationTargetingOnboardingRepository) {
        Intrinsics.checkNotNullParameter(privacySettingsRepository, "privacySettingsRepository");
        Intrinsics.checkNotNullParameter(revPointsPersonalisationAvailabilityInteractor, "revPointsPersonalisationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsPersonalisationTargetingOnboardingRepository, "revPointsPersonalisationTargetingOnboardingRepository");
        this.f220781a = privacySettingsRepository;
        this.f220782b = revPointsPersonalisationAvailabilityInteractor;
        this.f220783c = revPointsPersonalisationTargetingOnboardingRepository;
    }

    public final efm.b a(boolean z) {
        List securitySettings;
        String str;
        b0 b0Var = (b0) this.f220782b;
        if (!b0Var.b()) {
            pfm.m mVar = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        Continuation continuation = null;
        boolean z3 = false;
        if (z) {
            b71.a aVar = new b71.a(SecuritySettingType.TRANSACTIONS_USAGE, b0Var.b() && b0Var.f220775b.d("LOYALTY_PERSONALISATION.transactions_usage", null) == bla.c.ENABLED);
            b71.a aVar2 = new b71.a(SecuritySettingType.REVOLUT_PRODUCTS_USAGE, b0Var.b() && b0Var.f220775b.d("LOYALTY_PERSONALISATION.revolut_products_usage", null) == bla.c.ENABLED);
            SecuritySettingType securitySettingType = SecuritySettingType.REVPOINTS_PROFILE_USAGE;
            if (b0Var.b() && b0Var.f220775b.d("LOYALTY_PERSONALISATION.revpoints_profile_usage", null) == bla.c.ENABLED) {
                z3 = true;
            }
            securitySettings = zhm.v.k(aVar, aVar2, new b71.a(securitySettingType, z3));
        } else {
            securitySettings = zhm.v.k(new b71.a(SecuritySettingType.TRANSACTIONS_USAGE, false), new b71.a(SecuritySettingType.REVOLUT_PRODUCTS_USAGE, false), new b71.a(SecuritySettingType.REVPOINTS_PROFILE_USAGE, false));
        }
        zhm.f0 notificationSettings = zhm.f0.f322471a;
        b31.a aVar3 = this.f220781a;
        Intrinsics.checkNotNullParameter(notificationSettings, "notificationSettings");
        Intrinsics.checkNotNullParameter(securitySettings, "securitySettings");
        PrivacySettingsService privacySettingsService = aVar3.f11983a;
        Intrinsics.checkNotNullParameter(notificationSettings, "<this>");
        ArrayList arrayList = new ArrayList(zhm.w.t(notificationSettings, 10));
        zhm.e0 e0Var = (zhm.e0) notificationSettings.iterator();
        if (e0Var.hasNext()) {
            e0Var.next();
            throw null;
        }
        Intrinsics.checkNotNullParameter(securitySettings, "<this>");
        List<b71.a> list = securitySettings;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (b71.a aVar4 : list) {
            Intrinsics.checkNotNullParameter(aVar4, "<this>");
            switch (o11.a.f221265a[aVar4.f12865a.ordinal()]) {
                case 1:
                    str = "incognito";
                    break;
                case 2:
                    str = "analyticsEventsTracking";
                    break;
                case 3:
                    str = "creditDataSharing";
                    break;
                case 4:
                    str = "thirdPartyPromotion";
                    break;
                case 5:
                    str = "transactionsUsage";
                    break;
                case 6:
                    str = "revolutProductsUsage";
                    break;
                case 7:
                    str = "revpointsProfileUsage";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(new SettingDescriptionDto(str, aVar4.f12866b));
        }
        pfm.r rVarG0 = te0.w.g0(privacySettingsService.updatePrivacySettings(new PrivacySettingsDto(arrayList, arrayList2)));
        skm.p0 p0Var = skm.p0.f264001a;
        pfm.a aVarE = rVarG0.e(pd.b.n(elm.f.f127540b, new nt4.f(this, continuation, 8)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
