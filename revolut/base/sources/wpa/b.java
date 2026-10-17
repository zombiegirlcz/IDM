package wpa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private b() {
    }

    public static f a(String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        return Intrinsics.f(scheme, "VISA") ? e.f299211a : Intrinsics.f(scheme, "MASTERCARD") ? c.f299209a : new d(scheme);
    }
}
