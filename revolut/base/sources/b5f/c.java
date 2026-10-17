package b5f;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f12516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12517b;

    public c(TextLocalisedClause toolbarTitle, List items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f12516a = toolbarTitle;
        this.f12517b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f12517b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f12516a.equals(cVar.f12516a) && Intrinsics.f(this.f12517b, cVar.f12517b);
    }

    public final int hashCode() {
        return this.f12517b.hashCode() + (this.f12516a.hashCode() * 31);
    }
}
