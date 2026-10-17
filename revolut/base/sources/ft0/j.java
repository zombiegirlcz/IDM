package ft0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f137761b;

    public j(TextClause text, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f137760a = listId;
        this.f137761b = text;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59198a() {
        return this.f137760a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f137760a, jVar.f137760a) && this.f137761b.equals(jVar.f137761b);
    }

    public final int hashCode() {
        return this.f137761b.hashCode() + (this.f137760a.hashCode() * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof j ? (j) oldItem : null) != null) {
            return new i(!r3.f137761b.equals(this.f137761b));
        }
        return null;
    }
}
