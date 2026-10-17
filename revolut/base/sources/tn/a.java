package tn;

import com.google.protobuf.k3;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.AirTipContext;
import com.revolut.tracking.v3.DiscoverMoreWidgetContext;
import com.revolut.tracking.v3.HomeTotalWealthContext;
import com.revolut.tracking.v3.ImpressionContext;
import com.revolut.tracking.v3.P4UWidgetContext;
import com.revolut.tracking.v3.PremiumContextualBannerContext;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import grl.b5;
import ho.k0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.b;
import rn.c;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    @NotNull
    public static final C1518a Companion = new C1518a();

    /* JADX INFO: renamed from: tn.a$a, reason: collision with other inner class name */
    public static final class C1518a {
        private C1518a() {
        }
    }

    public static ImpressionContext b(b bVar, ImpressionContext impressionContext) {
        String str;
        String str2 = bVar.k;
        if (str2 == null || (str = bVar.i) == null) {
            return null;
        }
        ImpressionContext.a aVarNewBuilder = impressionContext != null ? ImpressionContext.newBuilder(impressionContext) : ImpressionContext.newBuilder();
        int i = bVar.f255381p;
        b5 b5Var = (500 > i || i >= 1000) ? i >= 1000 ? b5.VIEWABLE : b5.NON_VIEWABLE : b5.SUB_SECOND;
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setImpressionType(b5Var);
        boolean z = bVar.f255374c;
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setIsFirstImpression(z);
        int i2 = bVar.f255380n;
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setVisibilityL25TimeMs(i2);
        int i3 = bVar.o;
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setVisibilityGe25TimeMs(i3);
        int i5 = bVar.f255381p;
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setVisibilityGe50TimeMs(i5);
        int i6 = bVar.f255382q;
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setVisibilityGe75TimeMs(i6);
        int i21 = bVar.f255383r;
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setVisibility100TimeMs(i21);
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setAnalyticsRef(str2);
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setPlacementId(str);
        k3 k3VarA = k0.a(bVar.f255384s);
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setViewTimestampIn(k3VarA);
        k3 k3VarA2 = k0.a(bVar.f255385t);
        aVarNewBuilder.c();
        ((ImpressionContext) aVarNewBuilder.f49761b).setViewTimestampOut(k3VarA2);
        Long l2 = bVar.u;
        if (l2 != null) {
            k3 k3VarA3 = k0.a(l2.longValue());
            aVarNewBuilder.c();
            ((ImpressionContext) aVarNewBuilder.f49761b).setClickTimestamp(k3VarA3);
        }
        Integer num = bVar.f255378l;
        if (num != null) {
            int iIntValue = num.intValue();
            aVarNewBuilder.c();
            ((ImpressionContext) aVarNewBuilder.f49761b).setSlotPosition(iIntValue);
        }
        String str3 = bVar.f255377j;
        if (str3 != null) {
            aVarNewBuilder.c();
            ((ImpressionContext) aVarNewBuilder.f49761b).setCreativeUrl(str3);
        }
        String str4 = bVar.f255379m;
        if (str4 != null) {
            aVarNewBuilder.c();
            ((ImpressionContext) aVarNewBuilder.f49761b).setComponentId(str4);
        }
        return (ImpressionContext) aVarNewBuilder.a();
    }

    public final AnalyticsContext a(c viewableRecord) {
        ImpressionContext impressionContextB;
        Intrinsics.checkNotNullParameter(viewableRecord, "viewableRecord");
        if (viewableRecord instanceof rn.a) {
            rn.a aVar = (rn.a) viewableRecord;
            boolean z = aVar.f255369c;
            AnalyticsContext analyticsContext = aVar.d;
            w0 w0Var = analyticsContext != null ? analyticsContext.f50296a : null;
            if (w0Var instanceof RevPointsGenericWidgetContext) {
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                RevPointsGenericWidgetContext.a aVarNewBuilder = RevPointsGenericWidgetContext.newBuilder((RevPointsGenericWidgetContext) w0Var);
                aVarNewBuilder.c();
                ((RevPointsGenericWidgetContext) aVarNewBuilder.f49761b).setIsFirstImpression(z);
                w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            }
            if (w0Var instanceof PremiumContextualBannerContext) {
                AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                PremiumContextualBannerContext.a aVarNewBuilder2 = PremiumContextualBannerContext.newBuilder((PremiumContextualBannerContext) w0Var);
                aVarNewBuilder2.c();
                ((PremiumContextualBannerContext) aVarNewBuilder2.f49761b).setIsFirstImpression(z);
                w0 w0VarA2 = aVarNewBuilder2.a();
                companion2.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2));
            }
            if (w0Var instanceof HomeTotalWealthContext) {
                AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
                HomeTotalWealthContext.a aVarNewBuilder3 = HomeTotalWealthContext.newBuilder((HomeTotalWealthContext) w0Var);
                aVarNewBuilder3.c();
                ((HomeTotalWealthContext) aVarNewBuilder3.f49761b).setIsFirstImpression(z);
                w0 w0VarA3 = aVarNewBuilder3.a();
                companion3.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA3));
            }
            if (w0Var instanceof P4UWidgetContext) {
                AnalyticsContext.Companion companion4 = AnalyticsContext.INSTANCE;
                P4UWidgetContext.a aVarNewBuilder4 = P4UWidgetContext.newBuilder((P4UWidgetContext) w0Var);
                aVarNewBuilder4.c();
                ((P4UWidgetContext) aVarNewBuilder4.f49761b).setIsFirstImpression(z);
                w0 w0VarA4 = aVarNewBuilder4.a();
                companion4.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA4));
            }
            if (w0Var instanceof DiscoverMoreWidgetContext) {
                AnalyticsContext.Companion companion5 = AnalyticsContext.INSTANCE;
                DiscoverMoreWidgetContext.a aVarNewBuilder5 = DiscoverMoreWidgetContext.newBuilder((DiscoverMoreWidgetContext) w0Var);
                aVarNewBuilder5.c();
                ((DiscoverMoreWidgetContext) aVarNewBuilder5.f49761b).setIsFirstImpression(z);
                w0 w0VarA5 = aVarNewBuilder5.a();
                companion5.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA5));
            }
            if (w0Var instanceof AirTipContext) {
                AnalyticsContext.Companion companion6 = AnalyticsContext.INSTANCE;
                AirTipContext.a aVarNewBuilder6 = AirTipContext.newBuilder((AirTipContext) w0Var);
                aVarNewBuilder6.c();
                ((AirTipContext) aVarNewBuilder6.f49761b).setIsFirstImpression(z);
                w0 w0VarA6 = aVarNewBuilder6.a();
                companion6.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA6));
            }
        } else {
            if (!(viewableRecord instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            b bVar = (b) viewableRecord;
            AnalyticsContext analyticsContext2 = bVar.d;
            w0 w0Var2 = analyticsContext2 != null ? analyticsContext2.f50296a : null;
            if (w0Var2 instanceof ImpressionContext) {
                ImpressionContext impressionContextB2 = b(bVar, (ImpressionContext) w0Var2);
                if (impressionContextB2 != null) {
                    AnalyticsContext.INSTANCE.getClass();
                    return new AnalyticsContext(AnalyticsContext.Companion.a(impressionContextB2));
                }
            } else if (w0Var2 == null && (impressionContextB = b(bVar, null)) != null) {
                AnalyticsContext.INSTANCE.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(impressionContextB));
            }
        }
        return null;
    }
}
