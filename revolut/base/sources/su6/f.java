package su6;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f265681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f265682b;

    public f(TextLocalisedClause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f265681a = title;
        this.f265682b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f265682b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f265681a.equals(fVar.f265681a) && this.f265682b.equals(fVar.f265682b);
    }

    public final int hashCode() {
        return this.f265682b.hashCode() + (this.f265681a.hashCode() * 31);
    }
}
