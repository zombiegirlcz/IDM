package b39;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f12014a;

    public a(d featureId) {
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        this.f12014a = featureId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f12014a == ((a) obj2).f12014a;
    }

    public final int hashCode() {
        return this.f12014a.hashCode();
    }
}
