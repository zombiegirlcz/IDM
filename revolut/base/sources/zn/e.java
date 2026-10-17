package zn;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.WidgetDescription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f323639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f323641c;
    public final WidgetDescription d;
    public final String e;
    public final AnalyticsProduct f;

    public e(float f, String str, Integer num, WidgetDescription widgetDescription, String str2, AnalyticsProduct analyticsProduct) {
        this.f323639a = f;
        this.f323640b = str;
        this.f323641c = num;
        this.d = widgetDescription;
        this.e = str2;
        this.f = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Float.compare(this.f323639a, eVar.f323639a) == 0 && Intrinsics.f(this.f323640b, eVar.f323640b) && Intrinsics.f(this.f323641c, eVar.f323641c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f323639a) * 31;
        String str = this.f323640b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f323641c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        WidgetDescription widgetDescription = this.d;
        int iHashCode4 = (iHashCode3 + (widgetDescription == null ? 0 : widgetDescription.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnalyticsProduct analyticsProduct = this.f;
        return iHashCode5 + (analyticsProduct != null ? analyticsProduct.hashCode() : 0);
    }
}
