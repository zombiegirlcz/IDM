package lp5;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements lp5.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // lp5.a
    public final boolean validate(String destinationTag) {
        Intrinsics.checkNotNullParameter(destinationTag, "destinationTag");
        if (destinationTag.length() == 0) {
            return true;
        }
        Charset charset = Charsets.UTF_8;
        byte[] bytes = destinationTag.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        if (bytes.length > 28) {
            return false;
        }
        if (!StandardCharsets.US_ASCII.newEncoder().canEncode(destinationTag)) {
            try {
                Intrinsics.checkNotNullExpressionValue(destinationTag.getBytes(charset), "getBytes(...)");
            } catch (UnsupportedEncodingException unused) {
                return false;
            }
        }
        return true;
    }
}
