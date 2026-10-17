package ta;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f269062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269063b;

    public b(a state, String code) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f269062a = state;
        this.f269063b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f269062a == bVar.f269062a && Intrinsics.f(this.f269063b, bVar.f269063b);
    }

    public final int hashCode() {
        return this.f269063b.hashCode() + (this.f269062a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmButton(state=" + this.f269062a + ", code=" + this.f269063b + ")";
    }
}
