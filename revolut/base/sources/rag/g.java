package rag;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ui0.h;
import ui0.i;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.c f252851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f252852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8g.b f252853c;
    public final qd0.c d;
    public final c e;
    public final a f;

    public g(p8g.c travelHotelsFeatureInteractor, c90.c uiResources, q8g.b campaignsHubMapper, qd0.c localizedDistanceUnitFactory, c packageRatesBadgeMapper, a animationRequestFactory) {
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(campaignsHubMapper, "campaignsHubMapper");
        Intrinsics.checkNotNullParameter(localizedDistanceUnitFactory, "localizedDistanceUnitFactory");
        Intrinsics.checkNotNullParameter(packageRatesBadgeMapper, "packageRatesBadgeMapper");
        Intrinsics.checkNotNullParameter(animationRequestFactory, "animationRequestFactory");
        this.f252851a = travelHotelsFeatureInteractor;
        this.f252852b = uiResources;
        this.f252853c = campaignsHubMapper;
        this.d = localizedDistanceUnitFactory;
        this.e = packageRatesBadgeMapper;
        this.f = animationRequestFactory;
    }

    public static boolean c(HotelsProperty hotelsProperty, List list) {
        fgi.a aVar = hotelsProperty.u;
        if (aVar == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((fgi.b) it8.next()).f135075a == aVar) {
                return true;
            }
        }
        return false;
    }

    public final TextLocalisedClause a(double d) {
        i iVarA = this.d.a(rim.d.b(d));
        if (iVarA instanceof ui0.g) {
            ui0.g gVar = (ui0.g) iVarA;
            int i = gVar.f280285a;
            return i > 0 ? new TextLocalisedClause(R.string.common_distance_miles, u.c(Integer.valueOf(i)), null, 12) : new TextLocalisedClause(R.string.common_distance_feet, u.c(Integer.valueOf(gVar.f280286b)), null, 12);
        }
        if (!(iVarA instanceof h)) {
            throw new NoWhenBranchMatchedException();
        }
        h hVar = (h) iVarA;
        int i2 = hVar.f280287a;
        return i2 > 0 ? new TextLocalisedClause(R.string.common_distance_km, u.c(Integer.valueOf(i2)), null, 12) : new TextLocalisedClause(R.string.common_distance_meters, u.c(Integer.valueOf(hVar.f280288b)), null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[LOOP:1: B:41:0x00d1->B:43:0x00d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.util.ArrayList r63, java.util.Set r64, java.util.List r65, com.revolut.feature_travel_hotels_models.property.search.LocationData r66, com.revolut.core.ui_kit.delegates.ListSubheaderDelegate.Model r67) {
        /*
            Method dump skipped, instruction units count: 1691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rag.g.b(java.util.ArrayList, java.util.Set, java.util.List, com.revolut.feature_travel_hotels_models.property.search.LocationData, com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model):java.util.List");
    }
}
