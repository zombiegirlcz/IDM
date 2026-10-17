package vi9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f289539b;

    public e(TextLocalisedClause text, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f289538a = id10;
        this.f289539b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f289538a.equals(eVar.f289538a) && this.f289539b.equals(eVar.f289539b);
    }

    public final int hashCode() {
        return this.f289539b.hashCode() + (this.f289538a.hashCode() * 31);
    }
}
