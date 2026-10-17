package zaj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f320721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f320722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f320723c;

    public c() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f320721a, cVar.f320721a) && Intrinsics.f(this.f320722b, cVar.f320722b) && this.f320723c == cVar.f320723c;
    }

    public final int hashCode() {
        Clause clause = this.f320721a;
        return Boolean.hashCode(this.f320723c) + r6.b.d(this.f320722b, (clause == null ? 0 : clause.hashCode()) * 31, 31);
    }

    public c(TextClause textClause, LargeActionButton.ButtonStyle style, int i) {
        textClause = (i & 1) != 0 ? null : textClause;
        style = (i & 2) != 0 ? LargeActionButton.ButtonStyle.d : style;
        boolean z = (i & 4) != 0;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f320721a = textClause;
        this.f320722b = style;
        this.f320723c = z;
    }
}
