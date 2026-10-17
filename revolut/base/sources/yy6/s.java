package yy6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final az6.c f317858a;

    public s(az6.c itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f317858a = itemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a aVar = domainState.f317848c;
        Data data = domainState.f317847b;
        boolean z = aVar.f73954l;
        boolean z3 = aVar.f73949b;
        return new q(new p(new TextLocalisedClause((z && z3) ? R$string.freelancer_sale_invoice_template_setup_header_default_edit_title : z ? R$string.freelancer_sale_invoice_template_setup_header_edit_title : R$string.freelancer_sale_invoice_template_setup_header_new_title, null, null, 14), v.l((!aVar.f73954l || z3) ? null : IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_ITEM_ID_DELETE_TEMPLATE", new ResourceImage(R$drawable.uikit_icn_24_trash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124))), new o(new TextLocalisedClause(R$string.freelancer_common_action_save, null, null, 14), domainState.c() != null, (data.getLoading() || data.getContent() == null) ? false : true), (List) iii.c.f(data, new yv8.j(27), new yw9.j(22), new y66.q(this, domainState, 20)));
    }
}
