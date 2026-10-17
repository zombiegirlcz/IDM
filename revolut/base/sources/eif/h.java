package eif;

import com.revolut.data.model.Data;
import efm.d0;
import efm.h0;
import efm.i0;
import efm.w;
import ej6.x;
import ej9.q;
import java.util.List;
import kfm.o;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements o, kfm.b, i0, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f126612b;

    public /* synthetic */ h(Function function, int i) {
        this.f126611a = i;
        this.f126612b = function;
    }

    @Override // kfm.b
    public void accept(Object obj2, Object obj3) {
        ((eed.a) this.f126612b).invoke(obj2, obj3);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f126611a) {
            case 0:
                f fVar = (f) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar.invoke(p0);
            case 1:
                f fVar2 = (f) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar2.invoke(p0);
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 25:
            default:
                q qVar = (q) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar.invoke(p0);
            case 3:
                f fVar3 = (f) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar3.invoke(p0);
            case 7:
                eed.i iVar = (eed.i) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) iVar.invoke(p0);
            case 9:
                f fVar4 = (f) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar4.invoke(p0);
            case 13:
                efb.i iVar2 = (efb.i) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) iVar2.invoke(p0);
            case 16:
                efb.i iVar3 = (efb.i) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) iVar3.invoke(p0);
            case 17:
                eed.j jVar = (eed.j) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) jVar.invoke(p0);
            case 18:
                x xVar = (x) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) xVar.invoke(p0);
            case 19:
                ej9.j jVar2 = (ej9.j) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) jVar2.invoke(p0);
            case 20:
                x xVar2 = (x) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) xVar2.invoke(p0);
            case 21:
                x xVar3 = (x) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) xVar3.invoke(p0);
            case 22:
                x xVar4 = (x) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) xVar4.invoke(p0);
            case 23:
                ej9.j jVar3 = (ej9.j) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) jVar3.invoke(p0);
            case 24:
                ej9.j jVar4 = (ej9.j) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) jVar4.invoke(p0);
            case 26:
                x xVar5 = (x) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) xVar5.invoke(p0);
            case 27:
                ei8.d dVar = (ei8.d) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) dVar.invoke(p0);
        }
    }

    @Override // efm.i0
    public h0 i(d0 p0) {
        switch (this.f126611a) {
            case 4:
                c cVar = (c) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar.invoke(p0);
            case 5:
                c cVar2 = (c) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar2.invoke(p0);
            case 6:
            case 7:
            case 9:
            default:
                c cVar3 = (c) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar3.invoke(p0);
            case 8:
                c cVar4 = (c) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar4.invoke(p0);
            case 10:
                c cVar5 = (c) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar5.invoke(p0);
            case 11:
                c cVar6 = (c) this.f126612b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar6.invoke(p0);
        }
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f126611a) {
            case 6:
                ((f) this.f126612b).invoke(obj2);
                break;
            case 12:
                ((f) this.f126612b).invoke(obj2);
                break;
            case 15:
                ((f) this.f126612b).invoke(obj2);
                break;
            case 25:
                ((ej9.j) this.f126612b).invoke(obj2);
                break;
            default:
                ((q) this.f126612b).invoke(obj2);
                break;
        }
    }
}
