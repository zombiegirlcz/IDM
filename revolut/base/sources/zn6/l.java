package zn6;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f323679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f323680c;

    public l(TextLocalisedClause subtitle, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f323678a = items;
        this.f323679b = z;
        this.f323680c = subtitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f323678a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f323678a, lVar.f323678a) && this.f323679b == lVar.f323679b && this.f323680c.equals(lVar.f323680c);
    }

    public final int hashCode() {
        return this.f323680c.hashCode() + j6.a.c(this.f323678a.hashCode() * 31, 31, this.f323679b);
    }
}
