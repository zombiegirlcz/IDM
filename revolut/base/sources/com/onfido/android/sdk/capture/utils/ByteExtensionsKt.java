package com.onfido.android.sdk.capture.utils;

import com.google.common.primitives.UnsignedBytes;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toPositiveInt", "", "", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ByteExtensionsKt {
    public static final int toPositiveInt(byte b4) {
        return b4 & UnsignedBytes.MAX_VALUE;
    }
}
