package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fm implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f28560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r2 f28561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s20 f28562c;
    private final m80.b d;
    private final m80.a e;

    public fm(c81 title, r2 nationalityPicker, s20 birthplaceInputViewState, m80.b primaryButtonState, m80.a secondaryButtonState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nationalityPicker, "nationalityPicker");
        Intrinsics.checkNotNullParameter(birthplaceInputViewState, "birthplaceInputViewState");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        this.f28560a = title;
        this.f28561b = nationalityPicker;
        this.f28562c = birthplaceInputViewState;
        this.d = primaryButtonState;
        this.e = secondaryButtonState;
    }

    public final fm a(c81 title, r2 nationalityPicker, s20 birthplaceInputViewState, m80.b primaryButtonState, m80.a secondaryButtonState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nationalityPicker, "nationalityPicker");
        Intrinsics.checkNotNullParameter(birthplaceInputViewState, "birthplaceInputViewState");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        return new fm(title, nationalityPicker, birthplaceInputViewState, primaryButtonState, secondaryButtonState);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj2;
        return Intrinsics.f(this.f28560a, fmVar.f28560a) && Intrinsics.f(this.f28561b, fmVar.f28561b) && Intrinsics.f(this.f28562c, fmVar.f28562c) && Intrinsics.f(this.d, fmVar.d) && Intrinsics.f(this.e, fmVar.e);
    }

    public final c81 getTitle() {
        return this.f28560a;
    }

    public int hashCode() {
        return (((((((this.f28560a.hashCode() * 31) + this.f28561b.hashCode()) * 31) + this.f28562c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final s20 n() {
        return this.f28562c;
    }

    public final r2 o() {
        return this.f28561b;
    }

    public final m80.b p() {
        return this.d;
    }

    public final m80.a q() {
        return this.e;
    }

    public String toString() {
        return "State(title=" + this.f28560a + ", nationalityPicker=" + this.f28561b + ", birthplaceInputViewState=" + this.f28562c + ", primaryButtonState=" + this.d + ", secondaryButtonState=" + this.e + ")";
    }

    public static /* synthetic */ fm a(fm fmVar, c81 c81Var, r2 r2Var, s20 s20Var, m80.b bVar, m80.a aVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = fmVar.f28560a;
        }
        if ((i & 2) != 0) {
            r2Var = fmVar.f28561b;
        }
        if ((i & 4) != 0) {
            s20Var = fmVar.f28562c;
        }
        if ((i & 8) != 0) {
            bVar = fmVar.d;
        }
        if ((i & 16) != 0) {
            aVar = fmVar.e;
        }
        m80.a aVar2 = aVar;
        s20 s20Var2 = s20Var;
        return fmVar.a(c81Var, r2Var, s20Var2, bVar, aVar2);
    }
}
