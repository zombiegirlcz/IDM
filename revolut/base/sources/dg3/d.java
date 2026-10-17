package dg3;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.SavingsChallengeSetUpScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.FeatureTagData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.PlanFeatureResource;
import com.youTransactor.uCube.rpc.Constants;
import dh4.f;
import dh4.l;
import djc.t;
import dk9.o;
import dk9.s;
import dkb.g;
import dkb.j;
import hha.q0;
import ip0.cs;
import ip0.gs;
import ip0.gu;
import ip0.is;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import od0.i;
import org.bouncycastle.asn1.eac.CertificateBody;
import tof.a3;
import vf0.h;
import zh9.i0;
import zh9.r0;
import zh9.s0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114574a;

    public /* synthetic */ d(int i) {
        this.f114574a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean boolValueOf = null;
        switch (this.f114574a) {
            case 0:
                a0.d.B(obj2);
                Intrinsics.checkNotNullParameter(null, "it");
                throw null;
            case 1:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM account_notification_info");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastSeenTimestamp");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastActionTimestamp");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastTransactionTimestamp");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unreadCounter");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new gge.a((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 2:
                Intrinsics.checkNotNullParameter((f) obj2, "$this$update");
                return new f(new Data(null, null, true, 3, null));
            case 3:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i = R$string.refinancing_account_details_home_title;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    pb0 pb0Var = new pb0(a0.d.n("ID_LOADING_ITEM_", it9.nextInt() - 1));
                    yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(pb0Var);
                }
                return new l(textClause, textLocalisedClause, null, arrayList2, false);
            case 4:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return u.c(nb0.a(pb0.Companion, "loading-list-id", false, 6));
            case 5:
                q0 it11 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f152334a;
            case 6:
                NaviCommand it12 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.TRUE;
            case 7:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                i.Companion.getClass();
                return i.f224256b;
            case 8:
                djc.i update = (djc.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return djc.i.a(update, null, null, null, null, null, null, !update.f115303h, CertificateBody.profileType);
            case 9:
                djc.i update2 = (djc.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return djc.i.a(update2, Data.copy$default(update2.f115300b, null, null, true, 3, null), Data.copy$default(update2.f115301c, null, null, true, 3, null), Data.copy$default(update2.d, null, null, true, 3, null), null, null, null, false, Constants.TAG_TRANSACTION_DATA);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new t(djc.l.f115308a, f0.f322471a, false);
            case 11:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e = true;
                Json.f255101c = true;
                return Unit.f186387a;
            case 12:
                i it14 = (i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (i0) it14.f224257a;
            case 13:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(!d8l.d.k(it15).isEmpty());
            case 14:
                h hVar = (h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                i0 i0Var = (i0) hVar.f288433a;
                boolean zBooleanValue = ((Boolean) hVar.f288434b).booleanValue();
                Pair pair = (Pair) hVar.f288435c;
                return new o((a3) pair.f186386b, i0Var, (r0) pair.f186385a, zBooleanValue, (s0) hVar.d);
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new s(null, (List) getDefaultLoadingItems.invoke());
            case 16:
                gs gsVar = (gs) obj2;
                KProperty[] kPropertyArr = SavingsChallengeSetUpScreen.T;
                Intrinsics.checkNotNullParameter(gsVar, "<destruct>");
                return Boolean.valueOf(gsVar.f164466b.f110015b);
            case 17:
                gs it16 = (gs) obj2;
                KProperty[] kPropertyArr2 = SavingsChallengeSetUpScreen.T;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Integer.valueOf(it16.f164466b.f110014a);
            case 18:
                List challengeOnboardingList = (List) obj2;
                Intrinsics.checkNotNullParameter(challengeOnboardingList, "challengeOnboardingList");
                SavingsChallengeOnboarding savingsChallengeOnboarding = (SavingsChallengeOnboarding) d0.d0(challengeOnboardingList);
                if (savingsChallengeOnboarding != null) {
                    return savingsChallengeOnboarding;
                }
                throw new IllegalStateException("No valid challenges");
            case 19:
                Function0 it17 = (Function0) obj2;
                j.a aVar = j.Companion;
                Intrinsics.checkNotNullParameter(it17, "it");
                aim.e eVarB = u.b();
                eVarB.add(new is("SLIDER_LOADING_ITEM_ID"));
                List listK = v.k(new gu("REWARD_LOADING_SUBHEADER", 0, 0, 30), new pb0("REWARD_LOADING_ITEM_ID_1"), new pb0("REWARD_LOADING_ITEM_ID_2"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return new g(u.a(eVarB), false);
            case 20:
                dkj.g update3 = (dkj.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return dkj.g.a(update3, new Data(null, null, true, 3, null), null, 6);
            case 21:
                dkj.g update4 = (dkj.g) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return dkj.g.a(update4, null, null, 9);
            case 22:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                nb0 nb0Var = pb0.Companion;
                List listK2 = v.k(nb0.a(nb0Var, "ID_FEATURED_PHONE_NUMBER_0", false, 6), nb0.a(nb0Var, "ID_FEATURED_PHONE_NUMBER_1", false, 6), nb0.a(nb0Var, "ID_FEATURED_PHONE_NUMBER_2", false, 6), nb0.a(nb0Var, "ID_FEATURED_PHONE_NUMBER_3", false, 6), nb0.a(nb0Var, "ID_FEATURED_PHONE_NUMBER_4", false, 6), new cs("ID_REFRESH_BUTTON"));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return listK2;
            case 23:
                ti7.c limit = (ti7.c) obj2;
                Intrinsics.checkNotNullParameter(limit, "limit");
                dj0.d dVar = limit.f271429b;
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.I, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_car_hire_excess_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_car_hire_excess_subtitle_new, u.c(dok.b.b(dVar, null, null, null, 7)), null, 12), R$drawable.uikit_icn_24_driving_licence, (FeatureTagData) null, 34);
            case 24:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                List list = config.f123377k0;
                if (list != null) {
                    b93.b.Companion.getClass();
                    boolValueOf = Boolean.valueOf(list.contains(b93.b.u));
                }
                return Boolean.valueOf(pd.b.j(boolValueOf));
            case 25:
                FeatureTagData featureTagData = ((Boolean) obj2).booleanValue() ? new FeatureTagData(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.ultra_dashboard_badge_out_of_stock, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_16_sand_watch, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)) : null;
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.f0, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_ultra_card_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_ultra_card_subtitle, null, null, 14), R$drawable.uikit_icn_24_card, featureTagData, 2);
            case 26:
                dj0.d refundLimit = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(refundLimit, "refundLimit");
                int i2 = R$drawable.uikit_icn_24_shield;
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.f152342a0, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_trip_cancellation_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_trip_cancellation_subtitle, u.c(dok.b.b(refundLimit, null, null, null, 7)), null, 12), i2, (FeatureTagData) null, 34);
            case 27:
                dj0.d refundLimit2 = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(refundLimit2, "refundLimit");
                int i3 = R$drawable.uikit_icn_24_voucher;
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.f152344b0, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_event_ticket_cancellation_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_ticket_cancellation_subtitle, u.c(dok.b.b(refundLimit2, null, null, null, 7)), null, 12), i3, (FeatureTagData) null, 34);
            case 28:
                ti7.c limit2 = (ti7.c) obj2;
                Intrinsics.checkNotNullParameter(limit2, "limit");
                return limit2.f271429b;
            default:
                ti7.c limit3 = (ti7.c) obj2;
                Intrinsics.checkNotNullParameter(limit3, "limit");
                return limit3.f271429b;
        }
    }

    public /* synthetic */ d(com.revolut.feature.check_topup.impl.ui_kompot.flow.a aVar, yki.b bVar) {
        this.f114574a = 0;
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f114574a = i;
    }
}
