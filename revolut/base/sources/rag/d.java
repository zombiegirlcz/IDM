package rag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f252849a;

    public d(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f252849a = dateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.internal.views.tag.TagViewData a(com.revolut.feature_travel_hotels_models.property.HotelsProperty r11, q8g.a r12) {
        /*
            r10 = this;
            java.lang.String r0 = "property"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "style"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion r0 = r11.B
            r1 = 0
            if (r0 == 0) goto L73
            tfi.a r2 = r0.f97961b
            tfi.a r3 = tfi.a.PACKAGE_RATE
            if (r2 != r3) goto L2a
            com.revolut.feature_travel_hotels_models.property.Pricing r11 = r11.i
            if (r11 == 0) goto L26
            dj0.d r11 = h9g.m.j(r11)
            if (r11 == 0) goto L26
            long r2 = r11.f115082a
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            goto L27
        L26:
            r11 = r1
        L27:
            if (r11 == 0) goto L2a
            goto L2b
        L2a:
            r0 = r1
        L2b:
            if (r0 == 0) goto L73
            l80.e r11 = r10.f252849a
            l80.f r11 = (l80.f) r11
            org.joda.time.DateTime r11 = r11.g()
            com.revolut.core.ui_kit.models.TextLocalisedQuantityClause r11 = j9g.c.a(r0, r11)
            if (r11 == 0) goto L73
            com.revolut.core.ui_kit.internal.views.tag.TagViewData$a r0 = com.revolut.core.ui_kit.internal.views.tag.TagViewData.INSTANCE
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.travel.hotels.api.R$string.hotels_package_rates_property_card_time_left
            java.util.List r11 = zhm.u.c(r11)
            com.revolut.core.ui_kit.models.Custom r3 = new com.revolut.core.ui_kit.models.Custom
            int r4 = r12.b()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 0
            r9 = 254(0xfe, float:3.56E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r4 = 8
            r1.<init>(r2, r11, r3, r4)
            int r11 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_time
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r2 = r12.a()
            int r12 = r12.b()
            r0.getClass()
            com.revolut.core.ui_kit.internal.views.tag.TagViewData r11 = com.revolut.core.ui_kit.internal.views.tag.TagViewData.Companion.b(r2, r12, r1, r11)
            return r11
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rag.d.a(com.revolut.feature_travel_hotels_models.property.HotelsProperty, q8g.a):com.revolut.core.ui_kit.internal.views.tag.TagViewData");
    }
}
