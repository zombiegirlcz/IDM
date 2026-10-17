package e1d;

import android.os.Parcelable;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.topup.BookTransferResultDtoMappingKt;
import com.revolut.data.network.models.topup.CancelMultiCurrencyTransferDtoMappingKt;
import com.revolut.data.network.models.topup.CancelMultiCurrencyTransferResultDto;
import com.revolut.data.network.models.topup.McyBookTransferResultDto;
import com.revolut.data.network.models.topup.McyTransferReviewDto;
import com.revolut.data.network.models.topup.McyTransferReviewDtoMappingKt;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.payments.api.qr.QrCodeHandlingException;
import com.revolut.feature.semi_independent_onboarding.impl.R$string;
import com.revolut.feature.shared.beneficiary.api.common.QrScanResult;
import com.revolut.feature.shared.beneficiary.api.common.ReferenceField;
import com.revolut.feature.shared.beneficiary.api.domain.PaymentCodeType;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentification;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import dfl.r0;
import ds6.k;
import dx4.a1;
import f5j.r;
import f5j.t;
import ip0.nb0;
import ip0.pb0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jel.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.reflect.KProperty;
import org.bouncycastle.asn1.eac.CertificateBody;
import xo9.l;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121971a;

    public /* synthetic */ h(int i) {
        this.f121971a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xo9.e eVar;
        xo9.e eVar2;
        xi0.b bVar;
        str = null;
        String str = null;
        switch (this.f121971a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                f fVarA = j.a();
                s0 s0Var = new s0(3);
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB = nb0.b(nb0Var, "LIST_ID_LOADING_GUARDIAN", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                s0Var.a(pb0VarB);
                s0Var.a(new ListSubheaderDelegate.Model("LIST_ID_ACCOUNT_HIGHLIGHTS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.guardian_invitation_details_section_account_highlights_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                List listK = v.k(nb0.b(nb0Var, "LIST_ID_LOADING_HIGHLIGHT_1", false, 0, false, 30), nb0.b(nb0Var, "LIST_ID_LOADING_HIGHLIGHT_2", false, 0, false, 30), nb0.b(nb0Var, "LIST_ID_LOADING_HIGHLIGHT_3", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                s0Var.b(listK.toArray(new pb0[0]));
                ArrayList arrayList = s0Var.f186433a;
                return new g(fVarA, null, v.k(arrayList.toArray(new qv0.i[arrayList.size()])));
            case 1:
                xi0.b it8 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zi0.c.P(it8, false, null, 3);
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 3:
                List<del.a> list = ((del.b) obj2).e;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (del.a aVar : list) {
                    linkedHashMap.put(aVar.f113704a, aVar.b());
                }
                return linkedHashMap;
            case 4:
                CellDetailsActionDelegate.Model it9 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f51781a, "ITEM_ID_REPEATS_PERIOD"));
            case 5:
                LargeActionButtonDelegate.Model it10 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f52613a, "ITEM_ID_GOT_IT"));
            case 6:
                e7l.f it11 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                LinkedHashSet linkedHashSet = it11.M;
                ArrayList arrayList2 = new ArrayList(w.t(linkedHashSet, 10));
                Iterator it12 = linkedHashSet.iterator();
                while (it12.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it12.next(), arrayList2);
                }
                return d0.d1(arrayList2);
            case 7:
                CancelMultiCurrencyTransferResultDto it13 = (CancelMultiCurrencyTransferResultDto) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return CancelMultiCurrencyTransferDtoMappingKt.toDomain(it13);
            case 8:
                McyBookTransferResultDto it14 = (McyBookTransferResultDto) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return BookTransferResultDtoMappingKt.toDomain(it14);
            case 9:
                McyTransferReviewDto it15 = (McyTransferReviewDto) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return McyTransferReviewDtoMappingKt.toDomain(it15);
            case 10:
                List entryPoints = (List) obj2;
                Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
                fs3.i iVarU = ebm.a.u(entryPoints, fs3.b.OVERDRAFT);
                fs3.b bVar2 = iVarU.f137586a;
                String str2 = iVarU.f137587b;
                String str3 = iVarU.f137588c;
                a1 a1Var = iVarU.d;
                return new mp3.g("overdraft_account_item_id", bVar2, str2, str3, a1Var != null ? Integer.valueOf(a1Var.c()) : null, iVarU.e, cp5.d.L(iVarU.f));
            case 11:
                k it16 = (k) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it16);
            case 12:
                r0 page = (r0) obj2;
                Intrinsics.checkNotNullParameter(page, "page");
                return Boolean.valueOf(page.f114451b > 0);
            case 13:
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                if (!(exception instanceof ServerErrorException)) {
                    return efm.d0.l(exception);
                }
                switch (((ServerErrorException) exception).f.f51362a) {
                    case 50300:
                    case 50304:
                        eVar = new xo9.e(Integer.valueOf(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50300_title), Integer.valueOf(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50300_description), null, xo9.d.ERROR);
                        break;
                    case 50301:
                        eVar2 = new xo9.e(Integer.valueOf(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50301_title), Integer.valueOf(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50301_description), new xo9.c(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50301_action, com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(null, null, null, null, null, null, null, CertificateBody.profileType))))), xo9.d.ERROR);
                        eVar = eVar2;
                        break;
                    case 50302:
                        eVar2 = new xo9.e(Integer.valueOf(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50302_title), Integer.valueOf(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50302_description), new xo9.c(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50302_action, com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(null, null, null, null, null, null, null, CertificateBody.profileType))))), xo9.d.ERROR);
                        eVar = eVar2;
                        break;
                    case 50303:
                        eVar = new xo9.e(Integer.valueOf(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50303_title), Integer.valueOf(com.revolut.retail.feature.beneficiary.impl.R$string.payments_scan_qr_six_error_50303_description), null, xo9.d.ERROR);
                        break;
                    default:
                        eVar = null;
                        break;
                }
                QrCodeHandlingException qrCodeHandlingException = eVar != null ? new QrCodeHandlingException(eVar) : null;
                return qrCodeHandlingException == null ? efm.d0.l(exception) : efm.d0.l(qrCodeHandlingException);
            case 14:
                xo9.f qrCodeResult = (xo9.f) obj2;
                Intrinsics.checkNotNullParameter(qrCodeResult, "qrCodeResult");
                if (qrCodeResult instanceof xo9.a) {
                    throw new IllegalStateException("Expected Structured QR Code, got a Link one instead");
                }
                if (!(qrCodeResult instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                l lVar = (l) qrCodeResult;
                xo9.b bVar3 = lVar.f307754c;
                xo9.j jVar = bVar3.f307738b;
                Address address = jVar.d;
                String str4 = jVar.f307746a;
                r rVar = r.IBAN;
                dj0.d dVar = lVar.f307753b;
                if (dVar != null && (bVar = dVar.f115083b) != null) {
                    str = bVar.f306286a;
                }
                String str5 = str;
                String str6 = jVar.f307748c;
                String country = address.getCountry();
                String str7 = jVar.f307747b;
                if (str7 == null) {
                    str7 = "";
                }
                Map mapX = a0.d.x("IBAN", str7);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : mapX.entrySet()) {
                    if (!kotlin.text.d0.W((CharSequence) entry.getValue())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                f5j.a aVar2 = new f5j.a("SCANNED_BENEFICIARY_ID", "SCANNED_BENEFICIARY_ID", (String) null, str4, (String) null, (String) null, (String) null, str4, (String) null, (String) null, (String) null, rVar, address, str5, str6, (String) null, (t) null, country, (Boolean) null, (f5j.e) null, (Map) linkedHashMap2, new f5j.b(jVar.f307746a, null, null, null, address), (List) null, false, 0, 0L, (String) null, (BeneficiaryIdentification) null, (Instant) null, (String) null, 2144175940);
                dj0.d dVar2 = lVar.f307753b;
                ArrayList<xo9.k> arrayList3 = bVar3.f307739c;
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                for (xo9.k kVar : arrayList3) {
                    arrayList4.add(new ReferenceField(kVar.f307749a, kVar.f307751c, kVar.f307750b));
                }
                return new QrScanResult(aVar2, dVar2, null, arrayList4, bVar3.f307737a, PaymentCodeType.SWISS);
            case 15:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return d0.P0(it17, new e40.b());
            case 16:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("ID_BREAKDOWN_ITEM", i), false, 0, false, 30));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 17:
                e4b.e update = (e4b.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e4b.e.a(update, new Data(f0.f322471a, null, false, 6, null), null, null, null, 29);
            case 18:
                jel.c it18 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                q qVar = it18 instanceof q ? (q) it18 : null;
                if (qVar != null) {
                    return qVar.f;
                }
                throw new IllegalArgumentException(p.a.p("Instrument ", it18.i(), " needs ETF details for ETF Exposure Overview").toString());
            case 19:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 4);
                for (int i2 = 0; i2 < 4; i2++) {
                    arrayListP2.add(nb0.b(pb0.Companion, a0.d.n("exposureoverview.loading.", i2), false, 0, false, 30));
                }
                yp0.b.k(arrayListP2, 0, 0, 0, 0, 31);
                return e4h.h.b(arrayListP2);
            case 20:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new MoneyClause.Format.Defaults(null, null, false, false, 15);
            case 21:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new MoneyClause.Format.Defaults(null, null, false, false, 15);
            case 22:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new MoneyClause.Format.Defaults(null, null, false, false, 15);
            case 23:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new NumberClause.Format.AllDigitsAfterDot(null, null, 3);
            case 24:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new MoneyClause.Format.Defaults(null, null, false, false, 15);
            case 25:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new MoneyClause.Format.Defaults(null, null, false, false, 15);
            case 26:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new MoneyClause.Format.Defaults(null, null, false, false, 15);
            case 27:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new NumberClause.Format.AllDigitsAfterDot(null, null, 3);
            case 28:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                Set set = config.U;
                HashSet hashSet = new HashSet();
                Iterator it19 = set.iterator();
                while (it19.hasNext()) {
                    hashSet.add(((xi0.b) it19.next()).f306286a);
                }
                return hashSet;
            default:
                ty0.a it20 = (ty0.a) obj2;
                KProperty[] kPropertyArr = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f275445a;
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f121971a = i;
    }
}
