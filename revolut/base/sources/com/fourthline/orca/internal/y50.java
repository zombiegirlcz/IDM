package com.fourthline.orca.internal;

import com.fourthline.orca.internal.i5;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public final class y50 implements j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f35165a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35166a = new a("VALID", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f35167b = new a("PARTIAL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f35168c = new a("INVALID", 2);
        private static final /* synthetic */ a[] d;
        private static final /* synthetic */ EnumEntries e;

        static {
            a[] aVarArrA = a();
            d = aVarArrA;
            e = vc.s.n(aVarArrA);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f35166a, f35167b, f35168c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f35168c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f35167b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f35166a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y50(List ibanConfig) {
        Intrinsics.checkNotNullParameter(ibanConfig, "ibanConfig");
        this.f35165a = ibanConfig;
    }

    private final boolean b(String str) {
        return new Regex("^[A-Za-z]{1,2}").a(str);
    }

    private final a c(String str) {
        String upperCase = kotlin.text.a0.D(str, " ", "", false).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        for (int i = 0; i < upperCase.length(); i++) {
            if (!Character.isLetterOrDigit(upperCase.charAt(i))) {
                return a.f35168c;
            }
        }
        String str2 = upperCase.length() > 4 ? kotlin.text.f0.N0(4, upperCase) + kotlin.text.f0.U0(4, upperCase) : upperCase;
        StringBuilder sb6 = new StringBuilder();
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str2.charAt(i2);
            sb6.append(Character.isDigit(cCharAt) ? Character.valueOf(cCharAt) : String.valueOf(cCharAt - '7'));
        }
        String string = sb6.toString();
        BigInteger bigIntegerRemainder = BigInteger.ZERO;
        int length2 = string.length();
        String str3 = "";
        for (int i3 = 0; i3 < length2; i3++) {
            str3 = str3 + string.charAt(i3);
            if (str3.length() > 8) {
                BigInteger bigInteger = new BigInteger(bigIntegerRemainder.toString() + str3);
                BigInteger bigIntegerValueOf = BigInteger.valueOf(97L);
                Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
                bigIntegerRemainder = bigInteger.remainder(bigIntegerValueOf);
                Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "remainder(...)");
                str3 = "";
            }
        }
        if (str3.length() > 0) {
            BigInteger bigInteger2 = new BigInteger(bigIntegerRemainder.toString() + str3);
            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(97L);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf2, "valueOf(...)");
            bigIntegerRemainder = bigInteger2.remainder(bigIntegerValueOf2);
            Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "remainder(...)");
        }
        int length3 = upperCase.length();
        if (15 <= length3 && length3 < 35 && Intrinsics.f(bigIntegerRemainder, BigInteger.ONE)) {
            return a.f35166a;
        }
        if (upperCase.length() < 34) {
            BigInteger bigInteger3 = BigInteger.ZERO;
            BigInteger bigIntegerValueOf3 = BigInteger.valueOf(96L);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf3, "valueOf(...)");
            if (vim.i.b(bigInteger3, bigIntegerValueOf3).contains(bigIntegerRemainder)) {
                return a.f35167b;
            }
        }
        return a.f35168c;
    }

    @Override // com.fourthline.orca.internal.j5
    public i5 a(String input) {
        Object next;
        Intrinsics.checkNotNullParameter(input, "input");
        if (kotlin.text.d0.W(input)) {
            return i5.f.f29504a;
        }
        if (!b(input)) {
            return i5.e.f29502a;
        }
        Iterator it8 = this.f35165a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (kotlin.text.a0.H(input, ((f5) next).getCountryCode(), false)) {
                break;
            }
        }
        f5 f5Var = (f5) next;
        return input.length() == 1 ? new i5.a(Integer.valueOf(R.string.shared_validation_iban_country_code)) : f5Var != null ? a(input, f5Var) : i5.b.f29494a;
    }

    private final i5 a(String str, f5 f5Var) {
        if (str.length() == f5Var.getLength()) {
            int i = b.$EnumSwitchMapping$0[c(str).ordinal()];
            if (i == 1) {
                return new i5.c(true, f5Var);
            }
            if (i == 2) {
                return new i5.c(true, f5Var);
            }
            if (i == 3) {
                return new i5.g(f5Var);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new i5.d(str.length() > f5Var.getLength(), f5Var);
    }
}
