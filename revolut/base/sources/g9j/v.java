package g9j;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.cashback.api.models.CashbackByCurrencies;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.api.models.CashbackCurrency;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreen;
import efm.h0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class v implements kfm.o, kfm.i, kfm.p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f141944b;

    public /* synthetic */ v(Object obj2, int i) {
        this.f141943a = i;
        this.f141944b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((ge6.i) this.f141944b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f141943a;
        Object obj2 = this.f141944b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((u) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((dv5.p) obj2).invoke(p0);
            case 2:
            case 11:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((ge6.i) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((g4k.e) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((g9i.s) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) ((gae.a) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gae.h) ((gae.b) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((gbi.c) obj2).invoke(p0);
                return Boolean.TRUE;
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((g4k.e) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.Model) ((g58.h) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((g4k.e) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((g31.e) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((gaf.l) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((g4k.e) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((dqd.a) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((dqd.a) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((gd3.d) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CashbackBySources) ((gaf.l) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (uc3.c) ((gaf.l) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((gaf.l) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CashbackByCurrencies) ((gaf.l) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CashbackCurrency) ((gaf.l) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((e1.e) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((gd8.j) obj2).invoke(p0);
            case 25:
                AddPaymentMethodScreen.a aVar = AddPaymentMethodScreen.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((gd8.j) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((gd8.j) obj2).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        g58.h hVar = (g58.h) this.f141944b;
        AddPaymentMethodScreen.a aVar = AddPaymentMethodScreen.Companion;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) hVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.i
    public Object apply(Object p0, Object p17, Object p2, Object p3) {
        dr0.w wVar = (dr0.w) this.f141944b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        return (gcg.s) wVar.invoke(p0, p17, p2, p3);
    }
}
