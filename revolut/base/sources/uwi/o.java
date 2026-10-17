package uwi;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f283683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.a f283684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f283685c;

    public o(Clause clause, com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.a buttons, List items) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283683a = clause;
        this.f283684b = buttons;
        this.f283685c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f283685c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f283683a, oVar.f283683a) && Intrinsics.f(this.f283684b, oVar.f283684b) && Intrinsics.f(this.f283685c, oVar.f283685c);
    }

    public final int hashCode() {
        Clause clause = this.f283683a;
        return this.f283685c.hashCode() + ((this.f283684b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31)) * 31);
    }
}
