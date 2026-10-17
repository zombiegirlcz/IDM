package szb;

import android.content.Intent;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import cli.n;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.exchange.ExchangeRateDto;
import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jq9.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import prk.o;
import qv0.l;
import t05.u;
import t05.z;
import t0e.m;
import vkm.v1;
import yhm.r;
import z0h.p1;
import z0h.t1;
import z0h.y0;
import z0h.z0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266793a;

    public /* synthetic */ g(int i) {
        this.f266793a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        cv3.i iVar;
        int i = 0;
        switch (this.f266793a) {
            case 0:
                c it8 = (c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f266786c;
            case 1:
                c it9 = (c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.e;
            case 2:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return bool;
            case 3:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                Iterable iterable = (Iterable) getDefaultLoadingItems.invoke();
                ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                Iterator it10 = iterable.iterator();
                while (it10.hasNext()) {
                    arrayList.add(nb0.a(pb0.Companion, ((l) it10.next()).getF53900a(), false, 6));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 4:
                yvh.b autoInvest = (yvh.b) obj2;
                Intrinsics.checkNotNullParameter(autoInvest, "autoInvest");
                return Boolean.valueOf(autoInvest.f317177b && autoInvest.f == yvh.f.SPARE_CHANGE && autoInvest.e == yvh.h.CURRENT_POCKET);
            case 5:
                Boolean it11 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(!it11.booleanValue());
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 8:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new u((List) getDefaultLoadingItems2.invoke(), z.a());
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return t0c.g.a();
            case 10:
                t0e.f update = (t0e.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return t0e.f.a(update, new Data(null, null, true, 3, null));
            case 11:
                return new v1(new t0e.j((StatementUrlState) obj2, null));
            case 12:
                m.a aVar = m.Companion;
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayListP.add(t61.a.o("ID_TAX_YEAR_LOADING_", i2, pb0.Companion, false, 4));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 13:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM travel_experiences_booking").step();
                    return null;
                } finally {
                }
            case 14:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM travel_experiences_recently_viewed_dropoff").step();
                    return null;
                } finally {
                }
            case 15:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM travel_experiences_recent_search_destination").step();
                    return Unit.f186387a;
                } finally {
                }
            case 16:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM travel_experiences_recent_search_destination ORDER BY searchTimestamp DESC");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "searchTimestamp");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startDate");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endDate");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "locationType");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "destinationType");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new u0g.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow4)), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow5)), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 17:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) rVar.f314202b).booleanValue();
                boolean zBooleanValue3 = ((Boolean) rVar.f314203c).booleanValue();
                rzj.g gVar = rzj.g.STOCKS;
                if (!zBooleanValue) {
                    gVar = null;
                }
                rzj.g gVar2 = rzj.g.CRYPTO;
                if (!zBooleanValue2) {
                    gVar2 = null;
                }
                rzj.g[] elements = {gVar, gVar2, zBooleanValue3 ? rzj.g.COMMODITIES : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 18:
                String str = (String) obj2;
                if (str != null) {
                    cv3.i[] iVarArrValues = cv3.i.values();
                    int length = iVarArrValues.length;
                    while (true) {
                        if (i < length) {
                            iVar = iVarArrValues[i];
                            if (!a0.z(iVar.name(), str, true)) {
                                i++;
                            }
                        } else {
                            iVar = null;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "OfferV2DetailsDtoMapper.kt", p.a.p("Can't support ", str, " for CreditOfferIntroScreenDto.Prompt"), null, h0Var);
                return cv3.i.UNKNOWN;
            case 19:
                t1 disclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                y0 y0Var = y0.STOCKS;
                Links links = disclaimersData.f318563a;
                hel.b bVar = disclaimersData.f318564b;
                return new p1(zhm.u.c(new z0(y0Var, links, bVar)), bVar);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return t18.u.b();
            case 21:
                List balanceGroups = (List) obj2;
                Intrinsics.checkNotNullParameter(balanceGroups, "balanceGroups");
                return new t1j.c(balanceGroups);
            case 22:
                CountryProfile it12 = (CountryProfile) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zhm.u.c(it12);
            case 23:
                ExchangeRateDto exchangeRateDto = (ExchangeRateDto) obj2;
                Intrinsics.checkNotNullParameter(exchangeRateDto, "<destruct>");
                jo3.a aVarComponent1 = exchangeRateDto.getFrom();
                jo3.a aVarComponent2 = exchangeRateDto.getTo();
                jo3.a aVarComponent3 = exchangeRateDto.getFee();
                return new lrf.a(exchangeRateDto.getRate(), aVarComponent1.getCurrency(), aVarComponent2.getCurrency(), exchangeRateDto.getTimestamp(), aVarComponent1.getAmount(), aVarComponent2.getAmount(), aVarComponent3.getAmount(), aVarComponent3.getCurrency(), exchangeRateDto.getMarkup(), null, 512);
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                for (int i3 = 0; i3 < 3; i3++) {
                    eVarB.add(nb0.b(pb0.Companion, a0.d.n("STORE_BRAND_DETAIL_EARN_LOADING_", i3), true, 0, false, 28));
                }
                return new t2e.l(zhm.u.a(eVarB), 2, 0);
            case 26:
                kpi.a it13 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Intent intent = it13.f188248c;
                SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy = intent != null ? (SelectedPaymentMethodResultContract$SelectedCardBindingStrategy) intent.getParcelableExtra("EXTRA_SELECTED_CARD_BINDING_STRATEGY") : null;
                if (selectedPaymentMethodResultContract$SelectedCardBindingStrategy != null) {
                    return selectedPaymentMethodResultContract$SelectedCardBindingStrategy;
                }
                return null;
            case 27:
                InputTextDelegate.TextData it14 = (InputTextDelegate.TextData) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f52598b.toString();
            case 28:
                String str2 = (String) obj2;
                return o.m(str2, "it", str2, "SKIP_ACTION_LIST_ID");
            default:
                zm3.b groups = (zm3.b) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                List list = groups.f323334c;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                Iterator it15 = list.iterator();
                while (it15.hasNext()) {
                    arrayList3.add(new y((zm3.a) it15.next()));
                }
                return arrayList3;
        }
    }

    public /* synthetic */ g(n nVar, int i) {
        this.f266793a = i;
    }
}
