package psl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_embedded.impl.data.model.ActivateCoverageWidget;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import com.revolut.feature.insurance_embedded.impl.data.model.Website;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.InsuranceCoverageActivationFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.InsuranceCoverageActivationFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreenContract$ModalStep;
import com.revolut.feature.rev_points.exclusive_store.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pv7.o;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239530a;

    public /* synthetic */ m(int i) {
        this.f239530a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f239530a) {
            case 0:
                Throwable th10 = (Throwable) obj2;
                if (((tsl.j) obj3) == null) {
                    return th10;
                }
                return null;
            case 1:
                Throwable th11 = (Throwable) obj2;
                if (((tsl.j) obj3) == null) {
                    return th11;
                }
                return null;
            case 2:
                Throwable th12 = (Throwable) obj2;
                if (((tsl.j) obj3) == null) {
                    return th12;
                }
                return null;
            case 3:
                Throwable th13 = (Throwable) obj2;
                if (((tsl.j) obj3) == null) {
                    return th13;
                }
                return null;
            case 4:
                Throwable th14 = (Throwable) obj2;
                if (((tsl.j) obj3) == null) {
                    return th14;
                }
                return null;
            case 5:
                Throwable th15 = (Throwable) obj2;
                if (((hel.a) obj3) == null) {
                    return th15;
                }
                return null;
            case 6:
                Throwable th16 = (Throwable) obj2;
                if (((hel.a) obj3) == null) {
                    return th16;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new ptf.h(iii.c.b(null, null, 6, false), false);
            case 9:
                Throwable error = (Throwable) obj2;
                wi0.b bVar = (wi0.b) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bVar == null) {
                    return error;
                }
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "getDefaultErrorItems");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 12:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(ivi.a.f168867a);
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 14:
                Throwable error2 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool == null) {
                    return error2;
                }
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 16:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return puk.h.f239937a;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 20:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InsuranceDetailsLayoutScreenContract$ModalStep step = (InsuranceDetailsLayoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof InsuranceDetailsLayoutScreenContract$ModalStep.ConditionsDetails) {
                    return new EmbeddedBottomSheetScreen(new EmbeddedBottomSheetScreenContract$InputData(((InsuranceDetailsLayoutScreenContract$ModalStep.ConditionsDetails) step).f76114a));
                }
                if (!(step instanceof InsuranceDetailsLayoutScreenContract$ModalStep.CoverageActivation)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActivateCoverageWidget activateCoverageWidget = ((InsuranceDetailsLayoutScreenContract$ModalStep.CoverageActivation) step).f76115a;
                String str = activateCoverageWidget.d;
                List list = activateCoverageWidget.e;
                Website website = activateCoverageWidget.f;
                return new InsuranceCoverageActivationFlow(new InsuranceCoverageActivationFlowContract$InputData(str, list, new SchemeInsurancePortal(website.f75972a, website.f75973b)));
            case 21:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new pv7.r((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), o.a.f239992a);
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Throwable error3 = (Throwable) obj2;
                qua.p pVar = (qua.p) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (pVar == null) {
                    return error3;
                }
                return null;
            case 24:
                Throwable error4 = (Throwable) obj2;
                qua.p pVar2 = (qua.p) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (pVar2 == null) {
                    return error4;
                }
                return null;
            case 25:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null)), new lw0.a(new TextLocalisedClause(R$string.exclusive_store_product_status_title, null, null, 14), null, new lw0.b(pvb.f.a(), null), null, false, 26));
            case 26:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            case 27:
                Throwable error5 = (Throwable) obj2;
                el4.i iVar = (el4.i) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar == null) {
                    return error5;
                }
                return null;
            case 28:
                Throwable error6 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bool2 == null) {
                    return error6;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
        }
    }

    public /* synthetic */ m(cli.n nVar, int i) {
        this.f239530a = i;
    }
}
