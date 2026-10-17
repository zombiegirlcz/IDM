package gh3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f143839a;

    public g(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f143839a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f143839a.equals(((g) obj2).f143839a);
    }

    public final int hashCode() {
        return this.f143839a.hashCode();
    }
}
