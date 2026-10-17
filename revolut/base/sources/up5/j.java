package up5;

import com.revolut.data.model.Data;
import efm.h0;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tx0.g4;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements kfm.o, kfm.g, kfm.p, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f281900b;

    public /* synthetic */ j(Function function, int i) {
        this.f281899a = i;
        this.f281900b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f281899a) {
            case 1:
                ((f) this.f281900b).invoke(obj2);
                break;
            default:
                ((f) this.f281900b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f281899a) {
            case 0:
                h hVar = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) hVar.invoke(p0);
            case 1:
            case 3:
            case 7:
            case 11:
            case 16:
            case 23:
            default:
                b0 b0Var = (b0) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) b0Var.invoke(p0);
            case 2:
                i iVar = (i) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar.invoke(p0);
            case 4:
                h hVar2 = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) hVar2.invoke(p0);
            case 5:
                f fVar = (f) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar.invoke(p0);
            case 6:
                f fVar2 = (f) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar2.invoke(p0);
            case 8:
                h hVar3 = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wp5.n) hVar3.invoke(p0);
            case 9:
                ou5.a aVar = (ou5.a) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) aVar.invoke(p0);
            case 10:
                f fVar3 = (f) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) fVar3.invoke(p0);
            case 12:
                h hVar4 = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) hVar4.invoke(p0);
            case 13:
                h hVar5 = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar5.invoke(p0);
            case 14:
                f fVar4 = (f) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar4.invoke(p0);
            case 15:
                g4 g4Var = (g4) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) g4Var.invoke(p0);
            case 17:
                fp5.b bVar = (fp5.b) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) bVar.invoke(p0);
            case 18:
                f fVar5 = (f) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) fVar5.invoke(p0);
            case 19:
                h hVar6 = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar6.invoke(p0);
            case 20:
                uif.d dVar = (uif.d) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) dVar.invoke(p0);
            case 21:
                h hVar7 = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar7.invoke(p0);
            case 22:
                h hVar8 = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar8.invoke(p0);
            case 24:
                l lVar = (l) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) lVar.invoke(p0);
            case 25:
                l lVar2 = (l) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) lVar2.invoke(p0);
            case 26:
                t9f.n nVar = (t9f.n) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar.invoke(p0);
            case 27:
                c0 c0Var = (c0) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) c0Var.invoke(p0);
            case 28:
                c0 c0Var2 = (c0) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) c0Var2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f281899a) {
            case 3:
                h hVar = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) hVar.invoke(p0)).booleanValue();
            case 7:
                h hVar2 = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) hVar2.invoke(p0)).booleanValue();
            default:
                h hVar3 = (h) this.f281900b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) hVar3.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        k kVar = (k) this.f281900b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) kVar.invoke(p0, p17);
    }
}
