package xd1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f304214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f304215b;

    public g(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f304214a = z;
        this.f304215b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f304214a == gVar.f304214a && this.f304215b.equals(gVar.f304215b);
    }

    public final int hashCode() {
        return this.f304215b.hashCode() + (Boolean.hashCode(this.f304214a) * 31);
    }
}
