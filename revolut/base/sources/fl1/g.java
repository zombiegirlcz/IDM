package fl1;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f135889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f135890b;

    public g(Clause clause, boolean z) {
        this.f135889a = clause;
        this.f135890b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f135889a, gVar.f135889a) && this.f135890b == gVar.f135890b;
    }

    public final int hashCode() {
        Clause clause = this.f135889a;
        return Boolean.hashCode(this.f135890b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
