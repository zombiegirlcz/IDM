package j3f;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract$ImageGenerationRejected;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfo;
import com.revolut.feature.revolut_shop.api.domain.model.FiscalProfileDetails;
import com.revolut.shared.feature.wealth.models.config.Links;
import do3.q;
import eel.j;
import eel.k;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import j4c.n;
import j53.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171180a;

    public /* synthetic */ d(int i) {
        this.f171180a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f171180a) {
            case 0:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM portfolios");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_types");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "balance");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "kyc");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "disclosures");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "info");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "onboardedDate");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offboardedDate");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new p3f.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow9)), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 1:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return "?";
            case 2:
                String it9 = (String) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return "?";
            case 3:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new j45.g(new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_account_selector_title, null, null, 14), null, (List) getDefaultLoadingItems.invoke(), false, false);
            case 4:
                FiscalProfileDetails it10 = (FiscalProfileDetails) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f84193b;
            case 5:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new n(true, (List) getDefaultLoadingItems2.invoke());
            case 6:
                Links it11 = (Links) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f105090b;
            case 7:
                eel.e it12 = (eel.e) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return j.a(k.Companion, it12);
            case 8:
                Data it13 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Long.valueOf(it13.getLoading() ? 500L : 0L);
            case 9:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return new j53.i(true);
            case 10:
                l update2 = (l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return new j53.k(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null);
            case 11:
                return new j53.j(null);
            case 12:
                return new j53.j(new CustomisationImageGenerationControllerContract$ImageGenerationRejected());
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 14:
                do3.n it14 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return q.y(it14);
            case 15:
                do3.n it15 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return q.y(it15);
            case 16:
                do3.n it16 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return q.y(it16);
            case 17:
                rp0.q it17 = (rp0.q) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f256153a;
            case 18:
                j6a.g update3 = (j6a.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return j6a.g.a(update3, null, null, null, null, false, 79);
            case 19:
                j6a.g update4 = (j6a.g) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return j6a.g.a(update4, null, null, null, null, true, 95);
            case 20:
                j6b.c update5 = (j6b.c) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return j6b.c.a(update5, null, 15);
            case 21:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems3.invoke();
            case 22:
                j6f.a it18 = (j6f.a) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18;
            case 23:
                List dto = (List) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                z8l.h hVar = (z8l.h) d0.b0(dto);
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                ufm.b bVarM = efm.d0.m(new k71.c(hVar.getGroupId()));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 24:
                od0.i it19 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                od0.h hVar2 = od0.i.Companion;
                n38.a aVar = (n38.a) it19.g();
                String str = aVar != null ? aVar.f211923a : null;
                hVar2.getClass();
                return od0.h.a(str);
            case 25:
                j6k.i iVar = (j6k.i) obj2;
                Intrinsics.checkNotNullParameter(iVar, "<destruct>");
                return iVar.f171808a;
            case 26:
                List infos = (List) obj2;
                Intrinsics.checkNotNullParameter(infos, "infos");
                List list = infos;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it20 = list.iterator();
                while (it20.hasNext()) {
                    arrayList2.add(((zlg.c) it20.next()).f323250a.f116395a);
                }
                return d0.i1(arrayList2);
            case 27:
                do3.n it21 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return y0.b(it21.f116408a);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                pb0 pb0VarB = nb0.b(pb0.Companion, "account_row_loading_item_list_id", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarB);
                List listK = v.k(new s7("repayment_day_item_loading_list_id", 0, 0, 0, 0, false, null, 126), new s7("final_repayment_item_loading_list_id", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return u.a(eVarB);
            default:
                CobrandedCardsPlanHubInfo planHubInfo = (CobrandedCardsPlanHubInfo) obj2;
                Intrinsics.checkNotNullParameter(planHubInfo, "planHubInfo");
                return planHubInfo.e.f82410b;
        }
    }
}
