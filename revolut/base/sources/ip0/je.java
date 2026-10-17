package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f164829b;

    public je(TextLocalisedClause label, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f164828a = id10;
        this.f164829b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof je)) {
            return false;
        }
        je jeVar = (je) obj2;
        return this.f164828a.equals(jeVar.f164828a) && this.f164829b.equals(jeVar.f164829b);
    }

    public final int hashCode() {
        return this.f164829b.hashCode() + (this.f164828a.hashCode() * 31);
    }
}
