package rof;

import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitPreview;
import efm.w;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rgf.m;
import rlh.d0;
import rp0.k;
import rp0.m;
import rp0.n0;
import rp0.o0;
import rp0.p0;
import rp0.q;
import rp0.v0;
import rp0.z;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements kfm.g, o, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f255999b;

    public /* synthetic */ e(int i, Function1 function1) {
        this.f255998a = i;
        this.f255999b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f255998a;
        Function1 function1 = this.f255999b;
        switch (i) {
            case 0:
                ((d) function1).invoke(obj2);
                break;
            case 1:
            case 6:
            case 7:
            default:
                ((d0) function1).invoke(obj2);
                break;
            case 2:
                ((d) function1).invoke(obj2);
                break;
            case 3:
                WaitlistBenefitPreview.Companion bVar = WaitlistBenefitPreview.INSTANCE;
                ((d0) function1).invoke(obj2);
                break;
            case 4:
                ((rp0.g) function1).invoke(obj2);
                break;
            case 5:
                ((rp0.g) function1).invoke(obj2);
                break;
            case 8:
                ((m) function1).invoke(obj2);
                break;
            case 9:
                ((k) function1).invoke(obj2);
                break;
            case 10:
                ((k) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f255998a;
        Function1 function1 = this.f255999b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((rnd.k) function1).invoke(p0);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 14:
            case 22:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (nrf.c) ((d0) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (m.a) ((rnd.k) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (z) ((rnd.k) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (rp0.p) ((k) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q) ((k) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (o0) ((n0) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p0.b) ((n0) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p0.b) ((n0) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p0.a) ((n0) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (v0) ((n0) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p0.a) ((n0) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p0.a) ((n0) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p0.a) ((n0) function1).invoke(p0);
            case 25:
                KProperty[] kPropertyArr = BillsChooserScreen.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dp9.b) ((n0) function1).invoke(p0);
            case 26:
                KProperty[] kPropertyArr2 = BillsChooserScreen.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dp9.b) ((n0) function1).invoke(p0);
            case 27:
                KProperty[] kPropertyArr3 = BillsChooserScreen.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dp9.b) ((n0) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((rp9.k) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f255998a) {
            case 6:
                rnd.k kVar = (rnd.k) this.f255999b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar.invoke(p0)).booleanValue();
            case 11:
                rnd.k kVar2 = (rnd.k) this.f255999b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar2.invoke(p0)).booleanValue();
            default:
                rnd.k kVar3 = (rnd.k) this.f255999b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar3.invoke(p0)).booleanValue();
        }
    }
}
