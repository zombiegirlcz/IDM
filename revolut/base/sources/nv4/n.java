package nv4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f219471a;

    public n(TextLocalisedClause footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f219471a = footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f219471a.equals(((n) obj2).f219471a);
    }

    public final int hashCode() {
        return this.f219471a.hashCode();
    }
}
