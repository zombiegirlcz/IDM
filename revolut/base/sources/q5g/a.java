package q5g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f242353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f242354b;

    public a(TextLocalisedClause title, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f242353a = title;
        this.f242354b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f242353a.equals(aVar.f242353a) && this.f242354b.equals(aVar.f242354b);
    }

    public final int hashCode() {
        return this.f242354b.hashCode() + (this.f242353a.hashCode() * 31);
    }
}
