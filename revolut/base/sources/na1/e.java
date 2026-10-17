package na1;

import com.revolut.retail.core.navigation.CompositeCommand;
import efm.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import n8i.q0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f213679b;

    public /* synthetic */ e(int i, Function1 function1) {
        this.f213678a = i;
        this.f213679b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) throws Throwable {
        switch (this.f213678a) {
            case 4:
                ((q0) this.f213679b).invoke(obj2);
                break;
            case 7:
                ((n7h.c) this.f213679b).invoke(obj2);
                break;
            case 10:
                ((n7h.c) this.f213679b).invoke(obj2);
                break;
            case 13:
                ((c) this.f213679b).invoke(obj2);
                break;
            case 15:
                ((q0) this.f213679b).invoke(obj2);
                break;
            case 20:
                ((o) this.f213679b).invoke(obj2);
                break;
            case 25:
                ((n7h.c) this.f213679b).invoke(obj2);
                break;
            default:
                ((v9) this.f213679b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f213678a) {
            case 0:
                n45.b bVar = (n45.b) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar.invoke(p0);
            case 1:
                a aVar = (a) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar.invoke(p0);
            case 2:
                a aVar2 = (a) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar2.invoke(p0);
            case 3:
                b bVar2 = (b) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar2.invoke(p0);
            case 4:
            case 7:
            case 10:
            case 13:
            case 15:
            case 19:
            case 20:
            case 25:
            case 27:
            default:
                nae.b bVar3 = (nae.b) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar3.invoke(p0);
            case 5:
                i iVar = (i) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) iVar.invoke(p0);
            case 6:
                i iVar2 = (i) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) iVar2.invoke(p0);
            case 8:
                k kVar = (k) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) kVar.invoke(p0);
            case 9:
                k kVar2 = (k) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) kVar2.invoke(p0);
            case 11:
                l lVar = (l) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) lVar.invoke(p0);
            case 12:
                l lVar2 = (l) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) lVar2.invoke(p0);
            case 14:
                n45.b bVar4 = (n45.b) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar4.invoke(p0);
            case 16:
                n nVar = (n) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar.invoke(p0);
            case 17:
                n nVar2 = (n) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar2.invoke(p0);
            case 18:
                o oVar = (o) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) oVar.invoke(p0);
            case 21:
                r rVar = (r) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) rVar.invoke(p0);
            case 22:
                r rVar2 = (r) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) rVar2.invoke(p0);
            case 23:
                s sVar = (s) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar.invoke(p0);
            case 24:
                s sVar2 = (s) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar2.invoke(p0);
            case 26:
                ec9.a aVar3 = (ec9.a) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CompositeCommand) aVar3.invoke(p0);
            case 28:
                q0 q0Var = (q0) this.f213679b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                q0Var.invoke(p0);
                return Boolean.TRUE;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        q0 q0Var = (q0) this.f213679b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) q0Var.invoke(p0)).booleanValue();
    }
}
