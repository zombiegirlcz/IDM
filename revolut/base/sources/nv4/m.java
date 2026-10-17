package nv4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f219470a;

    public m(TextLocalisedClause footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f219470a = footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f219470a.equals(((m) obj2).f219470a);
    }

    public final int hashCode() {
        return this.f219470a.hashCode();
    }
}
