package inh;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f162944a;

    public f(ArrayList events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f162944a = events;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f162944a.equals(((f) obj2).f162944a);
    }

    public final int hashCode() {
        return this.f162944a.hashCode();
    }
}
