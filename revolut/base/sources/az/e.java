package az;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable f11276b;

    public e(Clause detectorResultsInfo, Iterable rects) {
        Intrinsics.checkNotNullParameter(detectorResultsInfo, "detectorResultsInfo");
        Intrinsics.checkNotNullParameter(rects, "rects");
        this.f11275a = detectorResultsInfo;
        this.f11276b = rects;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f11275a.equals(eVar.f11275a) && Intrinsics.f(this.f11276b, eVar.f11276b);
    }

    public final int hashCode() {
        return this.f11276b.hashCode() + (this.f11275a.hashCode() * 31);
    }
}
