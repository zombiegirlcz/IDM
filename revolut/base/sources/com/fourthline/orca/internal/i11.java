package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i11 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f29466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f29467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f29468c;
    private final List d;
    private final p70 e;
    private final m80.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m80.a f29469g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f29470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z10 f29471b;

        public a(c81 text, z10 icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f29470a = text;
            this.f29471b = icon;
        }

        public final z10 a() {
            return this.f29471b;
        }

        public final c81 b() {
            return this.f29470a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f29470a, aVar.f29470a) && Intrinsics.f(this.f29471b, aVar.f29471b);
        }

        public int hashCode() {
            return (this.f29470a.hashCode() * 31) + this.f29471b.hashCode();
        }

        public String toString() {
            return "Hint(text=" + this.f29470a + ", icon=" + this.f29471b + ")";
        }
    }

    public i11(c81 title, c81 subtitle, c81 description, List hints, p70 lottieSource, m80.b primaryButton, m80.a secondaryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(hints, "hints");
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f29466a = title;
        this.f29467b = subtitle;
        this.f29468c = description;
        this.d = hints;
        this.e = lottieSource;
        this.f = primaryButton;
        this.f29469g = secondaryButton;
    }

    public final c81 a() {
        return this.f29468c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i11)) {
            return false;
        }
        i11 i11Var = (i11) obj2;
        return Intrinsics.f(this.f29466a, i11Var.f29466a) && Intrinsics.f(this.f29467b, i11Var.f29467b) && Intrinsics.f(this.f29468c, i11Var.f29468c) && Intrinsics.f(this.d, i11Var.d) && Intrinsics.f(this.e, i11Var.e) && Intrinsics.f(this.f, i11Var.f) && Intrinsics.f(this.f29469g, i11Var.f29469g);
    }

    public final c81 getTitle() {
        return this.f29466a;
    }

    public int hashCode() {
        return (((((((((((this.f29466a.hashCode() * 31) + this.f29467b.hashCode()) * 31) + this.f29468c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f29469g.hashCode();
    }

    public final List n() {
        return this.d;
    }

    public final p70 o() {
        return this.e;
    }

    public final m80.b p() {
        return this.f;
    }

    public final m80.a q() {
        return this.f29469g;
    }

    public String toString() {
        return "State(title=" + this.f29466a + ", subtitle=" + this.f29467b + ", description=" + this.f29468c + ", hints=" + this.d + ", lottieSource=" + this.e + ", primaryButton=" + this.f + ", secondaryButton=" + this.f29469g + ")";
    }
}
