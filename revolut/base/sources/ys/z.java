package ys;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class z {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntRange f316370a = new IntRange(1, 2, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f316371b;

    public static final class a {
        private a() {
        }
    }

    static {
        x xVar = x.TAISHO;
        LocalDate localDateOf = LocalDate.of(1912, Month.JULY, 30);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
        Month month = Month.DECEMBER;
        LocalDate localDateOf2 = LocalDate.of(1926, month, 24);
        Intrinsics.checkNotNullExpressionValue(localDateOf2, "of(...)");
        c0 c0Var = new c0(xVar, localDateOf, localDateOf2);
        x xVar2 = x.SHOWA;
        LocalDate localDateOf3 = LocalDate.of(1926, month, 25);
        Intrinsics.checkNotNullExpressionValue(localDateOf3, "of(...)");
        Month month2 = Month.JANUARY;
        LocalDate localDateOf4 = LocalDate.of(1989, month2, 7);
        Intrinsics.checkNotNullExpressionValue(localDateOf4, "of(...)");
        c0 c0Var2 = new c0(xVar2, localDateOf3, localDateOf4);
        x xVar3 = x.HEISEI;
        LocalDate localDateOf5 = LocalDate.of(1989, month2, 8);
        Intrinsics.checkNotNullExpressionValue(localDateOf5, "of(...)");
        LocalDate localDateOf6 = LocalDate.of(2019, Month.APRIL, 30);
        Intrinsics.checkNotNullExpressionValue(localDateOf6, "of(...)");
        c0 c0Var3 = new c0(xVar3, localDateOf5, localDateOf6);
        x xVar4 = x.REIWA;
        LocalDate localDateOf7 = LocalDate.of(2019, Month.MAY, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf7, "of(...)");
        LocalDate MAX = LocalDate.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        f316371b = zhm.v.k(c0Var, c0Var2, c0Var3, new c0(xVar4, localDateOf7, MAX));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r6.compareTo((java.lang.Object) r8) <= 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ys.a0 a(ys.x r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "calendar"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "year"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "month"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "day"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            ys.x r0 = ys.x.GREGORIAN
            r1 = 1
            if (r5 != r0) goto L20
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r2 = 4
            r0.<init>(r2, r2, r1)
            goto L26
        L20:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r2 = 2
            r0.<init>(r1, r2, r1)
        L26:
            boolean r0 = b(r6, r0)
            r2 = 0
            if (r0 == 0) goto Lb1
            kotlin.ranges.IntRange r0 = ys.z.f316370a
            boolean r3 = b(r7, r0)
            if (r3 == 0) goto Lb1
            boolean r0 = b(r8, r0)
            if (r0 != 0) goto L3d
            goto Lb1
        L3d:
            java.lang.Integer r6 = kotlin.text.z.m(r6)
            if (r6 == 0) goto Lb1
            int r6 = r6.intValue()
            java.lang.Integer r7 = kotlin.text.z.m(r7)
            if (r7 == 0) goto Lb1
            int r7 = r7.intValue()
            java.lang.Integer r8 = kotlin.text.z.m(r8)
            if (r8 == 0) goto Lb1
            int r8 = r8.intValue()
            if (r6 >= r1) goto L5e
            goto Lb1
        L5e:
            java.util.List r0 = ys.z.f316371b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r0.next()
            r4 = r3
            ys.c0 r4 = (ys.c0) r4
            ys.x r4 = r4.f316342a
            if (r4 != r5) goto L66
            goto L79
        L78:
            r3 = r2
        L79:
            ys.c0 r3 = (ys.c0) r3
            if (r3 == 0) goto L86
            java.time.LocalDate r0 = r3.f316343b
            int r0 = r0.getYear()
            int r0 = r0 + r6
            int r6 = r0 + (-1)
        L86:
            java.time.LocalDate r6 = java.time.LocalDate.of(r6, r7, r8)     // Catch: java.time.DateTimeException -> Lb1
            if (r3 == 0) goto L9f
            java.time.LocalDate r7 = r3.f316343b
            java.time.LocalDate r8 = r3.f316344c
            kotlin.jvm.internal.Intrinsics.h(r6)
            int r7 = r6.compareTo(r7)
            if (r7 < 0) goto Lb1
            int r7 = r6.compareTo(r8)
            if (r7 > 0) goto Lb1
        L9f:
            ys.a0 r7 = new ys.a0
            kotlin.jvm.internal.Intrinsics.h(r6)
            ys.x r8 = ys.x.GREGORIAN
            if (r5 != r8) goto Lab
            omi.b r5 = omi.b.GREGORIAN
            goto Lad
        Lab:
            omi.b r5 = omi.b.JAPANESE
        Lad:
            r7.<init>(r6, r5)
            return r7
        Lb1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ys.z.a(ys.x, java.lang.String, java.lang.String, java.lang.String):ys.a0");
    }

    public static boolean b(String str, IntRange intRange) {
        int i = intRange.f186448a;
        int i2 = intRange.f186449b;
        int length = str.length();
        if (i <= length && length <= i2) {
            for (int i3 = 0; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if ('0' <= cCharAt && cCharAt < ':') {
                }
            }
            return true;
        }
        return false;
    }
}
