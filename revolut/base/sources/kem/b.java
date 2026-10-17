package kem;

import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.internal.un1;
import com.google.common.primitives.UnsignedBytes;
import io.ktor.http.URLDecodeException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import zhm.a1;

/* JADX INFO: loaded from: classes23.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f183183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f183184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f183185c;
    public static final Set d;
    public static final ArrayList e;

    static {
        Character chValueOf = Character.valueOf(CoreConstants.COMMA_CHAR);
        Character chValueOf2 = Character.valueOf(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        Character chValueOf3 = Character.valueOf(CoreConstants.LEFT_PARENTHESIS_CHAR);
        Character chValueOf4 = Character.valueOf(CoreConstants.SINGLE_QUOTE_CHAR);
        Character chValueOf5 = Character.valueOf(CoreConstants.COLON_CHAR);
        Character chValueOf6 = Character.valueOf(CoreConstants.DOLLAR);
        Character chValueOf7 = Character.valueOf(CoreConstants.DOT);
        Character chValueOf8 = Character.valueOf(CoreConstants.DASH_CHAR);
        ArrayList arrayListE0 = zhm.d0.E0(new kotlin.ranges.b('0', '9'), zhm.d0.C0(new kotlin.ranges.b('a', 'z'), new kotlin.ranges.b('A', 'Z')));
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListE0, 10));
        Iterator it8 = arrayListE0.iterator();
        while (it8.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it8.next()).charValue()));
        }
        f183183a = zhm.d0.i1(arrayList);
        f183184b = zhm.d0.i1(zhm.d0.E0(new kotlin.ranges.b('0', '9'), zhm.d0.C0(new kotlin.ranges.b('a', 'z'), new kotlin.ranges.b('A', 'Z'))));
        zhm.d0.i1(zhm.d0.E0(new kotlin.ranges.b('0', '9'), zhm.d0.C0(new kotlin.ranges.b('a', 'f'), new kotlin.ranges.b('A', 'F'))));
        Character[] elements = {chValueOf5, '/', '?', '#', '[', ']', '@', '!', chValueOf6, '&', chValueOf4, chValueOf3, chValueOf2, '*', chValueOf, ';', '=', chValueOf8, chValueOf7, '_', '~', '+'};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(setY0, 10));
        Iterator it9 = setY0.iterator();
        while (it9.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it9.next()).charValue()));
        }
        f183185c = arrayList2;
        Character[] elements2 = {chValueOf5, '@', '!', chValueOf6, '&', chValueOf4, chValueOf3, chValueOf2, '*', '+', chValueOf, ';', '=', chValueOf8, chValueOf7, '_', '~'};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        d = kotlin.collections.d.y0(elements2);
        Set set = f183184b;
        Character[] elements3 = {'!', '#', chValueOf6, '&', '+', chValueOf8, chValueOf7, '^', '_', '`', '|', '~'};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        a1.l(set, kotlin.collections.d.y0(elements3));
        List listK = zhm.v.k(chValueOf8, chValueOf7, '_', '~');
        ArrayList arrayList3 = new ArrayList(zhm.w.t(listK, 10));
        Iterator it10 = listK.iterator();
        while (it10.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it10.next()).charValue()));
        }
        e = arrayList3;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        if ('a' > c2 || c2 >= 'g') {
            return -1;
        }
        return c2 - 'W';
    }

    public static final String b(String str, int i, int i2, boolean z) throws URLDecodeException {
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z && cCharAt == '+')) {
                int i5 = i2 - i;
                if (i5 > 255) {
                    i5 /= 3;
                }
                StringBuilder sb6 = new StringBuilder(i5);
                if (i3 > i) {
                    sb6.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char cCharAt2 = str.charAt(i3);
                    if (z && cCharAt2 == '+') {
                        sb6.append(zsc.p.SPACE_CHAR);
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i6 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i21 = i3 + 2;
                            if (i21 >= i2) {
                                throw new URLDecodeException("Incomplete trailing HEX escape: " + str.subSequence(i3, str.length()).toString() + ", in " + ((Object) str) + " at " + i3);
                            }
                            int i22 = i3 + 1;
                            int iA = a(str.charAt(i22));
                            int iA2 = a(str.charAt(i21));
                            if (iA == -1 || iA2 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i22) + str.charAt(i21) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i6] = (byte) ((iA * 16) + iA2);
                            i3 += 3;
                            i6++;
                        }
                        sb6.append(kotlin.text.a0.v(i6, bArr));
                    } else {
                        sb6.append(cCharAt2);
                    }
                    i3++;
                }
                String string = sb6.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            i3++;
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String c(String str) {
        int length = str.length();
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return b(str, 0, length, false);
    }

    public static String d(int i, int i2, int i3, String str) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return b(str, i, i2, z);
    }

    public static final String e(String input, boolean z) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(input, "<this>");
        StringBuilder sb6 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "newEncoder(...)");
        int length = input.length();
        Intrinsics.checkNotNullParameter(charsetEncoderNewEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        jlm.a aVar = new jlm.a();
        a1m.e.r(charsetEncoderNewEncoder, aVar, input, 0, length);
        f(aVar, new un1(sb6, z, 5));
        return sb6.toString();
    }

    public static final void f(jlm.a aVar, Function1 function1) {
        aem.j block = new aem.j(2, function1);
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        while (!aVar.J()) {
            block.invoke(aVar);
        }
    }

    public static final String g(byte b4) {
        int i = (b4 & UnsignedBytes.MAX_VALUE) >> 4;
        int i2 = b4 & 15;
        return kotlin.text.a0.r(new char[]{CoreConstants.PERCENT_CHAR, (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }
}
