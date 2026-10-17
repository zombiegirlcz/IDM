package p9d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.help_centre.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lde.n f234302a;

    public m(lde.n widgetsInteractor) {
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.f234302a = widgetsInteractor;
    }

    public final TextLocalisedClause a() {
        k7d.a aVarA = this.f234302a.a();
        return aVarA == k7d.a.AiV2 ? new TextLocalisedClause(R$string.help_center_ask_ai_search_bar_placeholder_inactive, null, null, 14) : aVarA == k7d.a.AiV3 ? new TextLocalisedClause(R$string.help_center_ask_ai_search_bar_placeholder_inactive_v3, null, null, 14) : new TextLocalisedClause(R$string.help_center_search_placeholder_common, null, null, 14);
    }
}
