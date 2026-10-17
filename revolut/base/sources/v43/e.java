package v43;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.card_payment_method.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import ld6.f;
import zjh.j;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f285936a;

    public e(j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f285936a = legalEntityDisclaimerMapper;
    }

    public static Data a(Data data, md6.a aVar) {
        f cVar;
        try {
            Object content = data.getContent();
            if (content != null) {
                cVar = (f) content;
                if (cVar instanceof ld6.c) {
                    wi0.b baseEntityCountry = ((ld6.c) cVar).f194034a;
                    Intrinsics.checkNotNullParameter(baseEntityCountry, "baseEntityCountry");
                    cVar = new ld6.c(baseEntityCountry, aVar);
                }
            } else {
                cVar = null;
            }
            return new Data(cVar, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(com.revolut.core.model.account.AccountId r28, h93.l0 r29) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v43.e.b(com.revolut.core.model.account.AccountId, h93.l0):java.util.List");
    }

    public static LargeActionButtonDelegate.Model c(boolean z) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_payment_method_info_button_got_it, null, null, 14);
        int i = R$attr.uikit_dp16;
        return new LargeActionButtonDelegate.Model("GOT_IT_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, z ? R$attr.uikit_dp24 : R$attr.uikit_dp0, i, i, 496);
    }
}
