package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.fail_fast.exceptions.FailFastAnalyticsException;
import com.revolut.tracking.v3.SettingsDeeplinkContext;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154143c;
    public final w0 d;
    public final int e;

    public b(String str, AnalyticsProduct product, String path, w0 w0Var) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f154141a = str;
        this.f154142b = product;
        this.f154143c = path;
        this.d = w0Var;
        if (!(w0Var instanceof SettingsDeeplinkContext)) {
            throw new FailFastAnalyticsException("Unexpected deeplink context: screen=" + str + " product=" + product + " path=" + kotlin.text.d0.A0('?', path));
        }
        if (!kotlin.text.d0.K(path, '?')) {
            mo.e.Companion.getClass();
            this.e = 521;
            return;
        }
        throw new FailFastAnalyticsException("Invalid deeplink with params: screen=" + str + " product=" + product + " path=" + kotlin.text.d0.A0('?', path));
    }

    @Override // ho.n.a
    public final mo.e b() {
        return new mo.e(this.e);
    }

    public final w0 c() {
        return this.d;
    }

    public final String d() {
        return this.f154143c;
    }

    public final AnalyticsProduct e() {
        return this.f154142b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f154141a, bVar.f154141a) && Intrinsics.f(this.f154142b, bVar.f154142b) && Intrinsics.f(this.f154143c, bVar.f154143c) && Intrinsics.f(this.d, bVar.d);
    }

    public final String f() {
        return this.f154141a;
    }

    public final int hashCode() {
        String str = this.f154141a;
        return AnalyticsContext.a(this.d) + p.a.c(h30.l.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f154142b), 31, this.f154143c);
    }
}
