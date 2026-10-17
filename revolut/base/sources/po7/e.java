package po7;

import kl7.o0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f237894a;

    public e(o0 estimatedValue) {
        Intrinsics.checkNotNullParameter(estimatedValue, "estimatedValue");
        this.f237894a = estimatedValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f237894a == ((e) obj2).f237894a;
    }

    public final int hashCode() {
        return this.f237894a.hashCode();
    }
}
