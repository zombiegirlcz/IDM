package nmb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f217242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f217243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f217244c;

    public h(TextLocalisedClause title, HtmlClause htmlClause, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f217242a = title;
        this.f217243b = htmlClause;
        this.f217244c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f217242a.equals(hVar.f217242a) && Intrinsics.f(this.f217243b, hVar.f217243b) && this.f217244c == hVar.f217244c;
    }

    public final int hashCode() {
        int iHashCode = this.f217242a.hashCode() * 31;
        Clause clause = this.f217243b;
        return Boolean.hashCode(this.f217244c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
