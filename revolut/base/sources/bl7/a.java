package bl7;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16486a;

    public a(List statementArticles) {
        Intrinsics.checkNotNullParameter(statementArticles, "statementArticles");
        this.f16486a = statementArticles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f16486a, ((a) obj2).f16486a);
    }

    public final int hashCode() {
        return this.f16486a.hashCode();
    }
}
