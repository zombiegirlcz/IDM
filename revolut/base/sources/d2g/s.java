package d2g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lyf.a f110821a;

    public s(lyf.a experience) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        this.f110821a = experience;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f110821a, ((s) obj2).f110821a);
    }

    public final int hashCode() {
        return this.f110821a.hashCode();
    }
}
