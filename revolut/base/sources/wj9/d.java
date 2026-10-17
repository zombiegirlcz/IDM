package wj9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f298022b;

    public d(Data management, Data missedInstalments) {
        Intrinsics.checkNotNullParameter(management, "management");
        Intrinsics.checkNotNullParameter(missedInstalments, "missedInstalments");
        this.f298021a = management;
        this.f298022b = missedInstalments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f298021a, dVar.f298021a) && Intrinsics.f(this.f298022b, dVar.f298022b);
    }

    public final int hashCode() {
        return this.f298022b.hashCode() + (this.f298021a.hashCode() * 31);
    }
}
