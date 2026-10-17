package nf4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv3.a f214826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f214827b;

    public t(cv3.a content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f214826a = content;
        this.f214827b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f214826a, tVar.f214826a) && this.f214827b == tVar.f214827b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214827b) + (this.f214826a.hashCode() * 31);
    }
}
