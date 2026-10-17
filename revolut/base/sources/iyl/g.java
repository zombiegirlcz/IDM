package iyl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169800a;

    public g(String labelId) {
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        this.f169800a = labelId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f169800a, ((g) obj2).f169800a);
    }

    public final int hashCode() {
        return this.f169800a.hashCode();
    }
}
