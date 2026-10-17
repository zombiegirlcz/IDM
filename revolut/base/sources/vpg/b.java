package vpg;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.n;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pfm.m;
import s7a.m0;
import vb2.r;
import vgk.f;
import vh2.j;
import vpk.q;
import vq0.k;
import vq5.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements o, g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f291205b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f291204a = i;
        this.f291205b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f291204a) {
            case 3:
                ((a) this.f291205b).invoke(obj2);
                break;
            case 11:
                ((vn8.a) this.f291205b).invoke(obj2);
                break;
            case 20:
                ((k) this.f291205b).invoke(obj2);
                break;
            case 24:
                ((vrh.c) this.f291205b).invoke(obj2);
                break;
            case 25:
                ((vrh.c) this.f291205b).invoke(obj2);
                break;
            default:
                ((vrh.c) this.f291205b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f291204a) {
            case 0:
                a aVar = (a) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) aVar.invoke(p0);
            case 1:
                ec9.a aVar2 = (ec9.a) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) aVar2.invoke(p0);
            case 2:
                r rVar = (r) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) rVar.invoke(p0);
            case 3:
            case 11:
            case 12:
            case 15:
            case 17:
            case 20:
            case 24:
            case 25:
            default:
                f fVar = (f) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                fVar.invoke(p0);
                return m.f235744a;
            case 4:
                vn8.a aVar3 = (vn8.a) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                aVar3.invoke(p0);
                return Boolean.TRUE;
            case 5:
                f fVar2 = (f) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) fVar2.invoke(p0);
            case 6:
                a aVar4 = (a) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) aVar4.invoke(p0);
            case 7:
                vn8.a aVar5 = (vn8.a) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar5.invoke(p0);
            case 8:
                vn8.a aVar6 = (vn8.a) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar6.invoke(p0);
            case 9:
                m0 m0Var = (m0) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) m0Var.invoke(p0);
            case 10:
                q qVar = (q) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) qVar.invoke(p0);
            case 13:
                vq0.g gVar = (vq0.g) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) gVar.invoke(p0);
            case 14:
                j jVar = (j) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) jVar.invoke(p0);
            case 16:
                r rVar2 = (r) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) rVar2.invoke(p0);
            case 18:
                vq0.g gVar2 = (vq0.g) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (jv0.r) gVar2.invoke(p0);
            case 19:
                vq0.g gVar3 = (vq0.g) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) gVar3.invoke(p0);
            case 21:
                d62.a aVar7 = (d62.a) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar7.invoke(p0);
            case 22:
                vq0.g gVar4 = (vq0.g) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) gVar4.invoke(p0);
            case 23:
                x xVar = (x) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                xVar.invoke(p0);
                return Boolean.TRUE;
            case 26:
                vrh.c cVar = (vrh.c) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) cVar.invoke(p0);
            case 27:
                vrh.c cVar2 = (vrh.c) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) cVar2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f291204a) {
            case 12:
                vq0.g gVar = (vq0.g) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) gVar.invoke(p0)).booleanValue();
            case 13:
            case 14:
            default:
                vq0.g gVar2 = (vq0.g) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) gVar2.invoke(p0)).booleanValue();
            case 15:
                vq0.g gVar3 = (vq0.g) this.f291205b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) gVar3.invoke(p0)).booleanValue();
        }
    }
}
