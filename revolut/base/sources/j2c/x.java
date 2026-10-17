package j2c;

import aw0.m6;
import aw0.n6;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.tracking.v3.SpareChangeContext;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f170833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jub.a f170834b;

    public x(gte.a featureToggleInteractor, jub.a revPointsDisclaimerProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsDisclaimerProvider, "revPointsDisclaimerProvider");
        this.f170833a = featureToggleInteractor;
        this.f170834b = revPointsDisclaimerProvider;
    }

    public final CompositeClause a(Data data) {
        if (data.getContent() == null && data.getLoading() && data.getError() == null) {
            return null;
        }
        return ((ryb.b) this.f170834b).c((l71.d) data.getContent());
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Object next;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.d;
        Data data2 = domainState.f170808c;
        List list = (List) iii.c.f(t1.t(data, data2), new j1.e(9), new j0g.b(9), new igh.o(this, 25));
        j jVar2 = (j) iii.c.f(domainState.d, new j1.e(10), new j0g.b(10), new igh.o(this, domainState, 26));
        Data data3 = domainState.e;
        List list2 = (List) data2.getContent();
        aw0.i gVar = null;
        if (list2 != null) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((yvh.b) next).e == yvh.h.LOYALTY_PROFILE) {
                    break;
                }
            }
            yvh.b bVar = (yvh.b) next;
            if (bVar == null || !bVar.f317177b) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_spare_change_activate, zhm.u.c(new TextLocalisedClause(R$string.rev_points_day0_spare_change_activate_button, null, null, 14)), null, 12);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int iA = domainState.f170807b.a();
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                SpareChangeContext.a aVarNewBuilder = SpareChangeContext.newBuilder();
                aVarNewBuilder.h(String.valueOf(iA));
                w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                gVar = new aw0.h(true, new n6(textLocalisedClause, defaultFilledButton, null, "SPARE_CHANGE_ACTIVATE_BUTTON_TAG", false, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), null, 940), new n6(new TextLocalisedClause(R$string.rev_points_spare_change_not_now, null, null, 14), LargeActionButton.ButtonStyle.o, null, "SPARE_CHANGE_NOT_NOW_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), a(data3), null, null, 112);
            } else {
                gVar = new aw0.e(true, a(data3), null, new n6(new TextLocalisedClause(R$string.rev_points_day0_spare_change_deactivate_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "SPARE_CHANGE_DEACTIVATE_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 52);
            }
        } else if (data2.getLoading()) {
            n6.Companion.getClass();
            gVar = new aw0.g(m6.a(), m6.a(), a(data3), (aw0.f) null, 16);
        }
        return new m(list, jVar2, gVar);
    }
}
