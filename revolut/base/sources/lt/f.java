package lt;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f199723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f199724b;

    public f(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f199723a = items;
        this.f199724b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f199723a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f199723a, fVar.f199723a) && this.f199724b.equals(fVar.f199724b);
    }

    public final int hashCode() {
        return this.f199724b.hashCode() + (this.f199723a.hashCode() * 31);
    }
}
