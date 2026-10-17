package u8d;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lde.n;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9d.c f278180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f278181b;

    public m(e8d.a chatButtonItemProvider, p9d.c doneButtonProvider, n sharedHelpWidgetsInteractor) {
        Intrinsics.checkNotNullParameter(chatButtonItemProvider, "chatButtonItemProvider");
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        this.f278180a = doneButtonProvider;
        this.f278181b = sharedHelpWidgetsInteractor;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        qv0.i model;
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.help_center_action_help_with_something_else, null, null, 14);
        int i = l.f278179a[this.f278181b.a().ordinal()];
        if (i == 1) {
            model = new RowDelegate.Model("SEARCH_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.help_center_ask_ai_search_bar_placeholder_inactive_v3, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        } else if (i == 2) {
            model = new RowDelegate.Model("SEARCH_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.help_center_ask_ai_search_bar_placeholder_inactive, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            model = new SearchButtonDelegate.Model("SEARCH_ITEM_ID", new TextLocalisedClause(R$string.help_center_screen_help_search_hint, null, null, 14), null, 0, 0, 508);
        }
        List listI = yp0.b.i(model, new ListSubheaderDelegate.Model("SearchButtonSubHeader", (Image) null, (Clause) new TextLocalisedClause(R$string.help_center_section_search_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338), null, 0, 0, 126);
        domainState.getClass();
        Iterable iterableI = yp0.b.i(new RowDelegate.Model("CHAT_BUTTON_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_chat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.help_center_section_need_more_help_action_chat, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new ListSubheaderDelegate.Model("ChatWithUsButtonSubHeader", (Image) null, (Clause) new TextLocalisedClause(R$string.help_center_section_need_more_help_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338), null, 0, 0, 126);
        if (iterableI == null) {
            iterableI = f0.f322471a;
        }
        return new f(textLocalisedClause, d0.E0(iterableI, listI), ((p9d.d) this.f278180a).a(domainState.f278166a));
    }
}
