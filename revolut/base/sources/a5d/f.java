package a5d;

import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f1352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1354c;

    public f(TextLocalisedClause title, List previews, List selectionOptions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(previews, "previews");
        Intrinsics.checkNotNullParameter(selectionOptions, "selectionOptions");
        this.f1352a = title;
        this.f1353b = previews;
        this.f1354c = selectionOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f1352a.equals(fVar.f1352a) && Intrinsics.f(this.f1353b, fVar.f1353b) && Intrinsics.f(this.f1354c, fVar.f1354c);
    }

    public final int hashCode() {
        return this.f1354c.hashCode() + p.a.d(this.f1352a.hashCode() * 31, 31, this.f1353b);
    }
}
