package kwg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kp0.q;
import ku1.f0;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import wvg.f1;
import wvg.g0;
import wvg.g1;
import wvg.k0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f190335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eel.c f190336c;
    public final /* synthetic */ WidgetisedAnalyticsType d;

    public /* synthetic */ d(l lVar, WidgetisedAnalyticsType widgetisedAnalyticsType, eel.c cVar, int i) {
        this.f190334a = i;
        this.f190335b = lVar;
        this.d = widgetisedAnalyticsType;
        this.f190336c = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f190334a) {
            case 0:
                String userId = (String) obj2;
                xi0.b currency = (xi0.b) obj3;
                iwg.a analyticsProductType = (iwg.a) obj4;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                l lVar = this.f190335b;
                return rd0.e.c(nim.a.v(lVar.f190365s.b(userId, l.a(analyticsProductType), l.b(this.d), this.f190336c, currency), new i5f.g(lVar, currency, 14)), kotlin.coroutines.g.f186406a);
            case 1:
                String userId2 = (String) obj2;
                xi0.b currency2 = (xi0.b) obj3;
                iwg.a analyticsProductType2 = (iwg.a) obj4;
                Intrinsics.checkNotNullParameter(userId2, "userId");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                Intrinsics.checkNotNullParameter(analyticsProductType2, "analyticsProductType");
                l lVar2 = this.f190335b;
                k0 k0Var = lVar2.f;
                iwg.a analyticsProductType3 = l.a(analyticsProductType2);
                DateTime to6 = ((l80.f) lVar2.f190360m).h();
                String strB = l.b(this.d);
                k0Var.getClass();
                Intrinsics.checkNotNullParameter(userId2, "userId");
                Intrinsics.checkNotNullParameter(analyticsProductType3, "analyticsProductType");
                eel.c timeSpan = this.f190336c;
                Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                return nim.a.w(k0Var.d.f(new g1(userId2, analyticsProductType3, timeSpan, to6, currency2, strB), true), new q(analyticsProductType2, new f0(20), 18));
            default:
                String userId3 = (String) obj2;
                xi0.b currency3 = (xi0.b) obj3;
                iwg.a analyticsProductType4 = (iwg.a) obj4;
                Intrinsics.checkNotNullParameter(userId3, "userId");
                Intrinsics.checkNotNullParameter(currency3, "currency");
                Intrinsics.checkNotNullParameter(analyticsProductType4, "analyticsProductType");
                l lVar3 = this.f190335b;
                g0 g0Var = lVar3.f190357h;
                String strB2 = l.b(this.d);
                iwg.a analyticsProductType5 = l.a(analyticsProductType4);
                DateTime to10 = ((l80.f) lVar3.f190360m).h();
                g0Var.getClass();
                Intrinsics.checkNotNullParameter(userId3, "userId");
                Intrinsics.checkNotNullParameter(analyticsProductType5, "analyticsProductType");
                eel.c timeSpan2 = this.f190336c;
                Intrinsics.checkNotNullParameter(timeSpan2, "timeSpan");
                Intrinsics.checkNotNullParameter(to10, "to");
                Intrinsics.checkNotNullParameter(currency3, "currency");
                return nim.a.w(rd0.e.c(g0Var.e.a(new f1(userId3, strB2, analyticsProductType5, timeSpan2, to10, currency3, new Duration(1L, 1L)), w4l.i.f294643c), kotlin.coroutines.g.f186406a), new kvg.j(lVar3, 21));
        }
    }

    public /* synthetic */ d(l lVar, eel.c cVar, WidgetisedAnalyticsType widgetisedAnalyticsType) {
        this.f190334a = 1;
        this.f190335b = lVar;
        this.f190336c = cVar;
        this.d = widgetisedAnalyticsType;
    }
}
