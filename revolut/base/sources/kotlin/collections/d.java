package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.s;
import nkm.t;
import s8h.h;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.l;
import zhm.p;
import zhm.q;
import zhm.q0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public class d extends p {
    public static ArrayList A0(Object[] objArr, Object[] other) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(objArr[i], other[i]));
        }
        return arrayList;
    }

    public static Iterable D(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length == 0 ? f0.f322471a : new q(objArr);
    }

    public static Sequence E(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length == 0 ? t.d() : new lim.q(objArr, 2);
    }

    public static boolean F(char[] cArr, char c2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c2 == cArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static boolean G(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return X(iArr, i) >= 0;
    }

    public static boolean H(long[] jArr, long j2) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (j2 == jArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static boolean I(Object[] objArr, Object obj2) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return Y(objArr, obj2) >= 0;
    }

    public static List J(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length > 128) {
            length = 128;
        }
        LinkedHashSet destination = new LinkedHashSet(q0.b(length));
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (char c2 : cArr) {
            destination.add(Character.valueOf(c2));
        }
        return d0.d1(destination);
    }

    public static List K(int i, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " is less than zero.").toString());
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(j6.a.l(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            return f0.f322471a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return v0(objArr);
        }
        if (length == 1) {
            return u.c(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = length2 - length; i2 < length2; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static List L(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        M(objArr, arrayList);
        return arrayList;
    }

    public static void M(Object[] objArr, AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                destination.add(obj2);
            }
        }
    }

    public static int N(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object O(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object P(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static IntRange Q(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static IntRange R(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new IntRange(0, T(objArr), 1);
    }

    public static int S(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int T(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Float U(float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i < 0 || i >= fArr.length) {
            return null;
        }
        return Float.valueOf(fArr[i]);
    }

    public static Integer V(int i, int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object W(int i, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int X(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int Y(Object[] objArr, Object obj2) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i = 0;
        if (obj2 == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj2.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void Z(Object[] objArr, StringBuilder buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, Function1 function1) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append(prefix);
        int i = 0;
        for (Object obj2 : objArr) {
            i++;
            if (i > 1) {
                buffer.append(separator);
            }
            s.a(buffer, obj2, function1);
        }
        buffer.append(postfix);
    }

    public static String a0(byte[] bArr, String separator, String prefix, String postfix, Function1 function1, int i) {
        if ((i & 1) != 0) {
            separator = ", ";
        }
        if ((i & 2) != 0) {
            prefix = "";
        }
        if ((i & 4) != 0) {
            postfix = "";
        }
        int i2 = (i & 8) != 0 ? -1 : 1;
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) prefix);
        int i3 = 0;
        for (byte b4 : bArr) {
            i3++;
            if (i3 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Byte.valueOf(b4)));
            } else {
                buffer.append((CharSequence) String.valueOf((int) b4));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append((CharSequence) "...");
        }
        buffer.append((CharSequence) postfix);
        return buffer.toString();
    }

    public static String b0(char[] cArr, Function1 function1, int i) {
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter("", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter("", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i2 = 0;
        for (char c2 : cArr) {
            i2++;
            if (i2 > 1) {
                buffer.append((CharSequence) "");
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Character.valueOf(c2)));
            } else {
                buffer.append(c2);
            }
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public static String c0(int[] iArr, String separator, h hVar, int i) {
        if ((i & 1) != 0) {
            separator = ", ";
        }
        String prefix = (i & 2) != 0 ? "" : "[";
        String postfix = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            hVar = null;
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) prefix);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (hVar != null) {
                buffer.append((CharSequence) hVar.invoke(Integer.valueOf(i3)));
            } else {
                buffer.append((CharSequence) String.valueOf(i3));
            }
        }
        buffer.append((CharSequence) postfix);
        return buffer.toString();
    }

    public static String d0(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String postfix = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb6 = new StringBuilder();
        Z(objArr, sb6, separator, prefix, postfix, function1);
        return sb6.toString();
    }

    public static Object e0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr[objArr.length - 1];
    }

    public static Object f0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static float g0(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMax = fArr[0];
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMax;
    }

    public static Object[] h0(Object[] reference) {
        Intrinsics.checkNotNullParameter(reference, "<this>");
        if (reference.length == 0) {
            return reference;
        }
        int length = reference.length;
        Intrinsics.checkNotNullParameter(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), length);
        Intrinsics.i(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        Object[] objArr = (Object[]) objNewInstance;
        Intrinsics.checkNotNullParameter(reference, "<this>");
        int length2 = reference.length - 1;
        if (length2 >= 0) {
            int i = 0;
            while (true) {
                objArr[length2 - i] = reference[i];
                if (i == length2) {
                    break;
                }
                i++;
            }
        }
        return objArr;
    }

    public static char i0(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object j0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List k0(byte[] bArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? f0.f322471a : p.d(p.m(bArr, indices.f186448a, indices.f186449b + 1));
    }

    public static byte[] l0(byte[] bArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new byte[0] : p.m(bArr, indices.f186448a, indices.f186449b + 1);
    }

    public static List m0(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        Character[] chArr2 = chArr;
        Intrinsics.checkNotNullParameter(chArr2, "<this>");
        if (chArr2.length > 1) {
            Arrays.sort(chArr2);
        }
        return p.c(chArr);
    }

    public static List n0(Comparator comparator, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
            p.B(comparator, objArr);
        }
        return p.c(objArr);
    }

    public static List o0(int i, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return f0.f322471a;
        }
        if (i >= bArr.length) {
            return q0(bArr);
        }
        if (i == 1) {
            return u.c(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (byte b4 : bArr) {
            arrayList.add(Byte.valueOf(b4));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static final void p0(Object[] objArr, AbstractSet destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj2 : objArr) {
            destination.add(obj2);
        }
    }

    public static List q0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return f0.f322471a;
        }
        if (length == 1) {
            return u.c(Byte.valueOf(bArr[0]));
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b4 : bArr) {
            arrayList.add(Byte.valueOf(b4));
        }
        return arrayList;
    }

    public static List r0(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return f0.f322471a;
        }
        if (length == 1) {
            return u.c(Double.valueOf(dArr[0]));
        }
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static List s0(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return f0.f322471a;
        }
        if (length == 1) {
            return u.c(Float.valueOf(fArr[0]));
        }
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List t0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return f0.f322471a;
        }
        if (length == 1) {
            return u.c(Integer.valueOf(iArr[0]));
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List u0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return f0.f322471a;
        }
        if (length == 1) {
            return u.c(Long.valueOf(jArr[0]));
        }
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static List v0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? x0(objArr) : u.c(objArr[0]) : f0.f322471a;
    }

    public static List w0(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return f0.f322471a;
        }
        if (length == 1) {
            return u.c(Boolean.valueOf(zArr[0]));
        }
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static ArrayList x0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(new l(false, objArr));
    }

    public static Set y0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return h0.f322473a;
        }
        if (length == 1) {
            return y0.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(q0.b(objArr.length));
        p0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static q z0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new q(new zh0.b(objArr, 4));
    }
}
