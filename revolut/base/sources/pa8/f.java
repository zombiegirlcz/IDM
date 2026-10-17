package pa8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f234440a;

    public f(TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f234440a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f234440a.equals(((f) obj2).f234440a);
    }

    public final int hashCode() {
        return this.f234440a.hashCode();
    }
}
