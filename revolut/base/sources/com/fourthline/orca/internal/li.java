package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class li implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f30627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s20 f30628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s20 f30629c;
    private final s20 d;
    private final gi e;
    private final c81 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ji f30630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m80.b f30631h;
    private final z10 i;

    public li(c81 title, s20 documentNumberInputViewState, s20 expiryDateInputViewState, s20 birthDateInputViewState, gi giVar, c81 c81Var, ji backButtonState, m80.b nextButtonState, z10 calendarImageSource) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documentNumberInputViewState, "documentNumberInputViewState");
        Intrinsics.checkNotNullParameter(expiryDateInputViewState, "expiryDateInputViewState");
        Intrinsics.checkNotNullParameter(birthDateInputViewState, "birthDateInputViewState");
        Intrinsics.checkNotNullParameter(backButtonState, "backButtonState");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(calendarImageSource, "calendarImageSource");
        this.f30627a = title;
        this.f30628b = documentNumberInputViewState;
        this.f30629c = expiryDateInputViewState;
        this.d = birthDateInputViewState;
        this.e = giVar;
        this.f = c81Var;
        this.f30630g = backButtonState;
        this.f30631h = nextButtonState;
        this.i = calendarImageSource;
    }

    public final li a(c81 title, s20 documentNumberInputViewState, s20 expiryDateInputViewState, s20 birthDateInputViewState, gi giVar, c81 c81Var, ji backButtonState, m80.b nextButtonState, z10 calendarImageSource) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documentNumberInputViewState, "documentNumberInputViewState");
        Intrinsics.checkNotNullParameter(expiryDateInputViewState, "expiryDateInputViewState");
        Intrinsics.checkNotNullParameter(birthDateInputViewState, "birthDateInputViewState");
        Intrinsics.checkNotNullParameter(backButtonState, "backButtonState");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(calendarImageSource, "calendarImageSource");
        return new li(title, documentNumberInputViewState, expiryDateInputViewState, birthDateInputViewState, giVar, c81Var, backButtonState, nextButtonState, calendarImageSource);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof li)) {
            return false;
        }
        li liVar = (li) obj2;
        return Intrinsics.f(this.f30627a, liVar.f30627a) && Intrinsics.f(this.f30628b, liVar.f30628b) && Intrinsics.f(this.f30629c, liVar.f30629c) && Intrinsics.f(this.d, liVar.d) && Intrinsics.f(this.e, liVar.e) && Intrinsics.f(this.f, liVar.f) && Intrinsics.f(this.f30630g, liVar.f30630g) && Intrinsics.f(this.f30631h, liVar.f30631h) && Intrinsics.f(this.i, liVar.i);
    }

    public final c81 getTitle() {
        return this.f30627a;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f30627a.hashCode() * 31) + this.f30628b.hashCode()) * 31) + this.f30629c.hashCode()) * 31) + this.d.hashCode()) * 31;
        gi giVar = this.e;
        int iHashCode2 = (iHashCode + (giVar == null ? 0 : giVar.hashCode())) * 31;
        c81 c81Var = this.f;
        return ((((((iHashCode2 + (c81Var != null ? c81Var.hashCode() : 0)) * 31) + this.f30630g.hashCode()) * 31) + this.f30631h.hashCode()) * 31) + this.i.hashCode();
    }

    public final ji n() {
        return this.f30630g;
    }

    public final s20 o() {
        return this.d;
    }

    public final z10 p() {
        return this.i;
    }

    public final s20 q() {
        return this.f30628b;
    }

    public final gi r() {
        return this.e;
    }

    public final s20 s() {
        return this.f30629c;
    }

    public final c81 t() {
        return this.f;
    }

    public String toString() {
        return "State(title=" + this.f30627a + ", documentNumberInputViewState=" + this.f30628b + ", expiryDateInputViewState=" + this.f30629c + ", birthDateInputViewState=" + this.d + ", expiryDateCheckboxState=" + this.e + ", hint=" + this.f + ", backButtonState=" + this.f30630g + ", nextButtonState=" + this.f30631h + ", calendarImageSource=" + this.i + ")";
    }

    public final m80.b u() {
        return this.f30631h;
    }

    public static /* synthetic */ li a(li liVar, c81 c81Var, s20 s20Var, s20 s20Var2, s20 s20Var3, gi giVar, c81 c81Var2, ji jiVar, m80.b bVar, z10 z10Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = liVar.f30627a;
        }
        if ((i & 2) != 0) {
            s20Var = liVar.f30628b;
        }
        if ((i & 4) != 0) {
            s20Var2 = liVar.f30629c;
        }
        if ((i & 8) != 0) {
            s20Var3 = liVar.d;
        }
        if ((i & 16) != 0) {
            giVar = liVar.e;
        }
        if ((i & 32) != 0) {
            c81Var2 = liVar.f;
        }
        if ((i & 64) != 0) {
            jiVar = liVar.f30630g;
        }
        if ((i & 128) != 0) {
            bVar = liVar.f30631h;
        }
        if ((i & 256) != 0) {
            z10Var = liVar.i;
        }
        m80.b bVar2 = bVar;
        z10 z10Var2 = z10Var;
        c81 c81Var3 = c81Var2;
        ji jiVar2 = jiVar;
        gi giVar2 = giVar;
        s20 s20Var4 = s20Var2;
        return liVar.a(c81Var, s20Var, s20Var4, s20Var3, giVar2, c81Var3, jiVar2, bVar2, z10Var2);
    }
}
