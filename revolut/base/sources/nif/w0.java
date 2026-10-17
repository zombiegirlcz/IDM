package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216057b;

    public w0(String legId, boolean z) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f216056a = legId;
        this.f216057b = z;
    }

    public final boolean a() {
        return this.f216057b;
    }

    public final String b() {
        return this.f216056a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f216056a, w0Var.f216056a) && this.f216057b == w0Var.f216057b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216057b) + (this.f216056a.hashCode() * 31);
    }
}
