package p7f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f233763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f233764b;

    public k(Clause subtitle, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f233763a = title;
        this.f233764b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f233763a.equals(kVar.f233763a) && this.f233764b.equals(kVar.f233764b);
    }

    public final int hashCode() {
        return this.f233764b.hashCode() + (this.f233763a.hashCode() * 31);
    }
}
