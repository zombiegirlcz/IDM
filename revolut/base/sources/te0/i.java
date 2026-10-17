package te0;

import android.os.Bundle;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e {
    public final Function3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String key) {
        super(key);
        g putToBundleStrategy = g.f;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(putToBundleStrategy, "putToBundleStrategy");
        this.d = putToBundleStrategy;
    }

    @Override // te0.e
    public final Object d(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return bundle.get(this.f270012c);
    }

    @Override // te0.e
    public final void e(Bundle bundle, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.d.invoke(bundle, this.f270012c, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String key, Object obj2) {
        super(key, obj2);
        h putToBundleStrategy = h.f;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(obj2, "default");
        Intrinsics.checkNotNullParameter(putToBundleStrategy, "putToBundleStrategy");
        this.d = putToBundleStrategy;
    }
}
