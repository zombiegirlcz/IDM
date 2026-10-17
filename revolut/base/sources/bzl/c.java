package bzl;

import android.text.InputFilter;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements InputFilter {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f20057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Character f20058c;
    public final int d;
    public final int e;

    public c(Locale locale) {
        char cK = oc.c.k(locale);
        Character chValueOf = Character.valueOf(oc.c.l(locale));
        Intrinsics.checkNotNullParameter(locale, "locale");
        int groupingSize = oc.c.i(locale).getGroupingSize();
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f20056a = 2;
        this.f20057b = cK;
        this.f20058c = chValueOf;
        this.d = groupingSize;
        this.e = 11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!c.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.uicomponent.text.DefaultAmountInputFilter");
        c cVar = (c) obj2;
        return this.f20056a == cVar.f20056a && this.f20057b == cVar.f20057b && Intrinsics.f(this.f20058c, cVar.f20058c) && this.d == cVar.d && this.e == cVar.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r9, int r10, int r11, android.text.Spanned r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bzl.c.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    public final int hashCode() {
        int iHashCode = (Character.hashCode(this.f20057b) + (Integer.hashCode(this.f20056a) * 31)) * 31;
        Character ch5 = this.f20058c;
        return Integer.hashCode(this.e) + j6.a.b(this.d, (iHashCode + (ch5 != null ? ch5.hashCode() : 0)) * 31, 31);
    }
}
