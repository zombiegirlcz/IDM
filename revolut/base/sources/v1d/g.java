package v1d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f285295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f285296b;

    public g(TextLocalisedClause title, TextLocalisedClause action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f285295a = title;
        this.f285296b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f285295a.equals(gVar.f285295a) && this.f285296b.equals(gVar.f285296b);
    }

    public final int hashCode() {
        return this.f285296b.hashCode() + (this.f285295a.hashCode() * 31);
    }
}
