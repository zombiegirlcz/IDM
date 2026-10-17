package s1a;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.splitbill.api.R$string;
import ip0.u8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.split_with_anyone_person_counter_dialog_title, null, null, 14), null, null, null, false, 30);
        dj0.d dVar = domainState.f259116b;
        int i = domainState.f259115a;
        List listC = u.c(new u8("SPLIT_BILL_QR_BOTTOM_SHEET_SPLIT_BY_ITEM_ID", new TextLocalisedClause(R$string.split_with_anyone_person_counter_dialog_cell_title, null, null, 14), new TextLocalisedClause(R$string.split_with_anyone_person_counter_dialog_cell_description, u.c(new MoneyClause(j.a(i, dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextClause(String.valueOf(i), (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new ResourceImage(R$drawable.uikit_icn_24_minus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), i < 30, i > 2, null, 63874));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        m6 m6Var = n6.Companion;
        return new cii.b(new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.split_with_anyone_person_counter_dialog_primary_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "SPLIT_BILL_LINK_SPLIT_EQUALLY_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), m6.c(m6Var, new TextLocalisedClause(R$string.split_with_anyone_person_counter_dialog_secondory_button_title, null, null, 14), LargeActionButton.ButtonStyle.f, null, "SPLIT_BILL_LINK_RANDOM_SPLIT_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, null, 121), listC, aVar);
    }
}
