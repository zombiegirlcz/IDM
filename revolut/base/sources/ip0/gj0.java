package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f164429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f164430b;

    public gj0(int i, od0.i videoError) {
        Intrinsics.checkNotNullParameter(videoError, "videoError");
        this.f164429a = i;
        this.f164430b = videoError;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gj0)) {
            return false;
        }
        gj0 gj0Var = (gj0) obj2;
        return this.f164429a == gj0Var.f164429a && Intrinsics.f(this.f164430b, gj0Var.f164430b);
    }

    public final int hashCode() {
        return this.f164430b.hashCode() + (Integer.hashCode(this.f164429a) * 31);
    }
}
