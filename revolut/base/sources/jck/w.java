package jck;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f172869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f172870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f172871c;

    public w(p headerState, TextClause searchQuery, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172869a = headerState;
        this.f172870b = searchQuery;
        this.f172871c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f172871c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f172869a.equals(wVar.f172869a) && this.f172870b.equals(wVar.f172870b) && Intrinsics.f(this.f172871c, wVar.f172871c);
    }

    public final int hashCode() {
        return this.f172871c.hashCode() + v7.b(this.f172869a.hashCode() * 31, 31, this.f172870b);
    }
}
