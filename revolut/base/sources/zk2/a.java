package zk2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f322901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f322902b;

    public a(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter("ATM_OUT_OF_NETWORK_TILE_ID", "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f322901a = title;
        this.f322902b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f322901a.equals(aVar.f322901a) && this.f322902b.equals(aVar.f322902b);
    }

    public final int hashCode() {
        return t61.a.a(t61.a.a(-1266205609, 31, this.f322901a), 31, this.f322902b);
    }
}
