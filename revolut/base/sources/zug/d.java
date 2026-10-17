package zug;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f325455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f325456b;

    public d(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f325455a = title;
        this.f325456b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f325455a.equals(dVar.f325455a) && this.f325456b.equals(dVar.f325456b);
    }

    public final int hashCode() {
        return this.f325456b.hashCode() + (this.f325455a.hashCode() * 31);
    }
}
