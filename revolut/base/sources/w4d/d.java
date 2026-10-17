package w4d;

import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f294540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f294541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f294542c;

    public d(TextLocalisedClause title, List previews, List selectionOptions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(previews, "previews");
        Intrinsics.checkNotNullParameter(selectionOptions, "selectionOptions");
        this.f294540a = title;
        this.f294541b = previews;
        this.f294542c = selectionOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f294540a.equals(dVar.f294540a) && Intrinsics.f(this.f294541b, dVar.f294541b) && Intrinsics.f(this.f294542c, dVar.f294542c);
    }

    public final int hashCode() {
        return this.f294542c.hashCode() + p.a.d(this.f294540a.hashCode() * 31, 31, this.f294541b);
    }
}
