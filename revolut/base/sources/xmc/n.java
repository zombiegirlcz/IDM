package xmc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f307144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f307145b;

    public n(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f307144a = title;
        this.f307145b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f307144a.equals(nVar.f307144a) && this.f307145b.equals(nVar.f307145b);
    }

    public final int hashCode() {
        return this.f307145b.hashCode() + (this.f307144a.hashCode() * 31);
    }
}
