package z55;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m35.r f319490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c55.r f319491b;

    public b(m35.r loanUiContentMapper, c55.r loanLateDisbursalItemFactory) {
        Intrinsics.checkNotNullParameter(loanUiContentMapper, "loanUiContentMapper");
        Intrinsics.checkNotNullParameter(loanLateDisbursalItemFactory, "loanLateDisbursalItemFactory");
        this.f319490a = loanUiContentMapper;
        this.f319491b = loanLateDisbursalItemFactory;
    }

    public static CompositeClause a(int i, int i2) {
        return CompositeClause.a(sx4.g.g(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(i2), false, null, false, null, 254), 10), new ImageClauseTint.Color(i2)), null, new Click(30, (Integer) null, (Object) null, "description", false), 11);
    }
}
