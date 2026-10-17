package jwc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f178959a;

    public h(TextLocalisedClause message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f178959a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f178959a.equals(((h) obj2).f178959a);
    }

    public final int hashCode() {
        return this.f178959a.hashCode();
    }
}
