package jh3;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.checklist_challenges_ui.impl.R$string;
import ieg.z;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import jfb.v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.g;
import zg3.r;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements hh3.e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f174142a;

    public d(hh3.b commonMapper, g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f174142a = transactionsItemMapper;
    }

    @Override // hh3.e
    public final List a(hh3.a aVar) {
        b uiBlock = (b) aVar;
        Intrinsics.checkNotNullParameter(uiBlock, "uiBlock");
        r rVar = uiBlock.f174140a;
        return rVar.f322071b.isEmpty() ? b(rVar.f322070a) : (List) iii.c.f(uiBlock.f174141b, new jeg.g(this, uiBlock), new v0(2), new z(this, uiBlock, 26));
    }

    public final ArrayList b(String str) {
        return yp0.b.g(u.c(new TextDelegate.Model(j6.a.q("TRANSACTIONS_EMPTY_TEXT_LIST_ID_", str), new TextLocalisedClause(R$string.checklist_step_details_transactions_empty, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036)), c(str), null, 0, 0, 126);
    }

    public final ListSubheaderDelegate.Model c(String str) {
        return hh3.b.a(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j6.a.q("TRANSACTIONS_TITLE_LIST_ID_", str));
    }
}
