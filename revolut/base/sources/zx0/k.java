package zx0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f326002b;

    public k(TextClause emojiClause, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(emojiClause, "emojiClause");
        this.f326001a = id10;
        this.f326002b = emojiClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f326001a.equals(kVar.f326001a) && this.f326002b.equals(kVar.f326002b);
    }

    public final int hashCode() {
        return this.f326002b.hashCode() + (this.f326001a.hashCode() * 31);
    }
}
