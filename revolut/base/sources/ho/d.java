package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.fail_fast.exceptions.FailFastAnalyticsException;
import com.revolut.tracking.v3.ImpressionContext;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f154153c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public d(String str, AnalyticsProduct product, w0 w0Var, String str2, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154151a = str;
        this.f154152b = product;
        this.f154153c = w0Var;
        this.d = str2;
        this.e = num;
        this.f = num2;
        if (w0Var instanceof ImpressionContext) {
            return;
        }
        throw new FailFastAnalyticsException(a0.d.s("Unsupported context type ", w0Var != null ? w0Var.getClass().getName() : null, " in impression event: ", "ImpressionTracking(screen=" + str + ", product=" + product + ")"));
    }

    @Override // ho.n.a
    public final mo.e b() {
        return null;
    }

    public final w0 c() {
        return this.f154153c;
    }

    public final Integer d() {
        return this.f;
    }

    public final AnalyticsProduct e() {
        return this.f154152b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f154151a, dVar.f154151a) && Intrinsics.f(this.f154152b, dVar.f154152b) && Intrinsics.f(this.f154153c, dVar.f154153c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final String f() {
        return this.f154151a;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.f154151a;
        int iA = (AnalyticsContext.a(this.f154153c) + h30.l.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f154152b)) * 31;
        String str2 = this.d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
    }

    public final Integer i() {
        return this.e;
    }
}
