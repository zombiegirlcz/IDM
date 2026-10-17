package fl1;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f135894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f135895b;

    public l(Clause clause, boolean z) {
        this.f135894a = clause;
        this.f135895b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f135894a, lVar.f135894a) && this.f135895b == lVar.f135895b;
    }

    public final int hashCode() {
        Clause clause = this.f135894a;
        return Boolean.hashCode(this.f135895b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
