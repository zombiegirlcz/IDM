package luc;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f200220b;

    public i(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f200219a = items;
        this.f200220b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f200219a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f200219a.equals(iVar.f200219a) && this.f200220b.equals(iVar.f200220b);
    }

    public final int hashCode() {
        return this.f200220b.hashCode() + (this.f200219a.hashCode() * 31);
    }
}
