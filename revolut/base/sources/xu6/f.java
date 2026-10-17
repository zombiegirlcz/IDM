package xu6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f308965a;

    public f(TextLocalisedClause buttonLabel) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f308965a = buttonLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f308965a.equals(((f) obj2).f308965a);
    }

    public final int hashCode() {
        return this.f308965a.hashCode();
    }
}
