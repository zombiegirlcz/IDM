package fg4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f134897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f134898b;

    public d(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f134897a = items;
        this.f134898b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f134897a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f134897a, dVar.f134897a) && this.f134898b.equals(dVar.f134898b);
    }

    public final int hashCode() {
        return this.f134898b.hashCode() + (this.f134897a.hashCode() * 31);
    }
}
