package luk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f200250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f200251b;

    public b(ArrayList index, ArrayList movingAverage) {
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(movingAverage, "movingAverage");
        this.f200250a = index;
        this.f200251b = movingAverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f200250a.equals(bVar.f200250a) && this.f200251b.equals(bVar.f200251b);
    }

    public final int hashCode() {
        return this.f200251b.hashCode() + (this.f200250a.hashCode() * 31);
    }
}
