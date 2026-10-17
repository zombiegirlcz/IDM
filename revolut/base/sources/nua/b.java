package nua;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hua.c f219268a;

    public b(hua.c selectedFrequency) {
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        this.f219268a = selectedFrequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f219268a == ((b) obj2).f219268a;
    }

    public final int hashCode() {
        return this.f219268a.hashCode();
    }
}
