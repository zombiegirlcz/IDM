package aff;

import a2f.q;
import ael.r0;
import aw0.j0;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transaction.recogniser.api.domain.models.RecogniserTransaction;
import com.revolut.feature.transaction.recogniser.impl.R$string;
import ip0.pb0;
import java.util.ArrayList;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dff.a f4042a;

    public k(dff.a transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f4042a = transactionItemMapper;
    }

    public static ArrayList b() {
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("MERCHANT_DETAILS_LOADING", it8.nextInt())));
        }
        return arrayList;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RecogniserTransaction recogniserTransaction = domainState.f4036a.f91803a;
        boolean z = domainState.f4037b.f23436a != null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_recogniser_merchant_history_screen_unrecognised_transaction_title, null, null, 14);
        int i = R$attr.uikit_dp16;
        j0 j0Var = j0.TRANSPARENT;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("MERCHANT_DETAILS_LOADED_HEADER", null, textLocalisedClause, null, null, null, j0Var, null, null, false, false, null, null, 0, i, 0, 0, 14679994);
        RowDelegate.Model modelB = ((dff.b) this.f4042a).b(recogniserTransaction, false);
        yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
        return new i(d0.E0(ce9.m.y(domainState.f4037b, new r0(this, 23), new a9d.p(22), new q(this, 11), new r0(this, 24), new a9d.p(23)), v.k(model, modelB, new ListSubheaderDelegate.Model("MERCHANT_DETAILS_LOADED_PAST_HEADER", null, new TextLocalisedClause(R$string.transaction_recogniser_merchant_history_screen_two_year_transaction_title, null, null, 14), null, null, null, j0Var, null, null, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 14679994))), z);
    }
}
