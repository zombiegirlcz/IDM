package h40;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f149259b;

    public c(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f149258a = items;
        this.f149259b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f149258a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f149258a.equals(cVar.f149258a) && this.f149259b.equals(cVar.f149259b);
    }

    public final int hashCode() {
        return this.f149259b.hashCode() + (this.f149258a.hashCode() * 31);
    }
}
