package op0;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.apm.bills.pagopa.api.models.PagoPABill;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o3 implements kfm.g, kfm.o, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f227369b;

    public /* synthetic */ o3(int i, Function1 function1) {
        this.f227368a = i;
        this.f227369b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f227368a) {
            case 0:
                ((j3) this.f227369b).invoke(obj2);
                break;
            case 1:
                ((c4) this.f227369b).invoke(obj2);
                break;
            case 2:
                ((c4) this.f227369b).invoke(obj2);
                break;
            case 3:
                ((c4) this.f227369b).invoke(obj2);
                break;
            case 4:
                ((c4) this.f227369b).invoke(obj2);
                break;
            case 5:
                ((c4) this.f227369b).invoke(obj2);
                break;
            case 6:
                ((c4) this.f227369b).invoke(obj2);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                ((ood.k) this.f227369b).invoke(obj2);
                break;
            case 11:
                ((o4) this.f227369b).invoke(obj2);
                break;
            case 12:
                ((d5) this.f227369b).invoke(obj2);
                break;
            case 13:
                ((d5) this.f227369b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f227368a) {
            case 7:
                g gVar = (g) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.a) gVar.invoke(p0);
            case 8:
                g gVar2 = (g) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.a) gVar2.invoke(p0);
            case 9:
                o4 o4Var = (o4) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.a) o4Var.invoke(p0);
            case 10:
            case 11:
            case 12:
            case 13:
            case 17:
            case 18:
            case 19:
            default:
                oq3.d dVar = (oq3.d) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar.invoke(p0);
            case 14:
                ok7.c cVar = (ok7.c) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.widgets.z4) cVar.invoke(p0);
            case 15:
                kwg.e eVar = (kwg.e) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) eVar.invoke(p0);
            case 16:
                om4.l0 l0Var = (om4.l0) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) l0Var.invoke(p0);
            case 20:
                ood.o0 o0Var = (ood.o0) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PagoPABill) o0Var.invoke(p0);
            case 21:
                ood.o0 o0Var2 = (ood.o0) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PagoPABill) o0Var2.invoke(p0);
            case 22:
                ood.o0 o0Var3 = (ood.o0) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) o0Var3.invoke(p0);
            case 23:
                ood.o0 o0Var4 = (ood.o0) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PagoPABill) o0Var4.invoke(p0);
            case 24:
                l1.e eVar2 = (l1.e) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar2.invoke(p0);
            case 25:
                mli.h hVar = (mli.h) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) hVar.invoke(p0);
            case 26:
                ael.s sVar = (ael.s) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) sVar.invoke(p0);
            case 27:
                oq3.d dVar2 = (oq3.d) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) dVar2.invoke(p0);
            case 28:
                ood.o0 o0Var5 = (ood.o0) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) o0Var5.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f227368a) {
            case 10:
                o4 o4Var = (o4) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) o4Var.invoke(p0)).booleanValue();
            case 17:
                return ((Boolean) ((ood.o0) this.f227369b).invoke(p0)).booleanValue();
            default:
                ood.o0 o0Var = (ood.o0) this.f227369b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) o0Var.invoke(p0)).booleanValue();
        }
    }
}
