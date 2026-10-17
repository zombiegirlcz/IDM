package y6g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f311268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f311269b;

    public c(TextLocalisedClause title, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f311268a = title;
        this.f311269b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f311268a.equals(cVar.f311268a) && this.f311269b.equals(cVar.f311269b);
    }

    public final int hashCode() {
        return this.f311269b.hashCode() + (this.f311268a.hashCode() * 31);
    }
}
