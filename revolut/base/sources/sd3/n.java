package sd3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa6.y;
import sd3.h;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f261824a;

    public n(whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f261824a = transactionsListMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        uc3.d dVar;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f261811a, new y(23), new sa5.a(12), new sa5.b(this, 1));
        ActionsView.Item item = null;
        if (domainState.f261812b.size() > 1) {
            h hVar = domainState.f261813c;
            if (hVar instanceof i) {
                dVar = ((i) hVar).f261815a;
            } else {
                if (!Intrinsics.f(hVar, h.a.f261814a)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = null;
            }
            item = new ActionsView.Item("ID_ACTION_FILTER", mx0.d.SEMIBLACK, false, null, null, dVar != null ? z92.f.n(dVar) : new TextLocalisedClause(R$string.cashback_transactions_filter_all_sources, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
        }
        return new j(list, item);
    }
}
