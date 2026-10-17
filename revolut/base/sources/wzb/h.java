package wzb;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f301401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f301402b;

    public h(TextLocalisedClause secondDescriptionClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(secondDescriptionClause, "secondDescriptionClause");
        this.f301401a = items;
        this.f301402b = secondDescriptionClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f301401a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f301401a, hVar.f301401a) && this.f301402b.equals(hVar.f301402b);
    }

    public final int hashCode() {
        return this.f301402b.hashCode() + (this.f301401a.hashCode() * 31);
    }
}
