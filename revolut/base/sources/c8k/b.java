package c8k;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f22240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22241b;

    public b(Clause clause, boolean z) {
        this.f22240a = clause;
        this.f22241b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f22240a, bVar.f22240a) && this.f22241b == bVar.f22241b;
    }

    public final int hashCode() {
        Clause clause = this.f22240a;
        return Boolean.hashCode(this.f22241b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
