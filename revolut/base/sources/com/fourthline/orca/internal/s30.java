package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s30 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f32895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f32896c;
    private final p70 d;
    private final m80.b e;
    private final m80.a f;

    public s30(String name, c81 title, c81 description, p70 lottieSource, m80.b primaryButton, m80.a secondaryButton) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f32894a = name;
        this.f32895b = title;
        this.f32896c = description;
        this.d = lottieSource;
        this.e = primaryButton;
        this.f = secondaryButton;
    }

    public final s30 a(String name, c81 title, c81 description, p70 lottieSource, m80.b primaryButton, m80.a secondaryButton) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        return new s30(name, title, description, lottieSource, primaryButton, secondaryButton);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s30)) {
            return false;
        }
        s30 s30Var = (s30) obj2;
        return Intrinsics.f(this.f32894a, s30Var.f32894a) && Intrinsics.f(this.f32895b, s30Var.f32895b) && Intrinsics.f(this.f32896c, s30Var.f32896c) && Intrinsics.f(this.d, s30Var.d) && Intrinsics.f(this.e, s30Var.e) && Intrinsics.f(this.f, s30Var.f);
    }

    public final c81 getTitle() {
        return this.f32895b;
    }

    public int hashCode() {
        return (((((((((this.f32894a.hashCode() * 31) + this.f32895b.hashCode()) * 31) + this.f32896c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final p70 n() {
        return this.d;
    }

    public final String o() {
        return this.f32894a;
    }

    public final m80.b p() {
        return this.e;
    }

    public final m80.a q() {
        return this.f;
    }

    public String toString() {
        return "State(name=" + this.f32894a + ", title=" + this.f32895b + ", description=" + this.f32896c + ", lottieSource=" + this.d + ", primaryButton=" + this.e + ", secondaryButton=" + this.f + ")";
    }

    public static /* synthetic */ s30 a(s30 s30Var, String str, c81 c81Var, c81 c81Var2, p70 p70Var, m80.b bVar, m80.a aVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = s30Var.f32894a;
        }
        if ((i & 2) != 0) {
            c81Var = s30Var.f32895b;
        }
        if ((i & 4) != 0) {
            c81Var2 = s30Var.f32896c;
        }
        if ((i & 8) != 0) {
            p70Var = s30Var.d;
        }
        if ((i & 16) != 0) {
            bVar = s30Var.e;
        }
        if ((i & 32) != 0) {
            aVar = s30Var.f;
        }
        m80.b bVar2 = bVar;
        m80.a aVar2 = aVar;
        return s30Var.a(str, c81Var, c81Var2, p70Var, bVar2, aVar2);
    }

    public final c81 a() {
        return this.f32896c;
    }
}
