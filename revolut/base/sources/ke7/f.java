package ke7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f183015a;

    public f(TextLocalisedClause placeholderText) {
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        this.f183015a = placeholderText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f183015a.equals(((f) obj2).f183015a);
    }

    public final int hashCode() {
        return this.f183015a.hashCode();
    }
}
