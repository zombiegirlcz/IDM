package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/text/Charsets;", "", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Charsets {

    @NotNull
    public static final Charset UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Charsets f187886a = new Charsets();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f187887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f187888c;
    public static final Charset d;
    public static volatile Charset e;
    public static volatile Charset f;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        UTF_8 = charsetForName;
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        f187887b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(charsetForName3, "forName(...)");
        f187888c = charsetForName3;
        Charset charsetForName4 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(charsetForName4, "forName(...)");
        d = charsetForName4;
        Intrinsics.checkNotNullExpressionValue(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
