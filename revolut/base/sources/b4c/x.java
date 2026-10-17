package b4c;

import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolut_shop.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3c.f f12290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tse.l f12291b;

    public x(z3c.i productMapper, z3c.g productAssetsMapper, z3c.d menuItemsMapper, z3c.f permissionsAndVisibilityMapper, tse.l ticketsWidgetMapper) {
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(productAssetsMapper, "productAssetsMapper");
        Intrinsics.checkNotNullParameter(menuItemsMapper, "menuItemsMapper");
        Intrinsics.checkNotNullParameter(permissionsAndVisibilityMapper, "permissionsAndVisibilityMapper");
        Intrinsics.checkNotNullParameter(ticketsWidgetMapper, "ticketsWidgetMapper");
        this.f12290a = permissionsAndVisibilityMapper;
        this.f12291b = ticketsWidgetMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.internal.views.tag.TagViewData a(d3c.p r14) {
        /*
            java.util.ArrayList r14 = r14.f
            java.lang.Object r0 = zhm.d0.d0(r14)
            d3c.x r0 = (d3c.x) r0
            r1 = 0
            if (r0 == 0) goto L12
            d3c.k0 r2 = d3c.k0.PRE_ORDER
            d3c.j0 r0 = r0.a(r2)
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L2f
            com.revolut.core.ui_kit.internal.views.tag.TagViewData r2 = new com.revolut.core.ui_kit.internal.views.tag.TagViewData
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.revolut_shop.api.R$string.revolut_shop_common_product_promotion_pre_order_title
            r0 = 14
            r4.<init>(r14, r1, r1, r0)
            com.revolut.core.ui.models.Color$Solid r5 = new com.revolut.core.ui.models.Color$Solid
            int r6 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorPerformancePositive
            r5.<init>(r6)
            r7 = 0
            r8 = 1000(0x3e8, float:1.401E-42)
            r3 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L2f:
            java.lang.Object r14 = zhm.d0.d0(r14)
            d3c.x r14 = (d3c.x) r14
            if (r14 == 0) goto L8a
            dj0.d r0 = r14.f111074g
            if (r0 == 0) goto L61
            dj0.d r14 = r14.f
            long r2 = r14.f115082a
            r4 = 0
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 != 0) goto L46
            goto L61
        L46:
            long r6 = r0.f115082a
            long r6 = r2 - r6
            r14 = 100
            long r8 = (long) r14
            long r6 = r6 * r8
            long r8 = r6 / r2
            r10 = 0
            r12 = 100
            long r2 = kotlin.ranges.f.i(r8, r10, r12)
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L61
            goto L62
        L61:
            r14 = r1
        L62:
            if (r14 == 0) goto L8a
            long r2 = r14.longValue()
            com.revolut.core.ui_kit.internal.views.tag.TagViewData r4 = new com.revolut.core.ui_kit.internal.views.tag.TagViewData
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.revolut_shop.api.R$string.revolut_shop_flow_home_screen_home_badge_discount_percentage_title
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.util.List r0 = zhm.u.c(r0)
            r2 = 12
            r6.<init>(r14, r0, r1, r2)
            com.revolut.core.ui.models.Color$Solid r7 = new com.revolut.core.ui.models.Color$Solid
            int r8 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorPerformancePositive
            r7.<init>(r8)
            r9 = 0
            r10 = 1000(0x3e8, float:1.401E-42)
            r5 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b4c.x.a(d3c.p):com.revolut.core.ui_kit.internal.views.tag.TagViewData");
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("SUBHEADER_PRODUCTS_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_home_devices_subtitle, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_home_screen_title, null, null, 14);
        return (o) iii.c.f(t1.v(domainState.f12266b, domainState.f12267c, domainState.e, domainState.f), new aq4.i(textLocalisedClause, this), new aq4.j(1, textLocalisedClause), new a0i.a(this, 5, textLocalisedClause, domainState));
    }
}
