package yn7;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "CAR_TYPE_HELP_MENU", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124));
        RowDelegate.Model.MainImage.Image40 image40K = xl7.n.k(R$drawable.uikit_icn_24_arrow_exchange, false, null, 15);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_mta_car_type_cells_substitute_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_mta_car_type_cells_substitute_description, null, null, 14);
        tf tfVarC = xl7.n.c();
        d dVar = d.SUBSTITUTE;
        boolean z = domainState.f315265a;
        RowDelegate.Model.b.a aVar = RowDelegate.Model.b.a.f53266a;
        RowDelegate.Model.b.c cVar = RowDelegate.Model.b.c.f53268a;
        RowDelegate.Model model = new RowDelegate.Model("CAR_TYPE_SUBSTITUTE_ITEM", image40K, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, tfVarC, z, null, false, z ? cVar : aVar, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532657112);
        RowDelegate.Model.MainImage.Image40 image40K2 = xl7.n.k(R$drawable.uikit_icn_24_plus, false, null, 15);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.car_insurance_mta_car_type_cells_additional_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.car_insurance_mta_car_type_cells_additional_description, null, null, 14);
        tf tfVarC2 = xl7.n.c();
        d dVar2 = d.ADDITIONAL;
        boolean z3 = domainState.f315266b;
        List listK = v.k(model, new RowDelegate.Model("CAR_TYPE_ADDITIONAL_ITEM", image40K2, textLocalisedClause3, null, 0, textLocalisedClause4, null, null, 0, tfVarC2, z3, null, false, z3 ? cVar : aVar, null, null, null, null, null, dVar2, null, 0, 0, 0, 0, 532657112));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new g(listK, listC);
    }
}
