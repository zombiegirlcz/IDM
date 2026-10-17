package qsk;

import aw0.o9;
import bw0.m;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.BottomSheetScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.BottomSheetScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import ip0.q3;
import ip0.r3;
import ip0.u3;
import ip0.v3;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ox6.n;
import tof.i7;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248871a;

    public /* synthetic */ d(int i) {
        this.f248871a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f248871a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                u3 series = (u3) obj3;
                Intrinsics.checkNotNullParameter(series, "series");
                v3 v3Var = series.f166584a;
                q3 q3Var = r3.Companion;
                q3Var.getClass();
                List list = r3.f166086r;
                q3Var.getClass();
                return new Pair(v3Var, list.get(iIntValue % list.size()));
            case 1:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CoverageDetailsScreenContract$ModalStep step = (CoverageDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CoverageDetailsScreenContract$ModalStep.CoverageDetails) {
                    return new BottomSheetScreen(new BottomSheetScreenContract$InputData(((CoverageDetailsScreenContract$ModalStep.CoverageDetails) step).f75828a));
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                Throwable error = (Throwable) obj2;
                yt8.d dVar = (yt8.d) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (dVar == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                yt8.c cVar = (yt8.c) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (cVar == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (model == null) {
                    return error3;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m.Companion.getClass();
                return bw0.k.a();
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 11:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new qv4.i((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
            case 12:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(null, "it");
                return new LayoutViewerScreen(R$layout.screen_transparent);
            case 13:
                Throwable error4 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar == null) {
                    return error4;
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 15:
                Throwable th10 = (Throwable) obj2;
                if (((String) obj3) == null) {
                    return th10;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 18:
                Throwable error5 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (pair == null) {
                    return error5;
                }
                return null;
            case 19:
                Throwable error6 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bool == null) {
                    return error6;
                }
                return null;
            case 20:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new n((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)));
            case 21:
                Throwable th11 = (Throwable) obj2;
                if (((e7l.f) obj3) == null) {
                    return th11;
                }
                return null;
            case 22:
                Function1 defaultError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                return (List) defaultError.invoke(new iii.d(14, null, false, false, null));
            case 23:
                Function1 defaultError2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError2, "defaultError");
                return (List) defaultError2.invoke(new iii.d(14, null, true, false, null));
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                return null;
            case 26:
                Throwable error7 = (Throwable) obj2;
                i7 i7Var = (i7) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (i7Var == null) {
                    return error7;
                }
                return null;
            case 27:
                Throwable error8 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool2 == null) {
                    return error8;
                }
                return null;
            case 28:
                ((Boolean) obj2).booleanValue();
                return h0.f322473a;
            default:
                Throwable error9 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list2 == null) {
                    return error9;
                }
                return null;
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f248871a = i;
    }
}
