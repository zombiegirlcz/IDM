package yuc;

import android.content.Intent;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.data.network.models.topup.McyAllowedTravelCountries;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$BridgeDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$InputData;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.nb0;
import ip0.pb0;
import ip0.yl;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.bouncycastle.asn1.eac.CertificateBody;
import tof.a3;
import ulm.a1;
import ulm.b1;
import zh9.u0;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f316987b;

    public /* synthetic */ p(aii.r rVar, com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar, int i) {
        this.f316986a = i;
        this.f316987b = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object bVar;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        boolean zJ;
        String str;
        int i = this.f316986a;
        int i2 = 26;
        int i3 = 5;
        boolean z = true;
        boolean z3 = true;
        int i5 = 0;
        ?? bVar2 = 0;
        boolValueOf = null;
        Boolean boolValueOf3 = null;
        List list = null;
        Object obj3 = this.f316987b;
        switch (i) {
            case 0:
                i iVar = (i) obj3;
                Intrinsics.checkNotNullParameter((i) obj2, "$this$update");
                return iVar;
            case 1:
                yud.g gVar = (yud.g) obj3;
                List pocketFacades = (List) obj2;
                Intrinsics.checkNotNullParameter(pocketFacades, "pocketFacades");
                if (pocketFacades.isEmpty()) {
                    return zi0.c.i(f0.f322471a);
                }
                List list2 = pocketFacades;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(gVar.c(((zvd.b) it8.next()).f325661c.f115083b, w4l.h.f294642c));
                }
                return u0.k(arrayList);
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (McyAllowedTravelCountries) ((yue.b) obj3).f317017b.get("ALLOWED_COUNTRIES");
            case 3:
                cvi.g gVar2 = (cvi.g) obj3;
                yui.l update = (yui.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                yui.l lVarA = yui.l.a(update, null, null, null, null, gVar2.f109469a, null, null, null, null, null, false, false, false, false, 16367);
                return update.e != gVar2.f109469a ? yui.l.a(lVarA, null, null, null, null, 0, null, null, null, null, null, false, false, false, false, 11455) : lVarA;
            case 4:
                yui.l update2 = (yui.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return yui.l.a(update2, null, null, null, null, 0, null, ((evi.e) obj3).f129962a, null, null, null, false, false, false, false, 16319);
            case 5:
                avi.d dVar = (avi.d) obj3;
                yui.l update3 = (yui.l) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                yui.l lVarA2 = yui.l.a(update3, null, null, null, null, 0, dVar.f10043a, null, null, null, null, false, false, false, false, 16351);
                return !Intrinsics.f(update3.f, dVar.f10043a) ? yui.l.a(lVarA2, null, null, null, null, 0, null, null, null, null, null, false, false, false, false, 11455) : lVarA2;
            case 6:
                bti.d dVar2 = ((zsi.g) ((zsi.f) obj3)).f324937a;
                return yui.l.a((yui.l) obj2, null, null, null, null, 0, null, null, null, dVar2.f18588a, dVar2, false, false, false, false, 8447);
            case 7:
                yv1.l lVar = (yv1.l) obj3;
                zz1.e eVar = (zz1.e) obj2;
                sv1.d dVar3 = lVar.f317094p;
                int i6 = R$string.bre_b_area_more_add_toast_title;
                dVar3.getClass();
                lVar.X1(sv1.d.b(eVar, i6));
                if (eVar == zz1.e.COMPLETED) {
                    lVar.C2(yv1.f.f317088a);
                }
                return Unit.f186387a;
            case 8:
                yv2.f update4 = (yv2.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return yv2.f.a(update4, 0, null, null, false, null, false, false, (yv2.g) obj3, CertificateBody.profileType);
            case 9:
                com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a aVar = (com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a) obj3;
                mtk.d result = (mtk.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                aVar.H2(aVar.f104032s, new yrb.i(aVar, result, 22));
                return Unit.f186387a;
            case 10:
                yw9.e update5 = (yw9.e) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return yw9.e.a(update5, null, null, null, (iw9.b) obj3, null, 23);
            case 11:
                bof.r rVar = (bof.r) obj3;
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((o7.b) rVar.f17430c).getClass();
                List listC = zhm.u.c(new yl("PORTFOLIO_INSIGHTS_SUMMARY_LOADING_LIST_ID", 0, 30));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                ((axg.a) rVar.d).getClass();
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList2 = new ArrayList();
                vim.f it11 = intRange.iterator();
                while (it11.f289625c) {
                    int iNextInt = it11.nextInt();
                    yl ylVar = new yl(a0.d.n("LOADING_INDICATOR_HEADER_LIST_ID_", iNextInt), 0, 30);
                    List listC2 = zhm.u.c(nb0.b(pb0.Companion, a0.d.n("LOADING_INDICATOR_ROW_LIST_ID_", iNextInt), false, 0, false, 30));
                    i26.l.E(listC2);
                    List listK = zhm.v.k(ylVar, (qv0.l) d0.b0(listC2));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    a0.x(listK, arrayList2);
                }
                return i2b.a.o(listC, arrayList2);
            case 12:
                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) obj3;
                d67.u outputData = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(outputData, "result");
                fh8.a aVar2 = cVar.A;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof d67.s) {
                    bVar = new kg8.b(u0.b(aVar2.f135188a.a()));
                } else {
                    if (!(outputData instanceof d67.q) && !(outputData instanceof d67.t) && !(outputData instanceof d67.r) && !(outputData instanceof d67.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = kg8.a.f183931a;
                }
                if (bVar instanceof kg8.b) {
                    cVar.C1(((kg8.b) bVar).f183932a);
                } else {
                    if (!(bVar instanceof kg8.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.l2(new ywj.m(cVar, bVar2, i5), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 13:
                return PinCodeView.h0((PinCodeView) obj3, (ty0.a) obj2);
            case 14:
                FreelancerInvoiceSettings invoiceSettings = (FreelancerInvoiceSettings) obj2;
                Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
                ((yx6.b) obj3).r2().M0(new yx6.d(invoiceSettings.f73410m));
                return new wx6.g(null, invoiceSettings);
            case 15:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                FreelancerInvoice freelancerInvoice = (FreelancerInvoice) pair.f186385a;
                FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) pair.f186386b;
                ((yx6.g) obj3).r2().M0(new yx6.d(freelancerInvoice.v));
                return new wx6.g(freelancerInvoice, freelancerInvoiceSettings);
            case 16:
                RevPointsSpareChangeControllerApi$InputData inputData = (RevPointsSpareChangeControllerApi$InputData) obj3;
                p1c.h navigationPolicy = (p1c.h) obj2;
                Integer numValueOf = Integer.valueOf(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
                Intrinsics.checkNotNullParameter(navigationPolicy, "navigationPolicy");
                int i21 = yxb.d.f317612a[navigationPolicy.ordinal()];
                if (i21 == 1) {
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination(new RevPointsSpareChangeFullBannerGridControllerApi$InputData(inputData)), false, numValueOf, 0, 53));
                }
                if (i21 == 2) {
                    return gc0.c.f(new KompotOverlayFeatureConfig(new RevPointsSpareChangeControllerApi$BridgeDestination(inputData.f84125a), yhi.b.BOTTOM_DIALOG, numValueOf, 8));
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                yxh.e eVar2 = (yxh.e) obj3;
                dii.g it12 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                if (Intrinsics.f(it12, dii.f.f115069a)) {
                    yxh.d dVar4 = new yxh.d(eVar2, null);
                    eVar2.getClass();
                    eVar2.V2(new yv1.k(eVar2, dVar4, bVar2, i3), new yi5.b(29));
                }
                return Unit.f186387a;
            case 18:
                ((yxk.c) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM trading_onboarding_kyc");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nationalities");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "usTaxPayer");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rtlBrexitOptIn");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "documents");
                    if (sQLiteStatementPrepare.step()) {
                        Integer numValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                        List listK2 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        Integer numValueOf3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                        if (numValueOf3 == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf3.intValue() != 0);
                        }
                        Integer numValueOf4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                        if (numValueOf4 == null) {
                            boolValueOf2 = null;
                        } else {
                            if (numValueOf4.intValue() == 0) {
                                z = false;
                            }
                            boolValueOf2 = Boolean.valueOf(z);
                        }
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        if (text != null) {
                            kg.o oVarA = GsonHolder.a();
                            Type type = new TypeToken<List<? extends byk.a>>() { // from class: com.revolut.retail.feature.trading_onboarding.impl.data.database.typeconverters.TradingOnboardingKycDocumentListTypeConverter$toTradingOnboardingKycDocumentEntity$lambda$0$$inlined$fromJson$1
                            }.getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            Object objD = oVarA.d(text, type);
                            Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                            list = (List) objD;
                        }
                        bVar2 = new byk.b(numValueOf2, listK2, boolValueOf, boolValueOf2, list);
                    }
                    return bVar2;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 19:
                ((jz0.c) obj3).b();
                return Unit.f186387a;
            case 20:
                com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) obj3;
                v9d.a result2 = (v9d.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2.H2(cVar2.f73959s, new fz6.p(result2, z3 ? 1 : 0));
                return Unit.f186387a;
            case 21:
                Intrinsics.checkNotNullParameter((com.revolut.feature.kyc_documents_scan.ui.onfido.a) obj2, "$this$update");
                return new yy8.b((Intent) obj3);
            case 22:
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.a aVar3 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.a) obj3;
                yz9.c cVar3 = aVar3.f79760q;
                s8k.j result3 = (s8k.j) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if ((result3 instanceof s8k.g) || (result3 instanceof s8k.f)) {
                    cVar3.b(null);
                    aVar3.I2(null);
                } else if (result3 instanceof s8k.h) {
                    a3 a3Var = ((s8k.h) result3).f261066a;
                    cVar3.b(a3Var);
                    aVar3.I2(a3Var.f272579a);
                } else {
                    if (!(result3 instanceof s8k.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r6.b.D("Invalid result. Flow doesn't support transfer data capture");
                }
                return Unit.f186387a;
            case 23:
                com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a aVar4 = (com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) obj3;
                aii.q it13 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                aVar4.l2(new yzb.c(aVar4, bVar2, i5), new yi5.b(i2));
                return Unit.f186387a;
            case 24:
                yzc.c cVar4 = (yzc.c) obj3;
                yzc.f attachedFile = (yzc.f) obj2;
                Intrinsics.checkNotNullParameter(attachedFile, "attachedFile");
                if (attachedFile instanceof yzc.d) {
                    o80.b bVar3 = cVar4.f318066a;
                    String path = ((yzc.d) attachedFile).f318069c.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    bVar3.getClass();
                    zJ = o80.b.a(path);
                } else {
                    if (!(attachedFile instanceof yzc.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a1 a1Var = b1.Companion;
                    String str2 = ((yzc.e) attachedFile).f318073g;
                    a1Var.getClass();
                    b1 b1VarB = a1.b(str2);
                    if (b1VarB != null && (str = b1VarB.f281066b) != null) {
                        boolValueOf3 = Boolean.valueOf(str.equals("image"));
                    }
                    zJ = pd.b.j(boolValueOf3);
                }
                return Boolean.valueOf(zJ);
            case 25:
                List list3 = (List) obj2;
                Intrinsics.h(list3);
                ((BaseLayoutBuilderFragment) ((yzc.j) obj3)).setItems(list3);
                return Unit.f186387a;
            case 26:
                z0c.d update6 = (z0c.d) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return z0c.d.a(update6, ((z0c.j) obj3).f318211a, null, 5);
            case 27:
                return Recomposer.readObserverOf$lambda$0((ControlledComposition) obj3, obj2);
            case 28:
                return Recomposer.effectJob$lambda$0$0((Recomposer) obj3, (Throwable) obj2);
            default:
                return FontFamilyResolverImpl.createDefaultTypeface$lambda$0((FontFamilyResolverImpl) obj3, (TypefaceRequest) obj2);
        }
    }

    public /* synthetic */ p(Object obj2, int i) {
        this.f316986a = i;
        this.f316987b = obj2;
    }
}
