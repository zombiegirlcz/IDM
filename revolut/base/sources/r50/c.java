package r50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f251524a;

    public c(List incidents) {
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        this.f251524a = incidents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f251524a, ((c) obj2).f251524a);
    }

    public final int hashCode() {
        return this.f251524a.hashCode();
    }
}
