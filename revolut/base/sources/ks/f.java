package ks;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f189051b;

    public f(String tag2, boolean z) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f189050a = tag2;
        this.f189051b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f189050a.equals(fVar.f189050a) && this.f189051b == fVar.f189051b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189051b) + (this.f189050a.hashCode() * 31);
    }
}
