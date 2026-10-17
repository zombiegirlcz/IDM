package le1;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import java.util.List;
import koe.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge1.j f194446a;

    public k(ge1.j catalogueScreenMapper) {
        Intrinsics.checkNotNullParameter(catalogueScreenMapper, "catalogueScreenMapper");
        this.f194446a = catalogueScreenMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, (List) iii.c.f(domainState.f194432b, new lbh.a(27), new l9j.j(16), new y(this, domainState.f194433c, 14)), new lw0.a(new TextClause(domainState.f194431a.f60670b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, domainState.d ? new lw0.k(new TextLocalisedClause(R$string.product_catalogue_flow_catalogue_category_items_header_button_new, null, null, 14), "ADD_PRODUCT_MENU_ID") : null, false, 22));
    }
}
