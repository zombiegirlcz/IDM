package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2 f173443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f173444b;

    public f2(u2 title, u2 body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f173443a = title;
        this.f173444b = body;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.f173443a, f2Var.f173443a) && Intrinsics.f(this.f173444b, f2Var.f173444b);
    }

    public final int hashCode() {
        return this.f173444b.hashCode() + (this.f173443a.hashCode() * 31);
    }
}
