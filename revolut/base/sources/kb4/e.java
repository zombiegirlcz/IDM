package kb4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f182519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f182520b;

    public e(TextLocalisedClause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f182519a = items;
        this.f182520b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f182519a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f182519a.equals(eVar.f182519a) && this.f182520b.equals(eVar.f182520b);
    }

    public final int hashCode() {
        return this.f182520b.hashCode() + (this.f182519a.hashCode() * 31);
    }
}
