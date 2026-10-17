package bl7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16487a;

    public b(List statementArticles) {
        Intrinsics.checkNotNullParameter(statementArticles, "statementArticles");
        this.f16487a = statementArticles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f16487a, ((b) obj2).f16487a);
    }

    public final int hashCode() {
        return this.f16487a.hashCode();
    }
}
