package ds2;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreenContract$InputData;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockedMerchantDetailsScreenContract$InputData f117187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.g f117188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nr2.d f117189c;

    public k(BlockedMerchantDetailsScreenContract$InputData inputData, thf.g transactionItemMapper, nr2.d blockedMerchantWidgetProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        Intrinsics.checkNotNullParameter(blockedMerchantWidgetProvider, "blockedMerchantWidgetProvider");
        this.f117187a = inputData;
        this.f117188b = transactionItemMapper;
        this.f117189c = blockedMerchantWidgetProvider;
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("BLOCKED_TRANSACTIONS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.merchants_block_details_transactions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        Iterable iterableG;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        kr2.e eVar = domainState.f117178a;
        Data data = domainState.f117179b;
        String str = eVar.f188643a;
        String str2 = eVar.f188645c;
        ContentUser contentUser = this.f117187a.f64249a;
        ContentUser.Junior junior = contentUser instanceof ContentUser.Junior ? (ContentUser.Junior) contentUser : null;
        sa saVarA = ((xr2.b) this.f117189c).a(str, str2, junior != null ? junior.f64236c : null);
        yp0.b.l(saVarA, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(saVarA);
        if (((List) data.getContent()) == null || !(!r3.isEmpty())) {
            iterableG = data.getLoading() ? yp0.b.g(v.k(new pb0("LOADING_STATE_ID_1"), new pb0("LOADING_STATE_ID_2"), new pb0("LOADING_STATE_ID_3")), b(), null, 0, 0, 126) : f0.f322471a;
        } else {
            List list = (List) data.getContent();
            if (list == null) {
                list = f0.f322471a;
            }
            List listV0 = d0.V0(list, 3);
            q.Companion.getClass();
            ArrayList arrayListQ = ((anf.k) this.f117188b).q(listV0, k71.p.a(), new thf.f(false, 3));
            if (list.size() > 3) {
                arrayListQ = d0.F0(new LargeActionButtonDelegate.Model("ID_SEE_ALL_TRANSACTIONS_ITEM", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.merchants_block_details_transactions_seeAll, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), false, null, null, null, null, 1000), arrayListQ);
            }
            iterableG = yp0.b.g(arrayListQ, b(), null, 0, 0, 126);
        }
        return new h(d0.E0(iterableG, listC));
    }
}
