package s47;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f259793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f259794b;

    public p(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f259793a = title;
        this.f259794b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f259793a.equals(pVar.f259793a) && this.f259794b.equals(pVar.f259794b);
    }

    public final int hashCode() {
        return this.f259794b.hashCode() + (this.f259793a.hashCode() * 31);
    }
}
