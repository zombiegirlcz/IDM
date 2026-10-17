package h7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f149824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f149825b;

    public t(float f, float f4) {
        this.f149824a = f;
        this.f149825b = f4;
    }

    @Override // h7.u
    public final float a(d7.j composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        return this.f149825b;
    }

    @Override // h7.u
    public final float b(d7.j composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        return this.f149824a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Float.compare(this.f149824a, tVar.f149824a) == 0 && Float.compare(this.f149825b, tVar.f149825b) == 0;
    }

    public final int hashCode() {
        return (Float.hashCode(this.f149824a) * 31) + Float.hashCode(this.f149825b);
    }

    public final String toString() {
        return "Progress(min=" + this.f149824a + ", max=" + this.f149825b + ")";
    }
}
