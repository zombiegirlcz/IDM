package fmg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f136429c;

    public h0(String str, String text, a0 style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f136427a = str;
        this.f136428b = text;
        this.f136429c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f136427a, h0Var.f136427a) && Intrinsics.f(this.f136428b, h0Var.f136428b) && this.f136429c == h0Var.f136429c;
    }

    public final int hashCode() {
        String str = this.f136427a;
        return this.f136429c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f136428b);
    }
}
