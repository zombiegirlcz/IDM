package d2g;

import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedQuantityClause f110806a;

    public i(TextLocalisedQuantityClause buttonLabel) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f110806a = buttonLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f110806a.equals(((i) obj2).f110806a);
    }

    public final int hashCode() {
        return this.f110806a.hashCode();
    }
}
