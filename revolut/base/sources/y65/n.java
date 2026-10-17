package y65;

import android.graphics.Bitmap;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.impl.ui.flow.payment_breakdown.PaymentBreakdownFlowContract$Step;
import com.revolut.feature.revolutpay.shared.ui.bottom_sheet.payment_breakdown.PaymentBreakdownScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y65.i;
import zhm.a0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311173a;

    public /* synthetic */ n(int i) {
        this.f311173a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.f311173a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new j(i.b.f311164a, (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)));
            case 1:
                Function1 getDefault = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefault, "getDefault");
                return (List) getDefault.invoke(new iii.d(14, null, true, false, null));
            case 2:
                Function1 getDefault2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefault2, "getDefault");
                return (List) getDefault2.invoke(new iii.d(14, null, true, false, null));
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 4:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 5:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new y6b.h(null, hx7.a.p(getDefaultErrorItems2));
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 7:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                yki.l FlowCoordinator = (yki.l) obj2;
                PaymentBreakdownFlowContract$Step step = (PaymentBreakdownFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, PaymentBreakdownFlowContract$Step.PaymentBreakdown.f84481a)) {
                    return new PaymentBreakdownScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                Throwable th10 = (Throwable) obj2;
                if (((xi0.b) obj3) == null) {
                    return th10;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                aim.e eVarB = u.b();
                List listC = u.c(new FullScreenStateDelegate.Model("RETRY_LIST_ID", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, Integer.valueOf(R$drawable.uikit_icn_24_retry), null, false, 0, 0, 31556));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                a0.x(listC, eVarB);
                eVarB.add(y9a.s.a());
                return new y9a.o(u.a(eVarB));
            case 12:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new ya5.i((List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null)), ya5.m.b(), null);
            case 13:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 15:
                Throwable error2 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool2 == null) {
                    return error2;
                }
                return null;
            case 16:
                Throwable error3 = (Throwable) obj2;
                bcb.f fVar = (bcb.f) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (fVar == null) {
                    return error3;
                }
                return null;
            case 17:
                Throwable th11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th11 == null) {
                    return f0.f322471a;
                }
                throw th11;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 19:
                Throwable error4 = (Throwable) obj2;
                m1h.h hVar = (m1h.h) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (hVar == null) {
                    return error4;
                }
                return null;
            case 20:
                Throwable error5 = (Throwable) obj2;
                Boolean bool3 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool3 == null) {
                    return error5;
                }
                return null;
            case 21:
                Throwable error6 = (Throwable) obj2;
                Boolean bool4 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bool4 == null) {
                    return error6;
                }
                return null;
            case 22:
                Throwable error7 = (Throwable) obj2;
                Boolean bool5 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (bool5 == null) {
                    return error7;
                }
                return null;
            case 23:
                Throwable th12 = (Throwable) obj2;
                if (((m1h.j) obj3) == null) {
                    return th12;
                }
                return null;
            case 24:
                Throwable th13 = (Throwable) obj2;
                if (((m1h.j) obj3) == null) {
                    return th13;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 27:
                Throwable error8 = (Throwable) obj2;
                sf8.m mVar = (sf8.m) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (mVar == null) {
                    return error8;
                }
                return null;
            case 28:
                Throwable error9 = (Throwable) obj2;
                Bitmap bitmap = (Bitmap) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bitmap == null) {
                    return error9;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
        }
    }

    public /* synthetic */ n(cli.n nVar, int i) {
        this.f311173a = i;
    }
}
