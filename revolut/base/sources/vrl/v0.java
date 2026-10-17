package vrl;

import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreen;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class v0 implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f291684b;

    public /* synthetic */ v0(int i, Function1 function1) {
        this.f291683a = i;
        this.f291684b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f291683a;
        Function1 function1 = this.f291684b;
        switch (i) {
            case 4:
                int i2 = vt0.d.u;
                ((vt0.c) function1).invoke(obj2);
                break;
            case 5:
                int i3 = vt0.d.u;
                ((vt0.c) function1).invoke(obj2);
                break;
            case 6:
                int i5 = vt0.d.u;
                ((vsl.f) function1).invoke(obj2);
                break;
            case 8:
                int i6 = vt0.h.A;
                ((vq5.x) function1).invoke(obj2);
                break;
            case 18:
                SwipeToActionLayout.Companion companion = SwipeToActionLayout.INSTANCE;
                ((vu0.p) function1).invoke(obj2);
                break;
            default:
                SwipeToActionLayout.Companion companion2 = SwipeToActionLayout.INSTANCE;
                ((vu0.p) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f291683a;
        Function1 function1 = this.f291684b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((n) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((n) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k4l.p) ((vq5.x) function1).invoke(p0);
            case 3:
                int i2 = vt0.d.u;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((i0) function1).invoke(p0);
            case 4:
            case 5:
            case 6:
            case 8:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((pud.b) function1).invoke(p0);
            case 7:
                int i3 = vt0.h.A;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((i0) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((vtf.a) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((vq5.x) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((n) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((ar3.a) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BalancesInteractor$InputData) ((i0) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((vtf.a) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((vtf.b) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (utf.b) ((i0) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((i0) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((vq5.x) function1).invoke(p0);
            case 23:
                return (Unit) ((vq5.x) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((vx5.l) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((vx5.l) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((vx5.l) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((vx5.l) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f291683a;
        Function1 function1 = this.f291684b;
        switch (i) {
            case 19:
                SwipeToActionLayout.Companion companion = SwipeToActionLayout.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((i0) function1).invoke(p0)).booleanValue();
            case 20:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((vw4.j) function1).invoke(p0)).booleanValue();
            case 21:
                KProperty[] kPropertyArr = ExtendTicketScreen.S;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((i0) function1).invoke(p0)).booleanValue();
        }
    }
}
