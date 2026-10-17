package e1d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f121966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f121967b;

    public f(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f121966a = title;
        this.f121967b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f121966a.equals(fVar.f121966a) && this.f121967b.equals(fVar.f121967b);
    }

    public final int hashCode() {
        return this.f121967b.hashCode() + (this.f121966a.hashCode() * 31);
    }
}
