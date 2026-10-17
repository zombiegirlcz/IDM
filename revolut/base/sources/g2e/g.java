package g2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f139986a;

    public g(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f139986a = storage;
    }

    public static String a(String str) {
        if (kotlin.text.a0.H(str, "STORE_SESSION_EXPIRY_", false)) {
            throw new IllegalArgumentException("Campaign ID must not start with STORE_SESSION_EXPIRY_ to avoid storage key collisions");
        }
        return "STORE_SESSION_EXPIRY_".concat(str);
    }
}
