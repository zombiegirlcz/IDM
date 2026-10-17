package mh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv3.k f205397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f205398b;

    public l(mv3.k parameters, boolean z) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f205397a = parameters;
        this.f205398b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f205397a, lVar.f205397a) && this.f205398b == lVar.f205398b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205398b) + (this.f205397a.hashCode() * 31);
    }
}
