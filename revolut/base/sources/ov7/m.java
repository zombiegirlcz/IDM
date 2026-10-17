package ov7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f229977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f229978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f229979c;
    public final List d;

    public m(TextClause title, TextClause textClause, TextClause textClause2, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f229977a = title;
        this.f229978b = textClause;
        this.f229979c = textClause2;
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
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f229977a.equals(mVar.f229977a) && Intrinsics.f(this.f229978b, mVar.f229978b) && Intrinsics.f(this.f229979c, mVar.f229979c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f229977a.hashCode() * 31;
        Clause clause = this.f229978b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f229979c;
        return this.d.hashCode() + ((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
