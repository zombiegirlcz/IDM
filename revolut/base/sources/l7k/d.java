package l7k;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.payments.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tqi.g;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f192705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f192706b;

    public d(g shareNaviCommandFactory, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f192705a = shareNaviCommandFactory;
        this.f192706b = uiKitResources;
    }

    public final BridgeDestination a(TransferLinkDetails transferLinkDetails) {
        Intrinsics.checkNotNullParameter(transferLinkDetails, "transferLinkDetails");
        if (!(transferLinkDetails instanceof TransferLinkDetails.Active)) {
            if (transferLinkDetails instanceof TransferLinkDetails.NonActive) {
                throw new IllegalStateException("Sharing of non active transfer links is not supported");
            }
            throw new NoWhenBranchMatchedException();
        }
        TransferLinkDetails.Active active = (TransferLinkDetails.Active) transferLinkDetails;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payment_link_share_sms_template_send_anonymous, v.k(new MoneyClause(active.k, new MoneyClause.Format.Shorts(false, 63), null, null, 12), active.f60355c), null, 12);
        f01.c cVar = this.f192706b;
        CharSequence charSequenceB = cVar.b(textLocalisedClause);
        return new BridgeDestination(this.f192705a.f(0, cVar.b(new TextLocalisedClause(R$string.payment_link_share, null, null, 14)).toString(), charSequenceB.toString()));
    }
}
