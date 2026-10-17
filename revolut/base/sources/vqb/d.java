package vqb;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.slot_manager.api.navigation.SlotChecklistDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import q06.h;
import q06.k;
import sri.m;
import to7.f;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements jf0.d, k {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f291368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f291369b;

    public d(m navigator, b slotManagerChecklistDeeplinkParser) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(slotManagerChecklistDeeplinkParser, "slotManagerChecklistDeeplinkParser");
        this.f291368a = navigator;
        this.f291369b = slotManagerChecklistDeeplinkParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.slot_manager.api.navigation.SlotChecklistDestination b(com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig r5) {
        /*
            com.revolut.feature.slot_manager.api.navigation.SlotChecklistDestination r0 = new com.revolut.feature.slot_manager.api.navigation.SlotChecklistDestination
            java.lang.String r1 = r5.f87297a
            int r2 = r1.hashCode()
            r3 = -170273831(0xfffffffff5d9d3d9, float:-5.522584E32)
            java.lang.String r4 = "value"
            if (r2 == r3) goto L3a
            r3 = 402315120(0x17fad770, float:1.6210255E-24)
            if (r2 == r3) goto L2c
            r3 = 1953328841(0x746d6ec9, float:7.5245443E31)
            if (r2 == r3) goto L1a
            goto L42
        L1a:
            java.lang.String r2 = "LIFESTYLE_HOME"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L23
            goto L42
        L23:
            grl.k9 r1 = grl.k9.RevPoints
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r2 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
        L27:
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r1 = com.google.android.gms.internal.mlkit_vision_face.a.h(r1, r4, r1)
            goto L4c
        L2c:
            java.lang.String r2 = "PERSONAL_CURRENCY_HOME_10"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L35
            goto L42
        L35:
            grl.k9 r1 = grl.k9.Accounts
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r2 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            goto L27
        L3a:
            java.lang.String r2 = "SAVINGS_HOME_10"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L47
        L42:
            grl.k9 r1 = grl.k9.Retail
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r2 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            goto L27
        L47:
            grl.k9 r1 = grl.k9.Savings
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r2 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            goto L27
        L4c:
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vqb.d.b(com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig):com.revolut.feature.slot_manager.api.navigation.SlotChecklistDestination");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return d0.J(deeplink.f173629c, "/slots/checklists/", false) && deeplink.e(3).length() > 0 && deeplink.e(4).length() > 0;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        SlotChecklistFetchConfig slotChecklistFetchConfigA = this.f291369b.a(cVar.f173629c);
        q06.b bVar = null;
        if (slotChecklistFetchConfigA == null) {
            return null;
        }
        SlotChecklistDestination slotChecklistDestinationB = b(slotChecklistFetchConfigA);
        String str = slotChecklistFetchConfigA.f87297a;
        String str2 = slotChecklistFetchConfigA.f87298b;
        if (!Intrinsics.f(str, "LIFESTYLE_HOME") && !Intrinsics.f(str, "PERSONAL_CURRENCY_HOME_10") && Intrinsics.f(str, "SAVINGS_HOME_10") && str2 != null) {
            bVar = new q06.b(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str2, null), ProductId.SAVINGS), null));
        }
        return new h(slotChecklistDestinationB, bVar);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        SlotChecklistFetchConfig slotChecklistFetchConfigA = this.f291369b.a(deeplink.f173629c);
        if (slotChecklistFetchConfigA == null) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        FeatureCommand featureCommandF = null;
        NaviCommand naviCommandF = gc0.c.f(new KompotOverlayFeatureConfig(b(slotChecklistFetchConfigA), yhi.b.BOTTOM_DIALOG, (Integer) null, 12));
        String str = slotChecklistFetchConfigA.f87297a;
        String str2 = slotChecklistFetchConfigA.f87298b;
        if (!Intrinsics.f(str, "LIFESTYLE_HOME")) {
            if (Intrinsics.f(str, "PERSONAL_CURRENCY_HOME_10")) {
                featureCommandF = gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            } else if (Intrinsics.f(str, "SAVINGS_HOME_10") && str2 != null) {
                ProductId productId = ProductId.SAVINGS;
                featureCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str2, null), productId), null), null, 4)));
            } else if (z) {
                featureCommandF = gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            }
        }
        if (featureCommandF != null) {
            naviCommandF = com.revolut.retail.core.navigation.a.c(featureCommandF, naviCommandF);
        }
        return new ufm.c(new f(this, naviCommandF, 19), 2);
    }
}
