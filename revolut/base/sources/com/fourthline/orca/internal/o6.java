package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o6 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f31588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a9 f31589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p70 f31590c;

    public o6(c81 title, a9 backButtonState, p70 lottieSource) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backButtonState, "backButtonState");
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        this.f31588a = title;
        this.f31589b = backButtonState;
        this.f31590c = lottieSource;
    }

    public final o6 a(c81 title, a9 backButtonState, p70 lottieSource) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backButtonState, "backButtonState");
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        return new o6(title, backButtonState, lottieSource);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj2;
        return Intrinsics.f(this.f31588a, o6Var.f31588a) && Intrinsics.f(this.f31589b, o6Var.f31589b) && Intrinsics.f(this.f31590c, o6Var.f31590c);
    }

    public final c81 getTitle() {
        return this.f31588a;
    }

    public int hashCode() {
        return (((this.f31588a.hashCode() * 31) + this.f31589b.hashCode()) * 31) + this.f31590c.hashCode();
    }

    public final a9 n() {
        return this.f31589b;
    }

    public final p70 o() {
        return this.f31590c;
    }

    public String toString() {
        return "State(title=" + this.f31588a + ", backButtonState=" + this.f31589b + ", lottieSource=" + this.f31590c + ")";
    }

    public static /* synthetic */ o6 a(o6 o6Var, c81 c81Var, a9 a9Var, p70 p70Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = o6Var.f31588a;
        }
        if ((i & 2) != 0) {
            a9Var = o6Var.f31589b;
        }
        if ((i & 4) != 0) {
            p70Var = o6Var.f31590c;
        }
        return o6Var.a(c81Var, a9Var, p70Var);
    }
}
