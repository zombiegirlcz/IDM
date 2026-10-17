package au0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f9162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f9163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f9164c;

    public d0(Clause titleCaption, TextLocalisedClause title) {
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        TextClause separator = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleCaption, "titleCaption");
        Intrinsics.checkNotNullParameter(separator, "separator");
        this.f9162a = title;
        this.f9163b = titleCaption;
        this.f9164c = separator;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f9162a, d0Var.f9162a) && Intrinsics.f(this.f9163b, d0Var.f9163b) && Intrinsics.f(this.f9164c, d0Var.f9164c);
    }

    public final int hashCode() {
        return this.f9164c.hashCode() + p.a.a(this.f9162a.hashCode() * 31, 31, this.f9163b);
    }
}
