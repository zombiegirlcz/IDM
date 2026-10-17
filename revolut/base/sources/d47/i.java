package d47;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f111237a;

    public i(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f111237a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f111237a.equals(((i) obj2).f111237a);
    }

    public final int hashCode() {
        return this.f111237a.hashCode();
    }
}
