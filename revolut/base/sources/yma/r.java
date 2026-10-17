package yma;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.credit.card.impl.ui.bottom_sheet.picket.PickerBottomSheetController;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreen;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.h0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import skm.a2;
import yna.g0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements kfm.o, kfm.g, kfm.p, OnApplyWindowInsetsListener, zp0.x, kfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f314932b;

    public /* synthetic */ r(Object obj2, int i) {
        this.f314931a = i;
        this.f314932b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((yea.l) this.f314932b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f314931a;
        Object obj2 = this.f314932b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((q) obj2).invoke(p0);
            case 1:
            case 9:
            case 11:
            case 21:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((ypg.j) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (StatusViewConfiguration.Error) ((b0) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((yea.l) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((b0) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((b0) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((b0) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((b0) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((b0) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((g0) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((g0) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((g0) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((g0) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((g0) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((g0) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yna.z) ((yjj.j) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((yjj.j) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((g0) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xnf.a) ((yjj.j) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((yjj.j) obj2).invoke(p0);
            case 23:
                KProperty[] kPropertyArr = PickerBottomSheetController.W;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((yo7.p) obj2).invoke(p0);
            case 24:
                KProperty[] kPropertyArr2 = PickerBottomSheetController.W;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yp4.b) ((vvc.t) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((yo7.p) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((ypd.i) obj2).invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String str, String extractedValue, String formattedValue, boolean z) {
        TinInputScreen tinInputScreen = (TinInputScreen) this.f314932b;
        KProperty[] kPropertyArr = TinInputScreen.S;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        com.revolut.feature.tax_residency.impl.v2.ui.tin_input.a aVar = (com.revolut.feature.tax_residency.impl.v2.ui.tin_input.a) tinInputScreen.d();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        a2 a2Var = aVar.f90319s;
        if (a2Var != null) {
            a2Var.f(null);
        }
        aVar.f90319s = aVar.l2(new wjd.o(z, aVar, extractedValue, formattedValue, null), new yi5.b(26));
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        AdditionalDriverDetailsScreen additionalDriverDetailsScreen = (AdditionalDriverDetailsScreen) this.f314932b;
        KProperty[] kPropertyArr = AdditionalDriverDetailsScreen.f75571d0;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        boolean zIsVisible = insets.isVisible(WindowInsetsCompat.Type.ime());
        TwinVerticalButton driverDetailsButton = additionalDriverDetailsScreen.h3().f217046b;
        Intrinsics.checkNotNullExpressionValue(driverDetailsButton, "driverDetailsButton");
        driverDetailsButton.setVisibility(!zIsVisible ? 0 : 8);
        return insets;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f314931a) {
            case 9:
                yjj.j jVar = (yjj.j) this.f314932b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) jVar.invoke(p0)).booleanValue();
            default:
                yjj.j jVar2 = (yjj.j) this.f314932b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) jVar2.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.d
    public boolean test(Object p0, Object p17) {
        ypg.h hVar = (ypg.h) this.f314932b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((Boolean) hVar.invoke(p0, p17)).booleanValue();
    }
}
