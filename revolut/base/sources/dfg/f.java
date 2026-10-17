package dfg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f113896b;

    public f(TextLocalisedClause label, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f113895a = z;
        this.f113896b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f113895a == fVar.f113895a && this.f113896b.equals(fVar.f113896b);
    }

    public final int hashCode() {
        return this.f113896b.hashCode() + (Boolean.hashCode(this.f113895a) * 31);
    }
}
