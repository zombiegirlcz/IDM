package op0;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class x implements kfm.g, kfm.o, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f227472b;

    public /* synthetic */ x(int i, Function1 function1) {
        this.f227471a = i;
        this.f227472b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f227471a) {
            case 0:
                ((ok7.c) this.f227472b).invoke(obj2);
                break;
            case 1:
                ((ok7.c) this.f227472b).invoke(obj2);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 18:
            case 20:
            default:
                ((j3) this.f227472b).invoke(obj2);
                break;
            case 8:
                ((f1) this.f227472b).invoke(obj2);
                break;
            case 13:
                ((ok7.c) this.f227472b).invoke(obj2);
                break;
            case 14:
                ((ok7.c) this.f227472b).invoke(obj2);
                break;
            case 16:
                ((d2) this.f227472b).invoke(obj2);
                break;
            case 17:
                ((d2) this.f227472b).invoke(obj2);
                break;
            case 19:
                ((m2) this.f227472b).invoke(obj2);
                break;
            case 21:
                ((e3) this.f227472b).invoke(obj2);
                break;
            case 22:
                ((e3) this.f227472b).invoke(obj2);
                break;
            case 23:
                ((e3) this.f227472b).invoke(obj2);
                break;
            case 24:
                ((e3) this.f227472b).invoke(obj2);
                break;
            case 25:
                ((ok7.c) this.f227472b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f227471a) {
            case 2:
                g gVar = (g) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (s0) gVar.invoke(p0);
            case 3:
                g gVar2 = (g) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (r0) gVar2.invoke(p0);
            case 4:
                g gVar3 = (g) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q0) gVar3.invoke(p0);
            case 5:
                g gVar4 = (g) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p0) gVar4.invoke(p0);
            case 6:
                d1 d1Var = (d1) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.a) d1Var.invoke(p0);
            case 7:
            case 8:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                j3 j3Var = (j3) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.widgets.x2) j3Var.invoke(p0);
            case 9:
                d1 d1Var2 = (d1) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n1) d1Var2.invoke(p0);
            case 10:
                d1 d1Var3 = (d1) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (o1) d1Var3.invoke(p0);
            case 11:
                d1 d1Var4 = (d1) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.a) d1Var4.invoke(p0);
            case 12:
                g gVar5 = (g) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.a) gVar5.invoke(p0);
            case 20:
                g gVar6 = (g) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.a) gVar6.invoke(p0);
            case 26:
                j3 j3Var2 = (j3) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.widgets.w2) j3Var2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f227471a) {
            case 7:
                f1 f1Var = (f1) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) f1Var.invoke(p0)).booleanValue();
            case 15:
                d2 d2Var = (d2) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) d2Var.invoke(p0)).booleanValue();
            case 18:
                m2 m2Var = (m2) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) m2Var.invoke(p0)).booleanValue();
            default:
                j3 j3Var = (j3) this.f227472b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) j3Var.invoke(p0)).booleanValue();
        }
    }
}
