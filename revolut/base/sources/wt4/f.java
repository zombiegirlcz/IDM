package wt4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f299773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f299774b;

    public f(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f299773a = title;
        this.f299774b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f299773a.equals(fVar.f299773a) && this.f299774b.equals(fVar.f299774b);
    }

    public final int hashCode() {
        return this.f299774b.hashCode() + (this.f299773a.hashCode() * 31);
    }
}
