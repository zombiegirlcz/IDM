package k37;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f180637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f180638b;

    public n(TextLocalisedClause title, TextLocalisedClause caption) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caption, "caption");
        this.f180637a = title;
        this.f180638b = caption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f180637a.equals(nVar.f180637a) && this.f180638b.equals(nVar.f180638b);
    }

    public final int hashCode() {
        return this.f180638b.hashCode() + (this.f180637a.hashCode() * 31);
    }
}
