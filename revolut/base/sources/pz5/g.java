package pz5;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements oz5.a {
    @Override // oz5.a
    public final String name() {
        return "Revolut-Device-Platform-Version";
    }

    @Override // oz5.a
    public final String value() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }
}
