package q5g;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends com.revolut.feature.travel.flights.impl.ui.screen.checkout.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f242398a;

    public z(CompositeClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f242398a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f242398a.equals(((z) obj2).f242398a);
    }

    public final int hashCode() {
        return this.f242398a.hashCode();
    }
}
