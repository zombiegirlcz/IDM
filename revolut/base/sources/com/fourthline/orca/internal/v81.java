package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class v81 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f34273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s20 f34274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f34275c;
    private final m80.b d;
    private final m80.a e;

    public v81(c81 title, s20 input, c81 hint, m80.b primaryButtonState, m80.a secondaryButtonState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        this.f34273a = title;
        this.f34274b = input;
        this.f34275c = hint;
        this.d = primaryButtonState;
        this.e = secondaryButtonState;
    }

    public final v81 a(c81 title, s20 input, c81 hint, m80.b primaryButtonState, m80.a secondaryButtonState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        return new v81(title, input, hint, primaryButtonState, secondaryButtonState);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v81)) {
            return false;
        }
        v81 v81Var = (v81) obj2;
        return Intrinsics.f(this.f34273a, v81Var.f34273a) && Intrinsics.f(this.f34274b, v81Var.f34274b) && Intrinsics.f(this.f34275c, v81Var.f34275c) && Intrinsics.f(this.d, v81Var.d) && Intrinsics.f(this.e, v81Var.e);
    }

    public final c81 getTitle() {
        return this.f34273a;
    }

    public int hashCode() {
        return (((((((this.f34273a.hashCode() * 31) + this.f34274b.hashCode()) * 31) + this.f34275c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final c81 n() {
        return this.f34275c;
    }

    public final s20 o() {
        return this.f34274b;
    }

    public final m80.b p() {
        return this.d;
    }

    public final m80.a q() {
        return this.e;
    }

    public String toString() {
        return "State(title=" + this.f34273a + ", input=" + this.f34274b + ", hint=" + this.f34275c + ", primaryButtonState=" + this.d + ", secondaryButtonState=" + this.e + ")";
    }

    public static /* synthetic */ v81 a(v81 v81Var, c81 c81Var, s20 s20Var, c81 c81Var2, m80.b bVar, m80.a aVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = v81Var.f34273a;
        }
        if ((i & 2) != 0) {
            s20Var = v81Var.f34274b;
        }
        if ((i & 4) != 0) {
            c81Var2 = v81Var.f34275c;
        }
        if ((i & 8) != 0) {
            bVar = v81Var.d;
        }
        if ((i & 16) != 0) {
            aVar = v81Var.e;
        }
        m80.a aVar2 = aVar;
        c81 c81Var3 = c81Var2;
        return v81Var.a(c81Var, s20Var, c81Var3, bVar, aVar2);
    }
}
