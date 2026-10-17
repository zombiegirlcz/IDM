package bb2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f14148a;

    public n(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f14148a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f14148a, ((n) obj2).f14148a);
    }

    public final int hashCode() {
        return this.f14148a.hashCode();
    }
}
