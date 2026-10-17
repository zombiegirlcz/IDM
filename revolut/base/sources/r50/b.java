package r50;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f251523a;

    public b(List incidents) {
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        this.f251523a = incidents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f251523a, ((b) obj2).f251523a);
    }

    public final int hashCode() {
        return this.f251523a.hashCode();
    }
}
