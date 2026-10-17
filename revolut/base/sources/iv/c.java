package iv;

import e10.s;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r00.d;
import xv.k;
import xv.l;
import xv.q;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f168664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f168665b = Double.NEGATIVE_INFINITY;

    public static final class a {
        private a() {
        }
    }

    public final void a(l result) {
        d dVar;
        s sVar;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof k) {
            Iterator it8 = result.a().iterator();
            do {
                dVar = null;
                if (!it8.hasNext()) {
                    break;
                }
                q qVar = (q) it8.next();
                if (qVar instanceof d) {
                    dVar = (d) qVar;
                }
            } while (dVar == null);
            if (dVar == null || (sVar = dVar.f250676a.f121819a) == null) {
                return;
            }
            double d = (((((((double) sVar.f121837a.f121844b) + ((double) sVar.f121839c.f121844b)) + ((double) sVar.d.f121844b)) + ((double) sVar.f121841h.f121844b)) + ((double) sVar.i.f121844b)) + ((double) sVar.f121842j.f121844b)) / ((double) 6);
            if (this.f168664a == null || d > this.f168665b) {
                this.f168664a = (k) result;
                this.f168665b = d;
            }
        }
    }
}
