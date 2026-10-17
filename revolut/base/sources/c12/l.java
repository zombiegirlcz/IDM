package c12;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f20339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f20340b;

    public l(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f20339a = title;
        this.f20340b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f20339a.equals(lVar.f20339a) && this.f20340b.equals(lVar.f20340b);
    }

    public final int hashCode() {
        return this.f20340b.hashCode() + (this.f20339a.hashCode() * 31);
    }
}
