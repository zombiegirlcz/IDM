package dhi;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f114816a;

    public d(TextLocalisedClause message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f114816a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f114816a.equals(((d) obj2).f114816a);
    }

    public final int hashCode() {
        return this.f114816a.hashCode();
    }
}
