package tn5;

import kn5.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn5.b f272309a;

    public e(mn5.b base58Codec) {
        Intrinsics.checkNotNullParameter(base58Codec, "base58Codec");
        this.f272309a = base58Codec;
    }

    public final f a(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        int length = address.length();
        return (26 > length || length >= 36) ? new kn5.e(null) : this.f272309a.d(address, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz");
    }
}
