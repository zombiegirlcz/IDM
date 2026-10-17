package ul0;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements tl0.a {
    @Override // tl0.a
    public final byte[] a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bArrDecode = Base64.decode(value, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return bArrDecode;
    }

    @Override // tl0.a
    public final byte[] b(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        byte[] bArrEncode = Base64.encode(array, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return bArrEncode;
    }

    @Override // tl0.a
    public final byte[] c(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        byte[] bArrEncode = Base64.encode(array, 0);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return bArrEncode;
    }

    @Override // tl0.a
    public final String d(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        String strEncodeToString = Base64.encodeToString(array, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // tl0.a
    public final String e(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        String strEncodeToString = Base64.encodeToString(array, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // tl0.a
    public final byte[] f(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bArrDecode = Base64.decode(value, 8);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return bArrDecode;
    }
}
