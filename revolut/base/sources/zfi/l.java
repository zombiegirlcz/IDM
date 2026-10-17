package zfi;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f321981b;

    public l(String queryParam, Set selectedOptions) {
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        this.f321980a = queryParam;
        this.f321981b = selectedOptions;
    }

    public static l a(l lVar, Set selectedOptions) {
        String queryParam = lVar.f321980a;
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        return new l(queryParam, selectedOptions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f321980a, lVar.f321980a) && Intrinsics.f(this.f321981b, lVar.f321981b);
    }

    public final int hashCode() {
        return this.f321981b.hashCode() + (this.f321980a.hashCode() * 31);
    }
}
