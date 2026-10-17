package era;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.push_to_card.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128621b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String country) {
        super(new TextLocalisedClause(R$string.push2card_new_recipient_error_code2, zhm.u.c(country), null, 12), false);
        Intrinsics.checkNotNullParameter(country, "country");
        this.f128621b = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f128621b, ((o) obj2).f128621b);
    }

    public final int hashCode() {
        return this.f128621b.hashCode();
    }
}
