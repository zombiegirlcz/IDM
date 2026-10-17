package xm4;

import dx4.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f307075a;

    public b(z2 prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f307075a = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f307075a, ((b) obj2).f307075a);
    }

    public final int hashCode() {
        return this.f307075a.hashCode();
    }
}
