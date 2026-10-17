package tuk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f274627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f274628b;

    public j(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f274627a = textLocalisedClause;
        this.f274628b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f274628b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f274627a.equals(jVar.f274627a) && Intrinsics.f(this.f274628b, jVar.f274628b);
    }

    public final int hashCode() {
        return this.f274628b.hashCode() + (this.f274627a.hashCode() * 31);
    }
}
