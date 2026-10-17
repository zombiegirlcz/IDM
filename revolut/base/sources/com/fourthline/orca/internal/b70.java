package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b70 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f27021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f27022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f27023c;
    private final p70 d;
    private final m80.b e;
    private final m80.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f27024g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27025a = new a("SCANNING", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f27026b = new a("ERROR", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f27027c;
        private static final /* synthetic */ EnumEntries d;

        static {
            a[] aVarArrA = a();
            f27027c = aVarArrA;
            d = vc.s.n(aVarArrA);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f27025a, f27026b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f27027c.clone();
        }
    }

    public b70(c81 title, c81 subtitle, c81 description, p70 lottieSource, m80.b primaryButton, m80.a secondaryButton, a mode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f27021a = title;
        this.f27022b = subtitle;
        this.f27023c = description;
        this.d = lottieSource;
        this.e = primaryButton;
        this.f = secondaryButton;
        this.f27024g = mode;
    }

    public final b70 a(c81 title, c81 subtitle, c81 description, p70 lottieSource, m80.b primaryButton, m80.a secondaryButton, a mode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new b70(title, subtitle, description, lottieSource, primaryButton, secondaryButton, mode);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b70)) {
            return false;
        }
        b70 b70Var = (b70) obj2;
        return Intrinsics.f(this.f27021a, b70Var.f27021a) && Intrinsics.f(this.f27022b, b70Var.f27022b) && Intrinsics.f(this.f27023c, b70Var.f27023c) && Intrinsics.f(this.d, b70Var.d) && Intrinsics.f(this.e, b70Var.e) && Intrinsics.f(this.f, b70Var.f) && this.f27024g == b70Var.f27024g;
    }

    public final c81 getTitle() {
        return this.f27021a;
    }

    public int hashCode() {
        return (((((((((((this.f27021a.hashCode() * 31) + this.f27022b.hashCode()) * 31) + this.f27023c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f27024g.hashCode();
    }

    public final p70 n() {
        return this.d;
    }

    public final m80.b o() {
        return this.e;
    }

    public final m80.a p() {
        return this.f;
    }

    public String toString() {
        return "State(title=" + this.f27021a + ", subtitle=" + this.f27022b + ", description=" + this.f27023c + ", lottieSource=" + this.d + ", primaryButton=" + this.e + ", secondaryButton=" + this.f + ", mode=" + this.f27024g + ")";
    }

    public static /* synthetic */ b70 a(b70 b70Var, c81 c81Var, c81 c81Var2, c81 c81Var3, p70 p70Var, m80.b bVar, m80.a aVar, a aVar2, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = b70Var.f27021a;
        }
        if ((i & 2) != 0) {
            c81Var2 = b70Var.f27022b;
        }
        if ((i & 4) != 0) {
            c81Var3 = b70Var.f27023c;
        }
        if ((i & 8) != 0) {
            p70Var = b70Var.d;
        }
        if ((i & 16) != 0) {
            bVar = b70Var.e;
        }
        if ((i & 32) != 0) {
            aVar = b70Var.f;
        }
        if ((i & 64) != 0) {
            aVar2 = b70Var.f27024g;
        }
        m80.a aVar3 = aVar;
        a aVar4 = aVar2;
        m80.b bVar2 = bVar;
        c81 c81Var4 = c81Var3;
        return b70Var.a(c81Var, c81Var2, c81Var4, p70Var, bVar2, aVar3, aVar4);
    }

    public final c81 a() {
        return this.f27023c;
    }
}
