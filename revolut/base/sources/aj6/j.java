package aj6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f5412a;

    public j(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f5412a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f5412a.equals(((j) obj2).f5412a);
    }

    public final int hashCode() {
        return this.f5412a.hashCode();
    }
}
