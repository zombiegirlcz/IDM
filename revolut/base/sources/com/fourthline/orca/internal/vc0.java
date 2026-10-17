package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vc0 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f34293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s20 f34294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f34295c;
    private final z10 d;
    private final a e;
    private final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c81 f34296g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f34297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f34298b;

        public a(c81 text, c81 link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.f34297a = text;
            this.f34298b = link;
        }

        public final c81 a() {
            return this.f34298b;
        }

        public final c81 b() {
            return this.f34297a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f34297a, aVar.f34297a) && Intrinsics.f(this.f34298b, aVar.f34298b);
        }

        public int hashCode() {
            return (this.f34297a.hashCode() * 31) + this.f34298b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f34297a + ", link=" + this.f34298b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f34299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f34300b;

        public b(c81 text, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f34299a = text;
            this.f34300b = z;
        }

        public final b a(c81 text, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new b(text, z);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f34299a, bVar.f34299a) && this.f34300b == bVar.f34300b;
        }

        public int hashCode() {
            return (this.f34299a.hashCode() * 31) + Boolean.hashCode(this.f34300b);
        }

        public String toString() {
            return "PrimaryButtonState(text=" + this.f34299a + ", enabled=" + this.f34300b + ")";
        }

        public static /* synthetic */ b a(b bVar, c81 c81Var, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                c81Var = bVar.f34299a;
            }
            if ((i & 2) != 0) {
                z = bVar.f34300b;
            }
            return bVar.a(c81Var, z);
        }

        public final boolean a() {
            return this.f34300b;
        }
    }

    public vc0(c81 title, s20 inputViewState, c81 hintText, z10 hintImage, a aVar, b nextButtonState, c81 backButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputViewState, "inputViewState");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Intrinsics.checkNotNullParameter(hintImage, "hintImage");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(backButtonText, "backButtonText");
        this.f34293a = title;
        this.f34294b = inputViewState;
        this.f34295c = hintText;
        this.d = hintImage;
        this.e = aVar;
        this.f = nextButtonState;
        this.f34296g = backButtonText;
    }

    public final vc0 a(c81 title, s20 inputViewState, c81 hintText, z10 hintImage, a aVar, b nextButtonState, c81 backButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputViewState, "inputViewState");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Intrinsics.checkNotNullParameter(hintImage, "hintImage");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(backButtonText, "backButtonText");
        return new vc0(title, inputViewState, hintText, hintImage, aVar, nextButtonState, backButtonText);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vc0)) {
            return false;
        }
        vc0 vc0Var = (vc0) obj2;
        return Intrinsics.f(this.f34293a, vc0Var.f34293a) && Intrinsics.f(this.f34294b, vc0Var.f34294b) && Intrinsics.f(this.f34295c, vc0Var.f34295c) && Intrinsics.f(this.d, vc0Var.d) && Intrinsics.f(this.e, vc0Var.e) && Intrinsics.f(this.f, vc0Var.f) && Intrinsics.f(this.f34296g, vc0Var.f34296g);
    }

    public final c81 getTitle() {
        return this.f34293a;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f34293a.hashCode() * 31) + this.f34294b.hashCode()) * 31) + this.f34295c.hashCode()) * 31) + this.d.hashCode()) * 31;
        a aVar = this.e;
        return ((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f.hashCode()) * 31) + this.f34296g.hashCode();
    }

    public final z10 n() {
        return this.d;
    }

    public final c81 o() {
        return this.f34295c;
    }

    public final s20 p() {
        return this.f34294b;
    }

    public final a q() {
        return this.e;
    }

    public final b r() {
        return this.f;
    }

    public String toString() {
        return "State(title=" + this.f34293a + ", inputViewState=" + this.f34294b + ", hintText=" + this.f34295c + ", hintImage=" + this.d + ", linkButtonState=" + this.e + ", nextButtonState=" + this.f + ", backButtonText=" + this.f34296g + ")";
    }

    public static /* synthetic */ vc0 a(vc0 vc0Var, c81 c81Var, s20 s20Var, c81 c81Var2, z10 z10Var, a aVar, b bVar, c81 c81Var3, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = vc0Var.f34293a;
        }
        if ((i & 2) != 0) {
            s20Var = vc0Var.f34294b;
        }
        if ((i & 4) != 0) {
            c81Var2 = vc0Var.f34295c;
        }
        if ((i & 8) != 0) {
            z10Var = vc0Var.d;
        }
        if ((i & 16) != 0) {
            aVar = vc0Var.e;
        }
        if ((i & 32) != 0) {
            bVar = vc0Var.f;
        }
        if ((i & 64) != 0) {
            c81Var3 = vc0Var.f34296g;
        }
        b bVar2 = bVar;
        c81 c81Var4 = c81Var3;
        a aVar2 = aVar;
        c81 c81Var5 = c81Var2;
        return vc0Var.a(c81Var, s20Var, c81Var5, z10Var, aVar2, bVar2, c81Var4);
    }
}
