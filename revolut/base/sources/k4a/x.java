package k4a;

import ard.z;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewTransferScreenContract$InputData f180893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3a.b f180894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a f180895c;
    public final n4a.e d;
    public final zjh.j e;
    public final fn2.c f;

    public x(NewTransferScreenContract$InputData inputData, l3a.b recipientsSectionMapper, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a transferActionsFactory, n4a.f newTransferScreenStateSearchMapper, n4a.e newTransferPaymentMethodsGridMapper, zjh.j legalEntityDisclaimerMapper, fn2.c newTransferScreenMenuItemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recipientsSectionMapper, "recipientsSectionMapper");
        Intrinsics.checkNotNullParameter(transferActionsFactory, "transferActionsFactory");
        Intrinsics.checkNotNullParameter(newTransferScreenStateSearchMapper, "newTransferScreenStateSearchMapper");
        Intrinsics.checkNotNullParameter(newTransferPaymentMethodsGridMapper, "newTransferPaymentMethodsGridMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(newTransferScreenMenuItemsMapper, "newTransferScreenMenuItemsMapper");
        this.f180893a = inputData;
        this.f180894b = recipientsSectionMapper;
        this.f180895c = transferActionsFactory;
        this.d = newTransferPaymentMethodsGridMapper;
        this.e = legalEntityDisclaimerMapper;
        this.f = newTransferScreenMenuItemsMapper;
    }

    public final TextLocalisedClause a() {
        int i = w.f180892a[this.f180893a.d.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.payments_balance_transfer_subtitle, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        RowDelegate.Model modelA;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean zContains = this.f180893a.f80119a.contains(WhoToTransferFilter.Revolut.f80005a);
        if (domainState.f180873b || !zContains) {
            modelA = null;
        } else {
            modelA = this.f180895c.a(R$string.who_to_pay_widget_permission_contacts_title, Integer.valueOf(R$string.who_to_pay_widget_permission_contacts_subtitle), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_profile, R$attr.uikit_colorForeground, R$attr.uikit_colorGreyTone10), WhoToTransferActionItem.PermissionContact.f80098a);
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        }
        List listL = zhm.v.l(modelA);
        List listL2 = zhm.v.l(((dl9.c) this.f.f136517b).a());
        return (m) iii.c.f(domainState.f180872a, new ja3.d(this, domainState, listL, listL2, 8), new z(this, domainState, listL, listL2, 1), new ccg.b(this, domainState, listL, listL2, 4));
    }
}
