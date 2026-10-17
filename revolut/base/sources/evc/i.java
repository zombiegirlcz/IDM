package evc;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f129771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f129772b;

    public i(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f129771a = items;
        this.f129772b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f129771a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f129771a.equals(iVar.f129771a) && this.f129772b.equals(iVar.f129772b);
    }

    public final int hashCode() {
        return t61.a.a(this.f129771a.hashCode() * 31, 31, this.f129772b);
    }
}
