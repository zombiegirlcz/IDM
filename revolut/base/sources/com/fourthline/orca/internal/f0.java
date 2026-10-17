package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f0 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f28299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r2 f28300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s20 f28301c;
    private final s20 d;
    private final s20 e;
    private final s20 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s20 f28302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m80.b f28303h;
    private final m80.a i;

    public f0(c81 title, r2 residencyPicker, s20 postalCodeInputViewState, s20 streetNumberInputViewState, s20 streetNumberSuffixInputViewState, s20 streetInputViewState, s20 cityInputViewState, m80.b nextButtonState, m80.a backButtonState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(residencyPicker, "residencyPicker");
        Intrinsics.checkNotNullParameter(postalCodeInputViewState, "postalCodeInputViewState");
        Intrinsics.checkNotNullParameter(streetNumberInputViewState, "streetNumberInputViewState");
        Intrinsics.checkNotNullParameter(streetNumberSuffixInputViewState, "streetNumberSuffixInputViewState");
        Intrinsics.checkNotNullParameter(streetInputViewState, "streetInputViewState");
        Intrinsics.checkNotNullParameter(cityInputViewState, "cityInputViewState");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(backButtonState, "backButtonState");
        this.f28299a = title;
        this.f28300b = residencyPicker;
        this.f28301c = postalCodeInputViewState;
        this.d = streetNumberInputViewState;
        this.e = streetNumberSuffixInputViewState;
        this.f = streetInputViewState;
        this.f28302g = cityInputViewState;
        this.f28303h = nextButtonState;
        this.i = backButtonState;
    }

    public final f0 a(c81 title, r2 residencyPicker, s20 postalCodeInputViewState, s20 streetNumberInputViewState, s20 streetNumberSuffixInputViewState, s20 streetInputViewState, s20 cityInputViewState, m80.b nextButtonState, m80.a backButtonState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(residencyPicker, "residencyPicker");
        Intrinsics.checkNotNullParameter(postalCodeInputViewState, "postalCodeInputViewState");
        Intrinsics.checkNotNullParameter(streetNumberInputViewState, "streetNumberInputViewState");
        Intrinsics.checkNotNullParameter(streetNumberSuffixInputViewState, "streetNumberSuffixInputViewState");
        Intrinsics.checkNotNullParameter(streetInputViewState, "streetInputViewState");
        Intrinsics.checkNotNullParameter(cityInputViewState, "cityInputViewState");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(backButtonState, "backButtonState");
        return new f0(title, residencyPicker, postalCodeInputViewState, streetNumberInputViewState, streetNumberSuffixInputViewState, streetInputViewState, cityInputViewState, nextButtonState, backButtonState);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f28299a, f0Var.f28299a) && Intrinsics.f(this.f28300b, f0Var.f28300b) && Intrinsics.f(this.f28301c, f0Var.f28301c) && Intrinsics.f(this.d, f0Var.d) && Intrinsics.f(this.e, f0Var.e) && Intrinsics.f(this.f, f0Var.f) && Intrinsics.f(this.f28302g, f0Var.f28302g) && Intrinsics.f(this.f28303h, f0Var.f28303h) && Intrinsics.f(this.i, f0Var.i);
    }

    public final c81 getTitle() {
        return this.f28299a;
    }

    public int hashCode() {
        return (((((((((((((((this.f28299a.hashCode() * 31) + this.f28300b.hashCode()) * 31) + this.f28301c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f28302g.hashCode()) * 31) + this.f28303h.hashCode()) * 31) + this.i.hashCode();
    }

    public final m80.a n() {
        return this.i;
    }

    public final s20 o() {
        return this.f28302g;
    }

    public final m80.b p() {
        return this.f28303h;
    }

    public final s20 q() {
        return this.f28301c;
    }

    public final r2 r() {
        return this.f28300b;
    }

    public final s20 s() {
        return this.f;
    }

    public final s20 t() {
        return this.d;
    }

    public String toString() {
        return "State(title=" + this.f28299a + ", residencyPicker=" + this.f28300b + ", postalCodeInputViewState=" + this.f28301c + ", streetNumberInputViewState=" + this.d + ", streetNumberSuffixInputViewState=" + this.e + ", streetInputViewState=" + this.f + ", cityInputViewState=" + this.f28302g + ", nextButtonState=" + this.f28303h + ", backButtonState=" + this.i + ")";
    }

    public final s20 u() {
        return this.e;
    }

    public static /* synthetic */ f0 a(f0 f0Var, c81 c81Var, r2 r2Var, s20 s20Var, s20 s20Var2, s20 s20Var3, s20 s20Var4, s20 s20Var5, m80.b bVar, m80.a aVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = f0Var.f28299a;
        }
        if ((i & 2) != 0) {
            r2Var = f0Var.f28300b;
        }
        if ((i & 4) != 0) {
            s20Var = f0Var.f28301c;
        }
        if ((i & 8) != 0) {
            s20Var2 = f0Var.d;
        }
        if ((i & 16) != 0) {
            s20Var3 = f0Var.e;
        }
        if ((i & 32) != 0) {
            s20Var4 = f0Var.f;
        }
        if ((i & 64) != 0) {
            s20Var5 = f0Var.f28302g;
        }
        if ((i & 128) != 0) {
            bVar = f0Var.f28303h;
        }
        if ((i & 256) != 0) {
            aVar = f0Var.i;
        }
        m80.b bVar2 = bVar;
        m80.a aVar2 = aVar;
        s20 s20Var6 = s20Var4;
        s20 s20Var7 = s20Var5;
        s20 s20Var8 = s20Var3;
        s20 s20Var9 = s20Var;
        return f0Var.a(c81Var, r2Var, s20Var9, s20Var2, s20Var8, s20Var6, s20Var7, bVar2, aVar2);
    }
}
