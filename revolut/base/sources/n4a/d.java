package n4a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f212340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f212341b;

    public d(Clause title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f212340a = title;
        this.f212341b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f212340a, dVar.f212340a) && this.f212341b == dVar.f212341b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f212341b) + (this.f212340a.hashCode() * 31);
    }

    public d(int i, int i2) {
        this(new TextLocalisedClause(i, null, null, 14), i2);
    }
}
