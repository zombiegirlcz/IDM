package ir2;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends h {

    @NotNull
    public static final f Companion = new f();
    public static final g d = new g(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f167989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f167990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f167991c;

    public g(TextClause title, CompositeClause compositeClause, List list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f167989a = title;
        this.f167990b = compositeClause;
        this.f167991c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f167989a.equals(gVar.f167989a) && Intrinsics.f(this.f167990b, gVar.f167990b) && Intrinsics.f(this.f167991c, gVar.f167991c);
    }

    public final int hashCode() {
        int iHashCode = this.f167989a.hashCode() * 31;
        Clause clause = this.f167990b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        List list = this.f167991c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
