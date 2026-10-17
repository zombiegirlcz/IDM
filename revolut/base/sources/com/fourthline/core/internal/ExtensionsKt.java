package com.fourthline.core.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"sha256", "", "", "toHex", "alpha3Code", "fourthline-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(byte b4) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b4)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String alpha3Code(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Intrinsics.f(str, "D") ? "DEU" : str;
    }

    @NotNull
    public static final String sha256(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return toHex(bArrDigest);
    }

    @NotNull
    public static final String toHex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return kotlin.collections.d.a0(bArr, "", null, null, new aem.d(11), 30);
    }
}
