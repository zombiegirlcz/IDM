package nae;

import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import dce.k0;
import efm.w;
import f28.b0;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import n8i.q0;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements kfm.o, kfm.c, kfm.p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f213858b;

    public /* synthetic */ a(Function function, int i) {
        this.f213857a = i;
        this.f213858b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f213857a) {
            case 15:
                ((nb6.p) this.f213858b).invoke(obj2);
                break;
            case 16:
            default:
                ((nb6.p) this.f213858b).invoke(obj2);
                break;
            case 17:
                ((nc0.b) this.f213858b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f213857a) {
            case 0:
                imk.e eVar = (imk.e) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) eVar.invoke(p0);
            case 1:
                imk.e eVar2 = (imk.e) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) eVar2.invoke(p0);
            case 2:
                q0 q0Var = (q0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) q0Var.invoke(p0);
            case 3:
            case 5:
            case 9:
            case 15:
            case 17:
            case 18:
            case 20:
            case 23:
            default:
                q0 q0Var2 = (q0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) q0Var2.invoke(p0);
            case 4:
                b bVar = (b) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar.invoke(p0);
            case 6:
                k kVar = (k) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) kVar.invoke(p0);
            case 7:
                k kVar2 = (k) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) kVar2.invoke(p0);
            case 8:
                k kVar3 = (k) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) kVar3.invoke(p0);
            case 10:
                q0 q0Var3 = (q0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) q0Var3.invoke(p0);
            case 11:
                q0 q0Var4 = (q0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) q0Var4.invoke(p0);
            case 12:
                n45.b bVar2 = (n45.b) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar2.invoke(p0);
            case 13:
                k0 k0Var = (k0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (nbe.a) k0Var.invoke(p0);
            case 14:
                nc0.d dVar = (nc0.d) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) dVar.invoke(p0);
            case 16:
                nc0.b bVar3 = (nc0.b) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar3.invoke(p0);
            case 19:
                nc0.b bVar4 = (nc0.b) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar4.invoke(p0);
            case 21:
                n45.b bVar5 = (n45.b) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar5.invoke(p0);
            case 22:
                nc0.b bVar6 = (nc0.b) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Set) bVar6.invoke(p0);
            case 24:
                nc0.d dVar2 = (nc0.d) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar2.invoke(p0);
            case 25:
                nc1.g gVar = (nc1.g) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (nc1.c) gVar.invoke(p0);
            case 26:
                n68.w wVar = (n68.w) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) wVar.invoke(p0);
            case 27:
                mll.h hVar = (mll.h) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar.invoke(p0);
            case 28:
                q0 q0Var5 = (q0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) q0Var5.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f213857a) {
            case 5:
                q0 q0Var = (q0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) q0Var.invoke(p0)).booleanValue();
            case 9:
                q0 q0Var2 = (q0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) q0Var2.invoke(p0)).booleanValue();
            case 18:
                q0 q0Var3 = (q0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) q0Var3.invoke(p0)).booleanValue();
            default:
                q0 q0Var4 = (q0) this.f213858b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) q0Var4.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        b0 b0Var = (b0) this.f213858b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (i7) b0Var.invoke(p0, p17);
    }
}
