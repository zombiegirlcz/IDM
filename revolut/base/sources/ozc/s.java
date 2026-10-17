package ozc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231312a;

    public s(String evidenceId) {
        Intrinsics.checkNotNullParameter(evidenceId, "evidenceId");
        this.f231312a = evidenceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f231312a, ((s) obj2).f231312a);
    }

    public final int hashCode() {
        return this.f231312a.hashCode();
    }
}
