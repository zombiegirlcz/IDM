package a5b;

import a0e.o;
import android.os.Parcelable;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.view.compose.ActivityResultLauncherHolder;
import androidx.view.compose.ActivityResultRegistryKt;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContract;
import aw.a0;
import c5a.m0;
import cmf.i;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.chat.domain.model.ChatMessageToPass;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.apm.breb.impl.ui.new_alias.BrebAliasOtpData;
import com.revolut.feature.apm.core.code.ui.ApmCodeController;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$CodeDescriptor;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$InputData;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.CreditCardCancellationFlowContract$Step;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payments.messaging.data.api.model.MessageAuthor;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlow;
import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$InputData;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$PlanPagerItem;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import com.youTransactor.uCube.rpc.Constants;
import d67.s;
import dcl.v;
import f23.y;
import ggk.g1;
import ggk.h1;
import gsh.w;
import i9g.l;
import i9g.n0;
import ip0.ab;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k50.b1;
import k50.c0;
import k50.e0;
import k50.j4;
import k50.m1;
import k50.o0;
import k50.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import mv9.k;
import nii.y0;
import nii.z;
import nzj.n;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import pfm.m;
import q7c.j;
import r1i.h;
import til.r;
import tof.i7;
import tof.z6;
import v20.o2;
import vkm.j2;
import vkm.q0;
import yuc.p;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1335c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, int i) {
        this.f1333a = i;
        this.f1334b = obj2;
        this.d = obj3;
        this.f1335c = serializable;
        this.e = obj4;
        this.f = obj5;
    }

    private final Object a(Object obj2) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f1334b;
        hec.a aVar = (hec.a) this.d;
        String str = (String) this.f1335c;
        nt.e eVar = (nt.e) this.e;
        n nVar = (n) this.f;
        r it8 = (r) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        ref$BooleanRef.f186407a = true;
        aVar.f151681n.getClass();
        aVar.L2(rdc.d.a(false));
        Continuation continuation = null;
        yji.n.j2(aVar, ((j) aVar.f151680m).f(str), new w(aVar, eVar, continuation, 23), new y(aVar, nVar, continuation, 19), 2);
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    private final Object b(Object obj2) {
        h hVar = (h) this.f1334b;
        com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar = (com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a) this.f1335c;
        CharSequence charSequence = (CharSequence) this.d;
        h0 h0Var = (h0) this.e;
        ?? r4 = (q) this.f;
        ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
        Intrinsics.checkNotNullParameter(draft, "draft");
        return hVar == draft.f96882g ? (efm.f) r4.invoke(Long.valueOf(aVar.f96949n.b(charSequence.toString(), ((MoneyDetails) h0Var.invoke(draft)).f96897a.f306286a))) : m.f235744a;
    }

    private final Object c(Object obj2) {
        String str = (String) this.f1335c;
        LocalDate localDate = (LocalDate) this.f1334b;
        LocalDate localDate2 = (LocalDate) this.d;
        List list = (List) this.e;
        l lVar = (l) this.f;
        yhm.r rVar = (yhm.r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        HotelsProperty hotelsProperty = (HotelsProperty) rVar.f314201a;
        List list2 = (List) rVar.f314202b;
        do3.n nVar = (do3.n) rVar.f314203c;
        n0 n0Var = lVar.f159812b;
        String strA = n0Var.a(nVar);
        String strB = n0Var.b(nVar);
        String str2 = nVar.i;
        String str3 = nVar.f116411g;
        if (str3 == null) {
            m70.a.c(t0.f186434a);
            str3 = "";
        }
        afi.a aVar = new afi.a(str, hotelsProperty, localDate, localDate2, list, list2, strA, strB, str2, str3, 1024);
        return lVar.f159811a.a(aVar).g(efm.r.just(new Data(aVar, null, false, 6, null)));
    }

    private final Object d(Object obj2) {
        ivh.c cVar = (ivh.c) this.f1334b;
        String str = (String) this.f1335c;
        Function1 function1 = (Function1) this.d;
        Function1 function12 = (Function1) this.e;
        Function2 function2 = (Function2) this.f;
        Throwable error = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        kvh.h hVar = cVar.f168865l;
        ServerError serverErrorC = hVar.c(error);
        Continuation continuation = null;
        Integer numValueOf = serverErrorC != null ? Integer.valueOf(serverErrorC.f51362a) : null;
        kvh.g.c(kvh.h.Companion, str, error, null, 12);
        if (numValueOf == null || !((Boolean) function1.invoke(numValueOf)).booleanValue()) {
            TextLocalisedClause textLocalisedClauseB = hVar.b(error);
            ServerError serverErrorC2 = hVar.c(error);
            Integer numValueOf2 = serverErrorC2 != null ? Integer.valueOf(serverErrorC2.f51362a) : null;
            if (textLocalisedClauseB == null) {
                yji.n.j2(cVar, cVar.L2(new y0("UPDATE_APP_DIALOG_ID", new z(new TextLocalisedClause(R$string.product_eligibility_status_error_or_app_update_title, null, null, 14), new TextLocalisedClause(R$string.product_eligibility_status_error_or_app_update_description, null, null, 14), new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), new TextLocalisedClause(R$string.product_eligibility_status_app_update_button, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 4)), null, new i4g.d(new ivh.b(function2, numValueOf2, null, 1), new a54.g(cVar, continuation, 28), function12, (Continuation) null), 3);
            } else {
                yji.n.j2(cVar, cVar.L2(new y0("RETRY_DIALOG_ID", new z(textLocalisedClauseB, null, new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, new i4g.d(new ivh.b(function2, numValueOf2, null, 0), new a27.d(1, 5, null), function12, (Continuation) null), 3);
            }
        }
        return Boolean.TRUE;
    }

    private final Object e(Object obj2) {
        String str;
        v20.n nVar;
        j4 j4Var = (j4) this.f1334b;
        o2 o2Var = (o2) this.f1335c;
        xo0.e eVar = (xo0.e) this.d;
        ChatMessageToPass chatMessageToPass = (ChatMessageToPass) this.e;
        k50.h0 h0Var = (k50.h0) this.f;
        k50.h0 update = (k50.h0) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        m1 m1VarY3 = j4Var.y3(update.d, u.c(o2Var));
        o0 o0Var = update.e;
        CharSequence charSequence = o0Var.f181192a;
        long j2 = o0Var.f181193b;
        c0 c0Var = eVar != null ? new c0(chatMessageToPass.f51041b, eVar, e0.TEXT) : null;
        v20.n nVar2 = o0Var.f181194c;
        String str2 = o0Var.d;
        b1 b1VarA = b1.a(update.f181090r, null, null, null, null, 23);
        if (chatMessageToPass.f51042c && h0Var.e.f181193b == j2) {
            j2 += 100;
            charSequence = "";
            nVar = null;
            str = null;
        } else {
            str = str2;
            nVar = nVar2;
        }
        return j4Var.S.b3(k50.h0.a(update, null, null, null, m1VarY3, o0.a(update.e, charSequence, j2, nVar, str, false, null, null, 112), null, null, null, null, null, false, false, r0.f181222a, null, b1VarA, c0Var, false, null, null, null, null, null, null, null, 267943911));
    }

    private final Object g(Object obj2) {
        String str = (String) this.f1335c;
        String str2 = (String) this.f1334b;
        String str3 = (String) this.d;
        String str4 = (String) this.e;
        z6 z6Var = (z6) this.f;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pair.f186385a;
        return new i(str, str2, str3, str4, z6Var.f273203m, juniorBankingProfile.f77099b, (kq8.e) pair.f186386b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IOException {
        List list;
        ArrayList arrayList;
        ?? arrayList2;
        zme.g gVar;
        String str;
        zme.f fVar;
        ApmCodeControllerContract$CodeDescriptor email;
        ApmCodeControllerContract$CodeDescriptor email2;
        int i = this.f1333a;
        AliasType.REVTAG_EMAIL revtag_email = AliasType.REVTAG_EMAIL.f61896b;
        AliasType.ALPHANUMERIC alphanumeric = AliasType.ALPHANUMERIC.f61892b;
        AliasType.DOCUMENT_ID document_id = AliasType.DOCUMENT_ID.f61893b;
        AliasType.TAX_NUMBER tax_number = AliasType.TAX_NUMBER.f61897b;
        AliasType.EMAIL email3 = AliasType.EMAIL.f61894b;
        AliasType.PHONE phone = AliasType.PHONE.f61895b;
        Object obj3 = this.f1335c;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f1334b;
        switch (i) {
            case 0:
                g gVar2 = (g) obj7;
                String str2 = (String) obj3;
                xi0.b bVar = (xi0.b) obj6;
                n9l.b bVar2 = (n9l.b) obj5;
                Flow flow = (Flow) obj4;
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                int i2 = d.f1339a[portfolio.f296819b.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    vkm.f fVarF = ((ael.y) gVar2.f1342l).f(5L, str2);
                    akg.n nVarV = nim.a.v(u0.m(fVarF, boh.f.e(vkm.q.q(nim.a.v(fVarF, new a35.b(22))), new b(gVar2, str2, bVar, bVar2, 0))), new a0.c(gVar2, 22));
                    Continuation continuation = null;
                    int i3 = 1;
                    return new q0(new t38.e(new q0(nVarV, new e(gVar2, continuation, i3), 1), 24, flow, new o(gVar2, continuation, i3)), new e(gVar2, continuation, 0), 1);
                }
                if (i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar2.getClass();
                return new go.g(new Data(new b2b.a(f0.f322471a, portfolio, null), null, false, 6, null), 2);
            case 1:
                Data data = (Data) obj7;
                Data data2 = (Data) obj6;
                lgf.a aVar = (lgf.a) obj5;
                Data data3 = (Data) obj4;
                ahf.l lVar = (ahf.l) obj2;
                List list2 = (List) ((Data) obj3).getContent();
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                List list3 = list2;
                chf.g gVar3 = (chf.g) data2.getContent();
                if (gVar3 == null) {
                    gVar3 = chf.f.f24216a;
                }
                chf.g gVar4 = gVar3;
                List list4 = (List) data3.getContent();
                if (list4 == null) {
                    list4 = f0.f322471a;
                }
                return ahf.l.a(lVar, data, list3, null, false, gVar4, aVar, list4, 0, 0, null, 1820);
            case 2:
                xi0.b bVar3 = (xi0.b) obj3;
                j8l.d dVar = (j8l.d) obj5;
                BigDecimal bigDecimal = (BigDecimal) obj4;
                b6i.h update = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b6i.h.a(update, null, null, null, null, false, false, null, new OrderMode.Threshold(dVar, bigDecimal, (x5i.l) obj7, (xi0.b) obj6, bVar3), 0, 383);
            case 3:
                d67.u result = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                ((bmk.q) obj7).d3(result, (hha.d) obj3, (iha.h) obj6, (whk.e) obj5, null, new bkd.a(13), (Function1) obj4);
                return Unit.f186387a;
            case 4:
                DateTime dateTime = (DateTime) obj6;
                String str3 = (String) obj3;
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                k kVar = (k) ((r10.f) obj7).b;
                String strValueOf = String.valueOf(DateTimeUtils.currentTimeMillis());
                MessageAuthor messageAuthor = new MessageAuthor(r10.f.v0(user), null);
                Intrinsics.h(dateTime);
                return kVar.j(new MessageItem(strValueOf, dateTime, dv9.n.OUTGOING, dateTime, messageAuthor, str3, true, (MessageType) obj5, dv9.d.SENDING, dv9.f.ACTIVE), new dv9.k(r10.f.v0(user), str3), (String) obj4);
            case 5:
                Data realisedItemsData = (Data) obj3;
                Data contributorsData = (Data) obj6;
                vyg.f pnLType = (vyg.f) obj5;
                fzg.f pnLContributorsType = (fzg.f) obj4;
                bzg.k kVar2 = (bzg.k) obj2;
                ((com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) obj7).o.getClass();
                Intrinsics.checkNotNullParameter(realisedItemsData, "realisedItemsData");
                Intrinsics.checkNotNullParameter(contributorsData, "contributorsData");
                Intrinsics.checkNotNullParameter(pnLType, "pnLType");
                Intrinsics.checkNotNullParameter(pnLContributorsType, "pnLContributorsType");
                int i5 = tyg.b.f275568a[pnLType.ordinal()];
                if (i5 == 1) {
                    try {
                        Object content = realisedItemsData.getContent();
                        if (content != null) {
                            list = (List) content;
                            int i6 = tyg.b.f275569b[pnLContributorsType.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2 && i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!list.isEmpty()) {
                                ArrayList<List> arrayListP = ou5.b.p(list);
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListP, 10));
                                for (List list5 : arrayListP) {
                                    List list6 = list5;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list6, 10));
                                    Iterator it8 = list6.iterator();
                                    while (it8.hasNext()) {
                                        arrayList4.add(((rxg.j) it8.next()).d());
                                    }
                                    Iterator it9 = arrayList4.iterator();
                                    long j2 = 0;
                                    while (it9.hasNext()) {
                                        j2 += ((dj0.d) it9.next()).f115082a;
                                    }
                                    arrayList3.add(ou5.b.q(new dj0.d(j2, ((rxg.j) d0.b0(list5)).d().f115083b), list5));
                                }
                                list = arrayList3;
                            }
                        } else {
                            list = null;
                        }
                        contributorsData = new Data(list, realisedItemsData.getError(), realisedItemsData.getLoading());
                    } catch (Throwable th10) {
                        contributorsData = new Data(null, th10, realisedItemsData.getLoading());
                    }
                } else if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return bzg.k.a(kVar2, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, contributorsData, null, 1835007);
            case 6:
                c0i.e eVar = (c0i.e) obj6;
                k61.a aVar2 = ((c0i.h) obj5).f20289a;
                CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket pocket = (CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket) obj4;
                String str4 = (String) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                io3.d dVar2 = (io3.d) pair.f186385a;
                io3.d dVar3 = (io3.d) pair.f186386b;
                ((Ref$ObjectRef) obj7).f186409a = dVar2.e;
                c0i.a aVar3 = eVar.d;
                wd6.e eVar2 = eVar.f;
                int i21 = c0i.f.f20285a[aVar3.ordinal()];
                if (i21 == 1) {
                    return ((k61.i) aVar2).d(dVar2.f163145a, dVar3.f163145a, eVar.f20280a.f115082a, eVar.e, pocket.f96688b, eVar2 == wd6.e.BUY, eVar.f20283g, eVar.f20284h, str4);
                }
                if (i21 == 2) {
                    return ((k61.i) aVar2).e(dVar2.f163145a, dVar3.f163145a, eVar.f20282c.f115082a, eVar.e, pocket.f96688b, eVar2 == wd6.e.BUY, eVar.f20283g, eVar.f20284h, str4);
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                String str5 = (String) obj3;
                String str6 = (String) obj7;
                TransferNote.StructuredNote structuredNote = (TransferNote.StructuredNote) obj6;
                String str7 = (String) obj5;
                c4k.k kVar3 = (c4k.k) obj4;
                c4k.e update2 = (c4k.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                if (str6 == null) {
                    str6 = str5;
                }
                TransferNote.StructuredNote structuredNoteC = structuredNote.c(structuredNote.f101984a, str7, new TransferNote.StructuredNote.ReferenceValue(str5, str6));
                e5k.h hVar = new e5k.h(structuredNoteC, ((c4k.e) ((j2) kVar3.f21315p.f22677a).getValue()).f21306b);
                kVar3.o.getClass();
                return c4k.e.a(update2, structuredNoteC, e5k.g.a(hVar).f316033b, 2);
            case 8:
                com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a aVar4 = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) obj7;
                dj0.d dVar4 = (dj0.d) obj3;
                hl4.g gVar5 = (hl4.g) obj6;
                RepaymentDeferral repaymentDeferral = (RepaymentDeferral) obj5;
                PayoffBreakdown payoffBreakdown = (PayoffBreakdown) obj4;
                d67.u result2 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof s)) {
                    oki.h.D2(aVar4.z);
                } else if (dVar4 == null || !dVar4.f(dj0.d.e)) {
                    aVar4.l2(new m0(12, aVar4, dVar4, null, gVar5, null), new yi5.b(26));
                } else {
                    if (gVar5 == null) {
                        gVar5 = hl4.g.MANUAL;
                    }
                    oki.h.t2(aVar4, aVar4.z, new CreditCardCancellationFlowContract$Step.CheckoutScreen(gVar5, dVar4, repaymentDeferral, payoffBreakdown), true, null, false, 12);
                }
                return Unit.f186387a;
            case 9:
                d2i.b bVar4 = (d2i.b) obj6;
                k61.a aVar5 = ((d2i.e) obj5).f110853a;
                AccountId accountId = (AccountId) obj4;
                String str8 = (String) obj3;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                io3.d dVar5 = (io3.d) pair2.f186385a;
                io3.d dVar6 = (io3.d) pair2.f186386b;
                ((Ref$ObjectRef) obj7).f186409a = dVar5.e;
                d2i.c cVar = bVar4.d;
                wd6.e eVar3 = bVar4.f;
                int i22 = d2i.d.f110852a[cVar.ordinal()];
                if (i22 == 1) {
                    return ((k61.i) aVar5).d(dVar5.f163145a, dVar6.f163145a, bVar4.f110847a.f115082a, bVar4.e, accountId, eVar3 == wd6.e.BUY, bVar4.f110850g, bVar4.f110851h, str8);
                }
                if (i22 == 2) {
                    return ((k61.i) aVar5).e(dVar5.f163145a, dVar6.f163145a, bVar4.f110849c.f115082a, bVar4.e, accountId, eVar3 == wd6.e.BUY, bVar4.f110850g, bVar4.f110851h, str8);
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                return v.e((v) obj7, (String) obj3, (String) obj6, (eel.i) obj5, (ArrayList) obj4);
            case 11:
                Boolean bool = (Boolean) obj7;
                Boolean bool2 = (Boolean) obj3;
                Data settings = (Data) obj6;
                Data availableSaleTypes = (Data) obj5;
                Data vatProfile = (Data) obj4;
                Intrinsics.h(bool);
                boolean zBooleanValue = bool.booleanValue();
                Intrinsics.h(bool2);
                boolean zBooleanValue2 = bool2.booleanValue();
                ((e07.e) obj2).getClass();
                Intrinsics.checkNotNullParameter(settings, "settings");
                Intrinsics.checkNotNullParameter(availableSaleTypes, "availableSaleTypes");
                Intrinsics.checkNotNullParameter(vatProfile, "vatProfile");
                return new e07.e(settings, availableSaleTypes, vatProfile, zBooleanValue, zBooleanValue2);
            case 12:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj7;
                Comparator comparator = (Comparator) obj6;
                dz5.a aVar6 = (dz5.a) obj5;
                ez5.b bVar5 = (ez5.b) obj4;
                String str9 = (String) obj3;
                List ids = (List) obj2;
                Intrinsics.checkNotNullParameter(ids, "ids");
                LinkedHashMap linkedHashMapZ = zhm.r0.z(linkedHashMap);
                ArrayList arrayList5 = new ArrayList();
                Iterator it10 = ids.iterator();
                while (it10.hasNext()) {
                    Object objRemove = linkedHashMapZ.remove((String) it10.next());
                    if (objRemove != null) {
                        arrayList5.add(objRemove);
                    }
                }
                ArrayList arrayListF1 = d0.f1(arrayList5);
                if (linkedHashMapZ.isEmpty()) {
                    return efm.d0.m(arrayListF1);
                }
                ?? arrayList6 = new ArrayList(linkedHashMapZ.size());
                Iterator it11 = linkedHashMapZ.entrySet().iterator();
                while (it11.hasNext()) {
                    arrayList6.add(((Map.Entry) it11.next()).getValue());
                }
                if (comparator != null) {
                    arrayList6 = d0.P0(arrayList6, comparator);
                }
                int i32 = ez5.a.f130914a[aVar6.ordinal()];
                if (i32 == 1) {
                    arrayListF1.addAll(0, (Collection) arrayList6);
                    return bVar5.b(str9, arrayListF1, linkedHashMap).f(efm.d0.m(arrayListF1));
                }
                if (i32 == 2) {
                    arrayListF1.addAll((Collection) arrayList6);
                    return bVar5.b(str9, arrayListF1, linkedHashMap).f(efm.d0.m(arrayListF1));
                }
                if (i32 == 3) {
                    return efm.d0.m(arrayListF1);
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                TransactionsSort sort = (TransactionsSort) obj6;
                Priority priority = (Priority) obj5;
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                tif.q qVar = (tif.q) ((fif.m) obj7).f135410a;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(sort, "sort");
                Intrinsics.checkNotNullParameter(priority, "priority");
                return qVar.e.f(priority, new r5.c(qVar, (i7) obj3, sort, (BreadcrumbException) obj4, 4));
            case 14:
                String str10 = (String) obj3;
                List list7 = (List) obj7;
                fod.k kVar4 = (fod.k) obj6;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                amd.i iVar = (amd.i) obj4;
                fod.a dependencies = (fod.a) obj2;
                Intrinsics.checkNotNullParameter(dependencies, "dependencies");
                if (str10 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj8 : list7) {
                        if (Intrinsics.f(((Trip) obj8).f99263a, str10)) {
                            arrayList7.add(obj8);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it13 = arrayList7.iterator();
                    while (it13.hasNext()) {
                        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$IntervalC = kVar4.c((Trip) it13.next());
                        if (analyticsSpendingPeriod$IntervalC != null) {
                            arrayList8.add(analyticsSpendingPeriod$IntervalC);
                        }
                    }
                    arrayList = arrayList8;
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it14 = list7.iterator();
                    while (it14.hasNext()) {
                        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$IntervalC2 = kVar4.c((Trip) it14.next());
                        if (analyticsSpendingPeriod$IntervalC2 != null) {
                            arrayList9.add(analyticsSpendingPeriod$IntervalC2);
                        }
                    }
                    arrayList = arrayList9;
                }
                if (list7.isEmpty()) {
                    return new go.g(zi0.c.P(new fod.d(f0.f322471a, dependencies.f136922a, dependencies.f136923b), false, null, 3), 2);
                }
                kVar4.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj9 : list7) {
                    AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$IntervalC3 = kVar4.c((Trip) obj9);
                    Object arrayList10 = linkedHashMap2.get(analyticsSpendingPeriod$IntervalC3);
                    if (arrayList10 == null) {
                        arrayList10 = new ArrayList();
                        linkedHashMap2.put(analyticsSpendingPeriod$IntervalC3, arrayList10);
                    }
                    ((List) arrayList10).add(obj9);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((AnalyticsSpendingPeriod$Interval) entry.getKey()) != null) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList<Trip> arrayList11 = new ArrayList(linkedHashMap3.size());
                Iterator it15 = linkedHashMap3.entrySet().iterator();
                while (it15.hasNext()) {
                    arrayList11.add((Trip) d0.b0((List) ((Map.Entry) it15.next()).getValue()));
                }
                List list8 = (List) linkedHashMap2.get(null);
                if (list8 == null) {
                    list8 = f0.f322471a;
                }
                ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                for (Trip trip : arrayList11) {
                    AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$IntervalC4 = kVar4.c(trip);
                    if (analyticsSpendingPeriod$IntervalC4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList12.add(new Pair(analyticsSpendingPeriod$IntervalC4, kVar4.b(trip)));
                }
                ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayList12, 10));
                Iterator it16 = arrayList12.iterator();
                while (it16.hasNext()) {
                    arrayList13.add((AnalyticsSpendingPeriod$Interval) ((Pair) it16.next()).f186385a);
                }
                return vkm.q.H(new fod.e(list8, dependencies, linkedHashMap2, kVar4, null), kVar4.d(coroutineScope, dependencies, arrayList13, arrayList, zhm.r0.t(arrayList12), iVar));
            case 15:
                return ActivityResultRegistryKt.rememberLauncherForActivityResult$lambda$4$0((ActivityResultLauncherHolder) obj7, (ActivityResultRegistry) obj6, (String) obj3, (ActivityResultContract) obj5, (State) obj4, (DisposableEffectScope) obj2);
            case 16:
                List plans = (List) obj5;
                h1 layout = (h1) obj4;
                String str11 = (String) obj3;
                ghk.j update3 = (ghk.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data dataP = zi0.c.P((g1) obj7, false, null, 3);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e eVar4 = ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) obj6).o;
                eVar4.getClass();
                Intrinsics.checkNotNullParameter(plans, "plans");
                Intrinsics.checkNotNullParameter(layout, "layout");
                PlanLayoutType planLayoutType = eVar4.f103076a.d.f103060b;
                planLayoutType.getClass();
                if (planLayoutType instanceof PlanLayoutType.Default) {
                    ArrayList<hha.d> arrayListS = d8l.d.s(layout.f143727b, plans);
                    ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayListS, 10));
                    for (hha.d plan : arrayListS) {
                        String str12 = plan.f152287a;
                        Intrinsics.checkNotNullParameter(layout, "<this>");
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        arrayList14.add(new PlanPagerFlowContract$PlanPagerItem.PlanItem(str12, d8l.d.l(layout, plan.f152287a)));
                    }
                    boolean zIsEmpty = arrayList14.isEmpty();
                    List listC = arrayList14;
                    if (zIsEmpty) {
                        IllegalStateException illegalStateException = new IllegalStateException("plans cannot be matched to the layout");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "PlanPagerStateMapper", null, illegalStateException, h0Var);
                        listC = u.c(PlanPagerFlowContract$PlanPagerItem.PlanErrorItem.f103054a);
                    }
                    arrayList2 = listC;
                } else {
                    ArrayList<g1> arrayList15 = layout.f143727b;
                    arrayList2 = new ArrayList(zhm.w.t(arrayList15, 10));
                    for (g1 g1Var : arrayList15) {
                        arrayList2.add(new PlanPagerFlowContract$PlanPagerItem.PlanItem(g1Var.f143718a, g1Var));
                    }
                }
                return ghk.j.a(update3, arrayList2, str11, null, null, dataP, null, null, false, Constants.TAG_OS_VERSION);
            case 17:
                com.revolut.feature.tax_residency.impl.flows.tin.a aVar7 = (com.revolut.feature.tax_residency.impl.flows.tin.a) obj7;
                TaxNumberInputScreen taxNumberInputScreen = (TaxNumberInputScreen) obj3;
                zme.l lVar2 = (zme.l) obj6;
                List list9 = (List) obj5;
                List list10 = (List) obj4;
                roe.j outputData = (roe.j) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof roe.h) {
                    zme.f fVar2 = aVar7.f90080t.e;
                    if (fVar2 != null) {
                        boolean z = fVar2.d;
                        zme.f fVar3 = ((roe.h) outputData).f255983a;
                        wi0.b countryCode = fVar3.f323482a;
                        String str13 = fVar3.f323483b;
                        String str14 = fVar3.f323484c;
                        String str15 = fVar3.e;
                        String str16 = fVar3.f;
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        fVar = new zme.f(countryCode, str13, str14, z, str15, str16);
                    } else {
                        fVar = ((roe.h) outputData).f255983a;
                    }
                    aVar7.G2(new goe.b(fVar, false, false, "TAX_NUMBER_INPUT_SCREEN_LOADING_BUTTON_TAG"));
                } else {
                    if (!Intrinsics.f(outputData, roe.i.f255984a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TaxNumberInputScreenContract$InputData taxNumberInputScreenContract$InputData = (TaxNumberInputScreenContract$InputData) taxNumberInputScreen.G;
                    if (taxNumberInputScreenContract$InputData.f90125g && ((gVar = lVar2.d) == null || gVar.f323493n)) {
                        wi0.b bVar6 = taxNumberInputScreenContract$InputData.f90122a;
                        wi0.b bVar7 = lVar2.f323500a;
                        if (gVar == null || (str = gVar.e) == null) {
                            str = "";
                        }
                        yji.l.i2(aVar7, new TaxMissingRationaleFlow(new TaxMissingRationaleFlowContract$InputData(bVar6, bVar7, str, true, list9, list10)), null, new gbi.c(aVar7, lVar2, 28), 1);
                    } else {
                        aVar7.G2(new goe.b(new zme.f(lVar2.f323500a, null, null, false, null, null, 62), false, false, null));
                    }
                }
                return Unit.f186387a;
            case 18:
                String str17 = (String) obj3;
                String str18 = (String) obj7;
                Long l2 = (Long) obj6;
                Long l3 = (Long) obj5;
                String str19 = (String) obj4;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        UPDATE \n            payments_social_reactions \n        SET \n            status = COALESCE(?, status), \n            state = COALESCE(?, state), \n            createdDate = COALESCE(?, createdDate), \n            updatedDate = COALESCE(?, updatedDate) \n        WHERE \n            id = ?");
                try {
                    if (str17 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str17);
                    }
                    if (str18 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str18);
                    }
                    if (l2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindLong(3, l2.longValue());
                    }
                    if (l3 == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindLong(4, l3.longValue());
                    }
                    if (str19 == null) {
                        sQLiteStatementPrepare.bindNull(5);
                    } else {
                        sQLiteStatementPrepare.bindText(5, str19);
                    }
                    sQLiteStatementPrepare.step();
                    Unit unit = Unit.f186387a;
                    sQLiteStatementPrepare.close();
                    return unit;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 19:
                gw1.e eVar5 = (gw1.e) obj7;
                RegisterAlias$Alias registerAlias$Alias = (RegisterAlias$Alias) obj6;
                ApmAliasRegistrationMode apmAliasRegistrationMode = (ApmAliasRegistrationMode) obj5;
                String str20 = (String) obj3;
                Function1 function1 = (Function1) obj4;
                gw1.j jVar = (gw1.j) obj2;
                if (jVar instanceof gw1.i) {
                    fi7.s sVar = new fi7.s(2, function1, kotlin.jvm.internal.s.class, "suspendConversion1", "invokeSuspend$lambda$0$suspendConversion1(Lkotlin/jvm/functions/Function1;Lcom/revolut/feature/apm/core/models/alias/AliasOperation$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5);
                    ab abVar = ab.DIGITS_6;
                    AliasType aliasType = registerAlias$Alias.f61898a;
                    String str21 = registerAlias$Alias.f61899b;
                    if (Intrinsics.f(aliasType, phone)) {
                        email = new ApmCodeControllerContract$CodeDescriptor.Phone(str21);
                    } else {
                        if (!Intrinsics.f(aliasType, email3)) {
                            if (!Intrinsics.f(aliasType, tax_number) && !Intrinsics.f(aliasType, document_id) && !Intrinsics.f(aliasType, alphanumeric) && !Intrinsics.f(aliasType, revtag_email)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalArgumentException(aliasType + " unsupported");
                        }
                        email = new ApmCodeControllerContract$CodeDescriptor.Email(str21);
                    }
                    yji.n.P2(eVar5, new ApmCodeController(new ApmCodeControllerContract$InputData(abVar, email, new BrebAliasOtpData(aliasType, str21, zz1.j.CREATE), str20, 24)), null, new dqd.a(eVar5, sVar, apmAliasRegistrationMode, registerAlias$Alias, 18), 1);
                } else if (jVar instanceof gw1.h) {
                    function1.invoke(((gw1.h) jVar).f147271a);
                }
                return Unit.f186387a;
            case 20:
                gw1.g gVar6 = (gw1.g) obj7;
                Alias alias = (Alias) obj6;
                Alias alias2 = (Alias) obj5;
                String str22 = (String) obj3;
                p pVar = (p) obj4;
                gw1.j jVar2 = (gw1.j) obj2;
                if (jVar2 instanceof gw1.i) {
                    fi7.s sVar2 = new fi7.s(2, pVar, kotlin.jvm.internal.s.class, "suspendConversion1", "invokeSuspend$lambda$0$suspendConversion1(Lkotlin/jvm/functions/Function1;Lcom/revolut/feature/apm/core/models/alias/AliasOperation$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6);
                    gVar6.getClass();
                    ab abVar2 = ab.DIGITS_6;
                    AliasType aliasType2 = alias2.f61878a;
                    String str23 = alias2.f61879b;
                    if (Intrinsics.f(aliasType2, phone)) {
                        email2 = new ApmCodeControllerContract$CodeDescriptor.Phone(str23);
                    } else {
                        if (!Intrinsics.f(aliasType2, email3)) {
                            if (!Intrinsics.f(aliasType2, tax_number) && !Intrinsics.f(aliasType2, document_id) && !Intrinsics.f(aliasType2, alphanumeric) && !Intrinsics.f(aliasType2, revtag_email)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalArgumentException(aliasType2 + " unsupported");
                        }
                        email2 = new ApmCodeControllerContract$CodeDescriptor.Email(str23);
                    }
                    yji.n.P2(gVar6, new ApmCodeController(new ApmCodeControllerContract$InputData(abVar2, email2, new BrebAliasOtpData(aliasType2, str23, zz1.j.CREATE), str22, 24)), null, new dqd.a(gVar6, sVar2, alias, alias2, 19), 1);
                } else if (jVar2 instanceof gw1.h) {
                    pVar.invoke(((gw1.h) jVar2).f147271a);
                }
                return Unit.f186387a;
            case 21:
                t1j.d dVar7 = (t1j.d) obj4;
                return h2j.i.e((h2j.i) obj2, (Data) obj7, null, (j1j.d) obj3, null, null, null, (j1j.b) obj6, null, null, (CountryProfile) obj5, dVar7 != null ? dVar7.f267383b : null, 1786);
            case 22:
                return a(obj2);
            case 23:
                return b(obj2);
            case 24:
                return c(obj2);
            case 25:
                return d(obj2);
            case 26:
                Throwable it17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                efm.r rVarA = jqk.g.a((jqk.g) obj7, (i7) obj3, (TransactionContext) obj6, (Set) obj5, (i7) obj4);
                Intrinsics.checkNotNullExpressionValue(rVarA, "observeTransactionItems$fastTrack(...)");
                return rVarA;
            case 27:
                return e(obj2);
            case 28:
                return g(obj2);
            default:
                kv.p pVar2 = (kv.p) obj6;
                vw.a aVar8 = (vw.a) obj5;
                CameraCaptureSettings cameraCaptureSettings = (CameraCaptureSettings) obj4;
                String str24 = (String) obj3;
                a0 a0Var = (a0) obj2;
                yw.h hVar2 = pVar2.f189907c;
                int i33 = hVar2.b().f317230a.f317227a;
                aVar8.getClass();
                gv.k kVar5 = new gv.k((ByteBuffer) obj7, i33, aVar8.f292571b);
                xv.b bVar8 = a0Var.f10137a;
                vw.o oVar = bVar8.f309122a;
                int i43 = bVar8.f309123b;
                int i59 = bVar8.f309124c;
                long j3 = bVar8.d;
                InputStream inputStreamH = oVar.h();
                try {
                    String strA = pVar2.f189906b.a(inputStreamH);
                    inputStreamH.close();
                    return new gv.i(kVar5, new gv.l(oVar, i43, i59, strA, hVar2.b().f317231b.f317242a, ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50695b.f50701a.getF50734a(), j3, str24, a0Var.f10137a.e));
                } catch (Throwable th11) {
                    try {
                        throw th11;
                    } catch (Throwable th12) {
                        com.bumptech.glide.d.e(inputStreamH, th11);
                        throw th12;
                    }
                }
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f1333a = i;
        this.f1334b = obj2;
        this.f1335c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.f1333a = i;
        this.f1334b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.f1335c = str;
    }

    public /* synthetic */ a(String str, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1333a = i;
        this.f1335c = str;
        this.f1334b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(h hVar, com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar, CharSequence charSequence, h0 h0Var, Function1 function1) {
        this.f1333a = 23;
        this.f1334b = hVar;
        this.f1335c = aVar;
        this.d = charSequence;
        this.e = h0Var;
        this.f = (q) function1;
    }

    public /* synthetic */ a(yji.n nVar, Parcelable parcelable, Parcelable parcelable2, String str, Function1 function1, int i) {
        this.f1333a = i;
        this.f1334b = nVar;
        this.d = parcelable;
        this.e = parcelable2;
        this.f1335c = str;
        this.f = function1;
    }
}
