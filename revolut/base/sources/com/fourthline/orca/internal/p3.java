package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p3 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f31811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s20 f31812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f31813c;
    private final a d;
    private final m80.b e;
    private final m80.a f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f31814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f31815b;

        public a(c81 text, c81 link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.f31814a = text;
            this.f31815b = link;
        }

        public final c81 a() {
            return this.f31815b;
        }

        public final c81 b() {
            return this.f31814a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f31814a, aVar.f31814a) && Intrinsics.f(this.f31815b, aVar.f31815b);
        }

        public int hashCode() {
            return (this.f31814a.hashCode() * 31) + this.f31815b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f31814a + ", link=" + this.f31815b + ")";
        }
    }

    public p3(c81 title, s20 input, c81 hint, a linkButton, m80.b primaryButtonState, m80.a secondaryButtonState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(linkButton, "linkButton");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        this.f31811a = title;
        this.f31812b = input;
        this.f31813c = hint;
        this.d = linkButton;
        this.e = primaryButtonState;
        this.f = secondaryButtonState;
    }

    public final p3 a(c81 title, s20 input, c81 hint, a linkButton, m80.b primaryButtonState, m80.a secondaryButtonState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(linkButton, "linkButton");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        return new p3(title, input, hint, linkButton, primaryButtonState, secondaryButtonState);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Intrinsics.f(this.f31811a, p3Var.f31811a) && Intrinsics.f(this.f31812b, p3Var.f31812b) && Intrinsics.f(this.f31813c, p3Var.f31813c) && Intrinsics.f(this.d, p3Var.d) && Intrinsics.f(this.e, p3Var.e) && Intrinsics.f(this.f, p3Var.f);
    }

    public final c81 getTitle() {
        return this.f31811a;
    }

    public int hashCode() {
        return (((((((((this.f31811a.hashCode() * 31) + this.f31812b.hashCode()) * 31) + this.f31813c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final c81 n() {
        return this.f31813c;
    }

    public final s20 o() {
        return this.f31812b;
    }

    public final a p() {
        return this.d;
    }

    public final m80.b q() {
        return this.e;
    }

    public final m80.a r() {
        return this.f;
    }

    public String toString() {
        return "State(title=" + this.f31811a + ", input=" + this.f31812b + ", hint=" + this.f31813c + ", linkButton=" + this.d + ", primaryButtonState=" + this.e + ", secondaryButtonState=" + this.f + ")";
    }

    public static /* synthetic */ p3 a(p3 p3Var, c81 c81Var, s20 s20Var, c81 c81Var2, a aVar, m80.b bVar, m80.a aVar2, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = p3Var.f31811a;
        }
        if ((i & 2) != 0) {
            s20Var = p3Var.f31812b;
        }
        if ((i & 4) != 0) {
            c81Var2 = p3Var.f31813c;
        }
        if ((i & 8) != 0) {
            aVar = p3Var.d;
        }
        if ((i & 16) != 0) {
            bVar = p3Var.e;
        }
        if ((i & 32) != 0) {
            aVar2 = p3Var.f;
        }
        m80.b bVar2 = bVar;
        m80.a aVar3 = aVar2;
        return p3Var.a(c81Var, s20Var, c81Var2, aVar, bVar2, aVar3);
    }
}
