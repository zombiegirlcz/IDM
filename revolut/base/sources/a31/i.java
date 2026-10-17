package a31;

import androidx.compose.material.SnackbarHostKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.feature.junior_transfer.api.navigation.JuniorTransferKompotFeatureConfig;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$DomainDataItem;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jmrtd.lds.LDSFile;
import pcd.g0;
import zh9.u0;
import zhm.a1;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f971c;

    public /* synthetic */ i(Object obj2, String str, int i, boolean z) {
        this.f969a = i;
        this.f970b = str;
        this.f971c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set setM;
        TaxNumberInputScreenContract$DomainDataItem.Postcode postcode;
        TaxNumberInputScreenContract$DomainDataItem.TaxRegime taxRegime;
        int i = this.f969a;
        String code = this.f970b;
        boolean z = this.f971c;
        switch (i) {
            case 0:
                qua.p item = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                if (!Intrinsics.f(item.f249314a.f160150a, code)) {
                    return item;
                }
                qua.g gVar = item.f249332w;
                return qua.p.a(item, null, null, null, null, null, null, null, null, gVar != null ? qua.g.a(gVar, z, null, 495) : null, 0, null, -4194305, 33554431);
            case 1:
                qua.p item2 = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(item2, "item");
                if (!Intrinsics.f(item2.f249314a.f160150a, code)) {
                    return item2;
                }
                qua.g gVar2 = item2.f249332w;
                return qua.p.a(item2, null, null, null, null, null, null, null, null, gVar2 != null ? qua.g.a(gVar2, z, null, 495) : null, 0, null, -4194305, 33554431);
            case 2:
                bt2.e update = (bt2.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return bt2.e.a(update, null, null, null, this.f970b, this.f971c, null, 79);
            case 3:
                ebi.d update2 = (ebi.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                return new ebi.d(code, true, z);
            case 4:
                g2g.l updateState = (g2g.l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                TravelExperienceFiltersSelection travelExperienceFiltersSelection = updateState.f140057b;
                if (z) {
                    Set set = travelExperienceFiltersSelection.f92822c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : set) {
                        if (!Intrinsics.f((String) obj3, code)) {
                            arrayList.add(obj3);
                        }
                    }
                    setM = d0.i1(arrayList);
                } else {
                    setM = a1.m(travelExperienceFiltersSelection.f92822c, code);
                }
                return g2g.l.a(updateState, null, TravelExperienceFiltersSelection.a(travelExperienceFiltersSelection, null, null, setM, false, null, 27), 1);
            case 5:
                hib.e update3 = (hib.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                return new hib.e(code, z);
            case 6:
                jni.e update4 = (jni.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return jni.e.a(update4, this.f970b, 0L, this.f971c, null, null, false, LDSFile.EF_DG2_TAG);
            case 7:
                return k18.c.b(code, (List) obj2, z);
            case 8:
                neg.l update5 = (neg.l) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                String str = this.f970b;
                return neg.l.a(update5, null, null, null, null, null, null, str, str, null, this.f971c, null, 0L, 3391);
            case 9:
                o92.e update6 = (o92.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                ViaVerdeEnrollment enrollment = update6.f223061a;
                Intrinsics.checkNotNullParameter(enrollment, "enrollment");
                Intrinsics.checkNotNullParameter(code, "label");
                return new o92.e(enrollment, code, z);
            case 10:
                com.revolut.feature.tax_residency.impl.screens.tin.a updateState2 = (com.revolut.feature.tax_residency.impl.screens.tin.a) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                if (updateState2.f90130c != null) {
                    if (!kotlin.text.d0.W(code) && !z) {
                        z = true;
                    }
                    Intrinsics.checkNotNullParameter(code, "value");
                    postcode = new TaxNumberInputScreenContract$DomainDataItem.Postcode(code, z, z);
                } else {
                    postcode = null;
                }
                return com.revolut.feature.tax_residency.impl.screens.tin.a.a(updateState2, null, postcode, null, 11);
            case 11:
                com.revolut.feature.tax_residency.impl.screens.tin.a updateState3 = (com.revolut.feature.tax_residency.impl.screens.tin.a) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                TaxNumberInputScreenContract$DomainDataItem.TaxRegime taxRegime2 = updateState3.d;
                if (taxRegime2 != null) {
                    List regimes = taxRegime2.f90113a;
                    Intrinsics.checkNotNullParameter(regimes, "regimes");
                    Intrinsics.checkNotNullParameter(code, "selected");
                    taxRegime = new TaxNumberInputScreenContract$DomainDataItem.TaxRegime(code, regimes, z, !z);
                } else {
                    taxRegime = null;
                }
                return com.revolut.feature.tax_residency.impl.screens.tin.a.a(updateState3, null, null, taxRegime, 7);
            case 12:
                s92.e update7 = (s92.e) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                f92.b type = update7.f261090a;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(code, "reference");
                return new s92.e(type, code, z);
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                pcd.s sVar = (pcd.s) pair.f186385a;
                Set set2 = (Set) pair.f186386b;
                String str2 = sVar.f234881a;
                g0 g0Var = sVar.f234885h;
                if (set2.contains(str2)) {
                    throw new WidgetNotAvailableException(null, 3);
                }
                return new spb.c(this.f970b, w0.j(sVar), new TextClause(g0Var.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new dj0.d(g0Var.f234861c, kii.e.u(sVar, xi0.b.Companion)), this.f971c, new spb.o(sVar));
            case 14:
                bih.h updateState4 = (bih.h) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                LinkedHashMap linkedHashMapZ = r0.z(updateState4.f15498c);
                linkedHashMapZ.put(code, Boolean.valueOf(z));
                Unit unit = Unit.f186387a;
                return bih.h.a(updateState4, null, null, linkedHashMapZ, null, null, 59);
            case 15:
                uni.d update8 = (uni.d) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                z = code.length() > 0;
                update8.getClass();
                Intrinsics.checkNotNullParameter(code, "otpCode");
                return new uni.d(code, z, z);
            case 16:
                dj0.d cardBalance = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(cardBalance, "cardBalance");
                if (!cardBalance.k()) {
                    return rfm.h.f253943a;
                }
                ufm.b bVarM = efm.d0.m(u0.f(new JuniorTransferKompotFeatureConfig.JuniorTopUpPromptDestination(code, z)));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM.w();
            case 17:
                return SnackbarHostKt.FadeInFadeOutWithScale$lambda$2$0$1$0(z, code, null, (SemanticsPropertyReceiver) obj2);
            case 18:
                Set set3 = (Set) obj2;
                if (z) {
                    set3.add(code);
                } else {
                    set3.remove(code);
                }
                return Unit.f186387a;
            case 19:
                vni.b update9 = (vni.b) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                z = code.length() > 0;
                update9.getClass();
                Intrinsics.checkNotNullParameter(code, "otpCode");
                return new vni.b(code, z, z);
            case 20:
                List<OutboundTransactionLimit> limitList = (List) obj2;
                Intrinsics.checkNotNullParameter(limitList, "limitList");
                for (OutboundTransactionLimit outboundTransactionLimit : limitList) {
                    if (Intrinsics.f(outboundTransactionLimit.e, code)) {
                        Boolean bool = outboundTransactionLimit.f85486r;
                        if ((bool != null ? bool.booleanValue() : false) == z) {
                            return outboundTransactionLimit;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 21:
                return y7d.l.a((y7d.l) obj2, null, null, null, null, null, this.f970b, false, this.f971c, null, 0L, 863);
            case 22:
                yb4.f update10 = (yb4.f) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return yb4.f.a(update10, foh.i.w(code, Boolean.valueOf(z), update10.f312184a), null, 2);
            default:
                zgj.r update11 = (zgj.r) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return zgj.r.a(update11, null, null, null, null, null, null, z ? a1.m(update11.f322177g, code) : a1.j(update11.f322177g, code), null, null, null, null, null, null, null, null, 32703);
        }
    }

    public /* synthetic */ i(String str, boolean z, int i) {
        this.f969a = i;
        this.f970b = str;
        this.f971c = z;
    }

    public /* synthetic */ i(boolean z, String str, int i) {
        this.f969a = i;
        this.f971c = z;
        this.f970b = str;
    }
}
