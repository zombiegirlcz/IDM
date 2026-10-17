package h0f;

import aw0.f4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4 f148390a;

    public h(f4 focusData) {
        Intrinsics.checkNotNullParameter(focusData, "focusData");
        this.f148390a = focusData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f148390a, ((h) obj2).f148390a);
    }

    public final int hashCode() {
        return this.f148390a.hashCode();
    }
}
