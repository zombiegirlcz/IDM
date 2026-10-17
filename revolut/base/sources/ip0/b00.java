package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f163511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f163512b;

    public b00(Clause value, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f163511a = title;
        this.f163512b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b00)) {
            return false;
        }
        b00 b00Var = (b00) obj2;
        return this.f163511a.equals(b00Var.f163511a) && this.f163512b.equals(b00Var.f163512b);
    }

    public final int hashCode() {
        return this.f163512b.hashCode() + (this.f163511a.hashCode() * 31);
    }
}
