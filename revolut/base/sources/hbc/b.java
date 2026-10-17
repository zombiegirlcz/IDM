package hbc;

import a0e.w;
import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import aw0.u0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import grl.k9;
import java.time.ZonedDateTime;
import java.util.List;
import kac.d;
import kac.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xbc.f;
import xbc.g;
import xbc.h;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f150644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f150645b;

    public b(l80.e dateProvider, w durationCommonMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(durationCommonMapper, "durationCommonMapper");
        this.f150644a = dateProvider;
        this.f150645b = durationCommonMapper;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("id_flight_details_header", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_pay_flight_details_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, false, (Clause) null, false, (Object) d.f182457a, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 260066);
    }

    public static boolean b(h hVar) {
        h[] elements = {h.CANCELLED, h.DIVERTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(hVar);
    }

    public static CellDetailsActionDelegate.Model c(xbc.b bVar) {
        String str = bVar.f304035c;
        return new CellDetailsActionDelegate.Model("id_booking_reference", new TextLocalisedClause(R$string.revolut_pay_flight_details_booking_reference, null, null, 14), 0, new ResourceImage(str != null ? R$drawable.uikit_icn_16_link_external : R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(bVar.f304034b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, true, u0.LARGE, str != null ? new kac.a(str) : new kac.b(bVar.f304034b), 0, 0, 32032);
    }

    public final dii.a d() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.revolut_pay_flight_details_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_flight_details_disclaimer, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.RevolutPay;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(java.util.ArrayList r39) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hbc.b.e(java.util.ArrayList):java.util.List");
    }

    public final rw0.e f(g gVar, int i, boolean z) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClauseE;
        f fVar = gVar.f304041g;
        ZonedDateTime zonedDateTime = gVar.e;
        h hVar = gVar.f;
        rw0.g gVar2 = (fVar == f.LATE || b(hVar)) ? rw0.g.Negative : rw0.g.Positive;
        TextClause textClause = new TextClause(gVar.f304038a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TimeClause timeClause = new TimeClause(zonedDateTime.toEpochSecond() * ((long) 1000), TimeClause.Format.TimeDefault.f57977b, new Custom(null, b(hVar), null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), zonedDateTime.getZone());
        int[] iArr = a.f150642a;
        int i2 = iArr[hVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_flight_details_departed, null, null, 14);
            } else if (i2 == 3) {
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_flight_details_arrived, null, null, 14);
            } else if (i2 == 4) {
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_flight_details_cancelled, null, null, 14);
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_flight_details_diverted, null, null, 14);
            }
        } else {
            if (fVar == null) {
                throw new IllegalArgumentException("BE issue, punctuality is required for scheduled stage");
            }
            int i3 = a.f150643b[fVar.ordinal()];
            if (i3 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_flight_details_early, null, null, 14);
            } else if (i3 == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_flight_details_on_time, null, null, 14);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_flight_details_late, null, null, 14);
            }
        }
        int i5 = iArr[hVar.ordinal()];
        w wVar = this.f150645b;
        if (i5 != 1) {
            if (i5 == 2 || i5 == 3) {
                if (!z) {
                    textLocalisedClauseE = wVar.e(zonedDateTime);
                }
            } else if (i5 != 4 && i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClauseE = null;
        } else {
            textLocalisedClauseE = wVar.e(zonedDateTime);
        }
        rw0.d dVar = new rw0.d(textLocalisedClause, textLocalisedClauseE);
        String str = gVar.f304039b;
        String str2 = gVar.f304040c;
        int i6 = R$string.revolut_pay_flight_details_terminal_and_gate;
        if (str == null) {
            str = "--";
        }
        if (str2 == null) {
            str2 = "--";
        }
        return new rw0.e(textClause, i, timeClause, dVar, new TextLocalisedClause(i6, v.k(str, str2), null, 12), gVar2);
    }
}
