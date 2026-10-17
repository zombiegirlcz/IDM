package buf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f18780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f18781b;

    public b(e submitButtonState, e markAsPaidButtonState) {
        Intrinsics.checkNotNullParameter(submitButtonState, "submitButtonState");
        Intrinsics.checkNotNullParameter(markAsPaidButtonState, "markAsPaidButtonState");
        this.f18780a = submitButtonState;
        this.f18781b = markAsPaidButtonState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f18780a == bVar.f18780a && this.f18781b == bVar.f18781b;
    }

    public final int hashCode() {
        return this.f18781b.hashCode() + (this.f18780a.hashCode() * 31);
    }
}
