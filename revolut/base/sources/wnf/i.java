package wnf;

import aw0.o9;
import bnf.r;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.m;
import tof.a3;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f298839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0f.b f298840b;

    public i(m transactionTextResourcesMapper, q0f.b topUpMcyAccountDetailsMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(topUpMcyAccountDetailsMapper, "topUpMcyAccountDetailsMapper");
        this.f298839a = transactionTextResourcesMapper;
        this.f298840b = topUpMcyAccountDetailsMapper;
    }

    public final CellDetailsNoteDelegate.Model a(a3 a3Var, HtmlLocalisedClause htmlLocalisedClause) {
        return new CellDetailsNoteDelegate.Model("ID_MULTI_CURRENCY_STATUS", new TextLocalisedClause(R.string.transaction_status, null, null, 14), null, new CompositeClause(v.k(new TextClause(jli.g.b(((r) this.f298839a).l(a3Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null), htmlLocalisedClause), null, null, null, 14), null, false, null, null, null, null, null, 0, 131060);
    }
}
