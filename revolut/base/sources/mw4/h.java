package mw4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f209333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209334b;

    public h() {
        this(3, (TextLocalisedClause) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f209333a, hVar.f209333a) && this.f209334b == hVar.f209334b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209334b) + (this.f209333a.hashCode() * 31);
    }

    public /* synthetic */ h(int i, TextLocalisedClause textLocalisedClause) {
        Clause textClause = textLocalisedClause;
        if ((i & 1) != 0) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        this(textClause, false);
    }

    public h(Clause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f209333a = text;
        this.f209334b = z;
    }
}
