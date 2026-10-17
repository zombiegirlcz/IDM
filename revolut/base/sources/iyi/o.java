package iyi;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimerItem;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimerModal;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox0.b0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd7.d f169773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7b.a f169774b;

    public o(nd7.d termsClauseMapper, c7b.a iconMapper) {
        Intrinsics.checkNotNullParameter(termsClauseMapper, "termsClauseMapper");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f169773a = termsClauseMapper;
        this.f169774b = iconMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AirportLoungesDisclaimerModal airportLoungesDisclaimerModal = domainState.f169757a.f98913b;
        ArrayList arrayList = airportLoungesDisclaimerModal.f98920c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it8.hasNext();
            nd7.d dVar = this.f169773a;
            if (!zHasNext) {
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                TextClause textClause = new TextClause(airportLoungesDisclaimerModal.f98918a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                ParameterisedHyperText parameterisedHyperText = airportLoungesDisclaimerModal.f98919b;
                if (!airportLoungesDisclaimerModal.f98920c.isEmpty()) {
                    parameterisedHyperText = null;
                }
                Clause clauseA = parameterisedHyperText != null ? nd7.d.a(dVar, parameterisedHyperText.f74758a) : null;
                m6 m6Var = n6.Companion;
                return new d(arrayList2, textClause, clauseA, new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.airport_lounges_pass_list_disclaimer_button_activate_pass, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "airport_lounges_disclaimer_activate_button", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), m6.c(m6Var, new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_notnow, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, b0.BELOW_BUTTONS, null, 97));
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            AirportLoungesDisclaimerItem airportLoungesDisclaimerItem = (AirportLoungesDisclaimerItem) next;
            arrayList2.add(new RowDelegate.Model(a0.d.n("airport_lounges_disclaimer_item_", i), new RowDelegate.Model.MainImage.Image24(new ResourceImage(this.f169774b.b(airportLoungesDisclaimerItem.f98915a), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextClause(airportLoungesDisclaimerItem.f98916b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, nd7.d.a(dVar, airportLoungesDisclaimerItem.f98917c.f74758a), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i = i2;
        }
    }
}
