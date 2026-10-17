package dkk;

import androidx.palette.graphics.Palette;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreen;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a0 implements kfm.p, kfm.o, Palette.PaletteAsyncListener, kfm.g, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f115583b;

    public /* synthetic */ a0(Object obj2, int i) {
        this.f115582a = i;
        this.f115583b = obj2;
    }

    public clb.c a() {
        return new clb.c((clb.a) this.f115583b);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f115582a) {
            case 13:
                ((dsi.a) this.f115583b).invoke(obj2);
                break;
            default:
                ((du8.a) this.f115583b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f115582a;
        Object obj2 = this.f115583b;
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((dmj.e0) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((av8.o) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((dmj.a) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((dmj.a) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((dmj.a) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dqi.j) ((dmj.a) obj2).invoke(p0);
            case 9:
            case 11:
            case 13:
            case 17:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) ((ds4.b) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((drg.k) obj2).invoke(p0);
            case 12:
                KProperty[] kPropertyArr = CreditCardInstalmentHubScreen.f69386a0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ActionsView.Item) ((dmj.a) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((ds4.b) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zsc.h) ((dtc.h) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((dtc.h) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((du8.a) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((du8.c) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((du8.c) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((doe.c) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((du8.j) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((du8.j) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((ds4.b) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((a09.z) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((dug.a) obj2).invoke(p0);
                return Boolean.TRUE;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f115582a;
        Object obj2 = this.f115583b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((clk.a) obj2).invoke(p0)).booleanValue();
            case 2:
                KProperty[] kPropertyArr = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((dmj.a) obj2).invoke(p0)).booleanValue();
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((dmj.a) obj2).invoke(p0)).booleanValue();
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((ds4.b) obj2).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        dmb.m mVar = (dmb.m) this.f115583b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) mVar.invoke(p0, p17);
    }
}
