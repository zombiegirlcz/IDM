package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.DiagnosticContext;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n.a implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f154149c;
    public final mo.e d;
    public final boolean e;

    public c(String str, AnalyticsProduct product, w0 w0Var, mo.e eVar, boolean z) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154147a = str;
        this.f154148b = product;
        this.f154149c = w0Var;
        this.d = eVar;
        this.e = z;
        if (w0Var instanceof DiagnosticContext) {
            return;
        }
        throw new IllegalArgumentException(j6.a.q("Diagnostic event must use only DiagnosticContext: ", "Diagnostic(screen=" + str + ", product=" + product + ", context=" + AnalyticsContext.b(w0Var)));
    }

    @Override // ho.n.a
    public final mo.e b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f154147a, cVar.f154147a) && Intrinsics.f(this.f154148b, cVar.f154148b) && Intrinsics.f(this.f154149c, cVar.f154149c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        String str = this.f154147a;
        int iA = (AnalyticsContext.a(this.f154149c) + h30.l.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f154148b)) * 31;
        mo.e eVar = this.d;
        return Boolean.hashCode(this.e) + ((iA + (eVar != null ? mo.e.b(eVar.c()) : 0)) * 31);
    }

    public /* synthetic */ c(AnalyticsProduct analyticsProduct, w0 w0Var, mo.e eVar) {
        this(null, analyticsProduct, w0Var, eVar, false);
    }
}
