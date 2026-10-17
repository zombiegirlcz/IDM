package pkj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f237199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f237200b;

    public f(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f237199a = title;
        this.f237200b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f237199a.equals(fVar.f237199a) && this.f237200b.equals(fVar.f237200b);
    }

    public final int hashCode() {
        return this.f237200b.hashCode() + (this.f237199a.hashCode() * 31);
    }
}
