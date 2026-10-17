package gv;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.n f147035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f147037c;

    public q(xv.n nVar, List frameStatistics, o oVar) {
        Intrinsics.checkNotNullParameter(frameStatistics, "frameStatistics");
        this.f147035a = nVar;
        this.f147036b = frameStatistics;
        this.f147037c = oVar;
    }

    public static q a(q qVar, xv.n nVar, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            nVar = qVar.f147035a;
        }
        List frameStatistics = arrayList;
        if ((i & 2) != 0) {
            frameStatistics = qVar.f147036b;
        }
        o oVar = qVar.f147037c;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(frameStatistics, "frameStatistics");
        return new q(nVar, frameStatistics, oVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f147035a, qVar.f147035a) && Intrinsics.f(this.f147036b, qVar.f147036b) && Intrinsics.f(this.f147037c, qVar.f147037c);
    }

    public final int hashCode() {
        xv.n nVar = this.f147035a;
        int iD = p.a.d((nVar == null ? 0 : nVar.hashCode()) * 31, 31, this.f147036b);
        o oVar = this.f147037c;
        return iD + (oVar != null ? oVar.hashCode() : 0);
    }
}
