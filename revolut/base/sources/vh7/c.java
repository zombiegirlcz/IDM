package vh7;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.instruments.trend.collections.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nh7.d;
import op0.c2;
import op0.q;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import uh7.e;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbh.e f289342a;

    public c(adh.a assetPerformanceCalculator, jbh.e performanceAssetMapper) {
        Intrinsics.checkNotNullParameter(assetPerformanceCalculator, "assetPerformanceCalculator");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        this.f289342a = performanceAssetMapper;
    }

    public static c2 f(ph7.c cVar) {
        int i;
        nh7.c cVarC = d.CFDS_PNL_DRIVERS.c();
        nh7.b bVar = cVarC instanceof nh7.b ? (nh7.b) cVarC : null;
        List list = bVar != null ? bVar.f215378a : null;
        if (list == null) {
            list = f0.f322471a;
        }
        List<ph7.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ph7.c cVar2 : list2) {
            String strB = cVar2.b();
            int i2 = b.f289341a[cVar2.ordinal()];
            if (i2 == 1) {
                i = R$string.wealth_margin_cfds_pnl_drivers_key_profit_drivers;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("Unexpected collection key for pnl drivers");
                }
                i = R$string.wealth_margin_cfds_pnl_drivers_key_loss_drivers;
            }
            arrayList.add(new FixedTabs.Item(strB, new TextLocalisedClause(i, null, null, 14), (AnalyticsContext) null, 12));
        }
        return new c2(arrayList, cVar.b());
    }

    @Override // uh7.e
    public final List a(dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return f0.f322471a;
    }

    @Override // uh7.e
    public final BaseDraggableWidgetDelegate.Model b(String id10, ph7.c selectedCollectionKey, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(selectedCollectionKey, "selectedCollectionKey");
        return AvatarGridWidgetDelegate.Model.Companion.c(AvatarGridWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.wealth_invest_widget_cfds_pnl_drivers_header_title, null, null, 14), f(selectedCollectionKey));
    }

    @Override // uh7.e
    public final int c(dsh.e eVar) {
        return 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    @Override // uh7.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model d(java.lang.String r25, ph7.c r26, java.util.List r27) {
        /*
            r24 = this;
            r0 = r27
            java.lang.String r1 = "id"
            r3 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "selectedCollectionKey"
            r2 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "instruments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate$Model$a r2 = com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate.Model.INSTANCE
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.instruments.trend.collections.impl.R$string.wealth_invest_widget_cfds_pnl_drivers_header_title
            r5 = 14
            r6 = 0
            r4.<init>(r1, r6, r6, r5)
            op0.c2 r1 = f(r26)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r5 = 8
            java.util.List r0 = zhm.d0.V0(r0, r5)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto Lb7
            java.lang.Object r7 = r0.next()
            r10 = r7
            qi7.h r10 = (qi7.h) r10
            qi7.g r7 = r10.f246672b
            vel.f r14 = r10.f246671a
            boolean r8 = r7 instanceof qi7.c
            if (r8 == 0) goto L50
            qi7.c r7 = (qi7.c) r7
            goto L51
        L50:
            r7 = r6
        L51:
            if (r7 != 0) goto L57
            r15 = r24
            r7 = r6
            goto Lb1
        L57:
            java.lang.String r8 = r14.a()
            java.lang.String r9 = "CFDS_PNL_DRIVERS_INSTRUMENT_"
            java.lang.String r11 = j6.a.q(r9, r8)
            vel.f r9 = r10.f246671a
            r12 = 0
            r13 = 8
            r15 = r24
            jbh.e r8 = r15.f289342a
            com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model r16 = j1h.b.b(r8, r9, r10, r11, r12, r13)
            java.math.BigDecimal r8 = adh.a.b(r14)
            if (r8 == 0) goto L9f
            java.math.BigDecimal r9 = new java.math.BigDecimal
            float r7 = r7.f246663b
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r9.<init>(r7)
            java.math.BigDecimal r7 = r8.multiply(r9)
            java.lang.String r8 = "multiply(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            if (r7 == 0) goto L9f
            r22 = 0
            r23 = 127(0x7f, float:1.78E-43)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r17 = r7
            com.revolut.core.ui_kit.models.CompositeClause r7 = xqi.a.c(r17, r18, r19, r20, r21, r22, r23)
            r19 = r7
            goto La1
        L9f:
            r19 = r6
        La1:
            r22 = 0
            r23 = 8183(0x1ff7, float:1.1467E-41)
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model r7 = com.revolut.core.ui_kit.delegates.ReferralContactDelegate.Model.e(r16, r17, r18, r19, r20, r21, r22, r23)
        Lb1:
            if (r7 == 0) goto L38
            r5.add(r7)
            goto L38
        Lb7:
            r15 = r24
            r7 = 0
            r8 = 48
            r6 = r1
            com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate$Model r0 = com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate.Model.Companion.b(r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vh7.c.d(java.lang.String, ph7.c, java.util.List):com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model");
    }

    @Override // uh7.e
    public final ErrorWidgetDelegate.Model e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new ErrorWidgetDelegate.Model(id10, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), new TextLocalisedClause(R$string.wealth_invest_widget_cfds_pnl_drivers_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_common_error_action, null, null, 14), q.LARGE, null, null, BERTags.FLAGS);
    }
}
