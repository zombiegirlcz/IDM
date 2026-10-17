package ta;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f269069b;

    public g(String text, f state) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f269068a = text;
        this.f269069b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f269068a, gVar.f269068a) && this.f269069b == gVar.f269069b;
    }

    public final int hashCode() {
        return this.f269069b.hashCode() + (this.f269068a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(text=" + this.f269068a + ", state=" + this.f269069b + ")";
    }
}
