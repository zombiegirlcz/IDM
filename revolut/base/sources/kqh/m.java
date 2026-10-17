package kqh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f188416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f188417b;

    public m(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f188416a = title;
        this.f188417b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f188417b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f188416a.equals(mVar.f188416a) && Intrinsics.f(this.f188417b, mVar.f188417b);
    }

    public final int hashCode() {
        return this.f188417b.hashCode() + (this.f188416a.hashCode() * 31);
    }
}
