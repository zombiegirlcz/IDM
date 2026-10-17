package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class tr0 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f33841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f33842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33843c;
    private final c81 d;
    private final c81 e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f33845h;
    private final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f33846j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f33847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f33848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f33849c;
        private final InterfaceC0287a.C0288a d;
        private final b e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.tr0$a$a, reason: collision with other inner class name */
        public interface InterfaceC0287a {

            /* JADX INFO: renamed from: com.fourthline.orca.internal.tr0$a$a$a, reason: collision with other inner class name */
            public static final class C0288a implements InterfaceC0287a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f33850a;

                public C0288a(String title) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.f33850a = title;
                }

                public String a() {
                    return this.f33850a;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C0288a) && Intrinsics.f(this.f33850a, ((C0288a) obj2).f33850a);
                }

                public int hashCode() {
                    return this.f33850a.hashCode();
                }

                public String toString() {
                    return "Legal(title=" + this.f33850a + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.tr0$a$a$b */
            public static final class b implements InterfaceC0287a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f33851a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final z10 f33852b;

                public b(String title, z10 iconImageSource) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(iconImageSource, "iconImageSource");
                    this.f33851a = title;
                    this.f33852b = iconImageSource;
                }

                public final z10 a() {
                    return this.f33852b;
                }

                public String b() {
                    return this.f33851a;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj2;
                    return Intrinsics.f(this.f33851a, bVar.f33851a) && Intrinsics.f(this.f33852b, bVar.f33852b);
                }

                public int hashCode() {
                    return (this.f33851a.hashCode() * 31) + this.f33852b.hashCode();
                }

                public String toString() {
                    return "Sign(title=" + this.f33851a + ", iconImageSource=" + this.f33852b + ")";
                }
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c81 f33853a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final p70 f33854b;

            public b(c81 title, p70 lottieSource) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
                this.f33853a = title;
                this.f33854b = lottieSource;
            }

            public final p70 a() {
                return this.f33854b;
            }

            public final c81 b() {
                return this.f33853a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f33853a, bVar.f33853a) && Intrinsics.f(this.f33854b, bVar.f33854b);
            }

            public int hashCode() {
                return (this.f33853a.hashCode() * 31) + this.f33854b.hashCode();
            }

            public String toString() {
                return "LoaderState(title=" + this.f33853a + ", lottieSource=" + this.f33854b + ")";
            }
        }

        public a(c81 title, List signDocuments, List legalDocuments, InterfaceC0287a.C0288a c0288a, b bVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(signDocuments, "signDocuments");
            Intrinsics.checkNotNullParameter(legalDocuments, "legalDocuments");
            this.f33847a = title;
            this.f33848b = signDocuments;
            this.f33849c = legalDocuments;
            this.d = c0288a;
            this.e = bVar;
        }

        public final a a(c81 title, List signDocuments, List legalDocuments, InterfaceC0287a.C0288a c0288a, b bVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(signDocuments, "signDocuments");
            Intrinsics.checkNotNullParameter(legalDocuments, "legalDocuments");
            return new a(title, signDocuments, legalDocuments, c0288a, bVar);
        }

        public final List b() {
            return this.f33849c;
        }

        public final b c() {
            return this.e;
        }

        public final List d() {
            return this.f33848b;
        }

        public final c81 e() {
            return this.f33847a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f33847a, aVar.f33847a) && Intrinsics.f(this.f33848b, aVar.f33848b) && Intrinsics.f(this.f33849c, aVar.f33849c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
        }

        public int hashCode() {
            int iHashCode = ((((this.f33847a.hashCode() * 31) + this.f33848b.hashCode()) * 31) + this.f33849c.hashCode()) * 31;
            InterfaceC0287a.C0288a c0288a = this.d;
            int iHashCode2 = (iHashCode + (c0288a == null ? 0 : c0288a.hashCode())) * 31;
            b bVar = this.e;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "Agreements(title=" + this.f33847a + ", signDocuments=" + this.f33848b + ", legalDocuments=" + this.f33849c + ", disclaimerDocument=" + this.d + ", loader=" + this.e + ")";
        }

        public static /* synthetic */ a a(a aVar, c81 c81Var, List list, List list2, InterfaceC0287a.C0288a c0288a, b bVar, int i, Object obj2) {
            if ((i & 1) != 0) {
                c81Var = aVar.f33847a;
            }
            if ((i & 2) != 0) {
                list = aVar.f33848b;
            }
            if ((i & 4) != 0) {
                list2 = aVar.f33849c;
            }
            if ((i & 8) != 0) {
                c0288a = aVar.d;
            }
            if ((i & 16) != 0) {
                bVar = aVar.e;
            }
            b bVar2 = bVar;
            List list3 = list2;
            return aVar.a(c81Var, list, list3, c0288a, bVar2);
        }

        public final InterfaceC0287a.C0288a a() {
            return this.d;
        }
    }

    public tr0(c81 title, a agreements, String str, c81 primaryButtonText, c81 secondaryButtonText, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f33841a = title;
        this.f33842b = agreements;
        this.f33843c = str;
        this.d = primaryButtonText;
        this.e = secondaryButtonText;
        this.f = z;
        this.f33844g = z3;
        this.f33845h = z4;
        this.i = z6;
        this.f33846j = z11;
    }

    public final tr0 a(c81 title, a agreements, String str, c81 primaryButtonText, c81 secondaryButtonText, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        return new tr0(title, agreements, str, primaryButtonText, secondaryButtonText, z, z3, z4, z6, z11);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tr0)) {
            return false;
        }
        tr0 tr0Var = (tr0) obj2;
        return Intrinsics.f(this.f33841a, tr0Var.f33841a) && Intrinsics.f(this.f33842b, tr0Var.f33842b) && Intrinsics.f(this.f33843c, tr0Var.f33843c) && Intrinsics.f(this.d, tr0Var.d) && Intrinsics.f(this.e, tr0Var.e) && this.f == tr0Var.f && this.f33844g == tr0Var.f33844g && this.f33845h == tr0Var.f33845h && this.i == tr0Var.i && this.f33846j == tr0Var.f33846j;
    }

    public final c81 getTitle() {
        return this.f33841a;
    }

    public int hashCode() {
        int iHashCode = ((this.f33841a.hashCode() * 31) + this.f33842b.hashCode()) * 31;
        String str = this.f33843c;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.f33844g)) * 31) + Boolean.hashCode(this.f33845h)) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.f33846j);
    }

    public final a n() {
        return this.f33842b;
    }

    public final String o() {
        return this.f33843c;
    }

    public final boolean p() {
        return this.f;
    }

    public final boolean q() {
        return this.f33845h;
    }

    public final c81 r() {
        return this.d;
    }

    public final boolean s() {
        return this.f33844g;
    }

    public final boolean t() {
        return this.f33846j;
    }

    public String toString() {
        return "State(title=" + this.f33841a + ", agreements=" + this.f33842b + ", info=" + this.f33843c + ", primaryButtonText=" + this.d + ", secondaryButtonText=" + this.e + ", primaryButtonEnabled=" + this.f + ", secondaryButtonEnabled=" + this.f33844g + ", primaryButtonInProgress=" + this.f33845h + ", isTermsChecked=" + this.i + ", isClaimsChecked=" + this.f33846j + ")";
    }

    public final boolean u() {
        return this.i;
    }

    public static /* synthetic */ tr0 a(tr0 tr0Var, c81 c81Var, a aVar, String str, c81 c81Var2, c81 c81Var3, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = tr0Var.f33841a;
        }
        if ((i & 2) != 0) {
            aVar = tr0Var.f33842b;
        }
        if ((i & 4) != 0) {
            str = tr0Var.f33843c;
        }
        if ((i & 8) != 0) {
            c81Var2 = tr0Var.d;
        }
        if ((i & 16) != 0) {
            c81Var3 = tr0Var.e;
        }
        if ((i & 32) != 0) {
            z = tr0Var.f;
        }
        if ((i & 64) != 0) {
            z3 = tr0Var.f33844g;
        }
        if ((i & 128) != 0) {
            z4 = tr0Var.f33845h;
        }
        if ((i & 256) != 0) {
            z6 = tr0Var.i;
        }
        if ((i & 512) != 0) {
            z11 = tr0Var.f33846j;
        }
        boolean z12 = z6;
        boolean z29 = z11;
        boolean z31 = z3;
        boolean z41 = z4;
        c81 c81Var4 = c81Var3;
        boolean z49 = z;
        return tr0Var.a(c81Var, aVar, str, c81Var2, c81Var4, z49, z31, z41, z12, z29);
    }
}
