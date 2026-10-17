package vgf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f289137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f289138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f289139c;

    public v(ArrayList items, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f289137a = items;
        this.f289138b = num;
        this.f289139c = num2;
    }

    @Override // cli.p
    public final List c() {
        return this.f289137a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f289137a.equals(vVar.f289137a) && Intrinsics.f(this.f289138b, vVar.f289138b) && Intrinsics.f(this.f289139c, vVar.f289139c);
    }

    public final int hashCode() {
        int iHashCode = this.f289137a.hashCode() * 31;
        Integer num = this.f289138b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f289139c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
