package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsMetadata;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.UnsupportedMetadataType;
import com.revolut.tracking.v3.UiInteraction;
import com.revolut.tracking.v3.WidgetDescription;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n.a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154136c;
    public final Integer d;
    public final Integer e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsContext f154137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WidgetDescription f154138h;
    public final AnalyticsMetadata i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mo.e f154139j;

    public a(String action, String screen, String str, Integer num, Integer num2, AnalyticsProduct product, AnalyticsContext analyticsContext, WidgetDescription widgetDescription, AnalyticsMetadata analyticsMetadata, mo.e eVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154134a = action;
        this.f154135b = screen;
        this.f154136c = str;
        this.d = num;
        this.e = num2;
        this.f = product;
        this.f154137g = analyticsContext;
        this.f154138h = widgetDescription;
        this.i = analyticsMetadata;
        this.f154139j = eVar;
        if ((analyticsMetadata != null ? analyticsMetadata.f50297a : null) != null && !(analyticsMetadata.f50297a instanceof UiInteraction)) {
            throw new UnsupportedMetadataType(analyticsMetadata.f50297a);
        }
    }

    @Override // ho.f0
    public final AnalyticsMetadata a() {
        return this.i;
    }

    @Override // ho.n.a
    public final mo.e b() {
        return this.f154139j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f154134a, aVar.f154134a) && Intrinsics.f(this.f154135b, aVar.f154135b) && Intrinsics.f(this.f154136c, aVar.f154136c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f154137g, aVar.f154137g) && Intrinsics.f(this.f154138h, aVar.f154138h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f154139j, aVar.f154139j);
    }

    public final int hashCode() {
        w0 w0Var;
        int iC = p.a.c(this.f154134a.hashCode() * 31, 31, this.f154135b);
        String str = this.f154136c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iA = (AnalyticsContext.a(this.f154137g.f50296a) + h30.l.a((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f)) * 31;
        WidgetDescription widgetDescription = this.f154138h;
        int iHashCode3 = (iA + (widgetDescription == null ? 0 : widgetDescription.hashCode())) * 31;
        AnalyticsMetadata analyticsMetadata = this.i;
        int iHashCode4 = (iHashCode3 + ((analyticsMetadata == null || (w0Var = analyticsMetadata.f50297a) == null) ? 0 : w0Var.hashCode())) * 31;
        mo.e eVar = this.f154139j;
        return iHashCode4 + (eVar != null ? mo.e.b(eVar.c()) : 0);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("ButtonClick(screen=", this.f154135b, ", action=", this.f154134a, ", product=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
