package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.fail_fast.exceptions.FailFastAnalyticsException;
import com.revolut.tracking.v3.AirTipContext;
import com.revolut.tracking.v3.DiscoverMoreWidgetContext;
import com.revolut.tracking.v3.HomeTotalWealthContext;
import com.revolut.tracking.v3.P4UWidgetContext;
import com.revolut.tracking.v3.PremiumContextualBannerContext;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import com.revolut.tracking.v3.WidgetDescription;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class m extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f154185c;
    public final String d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WidgetDescription f154186g;

    public m(String str, AnalyticsProduct product, w0 w0Var, String str2, Integer num, Integer num2, WidgetDescription widgetDescription) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154183a = str;
        this.f154184b = product;
        this.f154185c = w0Var;
        this.d = str2;
        this.e = num;
        this.f = num2;
        this.f154186g = widgetDescription;
        if ((w0Var instanceof RevPointsGenericWidgetContext) || (w0Var instanceof PremiumContextualBannerContext) || (w0Var instanceof HomeTotalWealthContext) || (w0Var instanceof P4UWidgetContext) || (w0Var instanceof DiscoverMoreWidgetContext) || (w0Var instanceof AirTipContext)) {
            return;
        }
        throw new FailFastAnalyticsException(a0.d.s("Unsupported context type ", w0Var != null ? w0Var.getClass().getName() : null, " in viewable_record event: ", "ViewableRecordTracking(screen=" + str + ", product=" + product + ")"));
    }

    @Override // ho.n.a
    public final mo.e b() {
        return null;
    }

    public final w0 c() {
        return this.f154185c;
    }

    public final Integer d() {
        return this.f;
    }

    public final AnalyticsProduct e() {
        return this.f154184b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f154183a, mVar.f154183a) && Intrinsics.f(this.f154184b, mVar.f154184b) && Intrinsics.f(this.f154185c, mVar.f154185c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f154186g, mVar.f154186g);
    }

    public final String f() {
        return this.f154183a;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.f154183a;
        int iA = (AnalyticsContext.a(this.f154185c) + h30.l.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f154184b)) * 31;
        String str2 = this.d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        WidgetDescription widgetDescription = this.f154186g;
        return (iHashCode3 + (widgetDescription != null ? widgetDescription.hashCode() : 0)) * 31;
    }

    public final Integer i() {
        return this.e;
    }

    public final WidgetDescription k() {
        return this.f154186g;
    }
}
