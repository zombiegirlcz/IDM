package a1m;

import a09.r;
import aem.v;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.vision.internal.qh;
import d7.i0;
import d7.n;
import h7.a0;
import h7.y;
import h7.z;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import jlm.i;
import k7.f;
import kem.e0;
import kem.g0;
import kem.h0;
import kem.k0;
import kem.l;
import kem.l0;
import kem.m;
import kem.q0;
import kem.r0;
import kem.s;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.d0;
import org.bouncycastle.asn1.BERTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yhm.j;
import yhm.k;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes23.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f654a = 0;

    public static final i0 A(Context context, a0 a0Var, String str, boolean z) {
        if (a0Var instanceof z) {
            if (!Intrinsics.f(str, "__LottieInternalDefaultCacheKey__")) {
                return n.f(context, ((z) a0Var).f149831a, str);
            }
            int i = ((z) a0Var).f149831a;
            return n.f(context, i, n.m(i, context));
        }
        if (!(a0Var instanceof y)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return null;
        }
        String str2 = ((y) a0Var).f149830a;
        FileInputStream fileInputStream = new FileInputStream(str2);
        if (Intrinsics.f(str, "__LottieInternalDefaultCacheKey__")) {
            str = str2;
        }
        if (kotlin.text.a0.y(str2, "zip", false)) {
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            return n.a(str, new r(zipInputStream, str, 21), new a0.a(zipInputStream, 22));
        }
        if (!kotlin.text.a0.y(str2, "tgs", false)) {
            return n.a(str, new r(fileInputStream, str, 20), new a0.a(fileInputStream, 21));
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
        return n.a(str, new r(gZIPInputStream, str, 20), new a0.a(gZIPInputStream, 21));
    }

    public static final boolean B(mb.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return Intrinsics.f(dVar, mb.a.f204052a);
    }

    public static final List C(String str) {
        int i;
        Pair pair;
        Pair pair2;
        Lazy lazyC = j.c(k.NONE, new v(25));
        for (int i2 = 0; i2 <= d0.P(str); i2 = i) {
            Lazy lazyC2 = j.c(k.NONE, new v(26));
            Integer numValueOf = null;
            i = i2;
            while (true) {
                if (i <= d0.P(str)) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ',') {
                        ((ArrayList) lazyC.getValue()).add(new l(L(i2, numValueOf != null ? numValueOf.intValue() : i, str), lazyC2.isInitialized() ? (List) lazyC2.getValue() : f0.f322471a));
                        i++;
                    } else if (cCharAt != ';') {
                        i++;
                    } else {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i);
                        }
                        int i3 = i + 1;
                        int i5 = i3;
                        while (i5 <= d0.P(str)) {
                            char cCharAt2 = str.charAt(i5);
                            if (cCharAt2 == ',' || cCharAt2 == ';') {
                                D(lazyC2, str, i3, i5, "");
                                break;
                            }
                            if (cCharAt2 != '=') {
                                i5++;
                            } else {
                                int i6 = i5 + 1;
                                if (str.length() == i6) {
                                    pair2 = new Pair(Integer.valueOf(i6), "");
                                } else {
                                    char cCharAt3 = str.charAt(i6);
                                    char c2 = CoreConstants.DOUBLE_QUOTE_CHAR;
                                    if (cCharAt3 == '\"') {
                                        int i21 = i5 + 2;
                                        StringBuilder sb6 = new StringBuilder();
                                        while (i21 <= d0.P(str)) {
                                            char cCharAt4 = str.charAt(i21);
                                            if (cCharAt4 == c2) {
                                                int i22 = i21 + 1;
                                                int i32 = i22;
                                                while (i32 < str.length() && str.charAt(i32) == ' ') {
                                                    i32++;
                                                }
                                                if (i32 == str.length() || str.charAt(i32) == ';' || str.charAt(i32) == ',') {
                                                    pair = new Pair(Integer.valueOf(i22), sb6.toString());
                                                    break;
                                                }
                                            }
                                            if (cCharAt4 != '\\' || i21 >= d0.P(str) - 2) {
                                                sb6.append(cCharAt4);
                                                i21++;
                                            } else {
                                                sb6.append(str.charAt(i21 + 1));
                                                i21 += 2;
                                            }
                                            c2 = CoreConstants.DOUBLE_QUOTE_CHAR;
                                        }
                                        Integer numValueOf2 = Integer.valueOf(i21);
                                        String string = sb6.toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        pair = new Pair(numValueOf2, "\"" + string);
                                    } else {
                                        int i33 = i6;
                                        while (i33 <= d0.P(str)) {
                                            char cCharAt5 = str.charAt(i33);
                                            if (cCharAt5 == ',' || cCharAt5 == ';') {
                                                pair = new Pair(Integer.valueOf(i33), L(i6, i33, str));
                                                break;
                                            }
                                            i33++;
                                        }
                                        pair = new Pair(Integer.valueOf(i33), L(i6, i33, str));
                                    }
                                    pair2 = pair;
                                }
                                int iIntValue = ((Number) pair2.f186385a).intValue();
                                D(lazyC2, str, i3, i5, (String) pair2.f186386b);
                                i = iIntValue;
                            }
                        }
                        D(lazyC2, str, i3, i5, "");
                        i = i5;
                    }
                } else {
                    ((ArrayList) lazyC.getValue()).add(new l(L(i2, numValueOf != null ? numValueOf.intValue() : i, str), lazyC2.isInitialized() ? (List) lazyC2.getValue() : f0.f322471a));
                }
            }
        }
        return lazyC.isInitialized() ? (List) lazyC.getValue() : f0.f322471a;
    }

    public static final void D(Lazy lazy, String str, int i, int i2, String str2) {
        String strL = L(i, i2, str);
        if (strL.length() == 0) {
            return;
        }
        ((ArrayList) lazy.getValue()).add(new m(strL, str2));
    }

    public static kem.f0 E(String query) {
        int i;
        Intrinsics.checkNotNullParameter(query, "query");
        if (d0.P(query) < 0) {
            kem.f0.Companion.getClass();
            return e0.f183199b;
        }
        e0 e0Var = kem.f0.Companion;
        h0 h0Var = new h0();
        int iP = d0.P(query);
        int i2 = 0;
        int i3 = -1;
        if (iP >= 0) {
            int i5 = 0;
            i = 0;
            int i6 = -1;
            while (i2 != 1000) {
                char cCharAt = query.charAt(i5);
                if (cCharAt == '&') {
                    g(h0Var, query, i, i6, i5);
                    i = i5 + 1;
                    i2++;
                    i6 = -1;
                } else if (cCharAt == '=' && i6 == -1) {
                    i6 = i5;
                }
                if (i5 != iP) {
                    i5++;
                } else {
                    i3 = i6;
                }
            }
            Map values = (Map) h0Var.f224673a;
            Intrinsics.checkNotNullParameter(values, "values");
            return new kem.i0(true, values);
        }
        i = 0;
        if (i2 != 1000) {
            g(h0Var, query, i, i3, query.length());
        }
        Map values2 = (Map) h0Var.f224673a;
        Intrinsics.checkNotNullParameter(values2, "values");
        return new kem.i0(true, values2);
    }

    public static final h7.b F(Composer composer) {
        composer.startReplaceableGroup(2024497114);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2024497114, 0, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        composer.startReplaceableGroup(-610207850);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new h7.j();
            composer.updateRememberedValue(objRememberedValue);
        }
        h7.b bVar = (h7.b) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }

    public static final h7.e0 G(Object obj2, Object obj3, String[] keyPath, Composer composer) {
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        composer.startReplaceableGroup(-1788530187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1788530187, 6, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:46)");
        }
        composer.startReplaceableGroup(1613443961);
        boolean zChanged = composer.changed(keyPath);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new f((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(objRememberedValue);
        }
        f fVar = (f) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1613444012);
        boolean zChanged2 = composer.changed(fVar) | composer.changed(obj3);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new h7.e0(obj2, fVar, obj3);
            composer.updateRememberedValue(objRememberedValue2);
        }
        h7.e0 e0Var = (h7.e0) objRememberedValue2;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ub.a H(java.util.List r6, kotlin.jvm.functions.Function1 r7, androidx.compose.runtime.Composer r8, int r9) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1m.e.H(java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):ub.a");
    }

    public static wdm.a I(wdm.f originCall, Function1 responseContent) {
        kem.r responseHeaders = originCall.d().getHeaders();
        Intrinsics.checkNotNullParameter(originCall, "<this>");
        Intrinsics.checkNotNullParameter(responseHeaders, "headers");
        Intrinsics.checkNotNullParameter(responseContent, "content");
        vdm.b client = originCall.f296601a;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originCall, "originCall");
        Intrinsics.checkNotNullParameter(responseContent, "responseContent");
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        wdm.a aVar = new wdm.a(client);
        wdm.b bVar = new wdm.b(aVar, originCall.c());
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        aVar.f296602b = bVar;
        wdm.c cVar = new wdm.c(aVar, originCall.d(), responseContent, responseHeaders);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        aVar.f296603c = cVar;
        return aVar;
    }

    public static final void J(k0 k0Var, String value) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        k0Var.e(d0.W(value) ? f0.f322471a : value.equals("/") ? l0.f183213a : zhm.d0.f1(d0.m0(value, new char[]{'/'}, 6)));
    }

    public static final String K(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
        return string;
    }

    public static final String L(int i, int i2, String str) {
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return d0.F0(strSubstring).toString();
    }

    public static final void M(k0 k0Var, k0 url2) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        Intrinsics.checkNotNullParameter(url2, "url");
        k0Var.d = url2.d;
        k0Var.f(url2.f183205a);
        k0Var.g(url2.f183207c);
        k0Var.e(url2.f183209h);
        k0Var.e = url2.e;
        k0Var.f = url2.f;
        h0 value = new h0();
        f(value, url2.i);
        Intrinsics.checkNotNullParameter(value, "value");
        k0Var.i = value;
        k0Var.f183210j = new r0(value);
        String str = url2.f183208g;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        k0Var.f183208g = str;
        k0Var.f183206b = url2.f183206b;
    }

    public static final aim.f N(Throwable th10) {
        String strR;
        Intrinsics.checkNotNullParameter(th10, "<this>");
        aim.f builder = new aim.f();
        String strR2 = R(2048, th10.getMessage());
        if (strR2 == null || strR2.length() == 0) {
            Throwable cause = th10.getCause();
            String strR3 = R(2048, cause != null ? cause.getMessage() : null);
            if (strR3 == null) {
                strR3 = "Null or empty message found";
            }
            strR2 = aim.f.class.getSimpleName() + " - " + strR3;
        }
        String strR4 = R(8096, K(th10));
        StackTraceElement[] stackTrace = th10.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        if (stackTrace.length == 0) {
            strR = null;
        } else {
            StackTraceElement stackTraceElement = th10.getStackTrace()[0];
            int lineNumber = stackTraceElement.getLineNumber();
            numValueOf = lineNumber >= 0 ? Integer.valueOf(lineNumber) : null;
            strR = R(1024, stackTraceElement.getClassName());
        }
        String strR5 = R(1024, aim.f.class.getName());
        builder.put("message", strR2);
        builder.put("stackTrace", strR4);
        builder.put("programmingLanguage", "JAVA");
        builder.put("lineNumber", numValueOf);
        builder.put("className", strR);
        builder.put("exceptionName", strR5);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public static final byte[] O(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Intrinsics.f(charset, Charsets.UTF_8) ? kotlin.text.a0.x(str) : q(charset.newEncoder(), str, 0, str.length());
    }

    public static final int P(int i, int i2, String str) {
        while (i2 > i && CharsKt.e(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static final int Q(int i, int i2, String str) {
        while (i < i2 && CharsKt.e(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static final String R(int i, String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length <= i) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        List listN0 = d0.n0(url2, new String[]{"://"}, 0, 6);
        if (listN0.size() <= 1) {
            return url2;
        }
        return zhm.d0.k0(zhm.d0.E0(zhm.d0.V(listN0, 1), u.c(kotlin.text.f0.U0(16, (String) zhm.d0.b0(listN0)))), "://", null, null, 0, null, 62);
    }

    public static void T(jlm.a aVar, byte[] buffer) {
        int length = buffer.length;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        aVar.k(length, buffer);
    }

    public static void U(jlm.a aVar, CharSequence text) {
        int i;
        i segment;
        int i2;
        int length = text.length();
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String string = text.toString();
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        jlm.l.a(string.length(), 0, length);
        int i3 = 0;
        while (i3 < length) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            char cCharAt = string.charAt(i3);
            ref$IntRef.f186408a = cCharAt;
            if (cCharAt < 128) {
                i segment2 = aVar.j(1);
                byte[] bArr = segment2.f175881a;
                int i5 = -i3;
                int iMin = Math.min(length, segment2.a() + i3);
                byte b4 = (byte) ref$IntRef.f186408a;
                Intrinsics.checkNotNullParameter(segment2, "segment");
                bArr[segment2.f175883c + i3 + i5] = b4;
                i3++;
                while (i3 < iMin) {
                    char cCharAt2 = string.charAt(i3);
                    ref$IntRef.f186408a = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    Intrinsics.checkNotNullParameter(segment2, "segment");
                    bArr[segment2.f175883c + i3 + i5] = (byte) cCharAt2;
                    i3++;
                }
                int i6 = i5 + i3;
                if (i6 == 1) {
                    segment2.f175883c += i6;
                    aVar.f175871c += (long) i6;
                } else {
                    if (i6 < 0 || i6 > segment2.a()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i6 + ". Should be in 0.." + segment2.a()).toString());
                    }
                    if (i6 != 0) {
                        segment2.f175883c += i6;
                        aVar.f175871c += (long) i6;
                    } else if (jlm.l.d(segment2)) {
                        aVar.g();
                    }
                }
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                    segment = aVar.j(2);
                    int i21 = ref$IntRef.f186408a;
                    Intrinsics.checkNotNullParameter(segment, "segment");
                    byte[] bArr2 = segment.f175881a;
                    i2 = segment.f175883c;
                    bArr2[i2] = (byte) ((i21 >> 6) | 192);
                    bArr2[i2 + 1] = (byte) ((i21 & 63) | 128);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                    segment = aVar.j(3);
                    int i22 = ref$IntRef.f186408a;
                    byte b5 = (byte) ((i22 >> 12) | BERTags.FLAGS);
                    Intrinsics.checkNotNullParameter(segment, "segment");
                    byte[] bArr3 = segment.f175881a;
                    i2 = segment.f175883c;
                    bArr3[i2] = b5;
                    bArr3[i2 + 1] = (byte) (((i22 >> 6) & 63) | 128);
                    bArr3[i2 + 2] = (byte) ((i22 & 63) | 128);
                } else {
                    int i32 = i3 + 1;
                    char cCharAt3 = i32 < length ? string.charAt(i32) : (char) 0;
                    int i33 = ref$IntRef.f186408a;
                    if (i33 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        aVar.m((byte) 63);
                        i3 = i32;
                    } else {
                        int i43 = (((i33 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        i segment3 = aVar.j(4);
                        Intrinsics.checkNotNullParameter(segment3, "segment");
                        byte[] bArr4 = segment3.f175881a;
                        int i59 = segment3.f175883c;
                        bArr4[i59] = (byte) ((i43 >> 18) | 240);
                        bArr4[i59 + 1] = (byte) (((i43 >> 12) & 63) | 128);
                        bArr4[i59 + 2] = (byte) (((i43 >> 6) & 63) | 128);
                        bArr4[i59 + 3] = (byte) ((i43 & 63) | 128);
                        segment3.f175883c = i59 + 4;
                        aVar.f175871c += (long) 4;
                        i3 += 2;
                    }
                }
                segment.f175883c = i2 + i;
                aVar.f175871c += (long) i;
                i3++;
            }
        }
    }

    public static final Logger a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Logger logger = LoggerFactory.getLogger(name);
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        return logger;
    }

    public static final q0 b(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return l0.b(new k0(), urlString).b();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void c(k0 k0Var, StringBuilder sb6) throws IOException {
        List listC;
        sb6.append(k0Var.d().f183217a);
        String str = k0Var.d().f183217a;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    Intrinsics.checkNotNullParameter(k0Var, "<this>");
                    StringBuilder sb9 = new StringBuilder();
                    String str2 = k0Var.e;
                    String str3 = k0Var.f;
                    Intrinsics.checkNotNullParameter(sb9, "<this>");
                    if (str2 != null) {
                        sb9.append(str2);
                        if (str3 != null) {
                            sb9.append(CoreConstants.COLON_CHAR);
                            sb9.append(str3);
                        }
                        sb9.append("@");
                    }
                    CharSequence string = sb9.toString();
                    CharSequence charSequence = k0Var.f183205a;
                    sb6.append(":");
                    sb6.append(string);
                    sb6.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = k0Var.f183205a;
                    sb6.append(":");
                    sb6.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    CharSequence charSequence3 = k0Var.f183205a;
                    sb6.append(":");
                    sb6.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    CharSequence charSequence4 = k0Var.f183205a;
                    String strV = v(k0Var);
                    sb6.append("://");
                    sb6.append(charSequence4);
                    if (!d0.r0('/', strV)) {
                        sb6.append('/');
                    }
                    sb6.append((CharSequence) strV);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = k0Var.f183205a;
                    sb6.append(":");
                    sb6.append(charSequence5);
                    return;
                }
                break;
        }
        sb6.append("://");
        sb6.append(t(k0Var));
        String encodedPath = v(k0Var);
        g0 encodedQueryParameters = k0Var.i;
        boolean z = k0Var.f183206b;
        Intrinsics.checkNotNullParameter(sb6, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQueryParameters, "encodedQueryParameters");
        if (!d0.W(encodedPath) && !kotlin.text.a0.H(encodedPath, "/", false)) {
            sb6.append('/');
        }
        sb6.append((CharSequence) encodedPath);
        if (!encodedQueryParameters.isEmpty() || z) {
            sb6.append("?");
        }
        Set<Map.Entry> setEntries = encodedQueryParameters.entries();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntries) {
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listC = u.c(new Pair(str4, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new Pair(str4, (String) it8.next()));
                }
                listC = arrayList2;
            }
            zhm.a0.x(listC, arrayList);
        }
        zhm.d0.j0(arrayList, sb6, "&", null, null, new qh(9), 60);
        if (k0Var.f183208g.length() > 0) {
            sb6.append('#');
            sb6.append(k0Var.f183208g);
        }
    }

    public static final void d(String str, Object obj2, Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (obj2 == null || str.length() == 0) {
            return;
        }
        map.put(str, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object e(h7.b bVar, d7.j jVar, int i, float f, h7.u uVar, float f4, h7.r rVar, gim.i iVar, int i2) {
        h7.j jVar2 = (h7.j) bVar;
        Object objMutate$default = MutatorMutex.mutate$default(jVar2.o, null, new h7.f(jVar2, ((h7.j) bVar).e(), i, (i2 & 8) != 0 ? ((Boolean) ((h7.j) bVar).d.getValue()).booleanValue() : false, f, uVar, jVar, f4, false, false, rVar, null), iVar, 1, null);
        return objMutate$default == fim.a.COROUTINE_SUSPENDED ? objMutate$default : Unit.f186387a;
    }

    public static final void f(oem.n nVar, oem.n builder) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (Map.Entry entry : builder.entries()) {
            nVar.c((List) entry.getValue(), (String) entry.getKey());
        }
    }

    public static final void g(h0 h0Var, String str, int i, int i2, int i3) {
        if (i2 == -1) {
            int iQ = Q(i, i3, str);
            int iP = P(iQ, i3, str);
            if (iP > iQ) {
                String strSubstring = str.substring(iQ, iP);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                h0Var.c(f0.f322471a, strSubstring);
                return;
            }
            return;
        }
        int iQ2 = Q(i, i2, str);
        int iP2 = P(iQ2, i2, str);
        if (iP2 > iQ2) {
            String strSubstring2 = str.substring(iQ2, iP2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            int iQ3 = Q(i2 + 1, i3, str);
            String strSubstring3 = str.substring(iQ3, P(iQ3, i3, str));
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            h0Var.d(strSubstring2, strSubstring3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(hem.c r5, java.nio.charset.Charset r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof hem.e
            if (r0 == 0) goto L13
            r0 = r7
            hem.e r0 = (hem.e) r0
            int r1 = r0.f151729w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151729w = r1
            goto L18
        L13:
            hem.e r0 = new hem.e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151729w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.nio.charset.CharsetDecoder r5 = r0.u
            yhm.o.b(r7)
            goto L63
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            java.nio.charset.Charset r7 = j(r5)
            if (r7 != 0) goto L3b
            goto L3c
        L3b:
            r6 = r7
        L3c:
            java.nio.charset.CharsetDecoder r6 = r6.newDecoder()
            wdm.f r5 = r5.a()
            kotlin.jvm.internal.p0 r7 = kotlin.jvm.internal.o0.f186429a
            java.lang.Class<jlm.k> r2 = jlm.k.class
            kotlin.reflect.KClass r7 = r7.b(r2)
            kotlin.reflect.KType r2 = kotlin.jvm.internal.o0.b(r2)     // Catch: java.lang.Throwable -> L51
            goto L52
        L51:
            r2 = 0
        L52:
            tem.a r4 = new tem.a
            r4.<init>(r7, r2)
            r0.u = r6
            r0.f151729w = r3
            java.lang.Object r7 = r5.a(r4, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            r5 = r6
        L63:
            if (r7 == 0) goto L6f
            jlm.k r7 = (jlm.k) r7
            kotlin.jvm.internal.Intrinsics.h(r5)
            java.lang.String r5 = o(r5, r7)
            return r5
        L6f:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.io.Source"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a1m.e.h(hem.c, java.nio.charset.Charset, gim.c):java.lang.Object");
    }

    public static final oem.d i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new oem.d(str);
    }

    public static final Charset j(hem.c cVar) {
        kem.i iVarA;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        kem.r headers = cVar.getHeaders();
        List list = kem.u.f183239a;
        String str = headers.get("Content-Type");
        if (str != null) {
            kem.i.Companion.getClass();
            iVarA = kem.f.a(str);
        } else {
            iVarA = null;
        }
        if (iVarA != null) {
            return k(iVarA);
        }
        return null;
    }

    public static final Charset k(kem.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String name = iVar.a("charset");
        if (name == null) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(Charsets.f187886a, "<this>");
            Intrinsics.checkNotNullParameter(name, "name");
            Charset charsetForName = Charset.forName(name);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            return charsetForName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final kem.i l(kem.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        s headers = wVar.getHeaders();
        List list = kem.u.f183239a;
        String strG = headers.g("Content-Type");
        if (strG == null) {
            return null;
        }
        kem.i.Companion.getClass();
        return kem.f.a(strG);
    }

    public static final bem.c m(String name, Function0 createConfiguration, Function1 body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createConfiguration, "createConfiguration");
        Intrinsics.checkNotNullParameter(body, "body");
        return new bem.c(name, createConfiguration, body);
    }

    public static final bem.c n(String name, Function1 body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        return m(name, new v(3), body);
    }

    public static final String o(CharsetDecoder charsetDecoder, jlm.k input) throws EOFException {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder dst = new StringBuilder((int) Math.min(Integer.MAX_VALUE, input.getBuffer().f175871c));
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Charset charset = charsetDecoder.charset();
        Intrinsics.h(charset);
        if (charset.equals(Charsets.UTF_8)) {
            dst.append((CharSequence) jlm.l.g(input));
        } else {
            x(input);
            Intrinsics.checkNotNullParameter(input, "<this>");
            Intrinsics.checkNotNullParameter(input, "<this>");
            byte[] byteArray = jlm.l.f(input, -1);
            Intrinsics.checkNotNullParameter(byteArray, "array");
            klm.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            klm.b bVar = new klm.b(byteArray);
            Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
            Charset charset2 = charsetDecoder.charset();
            Intrinsics.h(charset2);
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Intrinsics.checkNotNullParameter(charset2, "charset");
            dst.append((CharSequence) new String(byteArray, charset2));
        }
        return dst.toString();
    }

    public static final kem.f0 p(oem.n parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        h0 h0Var = new h0();
        for (String str : parameters.names()) {
            List listB = parameters.b(str);
            if (listB == null) {
                listB = f0.f322471a;
            }
            String strD = kem.b.d(0, 0, 15, str);
            List list = listB;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(kem.b.d(0, 0, 11, (String) it8.next()));
            }
            h0Var.c(arrayList, strD);
        }
        Map values = (Map) h0Var.f224673a;
        Intrinsics.checkNotNullParameter(values, "values");
        return new kem.i0(true, values);
    }

    public static final byte[] q(CharsetEncoder charsetEncoder, CharSequence input, int i, int i2) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof String) {
            if (i == 0) {
                String str = (String) input;
                if (i2 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    return bytes;
                }
            }
            String strSubstring = ((String) input).substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            return bytes2;
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(input, i, i2));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final void r(CharsetEncoder charsetEncoder, jlm.a dst, CharSequence input, int i, int i2) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(dst, "destination");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i >= i2) {
            return;
        }
        do {
            Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(dst, "dst");
            byte[] bArrQ = q(charsetEncoder, input, i, i2);
            dst.k(bArrQ.length, bArrQ);
            int length = bArrQ.length;
            if (length < 0) {
                throw new IllegalStateException("Check failed.");
            }
            i += length;
        } while (i < i2);
    }

    public static final String s(mb.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (Intrinsics.f(dVar, mb.b.f204053a)) {
            return "production";
        }
        if (Intrinsics.f(dVar, mb.c.f204054a)) {
            return "sandbox";
        }
        if (Intrinsics.f(dVar, mb.a.f204052a)) {
            return "mock";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String t(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        StringBuilder sb6 = new StringBuilder();
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        StringBuilder sb9 = new StringBuilder();
        String str = k0Var.e;
        String str2 = k0Var.f;
        Intrinsics.checkNotNullParameter(sb9, "<this>");
        if (str != null) {
            sb9.append(str);
            if (str2 != null) {
                sb9.append(CoreConstants.COLON_CHAR);
                sb9.append(str2);
            }
            sb9.append("@");
        }
        sb6.append(sb9.toString());
        sb6.append(k0Var.f183205a);
        int i = k0Var.f183207c;
        if (i != 0 && i != k0Var.d().f183218b) {
            sb6.append(":");
            sb6.append(String.valueOf(k0Var.f183207c));
        }
        return sb6.toString();
    }

    public static final String u(long j2) {
        Date date = new Date(j2);
        Intrinsics.checkNotNullParameter(date, "date");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", new Locale("en"));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(date)");
        return str;
    }

    public static final String v(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        List list = k0Var.f183209h;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) zhm.d0.b0(list)).length() == 0 ? "/" : (String) zhm.d0.b0(list) : zhm.d0.k0(list, "/", null, null, 0, null, 62);
    }

    public static final String w(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        String strName = charset.name();
        Intrinsics.checkNotNullExpressionValue(strName, "name(...)");
        return strName;
    }

    public static final long x(jlm.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return kVar.getBuffer().f175871c;
    }

    public static final boolean y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullExpressionValue("e", "TAG");
        boolean z = false;
        z0m.j.e("e", "Checking tracker internet connectivity.", new Object[0]);
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e) {
                Intrinsics.checkNotNullExpressionValue("e", "TAG");
                z0m.j.b("e", "Security exception checking connection: %s", e.toString());
                return true;
            }
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        }
        Intrinsics.checkNotNullExpressionValue("e", "TAG");
        z0m.j.a("e", "Tracker connection online: %s", Boolean.valueOf(z));
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(android.content.Context r14, h7.a0 r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, gim.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1m.e.z(android.content.Context, h7.a0, java.lang.String, java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
