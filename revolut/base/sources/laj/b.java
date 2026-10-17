package laj;

import aa0.q0;
import aa0.t0;
import aa0.w0;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import cli.y;
import cn3.b;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.backend_flow.domain.models.BackendFlowBinary;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreen;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d67.q;
import e7l.f;
import go.g;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lb0.r;
import lb0.s;
import lb0.t;
import lb0.u;
import lb0.v;
import lb0.w;
import lbc.x;
import lc0.b0;
import lc0.i;
import lc0.j;
import lc0.n;
import lc1.c;
import le3.m;
import lk0.e;
import lk0.h;
import mii.k;
import nii.y0;
import nii.z;
import nr6.c0;
import nr6.g0;
import skm.p0;
import tof.fc;
import tof.i7;
import tof.na;
import tof.oa;
import tof.q7;
import tof.va;
import tof.wa;
import tof.xa;
import vkm.j2;
import w4l.h;
import whf.p;
import ya1.l;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f193407b;

    public /* synthetic */ b(CategorisationFilter categorisationFilter, m mVar) {
        this.f193406a = 16;
        this.f193407b = categorisationFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object q0Var;
        Bitmap bitmap;
        ArrayList arrayList;
        jia.c cVar;
        dj0.d dVarO;
        c0 c0Var;
        List list;
        e eVar;
        int i = this.f193406a;
        int i2 = 3;
        int i3 = 1;
        int i5 = 10;
        int i6 = 2;
        ?? r112 = 0;
        th = null;
        th = null;
        Throwable th10 = null;
        Object obj3 = this.f193407b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) ((d) obj3).f193409b.get("KEY_NEWLY_ADDED_CRYPTO");
            case 1:
                com.revolut.core.backend_flow.impl.ui.form_screen.a aVar = (com.revolut.core.backend_flow.impl.ui.form_screen.a) obj3;
                w result = (w) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof s) {
                    q0Var = new t0(((s) result).f193560b);
                } else if (result instanceof r) {
                    q0Var = ((r) result).f193553b.f297794a;
                } else if (result instanceof u) {
                    PhoneInputItem.Country country = ((u) result).f193564b;
                    q0Var = new w0(country.f63575b, country.f63574a);
                } else if (result instanceof t) {
                    q0Var = ((t) result).f193562b.getF63622a();
                } else {
                    if (!(result instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BackendFlowBinary.Companion companion = BackendFlowBinary.INSTANCE;
                    BackendFlowUploadResult backendFlowUploadResult = ((v) result).f193566b;
                    q0Var = new q0(BackendFlowBinary.Companion.a(companion, new File(backendFlowUploadResult.f63288a), null, backendFlowUploadResult.f63289b, 2));
                }
                aVar.S2(q0Var, result.getItemId());
                return Unit.f186387a;
            case 2:
                return lb1.c.a((lb1.c) obj2, null, null, (l) obj3, 3);
            case 3:
                yac.e linkedTransactions = (yac.e) obj2;
                Intrinsics.checkNotNullParameter(linkedTransactions, "linkedTransactions");
                return new lbc.v((wbc.m) obj3, linkedTransactions);
            case 4:
                com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar2 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) obj3;
                aVar2.X1(new k("TRACKING_WIDGET_ADDED_DIALOG_ID", new TextLocalisedClause(R$string.revolut_pay_order_details_add_widget_tip_success_dialog, null, null, 14), null, null, null, 28));
                aVar2.l2(new x(0, aVar2, null), new yi5.b(26));
                return Unit.f186387a;
            case 5:
                CardPhotoScreen cardPhotoScreen = (CardPhotoScreen) obj3;
                abm.a aVar3 = (abm.a) obj2;
                CardPhotoScreen.Companion aVar4 = CardPhotoScreen.INSTANCE;
                if (aVar3 != null && (bitmap = aVar3.f2989a) != null) {
                    Resources resources = cardPhotoScreen.m2().getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    bitmap.setDensity(resources.getDisplayMetrics().densityDpi);
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    Matrix matrix = new Matrix();
                    matrix.postRotate(-aVar3.f2990b);
                    Bitmap bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    Intrinsics.checkNotNullExpressionValue(bitmap2, "createBitmap(...)");
                    bitmap.recycle();
                    b0 b0Var = (b0) cardPhotoScreen.d();
                    b0Var.getClass();
                    Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
                    if (b0Var.f193739p.f51306c == n.SELFIE_WITH_CARD) {
                        b0Var.f193744w.k(new i(bitmap2, true, new lc0.w(b0Var, i3)));
                    } else {
                        b0Var.L2(new l9k.v(b0Var, bitmap2, 9));
                    }
                }
                return Unit.f186387a;
            case 6:
                j updateStateWithCameraMode = (j) obj2;
                Intrinsics.checkNotNullParameter(updateStateWithCameraMode, "$this$updateStateWithCameraMode");
                return j.a(updateStateWithCameraMode, null, null, null, (lc0.l) obj3, null, false, 47);
            case 7:
                lc1.d dVar = (lc1.d) obj3;
                d67.u output = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, d67.s.f111464a)) {
                    dVar.C2(c.a.f193781a);
                } else if (Intrinsics.f(output, d67.t.f111465a)) {
                    dVar.C2(c.b.f193782a);
                } else if (Intrinsics.f(output, q.f111462a)) {
                    dVar.B2();
                } else {
                    dVar.B2();
                }
                return Unit.f186387a;
            case 8:
                yoj.a feature = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(feature, "feature");
                ((ld5.b) obj3).getClass();
                return (yoj.b.k(feature) && Intrinsics.f(feature.d.get("crypto_regulator_requirement"), "FCA")) ? new ed5.a(ed5.d.UK) : (yoj.b.k(feature) && Intrinsics.f(feature.d.get("crypto_regulator_requirement"), "BOL")) ? new ed5.a(ed5.d.EEA) : ed5.b.f124917a;
            case 9:
                n6c.a it8 = (n6c.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new ldc.b((com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e) obj3, it8);
            case 10:
                kge.d dVar2 = (kge.d) obj3;
                Boolean kycVerificationEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(kycVerificationEnabled, "kycVerificationEnabled");
                return kycVerificationEnabled.booleanValue() ? nim.a.w(((mt8.d) dVar2.f183974b).a(false), new lbh.a(13)) : zi0.c.j(Optional.empty());
            case 11:
                p it9 = (p) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return whf.n.a(((lde.m) obj3).f194087b, it9, null, null, null, 14);
            case 12:
                return !((Boolean) obj2).booleanValue() ? new g(new Data(Boolean.FALSE, null, false, 6, null), 2) : nim.a.v(((ldi.a) obj3).f194129a.c(h.f294642c), new lbh.a(15));
            case 13:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return new pfm.h(new la8.j((ldi.k) obj3, pagedData, i6), i6);
            case 14:
                le1.i iVar = (le1.i) obj3;
                Data productsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(productsData, "productsData");
                try {
                    Object content = productsData.getContent();
                    if (content != null) {
                        arrayList = new ArrayList();
                        for (Object obj4 : (List) content) {
                            if (Intrinsics.f(((CatalogueProduct) obj4).e, iVar.o.f60791a.f60669a)) {
                                arrayList.add(obj4);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return new Data(arrayList, productsData.getError(), productsData.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, productsData.getLoading());
                }
            case 15:
                return (le1.c) obj3;
            case 16:
                CategorisationFilter categorisationFilter = (CategorisationFilter) obj3;
                Boolean pocketsEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(pocketsEnabled, "pocketsEnabled");
                boolean zBooleanValue = pocketsEnabled.booleanValue();
                od0.i iVar2 = od0.i.f224256b;
                if (!zBooleanValue) {
                    od0.i.Companion.getClass();
                    return zi0.c.j(iVar2);
                }
                CategorisationFilter.Scope scope = categorisationFilter.f65743b;
                if (scope instanceof CategorisationFilter.Scope.PocketsIdSet) {
                    od0.h hVar = od0.i.Companion;
                    va vaVar = new va(((CategorisationFilter.Scope.PocketsIdSet) scope).f65754a);
                    hVar.getClass();
                    return zi0.c.j(od0.h.a(vaVar));
                }
                if (!(scope instanceof CategorisationFilter.Scope.AllPockets)) {
                    if (!(scope instanceof CategorisationFilter.Scope.Empty)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    od0.i.Companion.getClass();
                    return zi0.c.j(iVar2);
                }
                CategorisationFilter.Scope.AllPockets allPockets = (CategorisationFilter.Scope.AllPockets) scope;
                Set set = allPockets.f65751a;
                boolean z = allPockets.f65752b;
                i7.c cVar2 = i7.Companion;
                Set set2 = set;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(set2, 10));
                Iterator it10 = set2.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(new xa((io3.l) it10.next()));
                }
                xa[] xaVarArr = (xa[]) arrayList2.toArray(new xa[0]);
                i7[] i7VarArr = (i7[]) Arrays.copyOf(xaVarArr, xaVarArr.length);
                cVar2.getClass();
                oa oaVarB = i7.c.b(i7VarArr);
                od0.h hVar2 = od0.i.Companion;
                i7.c cVar3 = i7.Companion;
                na naVarB = z ? fc.b(new wa(io3.i.EXTERNAL)) : null;
                cVar3.getClass();
                q7 q7VarA = i7.c.a(oaVarB, naVarB);
                hVar2.getClass();
                return zi0.c.j(od0.h.a(q7VarA));
            case 17:
                List transactionCategories = (List) obj2;
                Intrinsics.checkNotNullParameter(transactionCategories, "transactionCategories");
                k7i.i iVar3 = ((le3.b0) obj3).f194454c;
                Intrinsics.checkNotNullParameter(transactionCategories, "transactionCategories");
                return pd.b.n(p0.f264003c, new pdi.j(transactionCategories, iVar3, null, i2));
            case 18:
                com.revolut.feature.junior_coparent.impl.ui.invitation.b bVar = (com.revolut.feature.junior_coparent.impl.ui.invitation.b) obj3;
                cn3.b result2 = (cn3.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, b.a.f25343a)) {
                    oki.h.D2(bVar.f76893s);
                } else {
                    if (!(result2 instanceof cn3.c)) {
                        if (result2 instanceof cn3.d) {
                            throw new UnsupportedOperationException("Group selection is not supported");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.n2(new le8.c(bVar, ((cn3.e) d0.K0(((cn3.c) result2).f25344a)).f25347a, r112, 0), new whi.b(6));
                }
                return Unit.f186387a;
            case 19:
                lh9.i iVar4 = (lh9.i) obj2;
                dj0.d amount = iVar4.f195180a;
                PaymentData paymentData = iVar4.f195181b;
                List fields = iVar4.d;
                String str = iVar4.e;
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(paymentData, "paymentData");
                Intrinsics.checkNotNullParameter(fields, "fields");
                return new lh9.i(amount, paymentData, (lh9.j) obj3, fields, str);
            case 20:
                c84.c cVar4 = (c84.c) obj3;
                Object obj5 = ((od0.i) obj2).f224257a;
                TradingAccount.TaxAdvantage taxAdvantage = obj5 instanceof TradingAccount.TaxAdvantage ? (TradingAccount.TaxAdvantage) obj5 : null;
                if (taxAdvantage != null) {
                    return taxAdvantage;
                }
                throw new IllegalStateException(a10.b.s("Can't find trading account with portfolioId ", ((TransferSubjectId) cVar4.f22078n).getF95657a(), " in TaxAdvantageCompositeAddMoneyToolbarControllerModelExtension"));
            case 21:
                th1.d screenResult = (th1.d) obj2;
                Intrinsics.checkNotNullParameter(screenResult, "screenResult");
                ((com.revolut.feature.address.common.impl.flow.screen.find.flow.a) obj3).C2(screenResult);
                return Unit.f186387a;
            case 22:
                zp0.t data = (zp0.t) obj2;
                KProperty[] kPropertyArr = JuniorPersonalDetailsScreen.Q;
                Intrinsics.checkNotNullParameter(data, "data");
                li8.j jVarE3 = ((JuniorPersonalDetailsScreen) obj3).d();
                Date date = data.f324143a;
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c cVar5 = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c) jVarE3;
                cVar5.H2(cVar5.u, new l9k.v(cVar5, date != null ? ebm.a.N(date) : null, 20));
                return Unit.f186387a;
            case 23:
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c cVar6 = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c) obj3;
                ji8.e output2 = (ji8.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar6.H2(cVar6.u, new b(output2, 24));
                return Unit.f186387a;
            case 24:
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a update = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a.a(update, null, null, null, null, ((ji8.e) obj3).f174386a, null, null, null, false, 495);
            case 25:
                kia.b bVar2 = (kia.b) obj3;
                g0 ordersBalance = (g0) obj2;
                Intrinsics.checkNotNullParameter(ordersBalance, "ordersBalance");
                ArrayList arrayList3 = ordersBalance.f218561b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : arrayList3) {
                    m71.a aVar5 = (m71.a) obj6;
                    dj0.d dVar3 = aVar5.f203278a;
                    Object obj7 = aVar5.f203279b;
                    if (dVar3 != null) {
                        nr6.b bVar3 = (nr6.b) obj7;
                        nr6.e eVar2 = bVar3.e;
                        LocalDateTime localDateTime = bVar3.f218538b;
                        if (eVar2 != null && !localDateTime.toLocalDate().isBefore(bVar2.f184190a) && !localDateTime.toLocalDate().isAfter(bVar2.f184191b) && ((c0Var = bVar3.d) == c0.PAID || c0Var == c0.PARTIALLY_PAID)) {
                            arrayList4.add(obj6);
                        }
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj8 : arrayList4) {
                    nr6.e eVar3 = ((nr6.b) ((m71.a) obj8).f203279b).e;
                    Object arrayList5 = linkedHashMap.get(eVar3);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(eVar3, arrayList5);
                    }
                    ((List) arrayList5).add(obj8);
                }
                ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    nr6.e eVar4 = (nr6.e) entry.getKey();
                    List list2 = (List) entry.getValue();
                    if (eVar4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    switch (lia.e.f195443a[eVar4.ordinal()]) {
                        case 1:
                            cVar = jia.c.PAYMENT_LINK;
                            break;
                        case 2:
                            cVar = jia.c.QR_CODE;
                            break;
                        case 3:
                            cVar = jia.c.INVOICE;
                            break;
                        case 4:
                            cVar = jia.c.CARD_READER;
                            break;
                        case 5:
                            cVar = jia.c.POS;
                            break;
                        case 6:
                            cVar = jia.c.APPLE_PAY;
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            cVar = jia.c.ECOMMERCE;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    xi0.b bVar4 = ordersBalance.f218560a.f115083b;
                    ArrayList<lia.a> arrayListA = lia.c.a(bVar2);
                    ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayListA, i5));
                    ?? r113 = r112;
                    for (lia.a aVar6 : arrayListA) {
                        ArrayList arrayList8 = new ArrayList();
                        ?? r114 = r113;
                        for (Object obj9 : list2) {
                            ?? r182 = r114;
                            LocalDate localDate = ((nr6.b) ((m71.a) obj9).f203279b).f218538b.toLocalDate();
                            g0 g0Var = ordersBalance;
                            if (!localDate.isBefore(aVar6.f195440a) && !localDate.isAfter(aVar6.f195441b)) {
                                arrayList8.add(obj9);
                            }
                            ordersBalance = g0Var;
                            r114 = r182;
                        }
                        g0 g0Var2 = ordersBalance;
                        ?? r183 = r114;
                        LocalDate localDate2 = aVar6.f195440a;
                        LocalDate localDate3 = aVar6.f195441b;
                        if (arrayList8.isEmpty()) {
                            dVarO = new dj0.d(0L, bVar4);
                        } else {
                            dj0.d.Companion.getClass();
                            dVarO = dj0.d.e;
                            int i21 = 0;
                            for (Object obj10 : arrayList8) {
                                int i22 = i21 + 1;
                                if (i21 < 0) {
                                    zhm.v.s();
                                    throw r183;
                                }
                                if (i21 == 0) {
                                    dVarO = ((m71.a) obj10).f203278a;
                                    if (dVarO == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    dj0.d dVar4 = ((m71.a) obj10).f203278a;
                                    if (dVar4 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    dVarO = pyd.c.O(dVarO, dVar4);
                                }
                                i21 = i22;
                            }
                        }
                        arrayList7.add(new jia.b(localDate2, localDate3, dVarO, arrayList8.size()));
                        ordersBalance = g0Var2;
                        r113 = r183;
                    }
                    g0 g0Var3 = ordersBalance;
                    ?? r184 = r113;
                    dj0.d.Companion.getClass();
                    dj0.d dVarO2 = dj0.d.e;
                    int i32 = 0;
                    for (Object obj11 : list2) {
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            zhm.v.s();
                            throw r184;
                        }
                        if (i32 == 0) {
                            dVarO2 = ((m71.a) obj11).f203278a;
                            if (dVarO2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            dj0.d dVar5 = ((m71.a) obj11).f203278a;
                            if (dVar5 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            dVarO2 = pyd.c.O(dVarO2, dVar5);
                        }
                        i32 = i33;
                    }
                    arrayList6.add(new jia.a(cVar, arrayList7, dVarO2, list2.size()));
                    ordersBalance = g0Var3;
                    r112 = r184;
                    i5 = 10;
                }
                return arrayList6;
            case 26:
                TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen = (TravelMilesFlightLocationPickerScreen) obj3;
                Integer num = (Integer) obj2;
                int i43 = travelMilesFlightLocationPickerScreen.M.f58165c;
                if (num != null && num.intValue() == i43) {
                    lig.p pVar = (lig.p) travelMilesFlightLocationPickerScreen.e3();
                    pVar.getClass();
                    h.b event = h.b.f196176a;
                    Intrinsics.checkNotNullParameter(event, "event");
                    y yVar = pVar.f195525t;
                    if (((lig.g) ((j2) yVar.f22677a).getValue()).f195508a.length() >= 3) {
                        lk0.g gVar = ((lig.g) ((j2) yVar.f22677a).getValue()).f195510c;
                        if (gVar != null && (list = gVar.f196174a) != null && (eVar = (e) d0.o0(list)) != null) {
                            th10 = eVar.e;
                        }
                        if (th10 == null) {
                            vfg.k kVar = pVar.f195522q;
                            kVar.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            kVar.f288625b.onNext(event);
                        }
                    }
                }
                return Unit.f186387a;
            case 27:
                lj1.a aVar7 = (lj1.a) obj3;
                f config = (f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                List list3 = config.f123381n;
                List list4 = config.o;
                List list5 = config.i;
                List listD1 = d0.d1(o8b.c.f222983j.keySet());
                rh1.b.Companion.getClass();
                List list6 = rh1.a.f254296c;
                List list7 = rh1.a.f254295b;
                List list8 = rh1.a.d;
                List list9 = rh1.a.e;
                List list10 = rh1.a.f;
                List list11 = rh1.a.f254297g;
                List list12 = rh1.a.f254298h;
                List list13 = config.f123398v1;
                List list14 = list13.isEmpty() ? null : list13;
                if (list14 == null) {
                    list14 = rh1.a.f254299j;
                }
                List list15 = list14;
                List list16 = rh1.a.i;
                List list17 = config.f123376j;
                List listA = ((o8b.c) aVar7.f195591c).a();
                ArrayList arrayList9 = new ArrayList(zhm.w.t(listA, 10));
                Iterator it11 = listA.iterator();
                while (it11.hasNext()) {
                    kii.e.B(wi0.b.Companion, (String) it11.next(), arrayList9);
                }
                return new sh1.n(list3, list4, list5, listD1, list6, list7, list8, list9, list10, list11, list12, list15, list16, list17, arrayList9, config.L1);
            case 28:
                com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.a aVar8 = (com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.a) obj3;
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PrequalificationFlowModel", null, it12, h0Var);
                yji.l.a1(aVar8, aVar8.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_error_subtitle, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, null, 7);
                return Boolean.TRUE;
            default:
                k9h.d dVar6 = (k9h.d) obj3;
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                List list18 = it13;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(list18, 10));
                Iterator it14 = list18.iterator();
                while (it14.hasNext()) {
                    arrayList10.add(dVar6.invoke(it14.next()));
                }
                return arrayList10;
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f193406a = i;
        this.f193407b = obj2;
    }

    public /* synthetic */ b(lia.f fVar, kia.b bVar) {
        this.f193406a = 25;
        this.f193407b = bVar;
    }
}
