package xlb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.wealth.ui.impl.statements.flow.StatementFlowContract$Step;
import com.revolut.feature.wealth.ui.impl.statements.screen.StatementScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306988a;

    public /* synthetic */ l(int i) {
        this.f306988a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f306988a) {
            case 0:
                Throwable error = (Throwable) obj2;
                m mVar = (m) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (mVar == null) {
                    return error;
                }
                return null;
            case 1:
                yki.l FlowCoordinator = (yki.l) obj2;
                StatementFlowContract$Step step = (StatementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof StatementFlowContract$Step.AccountsStatementScreen) {
                    return new StatementScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(ynj.h.f315483a);
            case 3:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 4:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return xmc.o.f307146a;
            case 6:
                Throwable error3 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (iVar == null) {
                    return error3;
                }
                return null;
            case 7:
                Throwable error4 = (Throwable) obj2;
                xc8.g gVar = (xc8.g) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (gVar == null) {
                    return error4;
                }
                return null;
            case 8:
                Throwable error5 = (Throwable) obj2;
                of8.b bVar = (of8.b) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bVar == null) {
                    return error5;
                }
                return null;
            case 9:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return Boolean.FALSE;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return xo8.p.f307724a;
            case 12:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return (List) defaultErrorItemsProvider.invoke(new iii.d(14, null, false, false, null));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 14:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new xob.q((List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null)), new xob.h(null, new TextLocalisedClause(R$string.savings_details_title, null, null, 14), false));
            case 15:
                Throwable th10 = (Throwable) obj2;
                if (((do3.n) obj3) == null) {
                    return th10;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 17:
                Throwable error6 = (Throwable) obj2;
                cs3.b bVar2 = (cs3.b) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bVar2 == null) {
                    return error6;
                }
                return null;
            case 18:
                Throwable error7 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (bool == null) {
                    return error7;
                }
                return null;
            case 19:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new xq7.f(null, new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_telematics_device_unplugged_title, null, null, 14), (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null)));
            case 20:
                Throwable error8 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list2 == null) {
                    return error8;
                }
                return null;
            case 21:
                Throwable error9 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (cVar == null) {
                    return error9;
                }
                return null;
            case 22:
                Throwable th11 = (Throwable) obj2;
                if (((JuniorBankingProfile) obj3) == null) {
                    return th11;
                }
                return null;
            case 23:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            case 24:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new xs4.k(new xs4.j(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_details_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true), (List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null)), new xs4.i(null, false, false));
            case 25:
                Throwable error10 = (Throwable) obj2;
                l35.g gVar2 = (l35.g) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (gVar2 == null) {
                    return error10;
                }
                return null;
            case 26:
                Data data = (Data) obj3;
                return Boolean.valueOf(Intrinsics.f(org.bouncycastle.jcajce.provider.digest.a.m((Data) obj2, data, "old", "new"), data.getContent()));
            case 27:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return new xsi.e((List) getDefaultErrorItems7.invoke(new iii.d(14, null, true, false, null)), false);
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            default:
                Throwable error11 = (Throwable) obj2;
                whf.p pVar = (whf.p) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (pVar == null) {
                    return error11;
                }
                return null;
        }
    }

    public /* synthetic */ l(Object obj2, int i) {
        this.f306988a = i;
    }
}
