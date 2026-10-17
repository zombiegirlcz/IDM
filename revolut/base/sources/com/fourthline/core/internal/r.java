package com.fourthline.core.internal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public abstract class r implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntRange f26377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IntRange f26378c;
    private final IntRange d;
    private final IntRange e;
    private final IntRange f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final IntRange f26379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IntRange f26380h;
    private final IntRange i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IntRange f26381j;
    private final IntRange k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f26382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lazy f26383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f26384n;
    private final Lazy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Lazy f26385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f26386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Lazy f26387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Lazy f26388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f26389t;
    private final Lazy u;
    private final Lazy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Lazy f26390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Lazy f26391x;

    public r(String mrzText) {
        Intrinsics.checkNotNullParameter(mrzText, "mrzText");
        this.f26376a = mrzText;
        IntRange.INSTANCE.getClass();
        IntRange intRange = IntRange.d;
        this.f26377b = intRange;
        this.f26378c = intRange;
        this.d = intRange;
        this.e = intRange;
        this.f = intRange;
        this.f26379g = intRange;
        this.f26380h = intRange;
        this.i = intRange;
        this.f26381j = intRange;
        this.k = intRange;
        final int i = 0;
        this.f26382l = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i2 = 7;
        this.f26383m = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i3 = 8;
        this.f26384n = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i5 = 9;
        this.o = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i6 = 10;
        this.f26385p = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i21 = 11;
        this.f26386q = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i22 = 12;
        this.f26387r = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i32 = 1;
        this.f26388s = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i33 = 2;
        this.f26389t = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i33) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i43 = 3;
        this.u = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i43) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i59 = 4;
        this.v = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i59) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i66 = 5;
        this.f26390w = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i66) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
        final int i74 = 6;
        this.f26391x = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f26367b;

            {
                this.f26367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i74) {
                    case 0:
                        return r.h(this.f26367b);
                    case 1:
                        return r.a(this.f26367b);
                    case 2:
                        return r.e(this.f26367b);
                    case 3:
                        return r.m(this.f26367b);
                    case 4:
                        return r.d(this.f26367b);
                    case 5:
                        return r.c(this.f26367b);
                    case 6:
                        return r.k(this.f26367b);
                    case 7:
                        return r.i(this.f26367b);
                    case 8:
                        return r.b(this.f26367b);
                    case 9:
                        return r.f(this.f26367b);
                    case 10:
                        return r.g(this.f26367b);
                    case 11:
                        return r.j(this.f26367b);
                    default:
                        return r.l(this.f26367b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(r rVar) {
        return b0.c(rVar.a(rVar.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(r rVar) {
        return b0.b(rVar.a(new IntRange(2, 4, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(r rVar) {
        return b0.b(rVar.a(new IntRange(0, 1, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(r rVar) {
        return b0.c(rVar.a(rVar.j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(r rVar) {
        return rVar.a(rVar.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(r rVar) {
        return b0.b(rVar.a(rVar.p()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(r rVar) {
        return rVar.a(rVar.y());
    }

    public abstract boolean A();

    @Override // com.fourthline.core.internal.z
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public x a() {
        String strF = f();
        String strS = s();
        return a(new x(g(), strF, strS, v(), null, null, e(), a(e()), k(), b(k()), m(), u(), A(), b(), h(), w(), x(), 48, null));
    }

    public abstract IntRange c();

    public abstract IntRange d();

    public String e() {
        return (String) this.f26384n.getValue();
    }

    public IntRange i() {
        return this.f26381j;
    }

    public IntRange j() {
        return this.e;
    }

    public String k() {
        return (String) this.o.getValue();
    }

    public abstract IntRange l();

    public String m() {
        return (String) this.f26385p.getValue();
    }

    public abstract n n();

    public abstract String x();

    public abstract IntRange z();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(r rVar) {
        return rVar.a(rVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(r rVar) {
        return rVar.a(rVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(r rVar) {
        return b0.b(rVar.a(rVar.r()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(r rVar) {
        String strG;
        String strA = rVar.a(rVar.t());
        int i = 0;
        while (true) {
            if (i >= strA.length()) {
                strA = null;
                break;
            }
            if (strA.charAt(i) != '<') {
                break;
            }
            i++;
        }
        if (strA == null || (strG = b0.g(strA)) == null) {
            return null;
        }
        return rVar.c(strG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v k(r rVar) {
        return rVar.n().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(r rVar) {
        return rVar.a(rVar.z());
    }

    private final SimpleDateFormat o() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    private final v v() {
        return (v) this.f26391x.getValue();
    }

    public String b() {
        return (String) this.f26388s.getValue();
    }

    public final String f() {
        return (String) this.f26390w.getValue();
    }

    public final String g() {
        return (String) this.v.getValue();
    }

    public String h() {
        return (String) this.f26389t.getValue();
    }

    public IntRange p() {
        return this.f26377b;
    }

    public String q() {
        return (String) this.f26382l.getValue();
    }

    public IntRange r() {
        return this.f26378c;
    }

    public String s() {
        return (String) this.f26383m.getValue();
    }

    public IntRange t() {
        return this.f26379g;
    }

    public String u() {
        return (String) this.f26386q.getValue();
    }

    public String w() {
        return (String) this.u.getValue();
    }

    public IntRange y() {
        return this.f26380h;
    }

    private final x a(x xVar) {
        List listN0 = kotlin.text.d0.n0(q(), new String[]{"<<"}, 0, 6);
        return x.a(xVar, null, null, null, null, kotlin.text.d0.n0((CharSequence) listN0.get(1), new String[]{"<"}, 0, 6), kotlin.text.d0.n0((CharSequence) listN0.get(0), new String[]{"<"}, 0, 6), null, null, null, null, null, null, false, null, null, null, null, 131023, null);
    }

    private final Date b(String str) {
        return a(str, 50);
    }

    private final String c(String str) {
        return b0.f(b0.e(str));
    }

    private final Date a(String str) {
        return a(str, 100);
    }

    private final Date a(String str, int i) {
        try {
            SimpleDateFormat simpleDateFormatO = o();
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, -i);
            simpleDateFormatO.set2DigitYearStart(calendar.getTime());
            return simpleDateFormatO.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    private final String a(IntRange intRange) {
        return kotlin.text.d0.t0(this.f26376a, intRange);
    }
}
