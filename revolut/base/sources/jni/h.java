package jni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f176792b;

    public h(String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f176791a = value;
        this.f176792b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f176791a, hVar.f176791a) && this.f176792b == hVar.f176792b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176792b) + (this.f176791a.hashCode() * 31);
    }
}
