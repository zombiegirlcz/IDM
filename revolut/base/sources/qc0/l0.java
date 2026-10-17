package qc0;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc0.c;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l0 implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f244459b;

    public /* synthetic */ l0(int i, Function1 function1) {
        this.f244458a = i;
        this.f244459b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f244458a) {
            case 10:
                ((pud.b) this.f244459b).invoke(obj2);
                break;
            case 11:
            default:
                ((qa9.r) this.f244459b).invoke(obj2);
                break;
            case 12:
                ((z0) this.f244459b).invoke(obj2);
                break;
            case 13:
                ((z0) this.f244459b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f244458a) {
            case 0:
                qb5.a aVar = (qb5.a) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                aVar.invoke(p0);
                return c.b.f244404a;
            case 1:
                qb5.a aVar2 = (qb5.a) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                aVar2.invoke(p0);
                return c.b.f244404a;
            case 2:
                k0 k0Var = (k0) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) k0Var.invoke(p0);
            case 3:
                k0 k0Var2 = (k0) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) k0Var2.invoke(p0);
            case 4:
                k0 k0Var3 = (k0) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) k0Var3.invoke(p0);
            case 5:
                q2g.h hVar = (q2g.h) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) hVar.invoke(p0);
            case 6:
                z0 z0Var = (z0) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) z0Var.invoke(p0);
            case 7:
                qb5.a aVar3 = (qb5.a) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar3.invoke(p0);
            case 8:
                pvc.e eVar = (pvc.e) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar.invoke(p0);
            case 9:
                q2g.h hVar2 = (q2g.h) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar2.invoke(p0);
            case 10:
            case 12:
            case 13:
            case 15:
            case 22:
            case 26:
            default:
                qc7.b bVar = (qc7.b) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.Model) bVar.invoke(p0);
            case 11:
                pza.d dVar = (pza.d) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) dVar.invoke(p0);
            case 14:
                z0 z0Var2 = (z0) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) z0Var2.invoke(p0);
            case 16:
                z0 z0Var3 = (z0) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) z0Var3.invoke(p0);
            case 17:
                z0 z0Var4 = (z0) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) z0Var4.invoke(p0);
            case 18:
                qb5.a aVar4 = (qb5.a) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (co3.a) aVar4.invoke(p0);
            case 19:
                qa9.r rVar = (qa9.r) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) rVar.invoke(p0);
            case 20:
                q2g.h hVar3 = (q2g.h) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) hVar3.invoke(p0);
            case 21:
                qb5.a aVar5 = (qb5.a) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar5.invoke(p0);
            case 23:
                qb5.a aVar6 = (qb5.a) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) aVar6.invoke(p0);
            case 24:
                qc7.c cVar = (qc7.c) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar.invoke(p0);
            case 25:
                qa9.r rVar2 = (qa9.r) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) rVar2.invoke(p0);
            case 27:
                qc7.c cVar2 = (qc7.c) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar2.invoke(p0);
            case 28:
                pbi.h hVar4 = (pbi.h) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) hVar4.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f244458a) {
            case 22:
                qb5.a aVar = (qb5.a) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar.invoke(p0)).booleanValue();
            default:
                qc7.c cVar = (qc7.c) this.f244459b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar.invoke(p0)).booleanValue();
        }
    }
}
