package tp7;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f273304a;

    public f(Map answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f273304a = answers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f273304a, ((f) obj2).f273304a);
    }

    public final int hashCode() {
        return this.f273304a.hashCode();
    }
}
