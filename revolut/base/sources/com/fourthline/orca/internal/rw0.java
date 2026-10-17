package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rw0 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f32850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f32851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s20 f32852c;
    private final c81 d;
    private final a e;
    private final c81 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f32853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f32854h;
    private final c81 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f32855j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f32857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f32858c;
        private final Integer d;
        private final int e;

        public a(boolean z, c81 prefixText, c81 actionText, Integer num) {
            Intrinsics.checkNotNullParameter(prefixText, "prefixText");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            this.f32856a = z;
            this.f32857b = prefixText;
            this.f32858c = actionText;
            this.d = num;
            this.e = 30;
        }

        public final a a(boolean z, c81 prefixText, c81 actionText, Integer num) {
            Intrinsics.checkNotNullParameter(prefixText, "prefixText");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            return new a(z, prefixText, actionText, num);
        }

        public final Integer b() {
            return this.d;
        }

        public final int c() {
            return this.e;
        }

        public final c81 d() {
            return this.f32857b;
        }

        public final boolean e() {
            return this.f32856a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f32856a == aVar.f32856a && Intrinsics.f(this.f32857b, aVar.f32857b) && Intrinsics.f(this.f32858c, aVar.f32858c) && Intrinsics.f(this.d, aVar.d);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.f32856a) * 31) + this.f32857b.hashCode()) * 31) + this.f32858c.hashCode()) * 31;
            Integer num = this.d;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "SendAgain(isEnabled=" + this.f32856a + ", prefixText=" + this.f32857b + ", actionText=" + this.f32858c + ", counterValue=" + this.d + ")";
        }

        public static /* synthetic */ a a(a aVar, boolean z, c81 c81Var, c81 c81Var2, Integer num, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = aVar.f32856a;
            }
            if ((i & 2) != 0) {
                c81Var = aVar.f32857b;
            }
            if ((i & 4) != 0) {
                c81Var2 = aVar.f32858c;
            }
            if ((i & 8) != 0) {
                num = aVar.d;
            }
            return aVar.a(z, c81Var, c81Var2, num);
        }

        public final c81 a() {
            return this.f32858c;
        }

        public /* synthetic */ a(boolean z, c81 c81Var, c81 c81Var2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, c81Var, c81Var2, (i & 8) != 0 ? null : num);
        }
    }

    public rw0(c81 title, c81 description, s20 codeInput, c81 hint, a sendAgainSection, c81 primaryButtonText, boolean z, boolean z3, c81 secondaryButtonText, boolean z4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(codeInput, "codeInput");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(sendAgainSection, "sendAgainSection");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f32850a = title;
        this.f32851b = description;
        this.f32852c = codeInput;
        this.d = hint;
        this.e = sendAgainSection;
        this.f = primaryButtonText;
        this.f32853g = z;
        this.f32854h = z3;
        this.i = secondaryButtonText;
        this.f32855j = z4;
    }

    public final rw0 a(c81 title, c81 description, s20 codeInput, c81 hint, a sendAgainSection, c81 primaryButtonText, boolean z, boolean z3, c81 secondaryButtonText, boolean z4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(codeInput, "codeInput");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(sendAgainSection, "sendAgainSection");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        return new rw0(title, description, codeInput, hint, sendAgainSection, primaryButtonText, z, z3, secondaryButtonText, z4);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rw0)) {
            return false;
        }
        rw0 rw0Var = (rw0) obj2;
        return Intrinsics.f(this.f32850a, rw0Var.f32850a) && Intrinsics.f(this.f32851b, rw0Var.f32851b) && Intrinsics.f(this.f32852c, rw0Var.f32852c) && Intrinsics.f(this.d, rw0Var.d) && Intrinsics.f(this.e, rw0Var.e) && Intrinsics.f(this.f, rw0Var.f) && this.f32853g == rw0Var.f32853g && this.f32854h == rw0Var.f32854h && Intrinsics.f(this.i, rw0Var.i) && this.f32855j == rw0Var.f32855j;
    }

    public final c81 getTitle() {
        return this.f32850a;
    }

    public int hashCode() {
        return (((((((((((((((((this.f32850a.hashCode() * 31) + this.f32851b.hashCode()) * 31) + this.f32852c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Boolean.hashCode(this.f32853g)) * 31) + Boolean.hashCode(this.f32854h)) * 31) + this.i.hashCode()) * 31) + Boolean.hashCode(this.f32855j);
    }

    public final s20 n() {
        return this.f32852c;
    }

    public final c81 o() {
        return this.d;
    }

    public final a p() {
        return this.e;
    }

    public final boolean q() {
        return this.f32854h;
    }

    public final boolean r() {
        return this.f32853g;
    }

    public final boolean s() {
        return this.f32855j;
    }

    public String toString() {
        return "State(title=" + this.f32850a + ", description=" + this.f32851b + ", codeInput=" + this.f32852c + ", hint=" + this.d + ", sendAgainSection=" + this.e + ", primaryButtonText=" + this.f + ", isPrimaryButtonInProgress=" + this.f32853g + ", isPrimaryButtonEnabled=" + this.f32854h + ", secondaryButtonText=" + this.i + ", isSecondaryButtonEnabled=" + this.f32855j + ")";
    }

    public static /* synthetic */ rw0 a(rw0 rw0Var, c81 c81Var, c81 c81Var2, s20 s20Var, c81 c81Var3, a aVar, c81 c81Var4, boolean z, boolean z3, c81 c81Var5, boolean z4, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = rw0Var.f32850a;
        }
        if ((i & 2) != 0) {
            c81Var2 = rw0Var.f32851b;
        }
        if ((i & 4) != 0) {
            s20Var = rw0Var.f32852c;
        }
        if ((i & 8) != 0) {
            c81Var3 = rw0Var.d;
        }
        if ((i & 16) != 0) {
            aVar = rw0Var.e;
        }
        if ((i & 32) != 0) {
            c81Var4 = rw0Var.f;
        }
        if ((i & 64) != 0) {
            z = rw0Var.f32853g;
        }
        if ((i & 128) != 0) {
            z3 = rw0Var.f32854h;
        }
        if ((i & 256) != 0) {
            c81Var5 = rw0Var.i;
        }
        if ((i & 512) != 0) {
            z4 = rw0Var.f32855j;
        }
        c81 c81Var6 = c81Var5;
        boolean z6 = z4;
        boolean z11 = z;
        boolean z12 = z3;
        a aVar2 = aVar;
        c81 c81Var7 = c81Var4;
        return rw0Var.a(c81Var, c81Var2, s20Var, c81Var3, aVar2, c81Var7, z11, z12, c81Var6, z6);
    }

    public final c81 a() {
        return this.f32851b;
    }
}
