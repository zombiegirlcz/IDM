package s47;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f259790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f259791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f259792c;

    public o(TextLocalisedClause buttonLabel, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f259790a = buttonLabel;
        this.f259791b = textLocalisedClause;
        this.f259792c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f259790a.equals(oVar.f259790a) && Intrinsics.f(this.f259791b, oVar.f259791b) && this.f259792c == oVar.f259792c;
    }

    public final int hashCode() {
        int iHashCode = this.f259790a.hashCode() * 31;
        Clause clause = this.f259791b;
        return Boolean.hashCode(this.f259792c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
