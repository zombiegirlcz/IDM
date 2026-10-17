package no8;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f217956b;

    public l(aim.e items, TextLocalisedClause headerTitle) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        this.f217955a = items;
        this.f217956b = headerTitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f217955a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f217955a, lVar.f217955a) && this.f217956b.equals(lVar.f217956b);
    }

    public final int hashCode() {
        return this.f217956b.hashCode() + (this.f217955a.hashCode() * 31);
    }
}
