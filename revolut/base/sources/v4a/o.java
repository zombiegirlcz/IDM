package v4a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3a.b f286018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3a.b f286019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a f286020c;

    public o(j3a.b transferCommonMapper, l3a.b recipientsSectionMapper, j3a.f searchFilterItemsMapper, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a transferActionsListItemFactory) {
        Intrinsics.checkNotNullParameter(transferCommonMapper, "transferCommonMapper");
        Intrinsics.checkNotNullParameter(recipientsSectionMapper, "recipientsSectionMapper");
        Intrinsics.checkNotNullParameter(searchFilterItemsMapper, "searchFilterItemsMapper");
        Intrinsics.checkNotNullParameter(transferActionsListItemFactory, "transferActionsListItemFactory");
        this.f286018a = transferCommonMapper;
        this.f286019b = recipientsSectionMapper;
        this.f286020c = transferActionsListItemFactory;
    }

    public static List b(boolean z) {
        NavBarMenuItem[] elements = {IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_SEARCH", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124), z ? PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_NEW", new TextLocalisedClause(R.string.badge_new_sign_title, null, null, 14), null, 60) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f285998b, new v2g.i(this, 16), new v25.g(this, 16), new tvh.e(this, domainState, 21));
    }
}
