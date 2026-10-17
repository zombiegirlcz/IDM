package ytj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f316821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f316822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316823c;

    public n(TextClause title, Clause description, String headerImageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
        this.f316821a = title;
        this.f316822b = description;
        this.f316823c = headerImageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f316821a.equals(nVar.f316821a) && this.f316822b.equals(nVar.f316822b) && Intrinsics.f(this.f316823c, nVar.f316823c);
    }

    public final int hashCode() {
        return this.f316823c.hashCode() + p.a.b(this.f316821a.hashCode() * 31, 31, this.f316822b);
    }
}
