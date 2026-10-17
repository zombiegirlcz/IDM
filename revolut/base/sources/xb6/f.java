package xb6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f304004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f304005c;
    public final boolean d;

    public f(List items, TextClause textClause, TextClause textClause2, int i) {
        textClause = (i & 2) != 0 ? null : textClause;
        textClause2 = (i & 4) != 0 ? null : textClause2;
        boolean z = (i & 8) == 0;
        Intrinsics.checkNotNullParameter(items, "items");
        this.f304003a = items;
        this.f304004b = textClause;
        this.f304005c = textClause2;
        this.d = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f304003a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f304003a, fVar.f304003a) && Intrinsics.f(this.f304004b, fVar.f304004b) && Intrinsics.f(this.f304005c, fVar.f304005c) && this.d == fVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f304003a.hashCode() * 31;
        Clause clause = this.f304004b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f304005c;
        return Boolean.hashCode(false) + j6.a.c((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.d);
    }
}
