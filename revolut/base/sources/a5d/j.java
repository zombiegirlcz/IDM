package a5d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f1359a;

    public j(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f1359a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f1359a.equals(((j) obj2).f1359a);
    }

    public final int hashCode() {
        return this.f1359a.hashCode();
    }
}
