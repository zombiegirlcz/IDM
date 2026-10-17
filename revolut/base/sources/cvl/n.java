package cvl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f109498a;

    public n(q explanation) {
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        this.f109498a = explanation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f109498a, ((n) obj2).f109498a);
    }

    public final int hashCode() {
        return this.f109498a.hashCode();
    }
}
