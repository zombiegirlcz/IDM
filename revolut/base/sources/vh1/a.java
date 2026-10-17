package vh1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f289266a;

    public a(TextLocalisedClause message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f289266a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f289266a, ((a) obj2).f289266a);
    }

    public final int hashCode() {
        return this.f289266a.hashCode();
    }
}
