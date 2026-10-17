package pyc;

import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r implements kfm.g, kfm.o, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f240798b;

    public /* synthetic */ r(int i, Function1 function1) {
        this.f240797a = i;
        this.f240798b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f240797a) {
            case 0:
                ((pth.m) this.f240798b).invoke(obj2);
                break;
            case 7:
                ((u) this.f240798b).invoke(obj2);
                break;
            default:
                ((pth.l) this.f240798b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f240797a) {
            case 1:
                p pVar = (p) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) pVar.invoke(p0);
            case 2:
            case 7:
            case 18:
            default:
                mli.h hVar = (mli.h) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) hVar.invoke(p0);
            case 3:
                u uVar = (u) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) uVar.invoke(p0);
            case 4:
                u uVar2 = (u) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d) uVar2.invoke(p0);
            case 5:
                u uVar3 = (u) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d) uVar3.invoke(p0);
            case 6:
                pth.l lVar = (pth.l) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d) lVar.invoke(p0);
            case 8:
                u uVar4 = (u) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) uVar4.invoke(p0);
            case 9:
                u uVar5 = (u) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) uVar5.invoke(p0);
            case 10:
                u uVar6 = (u) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) uVar6.invoke(p0);
            case 11:
                p pVar2 = (p) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) pVar2.invoke(p0);
            case 12:
                p pVar3 = (p) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) pVar3.invoke(p0);
            case 13:
                p pVar4 = (p) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) pVar4.invoke(p0);
            case 14:
                p pVar5 = (p) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) pVar5.invoke(p0);
            case 15:
                p pVar6 = (p) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j) pVar6.invoke(p0);
            case 16:
                p pVar7 = (p) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j) pVar7.invoke(p0);
            case 17:
                p pVar8 = (p) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FragmentNavigateCommand) pVar8.invoke(p0);
            case 19:
                p pVar9 = (p) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) pVar9.invoke(p0);
            case 20:
                l3d.f fVar = (l3d.f) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar.invoke(p0);
            case 21:
                pth.l lVar2 = (pth.l) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) lVar2.invoke(p0);
            case 22:
                pud.b bVar = (pud.b) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) bVar.invoke(p0);
            case 23:
                pth.l lVar3 = (pth.l) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) lVar3.invoke(p0);
            case 24:
                pvc.e eVar = (pvc.e) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) eVar.invoke(p0);
            case 25:
                pth.m mVar = (pth.m) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) mVar.invoke(p0);
            case 26:
                pyj.b bVar2 = (pyj.b) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) bVar2.invoke(p0);
            case 27:
                pvc.e eVar2 = (pvc.e) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar2.invoke(p0);
            case 28:
                pvc.e eVar3 = (pvc.e) this.f240798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar3.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        p pVar = (p) this.f240798b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) pVar.invoke(p0)).booleanValue();
    }
}
