package tq7;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import java.time.LocalDate;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl7.n;
import yp0.e0;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f273532a;
        aim.e eVarB = u.b();
        List listK = v.k(new RowDelegate.Model("STEP_PLUG_THE_DEVICE_ID", n.b(1), new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_steps_plug_the_device_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_steps_plug_the_device_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("STEP_START_ENGINE_ID", n.b(2), new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_steps_start_engine_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_steps_start_engine_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("STEP_KEEP_PLUGGED_ID", n.b(3), new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_steps_keep_pluged_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_steps_keep_pluged_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("STEP_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_steps_subheader, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        e0 e0Var = e0.INSIDE_BOX;
        a0.x(yp0.b.g(listK, model, e0Var, 0, 0, 124), eVarB);
        aim.e eVarB2 = u.b();
        if (localDate != null) {
            eVarB2.add(new RowDelegate.Model("INFORMATION_ACTIVATE_YOUR_DEVICE_ID", n.i(R$drawable.uikit_icn_24_exclamation_triangle, Integer.valueOf(R$attr.uikit_colorTerracotta)), new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_important_information_activate_before_title, u.c(n.e(localDate, TimeClause.Format.DateLong.f57962b)), null, 12), null, 0, new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_important_information_activate_before_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
        eVarB2.add(new RowDelegate.Model("INFORMATION_WAIT_FOR_UPDATE_ID", n.i(R$drawable.uikit_icn_24_exclamation_triangle, Integer.valueOf(R$attr.uikit_colorTerracotta)), new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_important_information_wait_for_update_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_important_information_wait_for_update_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        eVarB2.add(new RowDelegate.Model("INFORMATION_KEEP_PLUGGED_ID", n.i(R$drawable.uikit_icn_24_exclamation_triangle, Integer.valueOf(R$attr.uikit_colorTerracotta)), new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_important_information_keep_pluged_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_important_information_keep_pluged_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        a0.x(yp0.b.g(u.a(eVarB2), new ListSubheaderDelegate.Model("INFORMATION_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_activate_telematics_device_important_information_subheader, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, 0, 0, 124), eVarB);
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("GET_HELP_ID", new TextLocalisedClause(R$string.car_insurance_common_get_help, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        return new d(u.a(eVarB));
    }
}
