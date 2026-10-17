package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.SettingsAccessibilityContext;
import com.revolut.tracking.v3.SettingsAppLifecycleContext;
import com.revolut.tracking.v3.SettingsAppSizeContext;
import com.revolut.tracking.v3.SettingsExtensionsContext;
import com.revolut.tracking.v3.SettingsFeaturesContext;
import com.revolut.tracking.v3.SettingsLockContext;
import com.revolut.tracking.v3.SettingsMultifactorContext;
import com.revolut.tracking.v3.SettingsPermissionsContext;
import com.revolut.tracking.v3.SettingsProductOptInSourceContext;
import com.revolut.tracking.v3.SettingsSecurityContext;
import com.revolut.tracking.v3.SettingsThemingContext;
import com.revolut.tracking.v3.SettingsThirdPartySdkContext;
import com.revolut.tracking.v3.SettingsUnlockContext;
import com.revolut.tracking.v3.SuspiciousAppContext;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f154182c;

    public l(String str, AnalyticsProduct product, w0 w0Var) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154180a = str;
        this.f154181b = product;
        this.f154182c = w0Var;
        if (!(w0Var instanceof SettingsAccessibilityContext) && !(w0Var instanceof SettingsAppLifecycleContext) && !(w0Var instanceof SettingsAppSizeContext) && !(w0Var instanceof SettingsExtensionsContext) && !(w0Var instanceof SettingsFeaturesContext) && !(w0Var instanceof SettingsLockContext) && !(w0Var instanceof SettingsMultifactorContext) && !(w0Var instanceof SettingsPermissionsContext) && !(w0Var instanceof SettingsProductOptInSourceContext) && !(w0Var instanceof SettingsSecurityContext) && !(w0Var instanceof SettingsThemingContext) && !(w0Var instanceof SettingsThirdPartySdkContext) && !(w0Var instanceof SettingsUnlockContext) && !(w0Var instanceof SuspiciousAppContext)) {
            throw new IllegalArgumentException(j6.a.q("Settings event must use only Settings context: ", c()));
        }
        mo.e.Companion.getClass();
    }

    @Override // ho.n.a
    public final mo.e b() {
        return mo.e.a();
    }

    public final String c() {
        return "Settings(screen=" + this.f154180a + ", product=" + this.f154181b + ", context=" + this.f154182c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f154180a, lVar.f154180a) && Intrinsics.f(this.f154181b, lVar.f154181b) && Intrinsics.f(this.f154182c, lVar.f154182c);
    }

    public final int hashCode() {
        String str = this.f154180a;
        return AnalyticsContext.a(this.f154182c) + h30.l.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f154181b);
    }

    public final String toString() {
        return c();
    }
}
