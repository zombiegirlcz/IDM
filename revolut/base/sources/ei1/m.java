package ei1;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreenContract$InputData;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FieldSearchScreenContract$InputData f126353a;

    public m(FieldSearchScreenContract$InputData inputData, xi1.a searchScreenItemsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(searchScreenItemsProvider, "searchScreenItemsProvider");
        this.f126353a = inputData;
    }

    public static FullScreenStateDelegate.Model a(String str, boolean z) {
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30));
        return new FullScreenStateDelegate.Model("NO_RESULTS_ID", new TextLocalisedClause(R$string.address_component_search_search_no_result_title, null, null, 14), new TextLocalisedClause(R$string.address_component_search_search_no_result_subtitle, u.c(textClause), null, 12), regular, zj.REGULAR, z ? new TextLocalisedClause(R$string.address_component_search_search_add_manually_button, null, null, 14) : null, false, z ? Integer.valueOf(R$drawable.uikit_icn_24_plus) : null, null, false, 0, 0, 32576);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listC;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f126344a;
        if (data == null) {
            listC = u.c(new FullScreenStateDelegate.Model("INITIAL_PLACEHOLDER_ID", new TextLocalisedClause(R$string.shared_address_flow_address_search_results, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, null, null, false, null, null, false, R$attr.uikit_dp8, 0, 30716));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        } else {
            listC = (List) iii.c.f(data, new efb.i(this, 20), new a8a.a(this, domainState, 25), new dn8.k(this, domainState, 17));
        }
        return new i(listC);
    }
}
