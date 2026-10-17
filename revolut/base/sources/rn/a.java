package rn;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.WidgetDescription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f255368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f255369c;
    public final AnalyticsContext d;
    public final String e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f255370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f255371h;
    public final WidgetDescription i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String identifier, Integer num, boolean z, AnalyticsContext analyticsContext, String str, AnalyticsProduct analyticsProduct, String str2, Integer num2, WidgetDescription widgetDescription) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f255367a = identifier;
        this.f255368b = num;
        this.f255369c = z;
        this.d = analyticsContext;
        this.e = str;
        this.f = analyticsProduct;
        this.f255370g = str2;
        this.f255371h = num2;
        this.i = widgetDescription;
    }

    @Override // rn.c
    public final String a() {
        return this.f255367a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f255367a, aVar.f255367a) && Intrinsics.f(this.f255368b, aVar.f255368b) && this.f255369c == aVar.f255369c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f255370g, aVar.f255370g) && Intrinsics.f(this.f255371h, aVar.f255371h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f255367a.hashCode() * 31;
        Integer num = this.f255368b;
        int iC = j6.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f255369c);
        AnalyticsContext analyticsContext = this.d;
        int iA = (iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        String str = this.e;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsProduct analyticsProduct = this.f;
        int iHashCode3 = (iHashCode2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        String str2 = this.f255370g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f255371h;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        WidgetDescription widgetDescription = this.i;
        return iHashCode5 + (widgetDescription != null ? widgetDescription.hashCode() : 0);
    }
}
