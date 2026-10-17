package fa1;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f133193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f133195c;
    public final List d;
    public final List e;
    public final Map f;

    public m(boolean z, boolean z3, List list, List list2, List list3, Map finalizationPlainTagsValues) {
        Intrinsics.checkNotNullParameter(finalizationPlainTagsValues, "finalizationPlainTagsValues");
        this.f133193a = z;
        this.f133194b = z3;
        this.f133195c = list;
        this.d = list2;
        this.e = list3;
        this.f = finalizationPlainTagsValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f133193a == mVar.f133193a && this.f133194b == mVar.f133194b && Intrinsics.f(this.f133195c, mVar.f133195c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f133193a) * 31, 31, this.f133194b);
        List list = this.f133195c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }
}
