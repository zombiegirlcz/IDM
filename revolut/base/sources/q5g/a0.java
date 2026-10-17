package q5g;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends com.revolut.feature.travel.flights.impl.ui.screen.checkout.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f242355a;

    public a0(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f242355a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f242355a, ((a0) obj2).f242355a);
    }

    public final int hashCode() {
        return this.f242355a.hashCode();
    }
}
