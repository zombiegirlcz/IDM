package qc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import e8e.t;
import efm.w;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import qa9.r;
import qce.q;
import qce.q0;
import qce.s;
import rp0.y;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements o, kfm.g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f244587b;

    public /* synthetic */ d(int i, Function1 function1) {
        this.f244586a = i;
        this.f244587b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f244586a) {
            case 5:
                ((q) this.f244587b).invoke(obj2);
                break;
            case 6:
                ((q) this.f244587b).invoke(obj2);
                break;
            default:
                ((q) this.f244587b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f244586a) {
            case 0:
                b bVar = (b) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.Model) bVar.invoke(p0);
            case 1:
                f fVar = (f) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar.invoke(p0);
            case 2:
                f fVar2 = (f) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar2.invoke(p0);
            case 3:
                q2g.h hVar = (q2g.h) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar.invoke(p0);
            case 4:
                qce.a aVar = (qce.a) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) aVar.invoke(p0);
            case 5:
            case 6:
            case 8:
            case 25:
            case 27:
            default:
                qce.a aVar2 = (qce.a) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qe0.e) aVar2.invoke(p0);
            case 7:
                q qVar = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar.invoke(p0);
            case 9:
                c cVar = (c) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q0) cVar.invoke(p0);
            case 10:
                q qVar2 = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) qVar2.invoke(p0);
            case 11:
                q qVar3 = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar3.invoke(p0);
            case 12:
                q qVar4 = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                qVar4.invoke(p0);
                return m.f235744a;
            case 13:
                q qVar5 = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar5.invoke(p0);
            case 14:
                q qVar6 = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar6.invoke(p0);
            case 15:
                c cVar2 = (c) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) cVar2.invoke(p0);
            case 16:
                q qVar7 = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar7.invoke(p0);
            case 17:
                t tVar = (t) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) tVar.invoke(p0);
            case 18:
                s sVar = (s) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) sVar.invoke(p0);
            case 19:
                s sVar2 = (s) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) sVar2.invoke(p0);
            case 20:
                s sVar3 = (s) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) sVar3.invoke(p0);
            case 21:
                q qVar8 = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar8.invoke(p0);
            case 22:
                q qVar9 = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar9.invoke(p0);
            case 23:
                c cVar3 = (c) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q0) cVar3.invoke(p0);
            case 24:
                q qVar10 = (q) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar10.invoke(p0);
            case 26:
                q2k.b bVar2 = (q2k.b) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) bVar2.invoke(p0);
            case 28:
                c cVar4 = (c) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar4.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f244586a) {
            case 25:
                c cVar = (c) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar.invoke(p0)).booleanValue();
            default:
                r rVar = (r) this.f244587b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) rVar.invoke(p0)).booleanValue();
        }
    }
}
