package f47;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f132017a;

    public h(TextLocalisedClause buttonLabel) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f132017a = buttonLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f132017a.equals(((h) obj2).f132017a);
    }

    public final int hashCode() {
        return this.f132017a.hashCode();
    }
}
