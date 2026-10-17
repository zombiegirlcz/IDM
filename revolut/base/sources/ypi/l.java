package ypi;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f315929a;

    public l(Clause note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.f315929a = note;
    }

    @Override // ypi.k
    public final Clause a() {
        return this.f315929a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f315929a, ((l) obj2).f315929a);
    }

    public final int hashCode() {
        return this.f315929a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l() {
        this(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        m70.a.c(t0.f186434a);
    }
}
