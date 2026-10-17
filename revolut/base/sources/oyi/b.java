package oyi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f231039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f231040b;

    public b(Data refundBreakdown, boolean z) {
        Intrinsics.checkNotNullParameter(refundBreakdown, "refundBreakdown");
        this.f231039a = refundBreakdown;
        this.f231040b = z;
    }

    public static b a(b bVar, Data refundBreakdown) {
        boolean z = bVar.f231040b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(refundBreakdown, "refundBreakdown");
        return new b(refundBreakdown, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f231039a, bVar.f231039a) && this.f231040b == bVar.f231040b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231040b) + (this.f231039a.hashCode() * 31);
    }
}
