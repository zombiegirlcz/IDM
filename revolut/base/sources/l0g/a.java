package l0g;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.rev_points.models.RevPointsProductRate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAdditionalInformation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFeature;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLanguage;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreen;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l2b.f;
import l2c.x;
import m1c.f1;
import o5l.i;
import o5l.n;
import o5l.s;
import org.joda.time.LocalDate;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191243a;

    public /* synthetic */ a(int i) {
        this.f191243a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        switch (this.f191243a) {
            case 0:
                ozf.d dtoList = (ozf.d) obj2;
                Intrinsics.checkNotNullParameter(dtoList, "dtoList");
                List<ozf.c> items = dtoList.getItems();
                ArrayList arrayList = new ArrayList(w.t(items, 10));
                for (ozf.c cVar : items) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    String experienceId = cVar.getExperienceId();
                    String name = cVar.getName();
                    String subtitle = cVar.getSubtitle();
                    String image = cVar.getImage();
                    ozf.a parameters = cVar.getParameters();
                    Intrinsics.checkNotNullParameter(parameters, "<this>");
                    String startDate = parameters.getStartDate();
                    LocalDate localDate = startDate != null ? LocalDate.parse(startDate) : null;
                    String endDate = parameters.getEndDate();
                    arrayList.add(new nyf.c(experienceId, name, subtitle, image, new nyf.a(localDate, endDate != null ? LocalDate.parse(endDate) : null)));
                }
                break;
            case 1:
                break;
            case 2:
                n it8 = (n) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 3:
                i it9 = (i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Iterable iterable = it9.f.f222475a.f222479c;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                break;
            case 4:
                s it10 = (s) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                break;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                break;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                break;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                break;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                break;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                break;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 12:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                break;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
            case 14:
                TravelExperienceFeature it12 = (TravelExperienceFeature) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                break;
            case 15:
                TravelExperienceLanguage it13 = (TravelExperienceLanguage) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                break;
            case 16:
                TravelExperienceFeature it14 = (TravelExperienceFeature) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                break;
            case 17:
                TravelExperienceAdditionalInformation it15 = (TravelExperienceAdditionalInformation) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                break;
            case 18:
                ReferralContactDelegate.Model it16 = (ReferralContactDelegate.Model) obj2;
                KProperty[] kPropertyArr = WealthNewsArticleReaderScreen.f0;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj4 = it16.f53167l;
                j1h.a aVar = obj4 instanceof j1h.a ? (j1h.a) obj4 : null;
                if (aVar != null) {
                }
                break;
            case 19:
                l1k.i updateState = (l1k.i) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                break;
            case 20:
                l1k.i updateState2 = (l1k.i) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                break;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
            case 23:
                l26.b it17 = (l26.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) it17.e.getContent();
                if (deFiAssetDetails != null && (r11 = deFiAssetDetails.f71665a) != null) {
                    break;
                }
                break;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 26:
                od0.i optionalAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                String strC = f.c((TradingAccount) optionalAccount.f224257a);
                break;
            case 27:
                List revPointsProductRate = (List) obj2;
                Intrinsics.checkNotNullParameter(revPointsProductRate, "revPointsProductRate");
                Iterator it18 = revPointsProductRate.iterator();
                while (true) {
                    if (it18.hasNext()) {
                        Object next = it18.next();
                        if (((RevPointsProductRate) next).f84036b == f1.REVOLUT_CARD) {
                            obj3 = next;
                        }
                    }
                }
                break;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
        }
        return x.b();
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f191243a = i;
    }
}
