package jwc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f178958a;

    public g(TextLocalisedClause message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f178958a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f178958a.equals(((g) obj2).f178958a);
    }

    public final int hashCode() {
        return this.f178958a.hashCode();
    }
}
