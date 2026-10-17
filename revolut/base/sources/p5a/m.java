package p5a;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.travel.hotels.impl.articles.StaysArticles;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import ip0.br;
import ip0.cr;
import ip0.cs;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.yl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import jq9.a0;
import jq9.b0;
import jq9.u;
import jq9.v;
import jq9.x;
import jq9.y;
import jq9.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233083a;

    public /* synthetic */ m(int i) {
        this.f233083a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Integer numM;
        int i = this.f233083a;
        od0.i iVar = od0.i.f224256b;
        qv0.i iVar2 = null;
        ProductArticleParams productArticleParams = null;
        iVar = null;
        od0.i iVar3 = null;
        switch (i) {
            case 0:
                Map results = (Map) obj2;
                Intrinsics.checkNotNullParameter(results, "results");
                ArrayList arrayListU = w.u(results.values());
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListU) {
                    jq9.t tVar = (jq9.t) obj3;
                    if ((tVar instanceof v) || (tVar instanceof jq9.w) || (tVar instanceof y)) {
                        arrayList.add(obj3);
                    } else if (!(tVar instanceof u) && !(tVar instanceof x) && !(tVar instanceof z) && !(tVar instanceof a0) && !(tVar instanceof b0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return arrayList;
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List listK = zhm.v.k(new yl("calculator_header_loading", 0, 30), new cr("calculator_slider_loading", br.START));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                cs csVar = new cs("calculator_button_loading");
                yp0.b.r(csVar, 0, 0, 0, 0, 15);
                return d0.F0(csVar, listK);
            case 2:
                od0.i itemOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(itemOptional, "itemOptional");
                qv0.i iVar4 = (qv0.i) itemOptional.g();
                if (iVar4 != null) {
                    yp0.b.l(iVar4, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                    iVar2 = iVar4;
                }
                od0.i.Companion.getClass();
                return od0.h.a(iVar2);
            case 3:
                p62.g update = (p62.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = Data.copy$default(update.f233204a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new p62.g(data);
            case 4:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return iii.c.c(1);
            case 5:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                gu guVar = new gu("LIST_ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "LIST_ID_LOADING_SCROLLER", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(guVar, pb0VarB);
            case 6:
                od0.i optionalWealthMarginBorrowingInterest = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalWealthMarginBorrowingInterest, "optionalWealthMarginBorrowingInterest");
                if (optionalWealthMarginBorrowingInterest.d() && ((WealthMarginBorrowingInterest) optionalWealthMarginBorrowingInterest.c()).f95668b.f(dj0.d.e)) {
                    iVar3 = optionalWealthMarginBorrowingInterest;
                }
                if (iVar3 != null) {
                    return iVar3;
                }
                od0.i.Companion.getClass();
                return iVar;
            case 7:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return f0.f322471a;
            case 8:
                ejb.b it12 = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f126837b;
            case 9:
                ejb.b it13 = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f126837b;
            case 10:
                List allProducts = (List) obj2;
                Intrinsics.checkNotNullParameter(allProducts, "allProducts");
                SavingsProductData savingsProductData = (SavingsProductData) d0.d0(allProducts);
                if (savingsProductData != null) {
                    return savingsProductData.f86683a;
                }
                return null;
            case 11:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB2 = nb0.b(nb0Var, "STRATEGY_REPORT_LOADING_STATE_ID_0", false, 0, false, 30);
                yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                pb0 pb0VarB3 = nb0.b(nb0Var, "STRATEGY_REPORT_LOADING_STATE_ID_1", false, 0, false, 30);
                yp0.b.l(pb0VarB3, 0, 0, 0, 0, null, false, 63);
                pb0 pb0VarB4 = nb0.b(nb0Var, "STRATEGY_REPORT_LOADING_STATE_ID_2", false, 0, false, 30);
                yp0.b.l(pb0VarB4, 0, 0, 0, 0, null, false, 63);
                return new p7f.n(p7f.l.f233765a, zhm.v.k(pb0VarB2, pb0VarB3, pb0VarB4));
            case 12:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 13:
                PaymentLinksTransferData it15 = (PaymentLinksTransferData) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f102235b;
            case 14:
                List consents = (List) obj2;
                Intrinsics.checkNotNullParameter(consents, "consents");
                List<q99.b> list = consents;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                for (q99.b bVar : list) {
                    Object obj4 = q99.d.f243840a;
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    arrayList2.add(new k89.a(bVar.getTitle(), bVar.getUrl()));
                }
                return arrayList2;
            case 15:
                q99.e eSignatureDto = (q99.e) obj2;
                Intrinsics.checkNotNullParameter(eSignatureDto, "eSignatureDto");
                od0.h hVar = od0.i.Companion;
                Object obj5 = q99.d.f243840a;
                Intrinsics.checkNotNullParameter(eSignatureDto, "<this>");
                String id10 = eSignatureDto.getId();
                Boolean isBackground = eSignatureDto.getIsBackground();
                ESignatureProcess eSignatureProcess = new ESignatureProcess(id10, isBackground != null ? isBackground.booleanValue() : false);
                hVar.getClass();
                return od0.h.a(eSignatureProcess);
            case 16:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                if (httpException == null || (numM = n14.e.m(httpException)) == null || numM.intValue() != 404) {
                    return efm.d0.l(throwable);
                }
                od0.i.Companion.getClass();
                ufm.b bVarM = efm.d0.m(iVar);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 17:
                q99.e eSignatureDto2 = (q99.e) obj2;
                Intrinsics.checkNotNullParameter(eSignatureDto2, "eSignatureDto");
                Object obj6 = q99.d.f243840a;
                Intrinsics.checkNotNullParameter(eSignatureDto2, "<this>");
                String id11 = eSignatureDto2.getId();
                Boolean isBackground2 = eSignatureDto2.getIsBackground();
                return new ESignatureProcess(id11, isBackground2 != null ? isBackground2.booleanValue() : false);
            case 18:
                p9g.f paData = (p9g.f) obj2;
                Intrinsics.checkNotNullParameter(paData, "paData");
                if (paData instanceof p9g.e) {
                    productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(StaysArticles.INTRO_WITH_POINTS_MAX_REWARD), a0.d.x("plan_rate", ((p9g.e) paData).f234314a));
                } else if (paData instanceof p9g.c) {
                    productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(StaysArticles.INTRO_WITH_CASHBACK));
                } else if (!(paData instanceof p9g.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                od0.i.Companion.getClass();
                return od0.h.a(productArticleParams);
            case 19:
                Throwable it16 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return p9g.d.f234313a;
            case 20:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                return Unit.f186387a;
            case 21:
                lf8.b it17 = (lf8.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                od0.h hVar2 = od0.i.Companion;
                lf8.j jVar = it17.f194665b;
                Integer num = jVar != null ? jVar.f194675c : null;
                hVar2.getClass();
                return od0.h.a(num);
            case 22:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                aim.e eVarB = zhm.u.b();
                eVarB.addAll(yp0.b.h(zhm.u.c(nb0.b(pb0.Companion, "ROW_LOADING_1", false, 0, false, 30)), new gu("LOADING_HEADER_1", 0, 0, 30), null, 0, 126));
                s7 s7Var = new s7("CELL_LOADING_1", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                s7 s7Var2 = new s7("CELL_LOADING_2", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                s7 s7Var3 = new s7("CELL_LOADING_3", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var3, 0, 0, 0, 0, null, false, 63);
                s7 s7Var4 = new s7("CELL_LOADING_4", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var4, 0, 0, 0, 0, null, false, 63);
                eVarB.addAll(yp0.b.h(zhm.v.k(s7Var, s7Var2, s7Var3, s7Var4), new gu("LOADING_HEADER_2", 0, 0, 30), null, 0, 126));
                return new pa8.k(zhm.u.a(eVarB), pa8.h.f234442a);
            case 23:
                efm.d0 activation = (efm.d0) obj2;
                Intrinsics.checkNotNullParameter(activation, "activation");
                return activation;
            case 24:
                List activations = (List) obj2;
                Intrinsics.checkNotNullParameter(activations, "activations");
                return w.u(activations);
            case 25:
                HashSet transactions = (HashSet) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return Integer.valueOf(transactions.size());
            case 26:
                dj0.d dVar = (dj0.d) obj2;
                if (dVar != null) {
                    return pb2.c.k(dVar);
                }
                return null;
            case 27:
                dj0.d dVar2 = (dj0.d) obj2;
                if (dVar2 != null) {
                    return pb2.c.k(dVar2);
                }
                return null;
            case 28:
                String str = (String) obj2;
                if (str != null) {
                    return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                return null;
            default:
                String str2 = (String) obj2;
                if (str2 != null) {
                    return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                return null;
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f233083a = i;
    }
}
