package qc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244414a;

    public f() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f244414a, ((f) obj2).f244414a);
    }

    public final int hashCode() {
        String str = this.f244414a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public f(String str) {
        this.f244414a = str;
    }
}
