package s92;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f261096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f261097c;

    public i(TextLocalisedClause title, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f261095a = items;
        this.f261096b = title;
        this.f261097c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f261095a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f261095a.equals(iVar.f261095a) && this.f261096b.equals(iVar.f261096b) && this.f261097c == iVar.f261097c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261097c) + t61.a.a(this.f261095a.hashCode() * 31, 31, this.f261096b);
    }
}
