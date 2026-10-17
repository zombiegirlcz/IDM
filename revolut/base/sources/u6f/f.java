package u6f;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f277589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f277590b;

    public f(TextLocalisedClause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f277589a = title;
        this.f277590b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f277590b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f277589a.equals(fVar.f277589a) && this.f277590b.equals(fVar.f277590b);
    }

    public final int hashCode() {
        return this.f277590b.hashCode() + (this.f277589a.hashCode() * 31);
    }
}
