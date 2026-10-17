package ipg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f167746a;

    public a(TextLocalisedClause message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f167746a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f167746a.equals(((a) obj2).f167746a);
    }

    public final int hashCode() {
        return this.f167746a.hashCode();
    }
}
