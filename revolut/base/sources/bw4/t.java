package bw4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreen;
import com.revolut.feature.statements.impl.ui.documents_hub.flow.DocumentsHubFlowContract$Step;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.w0;
import xw6.a;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19239a;

    public /* synthetic */ t(int i) {
        this.f19239a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f19239a) {
            case 0:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return new p((List) errorItems.invoke(new iii.d(14, null, true, false, null)), m.f19230a);
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new bw6.i((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)));
            case 2:
                Throwable error = (Throwable) obj2;
                nel.n nVar = (nel.n) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (nVar == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                w0 w0Var = (w0) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (w0Var == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                kel.g gVar = (kel.g) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (gVar == null) {
                    return error3;
                }
                return null;
            case 5:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 6:
                Throwable error4 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list == null) {
                    return error4;
                }
                return null;
            case 7:
                Throwable error5 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar == null) {
                    return error5;
                }
                return null;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return "";
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 11:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new bx6.g((List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null)), a.C1718a.f309332a, new TextLocalisedClause(R$string.freelancer_ecommerce_shopify_tutorial_action_go_to_shopify, null, null, 14), null);
            case 12:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return new bxb.i((List) defaultErrorItemsProvider.invoke(new iii.d(12, null, true, true, null)));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 14:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(6, bxg.i.f19690a, true, false, null));
            case 15:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
            case 16:
                Throwable error6 = (Throwable) obj2;
                StatementUrlState statementUrlState = (StatementUrlState) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (statementUrlState == null) {
                    return error6;
                }
                return null;
            case 17:
                Throwable th10 = (Throwable) obj2;
                if (obj3 == null) {
                    return th10;
                }
                return null;
            case 18:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, true, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 22:
                yki.l FlowCoordinator = (yki.l) obj2;
                DocumentsHubFlowContract$Step step = (DocumentsHubFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof DocumentsHubFlowContract$Step.Screen) {
                    return new DocumentsHubScreen(((DocumentsHubFlowContract$Step.Screen) step).f88369a);
                }
                throw new NoWhenBranchMatchedException();
            case 23:
                Throwable th11 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th11;
                }
                return null;
            case 24:
                Throwable error7 = (Throwable) obj2;
                d13.a aVar = (d13.a) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (aVar == null) {
                    return error7;
                }
                return null;
            case 25:
                Throwable th12 = (Throwable) obj2;
                if (((c93.j) obj3) == null) {
                    return th12;
                }
                return null;
            case 26:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return Boolean.FALSE;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 28:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return Boolean.FALSE;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
        }
    }
}
