package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sl0 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f33047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s20 f33048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s20 f33049c;
    private final s20 d;
    private final a e;
    private final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c81 f33050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m80.b f33051h;
    private final m80.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final z10 f33052j;
    private final z10 k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r20 f33053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f33054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l20 f33055c;
        private final c81 d;
        private final c81 e;
        private final c81 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final z10 f33056g;

        public a(r20 format, c81 text, l20 state, c81 title, c81 placeholder, c81 status, z10 z10Var) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(status, "status");
            this.f33053a = format;
            this.f33054b = text;
            this.f33055c = state;
            this.d = title;
            this.e = placeholder;
            this.f = status;
            this.f33056g = z10Var;
        }

        public final a a(r20 format, c81 text, l20 state, c81 title, c81 placeholder, c81 status, z10 z10Var) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(status, "status");
            return new a(format, text, state, title, placeholder, status, z10Var);
        }

        public final c81 b() {
            return this.e;
        }

        public final l20 c() {
            return this.f33055c;
        }

        public final c81 d() {
            return this.f;
        }

        public final z10 e() {
            return this.f33056g;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f33053a == aVar.f33053a && Intrinsics.f(this.f33054b, aVar.f33054b) && this.f33055c == aVar.f33055c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f33056g, aVar.f33056g);
        }

        public final c81 f() {
            return this.f33054b;
        }

        public final c81 g() {
            return this.d;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.f33053a.hashCode() * 31) + this.f33054b.hashCode()) * 31) + this.f33055c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
            z10 z10Var = this.f33056g;
            return iHashCode + (z10Var == null ? 0 : z10Var.hashCode());
        }

        public String toString() {
            return "GenderViewState(format=" + this.f33053a + ", text=" + this.f33054b + ", state=" + this.f33055c + ", title=" + this.d + ", placeholder=" + this.e + ", status=" + this.f + ", statusIcon=" + this.f33056g + ")";
        }

        public static /* synthetic */ a a(a aVar, r20 r20Var, c81 c81Var, l20 l20Var, c81 c81Var2, c81 c81Var3, c81 c81Var4, z10 z10Var, int i, Object obj2) {
            if ((i & 1) != 0) {
                r20Var = aVar.f33053a;
            }
            if ((i & 2) != 0) {
                c81Var = aVar.f33054b;
            }
            if ((i & 4) != 0) {
                l20Var = aVar.f33055c;
            }
            if ((i & 8) != 0) {
                c81Var2 = aVar.d;
            }
            if ((i & 16) != 0) {
                c81Var3 = aVar.e;
            }
            if ((i & 32) != 0) {
                c81Var4 = aVar.f;
            }
            if ((i & 64) != 0) {
                z10Var = aVar.f33056g;
            }
            c81 c81Var5 = c81Var4;
            z10 z10Var2 = z10Var;
            c81 c81Var6 = c81Var3;
            l20 l20Var2 = l20Var;
            return aVar.a(r20Var, c81Var, l20Var2, c81Var2, c81Var6, c81Var5, z10Var2);
        }

        public final r20 a() {
            return this.f33053a;
        }

        public /* synthetic */ a(r20 r20Var, c81 c81Var, l20 l20Var, c81 c81Var2, c81 c81Var3, c81 c81Var4, z10 z10Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r20Var, c81Var, l20Var, c81Var2, c81Var3, c81Var4, (i & 64) != 0 ? null : z10Var);
        }
    }

    public sl0(c81 title, s20 firstNameInputViewState, s20 lastNameInputViewState, s20 birthDateInputViewState, a genderInputViewState, Map map, c81 c81Var, m80.b nextButtonState, m80.a backButtonState, z10 arrowImageSource, z10 calendarImageSource) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(firstNameInputViewState, "firstNameInputViewState");
        Intrinsics.checkNotNullParameter(lastNameInputViewState, "lastNameInputViewState");
        Intrinsics.checkNotNullParameter(birthDateInputViewState, "birthDateInputViewState");
        Intrinsics.checkNotNullParameter(genderInputViewState, "genderInputViewState");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(backButtonState, "backButtonState");
        Intrinsics.checkNotNullParameter(arrowImageSource, "arrowImageSource");
        Intrinsics.checkNotNullParameter(calendarImageSource, "calendarImageSource");
        this.f33047a = title;
        this.f33048b = firstNameInputViewState;
        this.f33049c = lastNameInputViewState;
        this.d = birthDateInputViewState;
        this.e = genderInputViewState;
        this.f = map;
        this.f33050g = c81Var;
        this.f33051h = nextButtonState;
        this.i = backButtonState;
        this.f33052j = arrowImageSource;
        this.k = calendarImageSource;
    }

    public final sl0 a(c81 title, s20 firstNameInputViewState, s20 lastNameInputViewState, s20 birthDateInputViewState, a genderInputViewState, Map map, c81 c81Var, m80.b nextButtonState, m80.a backButtonState, z10 arrowImageSource, z10 calendarImageSource) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(firstNameInputViewState, "firstNameInputViewState");
        Intrinsics.checkNotNullParameter(lastNameInputViewState, "lastNameInputViewState");
        Intrinsics.checkNotNullParameter(birthDateInputViewState, "birthDateInputViewState");
        Intrinsics.checkNotNullParameter(genderInputViewState, "genderInputViewState");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(backButtonState, "backButtonState");
        Intrinsics.checkNotNullParameter(arrowImageSource, "arrowImageSource");
        Intrinsics.checkNotNullParameter(calendarImageSource, "calendarImageSource");
        return new sl0(title, firstNameInputViewState, lastNameInputViewState, birthDateInputViewState, genderInputViewState, map, c81Var, nextButtonState, backButtonState, arrowImageSource, calendarImageSource);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sl0)) {
            return false;
        }
        sl0 sl0Var = (sl0) obj2;
        return Intrinsics.f(this.f33047a, sl0Var.f33047a) && Intrinsics.f(this.f33048b, sl0Var.f33048b) && Intrinsics.f(this.f33049c, sl0Var.f33049c) && Intrinsics.f(this.d, sl0Var.d) && Intrinsics.f(this.e, sl0Var.e) && Intrinsics.f(this.f, sl0Var.f) && Intrinsics.f(this.f33050g, sl0Var.f33050g) && Intrinsics.f(this.f33051h, sl0Var.f33051h) && Intrinsics.f(this.i, sl0Var.i) && Intrinsics.f(this.f33052j, sl0Var.f33052j) && Intrinsics.f(this.k, sl0Var.k);
    }

    public final c81 getTitle() {
        return this.f33047a;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f33047a.hashCode() * 31) + this.f33048b.hashCode()) * 31) + this.f33049c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Map map = this.f;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        c81 c81Var = this.f33050g;
        return ((((((((iHashCode2 + (c81Var != null ? c81Var.hashCode() : 0)) * 31) + this.f33051h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.f33052j.hashCode()) * 31) + this.k.hashCode();
    }

    public final z10 n() {
        return this.f33052j;
    }

    public final m80.a o() {
        return this.i;
    }

    public final s20 p() {
        return this.d;
    }

    public final z10 q() {
        return this.k;
    }

    public final s20 r() {
        return this.f33048b;
    }

    public final a s() {
        return this.e;
    }

    public final Map t() {
        return this.f;
    }

    public String toString() {
        return "State(title=" + this.f33047a + ", firstNameInputViewState=" + this.f33048b + ", lastNameInputViewState=" + this.f33049c + ", birthDateInputViewState=" + this.d + ", genderInputViewState=" + this.e + ", genders=" + this.f + ", hint=" + this.f33050g + ", nextButtonState=" + this.f33051h + ", backButtonState=" + this.i + ", arrowImageSource=" + this.f33052j + ", calendarImageSource=" + this.k + ")";
    }

    public final c81 u() {
        return this.f33050g;
    }

    public final s20 v() {
        return this.f33049c;
    }

    public final m80.b w() {
        return this.f33051h;
    }

    public static /* synthetic */ sl0 a(sl0 sl0Var, c81 c81Var, s20 s20Var, s20 s20Var2, s20 s20Var3, a aVar, Map map, c81 c81Var2, m80.b bVar, m80.a aVar2, z10 z10Var, z10 z10Var2, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = sl0Var.f33047a;
        }
        if ((i & 2) != 0) {
            s20Var = sl0Var.f33048b;
        }
        if ((i & 4) != 0) {
            s20Var2 = sl0Var.f33049c;
        }
        if ((i & 8) != 0) {
            s20Var3 = sl0Var.d;
        }
        if ((i & 16) != 0) {
            aVar = sl0Var.e;
        }
        if ((i & 32) != 0) {
            map = sl0Var.f;
        }
        if ((i & 64) != 0) {
            c81Var2 = sl0Var.f33050g;
        }
        if ((i & 128) != 0) {
            bVar = sl0Var.f33051h;
        }
        if ((i & 256) != 0) {
            aVar2 = sl0Var.i;
        }
        if ((i & 512) != 0) {
            z10Var = sl0Var.f33052j;
        }
        if ((i & 1024) != 0) {
            z10Var2 = sl0Var.k;
        }
        z10 z10Var3 = z10Var;
        z10 z10Var4 = z10Var2;
        m80.b bVar2 = bVar;
        m80.a aVar3 = aVar2;
        Map map2 = map;
        c81 c81Var3 = c81Var2;
        a aVar4 = aVar;
        s20 s20Var4 = s20Var2;
        return sl0Var.a(c81Var, s20Var, s20Var4, s20Var3, aVar4, map2, c81Var3, bVar2, aVar3, z10Var3, z10Var4);
    }
}
