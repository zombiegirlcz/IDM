package gch;

import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f142479a;

    public h(c0 selectedPeriod) {
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f142479a = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f142479a == ((h) obj2).f142479a;
    }

    public final int hashCode() {
        return this.f142479a.hashCode();
    }
}
