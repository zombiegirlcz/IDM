package i6j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f159023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f159024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yy0.l f159025c;

    public i(Clause title, TextLocalisedClause description, yy0.l endImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        this.f159023a = title;
        this.f159024b = description;
        this.f159025c = endImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f159023a.equals(iVar.f159023a) && this.f159024b.equals(iVar.f159024b) && this.f159025c.equals(iVar.f159025c);
    }

    public final int hashCode() {
        return this.f159025c.hashCode() + t61.a.a(this.f159023a.hashCode() * 31, 31, this.f159024b);
    }
}
