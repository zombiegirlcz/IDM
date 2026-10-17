package rx6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x17.f f258056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u17.k f258057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jr6.n f258058c;

    public u(x17.f filtersDelegate, u17.k filterChipsProvider, jr6.n invoiceMapper) {
        Intrinsics.checkNotNullParameter(filtersDelegate, "filtersDelegate");
        Intrinsics.checkNotNullParameter(filterChipsProvider, "filterChipsProvider");
        Intrinsics.checkNotNullParameter(invoiceMapper, "invoiceMapper");
        this.f258056a = filtersDelegate;
        this.f258057b = filterChipsProvider;
        this.f258058c = invoiceMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        com.revolut.feature.freelancer.api.navigation.c cVar = domainState.f258044a;
        int i2 = t.f258055a[cVar.ordinal()];
        if (i2 == 1) {
            i = R$string.freelancer_sales_header_title_invoices;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.freelancer_sales_header_title_recurring_series;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        ActionNavBarMenuItem actionNavBarMenuItem = new ActionNavBarMenuItem("LIST_ID_MENU_ITEM_SEARCH", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        com.revolut.feature.freelancer.api.navigation.c cVar2 = com.revolut.feature.freelancer.api.navigation.c.ONE_TIME;
        Object[] elements = {actionNavBarMenuItem, cVar == cVar2 ? new ActionNavBarMenuItem("LIST_ID_MENU_ITEM_RECURRING", new ResourceImage(R$drawable.uikit_icn_24_repeat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)) : null, cVar == cVar2 ? new ActionNavBarMenuItem("LIST_ID_MENU_ITEM_SETTINGS", new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)) : null, domainState.f ? PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "LIST_ID_MENU_ITEM_NEW_INVOICE", new TextLocalisedClause(R$string.freelancer_common_action_new, null, null, 14), null, 60) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new q(new p(textLocalisedClause, kotlin.collections.d.L(elements), domainState.f258046c), (List) iii.c.f(domainState.e, new ru6.r(27), new ru5.m(18), new lk7.p(this, 26, domainState, domainState)));
    }
}
