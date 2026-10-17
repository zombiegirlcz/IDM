package a2f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f815c;
    public final String d;
    public final boolean e;
    public final Clause f;

    public i(List items, CompositeClause compositeClause, TextClause textClause, String str, boolean z, TextClause textClause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f813a = items;
        this.f814b = compositeClause;
        this.f815c = textClause;
        this.d = str;
        this.e = z;
        this.f = textClause2;
    }

    @Override // cli.p
    public final List c() {
        return this.f813a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f813a, iVar.f813a) && Intrinsics.f(this.f814b, iVar.f814b) && Intrinsics.f(this.f815c, iVar.f815c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f813a.hashCode() * 31;
        Clause clause = this.f814b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f815c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        String str = this.d;
        int iC = j6.a.c((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Clause clause3 = this.f;
        return iC + (clause3 != null ? clause3.hashCode() : 0);
    }
}
