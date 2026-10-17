package com.onfido.android.sdk.capture.utils;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0000¨\u0006\n"}, d2 = {"chuncked", "", "", "size", "", "toBase64String", "", "kotlin.jvm.PlatformType", "toPositiveIntArray", "", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ByteArrayExtensionsKt {
    @NotNull
    public static final List<byte[]> chuncked(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ArrayList arrayList = new ArrayList();
        while (byteBufferWrap.hasRemaining()) {
            int iMin = Integer.min(i, byteBufferWrap.remaining());
            byte[] bArr2 = new byte[iMin];
            byteBufferWrap.get(bArr2, 0, iMin);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    public static final String toBase64String(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Base64.encodeToString(bArr, 2);
    }

    @NotNull
    public static final int[] toPositiveIntArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b4 : bArr) {
            arrayList.add(Integer.valueOf(ByteExtensionsKt.toPositiveInt(b4)));
        }
        return d0.c1(arrayList);
    }
}
