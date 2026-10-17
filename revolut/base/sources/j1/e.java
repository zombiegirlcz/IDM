package j1;

import android.os.Parcelable;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreen;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import efm.d0;
import ip0.b5;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import j1k.g;
import j28.i;
import j2f.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.MatchResult;
import org.jmrtd.lds.LDSFile;
import wp5.y;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170090a;

    public /* synthetic */ e(int i) {
        this.f170090a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        objArr = 0;
        Object[] objArr = 0;
        boolean z = false;
        switch (this.f170090a) {
            case 0:
                return LazyListState.Saver$lambda$1((List) obj2);
            case 1:
                j17.d updateState = (j17.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data upsellData = new Data(null, null, true, 3, null);
                updateState.getClass();
                Intrinsics.checkNotNullParameter(upsellData, "upsellData");
                return new j17.d(upsellData);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                eVarB.add(new gu("ID_LIST_HEADER_LOADING", 0, 0, 30));
                ArrayList arrayList = new ArrayList(4);
                for (int i = 0; i < 4; i++) {
                    arrayList.add(new s7(a0.d.n("ID_LIST_LOADING_", i), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                return u.a(eVarB);
            case 3:
                NewsDelegate.Model it8 = (NewsDelegate.Model) obj2;
                KProperty[] kPropertyArr = WealthDailyNewsScreen.c0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.k;
                rzj.f fVar = obj3 instanceof rzj.f ? (rzj.f) obj3 : null;
                if (fVar != null) {
                    return fVar.a();
                }
                return null;
            case 4:
                NewsDelegate.Model it9 = (NewsDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = WealthDailyNewsScreen.c0;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj4 = it9.k;
                rzj.f fVar2 = obj4 instanceof rzj.f ? (rzj.f) obj4 : null;
                if (fVar2 != null) {
                    return fVar2.e();
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return g.b();
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 7:
                TradingLegalEntityInformation it10 = (TradingLegalEntityInformation) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                hel.b bVar = it10.f105106a;
                switch (bVar == null ? -1 : i.f170726a[bVar.ordinal()]) {
                    case -1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                    case 2:
                        z = true;
                        break;
                }
                return Boolean.valueOf(z);
            case 8:
                n4l.e status = (n4l.e) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                n4l.c cVar = status instanceof n4l.c ? (n4l.c) status : null;
                if (cVar != null && cVar.f212470a) {
                    objArr = 1;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_settings_stocks_lending_revamp_title, null, null, 14);
                TextLocalisedClause[] elements = {objArr != 0 ? new TextLocalisedClause(R$string.wealth_invest_settings_stocks_lending_revamp_description_active, null, new Custom(Integer.valueOf(R$attr.uikit_colorPerformancePositive), false, null, false, null, 254), 10) : null, new TextLocalisedClause(R$string.wealth_invest_settings_stocks_lending_revamp_description, null, null, 14)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new RowDelegate.Model("LIST_ID_AUTOMATIONS_STOCK_LENDING", new RowDelegate.Model.MainImage.Image40(j28.c.b(R$drawable.uikit_icn_24_percent), objArr != 0 ? new SuccessCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), textLocalisedClause, null, 0, v1.c.f(kotlin.collections.d.L(elements), null), null, null, 0, j28.c.a(), false, null, false, null, null, null, null, null, null, status, null, 0, 0, 0, 0, 532675544);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return j2c.i.f170813a;
            case 11:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "feature", aVar);
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB2 = u.b();
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                vim.f it11 = intRange.iterator();
                while (it11.f289625c) {
                    arrayList2.add(nb0.b(pb0.Companion, a0.d.n("AVAILABLE_VOUCHERS_LOADING_ITEM_LIST_ID", it11.nextInt()), false, 0, false, 30));
                }
                eVarB2.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("AVAILABLE_VOUCHERS_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278), null, 0, 0, 126));
                IntRange intRange2 = new IntRange(0, 3, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange2, 10));
                vim.f it12 = intRange2.iterator();
                while (it12.f289625c) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("USED_VOUCHERS_LOADING_ITEM_LIST_ID", it12.nextInt()), false, 0, false, 30));
                }
                eVarB2.addAll(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("USED_VOUCHERS_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278), null, 0, 0, 126));
                return u.a(eVarB2);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return h.f170851a;
            case 14:
                return j2g.h.a((j2g.h) obj2, null, null, null, null, new Data(null, null, true, 3, null), null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 15:
                ro3.e dto = (ro3.e) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return dto.getId();
            case 16:
                j33.i update = (j33.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j33.i.a(update, null, null, false, !update.e, null, null, LDSFile.EF_DG15_TAG);
            case 17:
                return j33.i.a((j33.i) obj2, null, null, false, true, null, null, LDSFile.EF_DG15_TAG);
            case 18:
                return j33.i.a((j33.i) obj2, null, null, !pd.b.j(r2.f170942c), false, null, null, LDSFile.EF_SOD_TAG);
            case 19:
                return j33.i.a((j33.i) obj2, null, null, !r2.d, false, null, null, LDSFile.EF_SOD_TAG);
            case 20:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB3 = u.b();
                eVarB3.add(j37.e.a(false));
                List listC = u.c(new b5("LIST_ID_CALENDAR_LOADER"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                eVarB3.addAll(listC);
                return u.a(eVarB3);
            case 22:
                TaxHubCalendarEvent calendarEvent = (TaxHubCalendarEvent) obj2;
                Intrinsics.checkNotNullParameter(calendarEvent, "calendarEvent");
                return calendarEvent;
            case 23:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("LIST_ID_TRANSACTIONS_LOADER_", i2), false, 0, false, 30));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 24:
                MatchResult matchResult = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(matchResult, "matchResult");
                return matchResult.getValue();
            case 25:
                String it13 = (String) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                String lowerCase = it13.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 26:
                yoj.a aVar2 = (yoj.a) obj2;
                return y.s(aVar2, "feature", aVar2);
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return d0.m(Boolean.TRUE);
            case 28:
                yoj.a aVar3 = (yoj.a) obj2;
                return y.s(aVar3, "feature", aVar3);
            default:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM holdings");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolio_id");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "creation_date");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holding_state");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cash_holding");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stock_holding");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList4.add(new o3f.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3)), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
                        break;
                    }
                    return arrayList4;
                } finally {
                    sQLiteStatementPrepare.close();
                }
        }
    }

    public /* synthetic */ e(Object obj2, int i) {
        this.f170090a = i;
    }
}
