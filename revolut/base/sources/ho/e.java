package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.fail_fast.exceptions.FailFastAnalyticsException;
import com.revolut.tracking.v3.IntentContext;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f154157c;

    public e(String str, AnalyticsProduct product, w0 w0Var) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154155a = str;
        this.f154156b = product;
        this.f154157c = w0Var;
        if (w0Var instanceof IntentContext) {
            mo.e.Companion.getClass();
            return;
        }
        StringBuilder sbM = v0.a.m("Unexpected context type ", w0Var != null ? w0Var.getClass().getName() : null, " in Intent(scree=", str, ", product=");
        sbM.append(product);
        sbM.append(")");
        throw new FailFastAnalyticsException(sbM.toString());
    }

    @Override // ho.n.a
    public final mo.e b() {
        return mo.e.a();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f154155a, eVar.f154155a) && Intrinsics.f(this.f154156b, eVar.f154156b) && Intrinsics.f(this.f154157c, eVar.f154157c);
    }

    public final int hashCode() {
        String str = this.f154155a;
        return AnalyticsContext.a(this.f154157c) + h30.l.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f154156b);
    }
}
