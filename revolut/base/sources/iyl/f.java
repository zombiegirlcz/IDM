package iyl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169799b;

    public f(String error, String context) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f169798a = error;
        this.f169799b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f169798a, fVar.f169798a) && Intrinsics.f(this.f169799b, fVar.f169799b);
    }

    public final int hashCode() {
        return this.f169799b.hashCode() + (this.f169798a.hashCode() * 31);
    }
}
