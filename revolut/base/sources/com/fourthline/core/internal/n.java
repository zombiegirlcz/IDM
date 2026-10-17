package com.fourthline.core.internal;

import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public abstract class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f26368g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f26371c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Integer.valueOf(((IntRange) obj3).f186449b), Integer.valueOf(((IntRange) obj2).f186449b));
        }
    }

    public n(String mrz, boolean z, c checksumValidator) {
        Intrinsics.checkNotNullParameter(mrz, "mrz");
        Intrinsics.checkNotNullParameter(checksumValidator, "checksumValidator");
        this.f26369a = mrz;
        this.f26370b = z;
        this.f26371c = checksumValidator;
        final int i = 0;
        this.d = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f26365b;

            {
                this.f26365b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return n.c(this.f26365b);
                    case 1:
                        return n.b(this.f26365b);
                    default:
                        return n.a(this.f26365b);
                }
            }
        });
        final int i2 = 1;
        this.e = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f26365b;

            {
                this.f26365b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return n.c(this.f26365b);
                    case 1:
                        return n.b(this.f26365b);
                    default:
                        return n.a(this.f26365b);
                }
            }
        });
        final int i3 = 2;
        this.f = yhm.j.b(new Function0(this) { // from class: com.fourthline.core.internal.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f26365b;

            {
                this.f26365b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return n.c(this.f26365b);
                    case 1:
                        return n.b(this.f26365b);
                    default:
                        return n.a(this.f26365b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(n nVar) {
        IntRange intRange;
        List listP0 = zhm.d0.P0(nVar.d(), new b());
        List listC = null;
        List list = nVar.g() ? listP0 : null;
        if (list != null && (intRange = (IntRange) zhm.d0.d0(list)) != null) {
            int i = intRange.f186448a;
            String strSubstring = nVar.f26369a.substring(i, intRange.f186449b + 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int length = strSubstring.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                if (strSubstring.charAt(i2) == '<') {
                    break;
                }
                i2++;
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (i2 == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    listC = zhm.u.c(kotlin.ranges.f.o(i, (numValueOf.intValue() - 2) + i));
                }
            }
        }
        return listC == null ? listP0 : listC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v b(n nVar) {
        return nVar.a(nVar.a(nVar.f()), nVar.f().f186449b + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v c(n nVar) {
        v vVarA = nVar.a();
        return vVarA == null ? nVar.c() : vVarA;
    }

    private final boolean g() {
        return Intrinsics.f(c().b(), "<");
    }

    public abstract List d();

    public abstract IntRange f();

    private final v c() {
        return (v) this.e.getValue();
    }

    public final v e() {
        return (v) this.d.getValue();
    }

    private final List b() {
        return (List) this.f.getValue();
    }

    public /* synthetic */ n(String str, boolean z, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? new c() : cVar);
    }

    private final v a() {
        v vVarC = c();
        if (this.f26371c.a(vVarC.a(), vVarC.b())) {
            return vVarC;
        }
        for (IntRange intRange : b()) {
            if (g()) {
                intRange = new IntRange(intRange.f186448a, intRange.f186449b + 1, 1);
            }
            String str = vVarC.a() + vVarC.b() + a(intRange);
            int i = intRange.f186449b + 1;
            if (this.f26371c.a(str, a(i))) {
                return a(str, i);
            }
        }
        return null;
    }

    private final String a(IntRange intRange) {
        String strG = b0.g(kotlin.text.d0.t0(this.f26369a, intRange));
        return !this.f26370b ? b0.h(strG) : strG;
    }

    private final String a(int i) {
        return b0.i(String.valueOf(this.f26369a.charAt(i)));
    }

    private final v a(String str, int i) {
        return new v(str, a(str), a(i), i);
    }

    private final String a(String str) {
        return kotlin.text.a0.D(str, "<", "", false);
    }
}
