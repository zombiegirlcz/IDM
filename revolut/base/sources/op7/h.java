package op7;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.add(new FullScreenStateDelegate.Model("FULL_SCREEN_STATE_ID", null, null, new ComplexImage.Regular(mra.d.B("3D186")), zj.REGULAR, null, false, null, null, false, 0, 0, 31686));
        List listK = v.k(new RowDelegate.Model("DRIVING_NUMBER_ID", xl7.n.i(R$drawable.uikit_icn_24_national_id, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_imid_prompt_cells_main_driver_number_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_imid_prompt_cells_main_driver_number_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("ADDITIONAL_DRIVER_ID", xl7.n.i(R$drawable.uikit_icn_24_people, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_imid_prompt_cells_additional_drivers_number_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_imid_prompt_cells_additional_drivers_number_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("INTERNATIONAL_LICENCE_ID", xl7.n.i(R$drawable.uikit_icn_24_globe, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.car_insurance_imid_prompt_cells_international_licence_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_imid_prompt_cells_international_licence_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        a0.x(listK, eVarB);
        return new f(u.a(eVarB));
    }
}
