package pz5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private b() {
    }

    public static String a(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return "Bearer ".concat(accessToken);
    }
}
