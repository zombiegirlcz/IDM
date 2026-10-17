package l5i;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f192283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f192284b;

    public j(CompositeClause description, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f192283a = title;
        this.f192284b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f192283a.equals(jVar.f192283a) && this.f192284b.equals(jVar.f192284b);
    }

    public final int hashCode() {
        return this.f192284b.hashCode() + (this.f192283a.hashCode() * 31);
    }
}
