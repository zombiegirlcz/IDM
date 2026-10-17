package km9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.security_hub.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import java.util.ArrayList;
import java.util.List;
import jq9.t;
import jq9.v;
import jq9.w;
import jq9.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m3j.n;
import mra.i;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f185739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aqa.c f185740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dl3.f f185741c;

    public g(n beneficiaryItemViewMapper, aqa.c cardOwnersMapper, dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        Intrinsics.checkNotNullParameter(cardOwnersMapper, "cardOwnersMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f185739a = beneficiaryItemViewMapper;
        this.f185740b = cardOwnersMapper;
        this.f185741c = contactsMapper;
    }

    public final RowDelegate.Model a(t paymentRecipient) {
        Intrinsics.checkNotNullParameter(paymentRecipient, "paymentRecipient");
        if (paymentRecipient instanceof y) {
            return ((xl3.d) this.f185741c).m(((y) paymentRecipient).f177526a);
        }
        if (paymentRecipient instanceof v) {
            return this.f185739a.c(((v) paymentRecipient).f177523a, true);
        }
        if (paymentRecipient instanceof w) {
            return ((i) this.f185740b).c(((w) paymentRecipient).f177524a.f81495a);
        }
        throw new UnsupportedOperationException(this + " is not supported in payees");
    }

    public final ArrayList b(List paymentRecipients, PayeesFlowType flowType) {
        String str;
        Intrinsics.checkNotNullParameter(paymentRecipients, "paymentRecipients");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        List list = paymentRecipients;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            t tVar = (t) obj2;
            boolean z = flowType instanceof PayeesFlowType.Blocked;
            String str2 = "BLOCKED";
            if (z) {
                str = "BLOCKED";
            } else {
                if (!(flowType instanceof PayeesFlowType.RequireAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "REQUIRE_AUTHENTICATION";
            }
            String strT = v1.c.t(i, "SWIPE_TO_ACTION_ITEM_ID_PREFIX_", str, "_");
            RowDelegate.Model modelA = a(tVar);
            if (!z) {
                if (!(flowType instanceof PayeesFlowType.RequireAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "REQUIRE_AUTHENTICATION";
            }
            arrayList.add(new wh(strT, modelA, u.c(new SwipeToActionDelegate.SwipeAction(v1.c.t(i, "ACTION_ITEM_ID_PREFIX_", str2, "_"), new ResourceImage(R$drawable.uikit_icn_24_trash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.security_hub_payees_common_action_remove, null, null, 14), xh0.NEGATIVE, null, new f(flowType, tVar), null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            i = i2;
        }
        return arrayList;
    }
}
