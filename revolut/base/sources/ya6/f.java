package ya6;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.add.new_product.impl.ui.add_new_product.AddNewProductScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import dce.k0;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements kfm.o, kfm.g, zp0.x, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f311961b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f311960a = i;
        this.f311961b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f311960a) {
            case 2:
                ((s) this.f311961b).invoke(obj2);
                break;
            case 22:
                ((yh0.b) this.f311961b).invoke(obj2);
                break;
            default:
                ((yh0.b) this.f311961b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f311960a;
        Object obj2 = this.f311961b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((y99.x) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((y99.x) obj2).invoke(p0);
            case 2:
            case 12:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((yi5.b) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ba6.h) ((y99.x) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) ((y99.x) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((y99.x) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ba6.g0) ((y99.x) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Set) ((y99.x) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hce.a) ((xwd.o) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ybe.a) ((k0) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((y8a.h) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Image) ((ybh.a0) obj2).invoke(p0);
            case 13:
                KProperty[] kPropertyArr = TravelHotelsDatesPickerScreen.P;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LocalDate) ((ybh.a0) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((ybh.a0) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((ye1.m) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((y7k.g0) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((y9d.c) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((yed.g0) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yg0.e) ((ye1.m) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((yi5.k) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((yi5.k) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((yed.g0) obj2).invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String str, String text, String str2, boolean z) {
        PixTransferInputKeyScreen pixTransferInputKeyScreen = (PixTransferInputKeyScreen) this.f311961b;
        KProperty[] kPropertyArr = PixTransferInputKeyScreen.W;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(text, "extractedValue");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        yca.t tVar = (yca.t) pixTransferInputKeyScreen.R2();
        tVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        tVar.H2(tVar.u, new y7k.g0(text, tVar, 13));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f311960a;
        Object obj2 = this.f311961b;
        switch (i) {
            case 18:
                KProperty[] kPropertyArr = AddNewProductScreen.T;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((yed.g0) obj2).invoke(p0)).booleanValue();
            case 19:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((yi5.b) obj2).invoke(p0)).booleanValue();
            case 20:
                KProperty[] kPropertyArr2 = SubformScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((ye1.m) obj2).invoke(p0)).booleanValue();
            case 21:
                KProperty[] kPropertyArr3 = SubformScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((ye1.m) obj2).invoke(p0)).booleanValue();
        }
    }
}
