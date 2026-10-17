package tx5;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw5.e f275334a;

    public e(cw5.e timeFrame) {
        Intrinsics.checkNotNullParameter(timeFrame, "timeFrame");
        this.f275334a = timeFrame;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f275334a == ((e) obj2).f275334a;
    }

    public final int hashCode() {
        return this.f275334a.hashCode();
    }
}
