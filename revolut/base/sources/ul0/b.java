package ul0;

import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public final class b implements tl0.a {
    @Override // tl0.a
    public final byte[] a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] array = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(array, "getBytes(...)");
        Intrinsics.checkNotNullParameter(array, "array");
        byte[] bArrDecode = Base64.getDecoder().decode(array);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return bArrDecode;
    }

    @Override // tl0.a
    public final byte[] b(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        byte[] bArrEncode = Base64.getEncoder().encode(array);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return bArrEncode;
    }

    @Override // tl0.a
    public final byte[] c(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        byte[] bArrEncode = Base64.getEncoder().encode(array);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return bArrEncode;
    }

    @Override // tl0.a
    public final String d(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        String strEncodeToString = Base64.getEncoder().encodeToString(byteArray);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // tl0.a
    public final String e(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        String strEncodeToString = Base64.getEncoder().encodeToString(byteArray);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // tl0.a
    public final byte[] f(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bArrDecode = Base64.getUrlDecoder().decode(value);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return bArrDecode;
    }
}
