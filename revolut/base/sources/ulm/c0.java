package ulm;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f281069l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f281070m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f281071n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f281073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f281074c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f281075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f281076h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f281077j;

    public c0(String str, String str2, long j2, String str3, String str4, boolean z, boolean z3, boolean z4, boolean z6, String str5) {
        this.f281072a = str;
        this.f281073b = str2;
        this.f281074c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.f281075g = z3;
        this.f281076h = z4;
        this.i = z6;
        this.f281077j = str5;
    }

    public final String a() {
        return this.f281072a;
    }

    public final String b() {
        return this.f281073b;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(c0Var.f281072a, this.f281072a) && Intrinsics.f(c0Var.f281073b, this.f281073b) && c0Var.f281074c == this.f281074c && Intrinsics.f(c0Var.d, this.d) && Intrinsics.f(c0Var.e, this.e) && c0Var.f == this.f && c0Var.f281075g == this.f281075g && c0Var.f281076h == this.f281076h && c0Var.i == this.i && Intrinsics.f(c0Var.f281077j, this.f281077j);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(a0.d.c(p.a.c(p.a.c(527, 31, this.f281072a), 31, this.f281073b), 31, this.f281074c), 31, this.d), 31, this.e), 31, this.f), 31, this.f281075g), 31, this.f281076h), 31, this.i);
        String str = this.f281077j;
        return iC + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f281072a);
        sb6.append('=');
        sb6.append(this.f281073b);
        if (this.f281076h) {
            long j2 = this.f281074c;
            if (j2 == Long.MIN_VALUE) {
                sb6.append("; max-age=0");
            } else {
                sb6.append("; expires=");
                Date date = new Date(j2);
                cd.b bVar = zlm.c.f323304a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String str = ((DateFormat) zlm.c.f323304a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                sb6.append(str);
            }
        }
        if (!this.i) {
            sb6.append("; domain=");
            sb6.append(this.d);
        }
        sb6.append("; path=");
        sb6.append(this.e);
        if (this.f) {
            sb6.append("; secure");
        }
        if (this.f281075g) {
            sb6.append("; httponly");
        }
        String str2 = this.f281077j;
        if (str2 != null) {
            sb6.append("; samesite=");
            sb6.append(str2);
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
