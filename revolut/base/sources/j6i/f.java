package j6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f171777a;

    public f(TextClause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f171777a = label;
    }

    @Override // yqi.b
    public final Clause a() {
        return this.f171777a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f171777a.equals(((f) obj2).f171777a);
    }

    public final int hashCode() {
        return this.f171777a.hashCode();
    }
}
