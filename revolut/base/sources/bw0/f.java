package bw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19178a;

    public f(List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f19178a = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f19178a, ((f) obj2).f19178a);
    }

    public final int hashCode() {
        return this.f19178a.hashCode();
    }
}
