package ldk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f194165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f194166b;

    public g(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f194165a = title;
        this.f194166b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f194165a.equals(gVar.f194165a) && this.f194166b.equals(gVar.f194166b);
    }

    public final int hashCode() {
        return this.f194166b.hashCode() + (this.f194165a.hashCode() * 31);
    }
}
