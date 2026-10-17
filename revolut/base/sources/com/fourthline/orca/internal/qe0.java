package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class qe0 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f32395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f32396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m80.b f32397c;
    private final c d;
    private final m80.a e;
    private final b f;

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qe0$a$a, reason: collision with other inner class name */
        public static final class C0273a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final p70 f32398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final c81 f32399b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final c81 f32400c;

            public C0273a(p70 lottieSource, c81 subtitle, c81 description) {
                Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(description, "description");
                this.f32398a = lottieSource;
                this.f32399b = subtitle;
                this.f32400c = description;
            }

            public final c81 a() {
                return this.f32400c;
            }

            public final p70 b() {
                return this.f32398a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0273a)) {
                    return false;
                }
                C0273a c0273a = (C0273a) obj2;
                return Intrinsics.f(this.f32398a, c0273a.f32398a) && Intrinsics.f(this.f32399b, c0273a.f32399b) && Intrinsics.f(this.f32400c, c0273a.f32400c);
            }

            public int hashCode() {
                return (((this.f32398a.hashCode() * 31) + this.f32399b.hashCode()) * 31) + this.f32400c.hashCode();
            }

            public String toString() {
                return "Default(lottieSource=" + this.f32398a + ", subtitle=" + this.f32399b + ", description=" + this.f32400c + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f32401a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final z10 f32402b;

            public b(List pages, z10 arrowIcon) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(arrowIcon, "arrowIcon");
                this.f32401a = pages;
                this.f32402b = arrowIcon;
            }

            public final z10 a() {
                return this.f32402b;
            }

            public final List b() {
                return this.f32401a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f32401a, bVar.f32401a) && Intrinsics.f(this.f32402b, bVar.f32402b);
            }

            public int hashCode() {
                return (this.f32401a.hashCode() * 31) + this.f32402b.hashCode();
            }

            public String toString() {
                return "OrcaPages(pages=" + this.f32401a + ", arrowIcon=" + this.f32402b + ")";
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z10 f32403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f32404b;

        public b(z10 imageSource, c81 text) {
            Intrinsics.checkNotNullParameter(imageSource, "imageSource");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f32403a = imageSource;
            this.f32404b = text;
        }

        public final z10 a() {
            return this.f32403a;
        }

        public final c81 b() {
            return this.f32404b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f32403a, bVar.f32403a) && Intrinsics.f(this.f32404b, bVar.f32404b);
        }

        public int hashCode() {
            return (this.f32403a.hashCode() * 31) + this.f32404b.hashCode();
        }

        public String toString() {
            return "Instruction(imageSource=" + this.f32403a + ", text=" + this.f32404b + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f32405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f32406b;

        public c(c81 text, c81 link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.f32405a = text;
            this.f32406b = link;
        }

        public final c81 a() {
            return this.f32406b;
        }

        public final c81 b() {
            return this.f32405a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f32405a, cVar.f32405a) && Intrinsics.f(this.f32406b, cVar.f32406b);
        }

        public int hashCode() {
            return (this.f32405a.hashCode() * 31) + this.f32406b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f32405a + ", link=" + this.f32406b + ")";
        }
    }

    public qe0(c81 title, a body, m80.b primaryButton, c cVar, m80.a backButton, b learnHowToScanInstruction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        Intrinsics.checkNotNullParameter(learnHowToScanInstruction, "learnHowToScanInstruction");
        this.f32395a = title;
        this.f32396b = body;
        this.f32397c = primaryButton;
        this.d = cVar;
        this.e = backButton;
        this.f = learnHowToScanInstruction;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qe0)) {
            return false;
        }
        qe0 qe0Var = (qe0) obj2;
        return Intrinsics.f(this.f32395a, qe0Var.f32395a) && Intrinsics.f(this.f32396b, qe0Var.f32396b) && Intrinsics.f(this.f32397c, qe0Var.f32397c) && Intrinsics.f(this.d, qe0Var.d) && Intrinsics.f(this.e, qe0Var.e) && Intrinsics.f(this.f, qe0Var.f);
    }

    public final c81 getTitle() {
        return this.f32395a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f32395a.hashCode() * 31) + this.f32396b.hashCode()) * 31) + this.f32397c.hashCode()) * 31;
        c cVar = this.d;
        return ((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final m80.a n() {
        return this.e;
    }

    public final a o() {
        return this.f32396b;
    }

    public final b p() {
        return this.f;
    }

    public final c q() {
        return this.d;
    }

    public final m80.b r() {
        return this.f32397c;
    }

    public String toString() {
        return "State(title=" + this.f32395a + ", body=" + this.f32396b + ", primaryButton=" + this.f32397c + ", linkButton=" + this.d + ", backButton=" + this.e + ", learnHowToScanInstruction=" + this.f + ")";
    }
}
