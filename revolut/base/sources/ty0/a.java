package ty0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f275446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f275447c;
    public final Object d;

    public a(String id10, String text, Clause clause, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f275445a = id10;
        this.f275446b = text;
        this.f275447c = clause;
        this.d = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f275445a, aVar.f275445a) && Intrinsics.f(this.f275446b, aVar.f275446b) && Intrinsics.f(this.f275447c, aVar.f275447c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f275445a.hashCode() * 31, 31, this.f275446b);
        Clause clause = this.f275447c;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public /* synthetic */ a(String str, String str2, TextClause textClause, Object obj2, int i) {
        this(str, str2, (i & 4) != 0 ? null : textClause, (i & 8) != 0 ? null : obj2);
    }
}
