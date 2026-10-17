package ld4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f194029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f194030b;

    public m(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f194029a = items;
        this.f194030b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f194029a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f194029a, mVar.f194029a) && Intrinsics.f(this.f194030b, mVar.f194030b);
    }

    public final int hashCode() {
        return this.f194030b.hashCode() + (this.f194029a.hashCode() * 31);
    }
}
