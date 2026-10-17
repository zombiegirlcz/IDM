package rvc;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.security_hub.api.R$string;
import ip0.jh0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("NAME_LOCATION_INPUT_LIST_ITEM_ID", domainState.f257744b, null, new TextLocalisedClause(R$string.security_hub_street_mode_name_location_input_hint, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, true, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -67108876, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new j(v.k(model, new nh("SUGGESTION_BAR_LIST_ITEM_ID", v.k(new SuggestionsBarDelegate.Suggestion("SUGGESTION_BAR_HOME_LIST_ITEM_ID", new TextLocalisedClause(R$string.security_hub_street_mode_name_location_input_hint_home, null, null, 14), null, null, null, false, null, null, 508), new SuggestionsBarDelegate.Suggestion("SUGGESTION_BAR_WORK_LIST_ITEM_ID", new TextLocalisedClause(R$string.security_hub_street_mode_name_location_input_hint_work, null, null, 14), null, null, null, false, null, null, 508), new SuggestionsBarDelegate.Suggestion("SUGGESTION_BAR_SCHOOL_LIST_ITEM_ID", new TextLocalisedClause(R$string.security_hub_street_mode_name_location_input_hint_school, null, null, 14), null, null, null, false, null, null, 508)), jh0.HORIZONTAL_SCROLLER, R$attr.uikit_dp12, 0, 0, 0, 0, 496)), !d0.W(domainState.f257743a));
    }
}
