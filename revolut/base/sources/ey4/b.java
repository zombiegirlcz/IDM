package ey4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f130564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f130565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f130566c;
    public final List d;

    public b(TextClause title, TextClause textClause, TextClause textClause2, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f130564a = title;
        this.f130565b = textClause;
        this.f130566c = textClause2;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f130564a.equals(bVar.f130564a) && Intrinsics.f(this.f130565b, bVar.f130565b) && Intrinsics.f(this.f130566c, bVar.f130566c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f130564a.hashCode() * 31;
        Clause clause = this.f130565b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f130566c;
        return this.d.hashCode() + ((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
