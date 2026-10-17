package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bu implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f27228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f27229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f27230c;
    private final a d;
    private final boolean e;
    private final b f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f27231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27232b;

        public a(c81 text, String link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.f27231a = text;
            this.f27232b = link;
        }

        public final String a() {
            return this.f27232b;
        }

        public final c81 b() {
            return this.f27231a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f27231a, aVar.f27231a) && Intrinsics.f(this.f27232b, aVar.f27232b);
        }

        public int hashCode() {
            return (this.f27231a.hashCode() * 31) + this.f27232b.hashCode();
        }

        public String toString() {
            return "Hint(text=" + this.f27231a + ", link=" + this.f27232b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f27233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c81 f27234b;

        public b(c81 text, c81 link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.f27233a = text;
            this.f27234b = link;
        }

        public final c81 a() {
            return this.f27234b;
        }

        public final c81 b() {
            return this.f27233a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f27233a, bVar.f27233a) && Intrinsics.f(this.f27234b, bVar.f27234b);
        }

        public int hashCode() {
            return (this.f27233a.hashCode() * 31) + this.f27234b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f27233a + ", link=" + this.f27234b + ")";
        }
    }

    public bu(c81 title, c81 description, c81 pinInputTitle, a hint, boolean z, b linkButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(pinInputTitle, "pinInputTitle");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(linkButton, "linkButton");
        this.f27228a = title;
        this.f27229b = description;
        this.f27230c = pinInputTitle;
        this.d = hint;
        this.e = z;
        this.f = linkButton;
    }

    public final bu a(c81 title, c81 description, c81 pinInputTitle, a hint, boolean z, b linkButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(pinInputTitle, "pinInputTitle");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(linkButton, "linkButton");
        return new bu(title, description, pinInputTitle, hint, z, linkButton);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bu)) {
            return false;
        }
        bu buVar = (bu) obj2;
        return Intrinsics.f(this.f27228a, buVar.f27228a) && Intrinsics.f(this.f27229b, buVar.f27229b) && Intrinsics.f(this.f27230c, buVar.f27230c) && Intrinsics.f(this.d, buVar.d) && this.e == buVar.e && Intrinsics.f(this.f, buVar.f);
    }

    public final c81 getTitle() {
        return this.f27228a;
    }

    public int hashCode() {
        return (((((((((this.f27228a.hashCode() * 31) + this.f27229b.hashCode()) * 31) + this.f27230c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + this.f.hashCode();
    }

    public final a n() {
        return this.d;
    }

    public final b o() {
        return this.f;
    }

    public final c81 p() {
        return this.f27230c;
    }

    public final boolean q() {
        return this.e;
    }

    public String toString() {
        return "State(title=" + this.f27228a + ", description=" + this.f27229b + ", pinInputTitle=" + this.f27230c + ", hint=" + this.d + ", isPrimaryButtonEnabled=" + this.e + ", linkButton=" + this.f + ")";
    }

    public static /* synthetic */ bu a(bu buVar, c81 c81Var, c81 c81Var2, c81 c81Var3, a aVar, boolean z, b bVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = buVar.f27228a;
        }
        if ((i & 2) != 0) {
            c81Var2 = buVar.f27229b;
        }
        if ((i & 4) != 0) {
            c81Var3 = buVar.f27230c;
        }
        if ((i & 8) != 0) {
            aVar = buVar.d;
        }
        if ((i & 16) != 0) {
            z = buVar.e;
        }
        if ((i & 32) != 0) {
            bVar = buVar.f;
        }
        boolean z3 = z;
        b bVar2 = bVar;
        return buVar.a(c81Var, c81Var2, c81Var3, aVar, z3, bVar2);
    }

    public final c81 a() {
        return this.f27229b;
    }
}
