package j02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f169919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f169920b;

    public h(g consumer, boolean z) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f169919a = consumer;
        this.f169920b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f169919a, hVar.f169919a) && this.f169920b == hVar.f169920b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f169920b) + (this.f169919a.f169918a.hashCode() * 31);
    }
}
