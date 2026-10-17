package rm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s {
    private s() {
    }

    public static u a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return kotlin.text.a0.H(value, "2:", false) ? new u(kotlin.text.d0.e0(value, "2:"), r.V2_OAEP) : new u(value, r.V1_PKCS1);
    }
}
