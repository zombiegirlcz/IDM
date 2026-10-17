package i7d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f159264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f159265b;

    public b(TextLocalisedClause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159264a = title;
        this.f159265b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f159264a.equals(bVar.f159264a) && this.f159265b.equals(bVar.f159265b);
    }

    public final int hashCode() {
        return this.f159265b.hashCode() + (this.f159264a.hashCode() * 31);
    }
}
