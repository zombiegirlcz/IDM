package cvl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f109499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f109500b;

    public q(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f109499a = title;
        this.f109500b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f109499a.equals(qVar.f109499a) && this.f109500b.equals(qVar.f109500b);
    }

    public final int hashCode() {
        return this.f109500b.hashCode() + (this.f109499a.hashCode() * 31);
    }
}
