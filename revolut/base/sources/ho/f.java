package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.fail_fast.exceptions.FailFastAnalyticsException;
import com.revolut.tracking.v3.NudgeContext;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f154160c;

    public f(String str, AnalyticsProduct product, w0 w0Var) {
        mo.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154158a = str;
        this.f154159b = product;
        this.f154160c = w0Var;
        if (w0Var instanceof NudgeContext) {
        } else {
            throw new FailFastAnalyticsException(a0.d.s("Unsupported context type ", w0Var != null ? w0Var.getClass().getName() : null, " in nudge event: ", c()));
        }
    }

    @Override // ho.n.a
    public final mo.e b() {
        return new mo.e(1741);
    }

    public final String c() {
        return "Nudge(screen=" + this.f154158a + ", product=" + this.f154159b + ")";
    }

    public final w0 d() {
        return this.f154160c;
    }

    public final AnalyticsProduct e() {
        return this.f154159b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f154158a, fVar.f154158a) && Intrinsics.f(this.f154159b, fVar.f154159b) && Intrinsics.f(this.f154160c, fVar.f154160c);
    }

    public final String f() {
        return this.f154158a;
    }

    public final int hashCode() {
        String str = this.f154158a;
        return Integer.hashCode(1741) + ((AnalyticsContext.a(this.f154160c) + h30.l.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f154159b)) * 31);
    }

    public final String toString() {
        return c();
    }
}
