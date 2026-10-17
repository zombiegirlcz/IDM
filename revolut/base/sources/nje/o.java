package nje;

import aw0.ka;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.tab.crypto.impl.R$string;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import ip0.ej;
import ip0.km;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import mx0.d7;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bbj.c f216475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bi5.b f216476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f216477c;
    public final iv5.a d;

    public o(bbj.c cryptoDisclaimerMapper, pje.a slotManagerItemsMapper, bi5.b cryptoOnboardingBannerMapper, q cryptoPortfolioZeroFeesBannerProvider, iv5.a splitAccountsGroupsMapper) {
        Intrinsics.checkNotNullParameter(cryptoDisclaimerMapper, "cryptoDisclaimerMapper");
        Intrinsics.checkNotNullParameter(slotManagerItemsMapper, "slotManagerItemsMapper");
        Intrinsics.checkNotNullParameter(cryptoOnboardingBannerMapper, "cryptoOnboardingBannerMapper");
        Intrinsics.checkNotNullParameter(cryptoPortfolioZeroFeesBannerProvider, "cryptoPortfolioZeroFeesBannerProvider");
        Intrinsics.checkNotNullParameter(splitAccountsGroupsMapper, "splitAccountsGroupsMapper");
        this.f216475a = cryptoDisclaimerMapper;
        this.f216476b = cryptoOnboardingBannerMapper;
        this.f216477c = cryptoPortfolioZeroFeesBannerProvider;
        this.d = splitAccountsGroupsMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [qv0.i] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [com.revolut.core.ui_kit.delegates.hg, qv0.n] */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List list;
        List listC;
        char c2;
        char c3;
        ?? r142;
        TimeClause.Format pretty;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data onboardingProcess = domainState.f216457b;
        int i = 0;
        List listC2 = null;
        if (onboardingProcess != null) {
            yh5.a cryptoFeatureState = domainState.f;
            si5.d dVar = (si5.d) this.f216476b;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(onboardingProcess, "onboardingProcess");
            Intrinsics.checkNotNullParameter(cryptoFeatureState, "cryptoFeatureState");
            list = (List) iii.c.f(onboardingProcess, new se0.a(27), new sa5.a(22), new si5.c(dVar, cryptoFeatureState, i));
        } else {
            list = null;
        }
        LocalDateTime endDate = domainState.f216459g;
        if (endDate != null) {
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Clock clock = this.f216477c.f216478a;
            if (endDate.getYear() == LocalDateTime.now(clock).getYear()) {
                pretty = (Intrinsics.f(endDate.toLocalDate(), LocalDate.now(clock)) || Intrinsics.f(endDate.toLocalDate(), LocalDate.now(clock).plusDays(1L))) ? new TimeClause.Format.Pretty(q0.DATETIME) : new TimeClause.Format.DayAndMonth(ka.SHORT);
            } else {
                TimeClause.Format.INSTANCE.getClass();
                pretty = TimeClause.Format.f57959a;
            }
            HighlightTileDelegate.Model model = new HighlightTileDelegate.Model("ZERO_FEES_BANNER_LIST_ID", new TextLocalisedClause(R$string.crypto_home_zero_fees_title, u.c(new TimeClause(oi0.d.R(endDate), pretty, null, null, 12)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, null, null, null, null, new km(0), 1000);
            int i2 = R$attr.uikit_dp16;
            yp0.b.l(model, 0, 0, i2, i2, null, false, 51);
            listC = u.c(model);
        } else {
            listC = null;
        }
        Data slotManagerItemsData = domainState.f216456a;
        Intrinsics.checkNotNullParameter(slotManagerItemsData, "slotManagerItemsData");
        List list2 = (List) iii.c.f(slotManagerItemsData, new pj9.n(1), new pj9.m(3), new p2b.a(14));
        if (list2.size() > 2) {
            throw new IllegalArgumentException("slotManagerFeedControllerModelExtension is expected to emit 2 items max. API has changed!");
        }
        List<koi.j> list3 = list2;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (koi.j jVar : list3) {
            if (jVar instanceof hg) {
                r142 = (hg) jVar;
                int i3 = ((list2.size() == 2) && (r142.f54247b.size() > 1)) ? R$attr.uikit_dp0 : R$attr.uikit_dp8;
                int i5 = R$attr.uikit_dp0;
                yp0.b.r(r142, 0, i3, i5, i5, 1);
            } else {
                if (!(jVar instanceof ActionWidgetDelegate.Model)) {
                    throw new IllegalArgumentException("Unsupported slotManager item type: ".concat(jVar.getClass().getName()));
                }
                qv0.n nVar = (qv0.n) jVar;
                yp0.b.r(nVar, 0, R$attr.uikit_dp16, 0, 0, 13);
                r142 = (qv0.i) nVar;
            }
            arrayList.add(r142);
        }
        List listP0 = d0.P0(arrayList, new afa.a(new pj9.m(2), 6));
        ArrayList arrayListB = this.d.b(domainState.f216458c);
        List list4 = domainState.e;
        if (list4 == null) {
            list4 = f0.f322471a;
        }
        DisclaimerParams disclaimerParams = domainState.d;
        if (disclaimerParams != null) {
            UserCompanyRegion userCompanyRegion = disclaimerParams.f100019a;
            wi0.b countryCode = disclaimerParams.f100020b;
            boolean z = disclaimerParams.f100021c;
            boolean z3 = disclaimerParams.d;
            cbj.b bVar = (cbj.b) this.f216475a;
            c2 = 1;
            Intrinsics.checkNotNullParameter(userCompanyRegion, "userCompanyRegion");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            c3 = 3;
            ej ejVar = new ej("LEGAL_DISCLAIMER_ID", new c7(bVar.a(userCompanyRegion, countryCode, z, z3), false, d7.DISCLAIMER, 2));
            yp0.b.r(ejVar, 0, 0, 0, 0, 15);
            listC2 = u.c(ejVar);
        } else {
            c2 = 1;
            c3 = 3;
        }
        if (listC2 == null) {
            listC2 = f0.f322471a;
        }
        List[] elements = new List[6];
        elements[0] = list;
        elements[c2] = listC;
        elements[2] = listP0;
        elements[c3] = arrayListB;
        elements[4] = list4;
        elements[5] = listC2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new g(w.u(kotlin.collections.d.L(elements)));
    }
}
