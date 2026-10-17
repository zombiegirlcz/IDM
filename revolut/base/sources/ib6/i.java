package ib6;

import aw0.n6;
import cli.o;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.donations.impl.R$string;
import ip0.jh0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cli.n {
    public static n6 a() {
        return new n6(new TextLocalisedClause(R$string.donations_common_action_save, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "SAVE_BUTTON_TAG", false, null, b.f160091a, 492);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        float f = domainState.f160093b;
        ?? r3 = e.f160095a;
        ArrayList arrayList = new ArrayList(r3.size());
        for (Map.Entry entry : r3.entrySet()) {
            float fFloatValue = ((Number) entry.getKey()).floatValue();
            arrayList.add(new SuggestionsBarDelegate.Suggestion("SUGGESTIONS_BAR_DELEGATE_LIST_ID_MULTIPLIER_" + fFloatValue, new TextLocalisedClause(((Number) entry.getValue()).intValue(), null, null, 14), null, null, f == fFloatValue ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, Float.valueOf(fFloatValue), null, 364));
        }
        List listC = u.c(new nh("SUGGESTIONS_BAR_DELEGATE_LIST_ID", arrayList, jh0.HORIZONTAL_SCROLLER, R$attr.uikit_dp12, 0, 0, 0, 0, 496));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new cii.b(domainState.f160092a ? new aw0.g(new n6(new TextLocalisedClause(R$string.donations_common_action_deactivate, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "DEACTIVATE_BUTTON_TAG", false, null, a.f160090a, 492), a(), (Clause) null, (aw0.f) null, 25) : new aw0.e(false, null, null, a(), null, null, 55), listC, new lw0.a(new TextLocalisedClause(R$string.donations_spare_change_title, null, null, 14), new TextLocalisedClause(R$string.donations_spare_change_description, null, null, 14), null, null, false, 28));
    }
}
