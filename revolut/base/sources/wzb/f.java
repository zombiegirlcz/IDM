package wzb;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f301398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f301399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f301400c;
    public final boolean d;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data groupedExpiringPoints, boolean z, Map expandedSectionsMap, boolean z3, int i) {
        if ((i & 1) != 0) {
            groupedExpiringPoints = fVar.f301398a;
        }
        if ((i & 2) != 0) {
            z = fVar.f301399b;
        }
        if ((i & 4) != 0) {
            expandedSectionsMap = fVar.f301400c;
        }
        if ((i & 8) != 0) {
            z3 = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(groupedExpiringPoints, "groupedExpiringPoints");
        Intrinsics.checkNotNullParameter(expandedSectionsMap, "expandedSectionsMap");
        return new f(groupedExpiringPoints, z, expandedSectionsMap, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f301398a, fVar.f301398a) && this.f301399b == fVar.f301399b && Intrinsics.f(this.f301400c, fVar.f301400c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.e(j6.a.c(this.f301398a.hashCode() * 31, 31, this.f301399b), 31, this.f301400c);
    }

    public f(Data groupedExpiringPoints, boolean z, Map expandedSectionsMap, boolean z3) {
        Intrinsics.checkNotNullParameter(groupedExpiringPoints, "groupedExpiringPoints");
        Intrinsics.checkNotNullParameter(expandedSectionsMap, "expandedSectionsMap");
        this.f301398a = groupedExpiringPoints;
        this.f301399b = z;
        this.f301400c = expandedSectionsMap;
        this.d = z3;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), false, r0.g(), false);
    }
}
