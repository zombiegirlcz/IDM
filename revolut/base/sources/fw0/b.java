package fw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import fw0.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f138511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f138512b;

    public b(TextLocalisedClause textLocalisedClause) {
        a.C0807a style = a.C0807a.f138509a;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f138511a = textLocalisedClause;
        this.f138512b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f138511a, bVar.f138511a) && Intrinsics.f(this.f138512b, bVar.f138512b);
    }

    public final int hashCode() {
        Clause clause = this.f138511a;
        return this.f138512b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
