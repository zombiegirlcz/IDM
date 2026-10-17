package ep7;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f128096a;

    public f(Map answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f128096a = answers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f128096a, ((f) obj2).f128096a);
    }

    public final int hashCode() {
        return this.f128096a.hashCode();
    }
}
