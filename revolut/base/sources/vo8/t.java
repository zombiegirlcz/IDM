package vo8;

import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.MakeClaimScreenContract$ModalStep;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290917a;

    public /* synthetic */ t(int i) {
        this.f290917a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        boolean z = false;
        switch (this.f290917a) {
            case 0:
                Throwable error = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (juniorBankingProfile == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                of8.b bVar = (of8.b) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bVar == null) {
                    return error2;
                }
                return null;
            case 2:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th10 != null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return null;
            case 3:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 5:
                return Integer.valueOf(new hha.f0(null).compare((hha.d) ((Pair) obj2).f186385a, (hha.d) ((Pair) obj3).f186385a));
            case 6:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new vob.h((List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null)), new lw0.a(new TextLocalisedClause(R$string.savings_onboarding_representative_examples_title, null, null, 14), null, null, null, false, 30));
            case 7:
                Throwable error3 = (Throwable) obj2;
                SimpleTileWidgetDelegate.Model model = (SimpleTileWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (model == null) {
                    return error3;
                }
                return null;
            case 8:
                Throwable error4 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list == null) {
                    return error4;
                }
                return null;
            case 9:
                Throwable error5 = (Throwable) obj2;
                pcd.s sVar = (pcd.s) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (sVar == null) {
                    return error5;
                }
                return null;
            case 10:
                Throwable error6 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list2 == null) {
                    return error6;
                }
                return null;
            case 11:
                Throwable error7 = (Throwable) obj2;
                pcd.s sVar2 = (pcd.s) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (sVar2 == null) {
                    return error7;
                }
                return null;
            case 12:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 13:
                Throwable error8 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (iVar == null) {
                    return error8;
                }
                return null;
            case 14:
                Throwable error9 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (iVar2 == null) {
                    return error9;
                }
                return null;
            case 15:
                Throwable error10 = (Throwable) obj2;
                od0.i iVar3 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (iVar3 == null) {
                    return error10;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 18:
                Throwable error11 = (Throwable) obj2;
                InvestOrder investOrder = (InvestOrder) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (investOrder == null) {
                    return error11;
                }
                return null;
            case 19:
                Throwable error12 = (Throwable) obj2;
                InvestOrder investOrder2 = (InvestOrder) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (investOrder2 == null) {
                    return error12;
                }
                return null;
            case 20:
                int iIntValue = ((Integer) obj3).intValue();
                if (zhm.v.k(k4l.o0.RECEIVED, k4l.o0.PENDING).contains(((InvestOrder) obj2).getI()) && iIntValue < 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                Throwable error13 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (list3 == null) {
                    return error13;
                }
                return null;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 23:
                Throwable error14 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (list4 == null) {
                    return error14;
                }
                return null;
            case 24:
                Throwable error15 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (list5 == null) {
                    return error15;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 28:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                FlowStep it8 = (FlowStep) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                throw new IllegalStateException("No steps in this flow");
            default:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                MakeClaimScreenContract$ModalStep step = (MakeClaimScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof MakeClaimScreenContract$ModalStep.BottomSheetStep) {
                    return new EmbeddedBottomSheetScreen(new EmbeddedBottomSheetScreenContract$InputData(((MakeClaimScreenContract$ModalStep.BottomSheetStep) step).f76129a));
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
