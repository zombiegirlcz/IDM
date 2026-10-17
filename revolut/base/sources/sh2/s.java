package sh2;

import c12.y;
import c12.z;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import hy1.b0;
import hy1.m0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends yji.n implements z {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qh2.a f263415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m0 f263416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f263417n;
    public final fh2.a o;

    public s(qh2.a weroInteractor, m0 weroContactsProvider, d navigationProvider, fh2.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(weroInteractor, "weroInteractor");
        Intrinsics.checkNotNullParameter(weroContactsProvider, "weroContactsProvider");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f263415l = weroInteractor;
        this.f263416m = weroContactsProvider;
        this.f263417n = navigationProvider;
        this.o = apmNavigationProvider;
    }

    @Override // c12.z
    public final void K(hrf.f transferDirection, String listId) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        if (Intrinsics.f(listId, "REQUEST_ITEM_ID")) {
            T2(new s64.a(this, continuation, 21), new yi5.b(27));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown ExtraItem for WERO: ", listId));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // c12.z
    public final void X(y params) {
        Intrinsics.checkNotNullParameter(params, "params");
        T2(new r(this, params, null), new yi5.b(27));
    }

    @Override // c12.z
    public final void e1(ApmRecipient recipient, hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        A2(new com.revolut.kompot.common.b(o2(this.o.g((WeroContact) recipient, transferDirection, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final Flow g2(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new s6e.v((b0) this.f263416m.a(null), transferDirection, 6);
    }

    @Override // c12.z
    public final n02.b l1() {
        return n02.b.WERO;
    }

    @Override // c12.z
    public final List o0(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        int i = o.f263412a[transferDirection.ordinal()];
        if (i == 1) {
            return f0.f322471a;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wero_qr_request_cell_title, null, null, 14);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60);
        tf tfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
        int i2 = R$attr.uikit_dp8;
        return zhm.u.c(new RowDelegate.Model("REQUEST_ITEM_ID", image40, textLocalisedClause, null, 0, null, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, null, null, i2, i2, 0, 0, 486538232));
    }

    @Override // c12.z
    public final void y0(hrf.f transferDirection, zm3.f recipient) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        IllegalStateException illegalStateException = new IllegalStateException("onContactRecipient action not supported in WERO");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }
}
