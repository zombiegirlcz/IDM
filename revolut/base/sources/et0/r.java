package et0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.x3;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f129099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f129100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f129101c;
    public final x3 d;

    public r(boolean z, List list, Function0 function0, x3 heightListener) {
        Intrinsics.checkNotNullParameter(heightListener, "heightListener");
        this.f129099a = z;
        this.f129100b = list;
        this.f129101c = function0;
        this.d = heightListener;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f129099a == rVar.f129099a && Intrinsics.f(this.f129100b, rVar.f129100b) && Intrinsics.f(this.f129101c, rVar.f129101c) && this.d.equals(rVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f129099a) * 31;
        List list = this.f129100b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Function0 function0 = this.f129101c;
        return this.d.hashCode() + ((iHashCode2 + (function0 != null ? function0.hashCode() : 0)) * 31);
    }
}
