package f86;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.lifecycle.b;
import cpi.k;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f132740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a86.a f132741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f132742c;

    public a(Context context, a86.a featureToggleEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureToggleEnabled, "featureToggleEnabled");
        this.f132740a = context;
        this.f132741b = featureToggleEnabled;
        this.f132742c = j.b(new b(this, 16));
    }

    public final boolean a() {
        if (!((k) this.f132741b).a()) {
            return true;
        }
        od0.a aVar = od0.a.f224253a;
        return od0.a.e() || ((KeyguardManager) this.f132742c.getValue()).isDeviceSecure();
    }
}
