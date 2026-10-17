package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface zp0 {
    c81 a();

    kd1 b();

    boolean c();

    kd1 d();

    c81 getTitle();

    public static final class b implements zp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f35666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p70 f35667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f35668c;
        private final List d;
        private final kd1 e;
        private final kd1 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f35669g;

        public b(c81 title, p70 lottieSource, c81 description, List bulletPoints, kd1 primaryButtonIntent, kd1 kd1Var, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(bulletPoints, "bulletPoints");
            Intrinsics.checkNotNullParameter(primaryButtonIntent, "primaryButtonIntent");
            this.f35666a = title;
            this.f35667b = lottieSource;
            this.f35668c = description;
            this.d = bulletPoints;
            this.e = primaryButtonIntent;
            this.f = kd1Var;
            this.f35669g = z;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 a() {
            return this.f35668c;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 b() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.zp0
        public boolean c() {
            return this.f35669g;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 d() {
            return this.f;
        }

        public final List e() {
            return this.d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f35666a, bVar.f35666a) && Intrinsics.f(this.f35667b, bVar.f35667b) && Intrinsics.f(this.f35668c, bVar.f35668c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f35669g == bVar.f35669g;
        }

        public final p70 f() {
            return this.f35667b;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 getTitle() {
            return this.f35666a;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f35666a.hashCode() * 31) + this.f35667b.hashCode()) * 31) + this.f35668c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
            kd1 kd1Var = this.f;
            return ((iHashCode + (kd1Var == null ? 0 : kd1Var.hashCode())) * 31) + Boolean.hashCode(this.f35669g);
        }

        public String toString() {
            return "AnimatedWithBullets(title=" + this.f35666a + ", lottieSource=" + this.f35667b + ", description=" + this.f35668c + ", bulletPoints=" + this.d + ", primaryButtonIntent=" + this.e + ", secondaryButtonIntent=" + this.f + ", requiresAnnouncement=" + this.f35669g + ")";
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final z10 f35670a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Function2 f35671b;

            public a(z10 z10Var, Function2 text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f35670a = z10Var;
                this.f35671b = text;
            }

            public final z10 a() {
                return this.f35670a;
            }

            public final Function2 b() {
                return this.f35671b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.f35670a, aVar.f35670a) && Intrinsics.f(this.f35671b, aVar.f35671b);
            }

            public int hashCode() {
                z10 z10Var = this.f35670a;
                return ((z10Var == null ? 0 : z10Var.hashCode()) * 31) + this.f35671b.hashCode();
            }

            public String toString() {
                return "BulletPoint(imageSource=" + this.f35670a + ", text=" + this.f35671b + ")";
            }

            public /* synthetic */ a(z10 z10Var, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : z10Var, function2);
            }
        }

        public /* synthetic */ b(c81 c81Var, p70 p70Var, c81 c81Var2, List list, kd1 kd1Var, kd1 kd1Var2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c81Var, p70Var, c81Var2, list, kd1Var, (i & 32) != 0 ? null : kd1Var2, (i & 64) != 0 ? false : z);
        }
    }

    public static final class d implements zp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f35675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f35676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f35677c;
        private final kd1 d;
        private final kd1 e;

        public d(boolean z, c81 title, c81 description, kd1 primaryButtonIntent, kd1 kd1Var) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonIntent, "primaryButtonIntent");
            this.f35675a = z;
            this.f35676b = title;
            this.f35677c = description;
            this.d = primaryButtonIntent;
            this.e = kd1Var;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 a() {
            return this.f35677c;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 b() {
            return this.d;
        }

        @Override // com.fourthline.orca.internal.zp0
        public boolean c() {
            return this.f35675a;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 d() {
            return this.e;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return this.f35675a == dVar.f35675a && Intrinsics.f(this.f35676b, dVar.f35676b) && Intrinsics.f(this.f35677c, dVar.f35677c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 getTitle() {
            return this.f35676b;
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.f35675a) * 31) + this.f35676b.hashCode()) * 31) + this.f35677c.hashCode()) * 31) + this.d.hashCode()) * 31;
            kd1 kd1Var = this.e;
            return iHashCode + (kd1Var == null ? 0 : kd1Var.hashCode());
        }

        public String toString() {
            return "Default(requiresAnnouncement=" + this.f35675a + ", title=" + this.f35676b + ", description=" + this.f35677c + ", primaryButtonIntent=" + this.d + ", secondaryButtonIntent=" + this.e + ")";
        }

        public /* synthetic */ d(boolean z, c81 c81Var, c81 c81Var2, kd1 kd1Var, kd1 kd1Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, c81Var, c81Var2, kd1Var, (i & 16) != 0 ? null : kd1Var2);
        }
    }

    public static final class e implements zp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z10 f35678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f35679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kd1 f35680c;
        private final kd1 d;
        private final boolean e;
        private final c81 f;

        public e(z10 imageSource, c81 description, kd1 primaryButtonIntent, kd1 kd1Var, boolean z) {
            Intrinsics.checkNotNullParameter(imageSource, "imageSource");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonIntent, "primaryButtonIntent");
            this.f35678a = imageSource;
            this.f35679b = description;
            this.f35680c = primaryButtonIntent;
            this.d = kd1Var;
            this.e = z;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 a() {
            return this.f35679b;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 b() {
            return this.f35680c;
        }

        @Override // com.fourthline.orca.internal.zp0
        public boolean c() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 d() {
            return this.d;
        }

        public final z10 e() {
            return this.f35678a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.f35678a, eVar.f35678a) && Intrinsics.f(this.f35679b, eVar.f35679b) && Intrinsics.f(this.f35680c, eVar.f35680c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 getTitle() {
            return this.f;
        }

        public int hashCode() {
            int iHashCode = ((((this.f35678a.hashCode() * 31) + this.f35679b.hashCode()) * 31) + this.f35680c.hashCode()) * 31;
            kd1 kd1Var = this.d;
            return ((iHashCode + (kd1Var == null ? 0 : kd1Var.hashCode())) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            return "WithImage(imageSource=" + this.f35678a + ", description=" + this.f35679b + ", primaryButtonIntent=" + this.f35680c + ", secondaryButtonIntent=" + this.d + ", requiresAnnouncement=" + this.e + ")";
        }

        public /* synthetic */ e(z10 z10Var, c81 c81Var, kd1 kd1Var, kd1 kd1Var2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10Var, c81Var, kd1Var, (i & 8) != 0 ? null : kd1Var2, (i & 16) != 0 ? false : z);
        }
    }

    public static final class f implements zp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f35681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f35682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kd1 f35683c;
        private final kd1 d;
        private final boolean e;
        private final c81 f;

        public f(List items, c81 description, kd1 primaryButtonIntent, kd1 kd1Var, boolean z) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonIntent, "primaryButtonIntent");
            this.f35681a = items;
            this.f35682b = description;
            this.f35683c = primaryButtonIntent;
            this.d = kd1Var;
            this.e = z;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 a() {
            return this.f35682b;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 b() {
            return this.f35683c;
        }

        @Override // com.fourthline.orca.internal.zp0
        public boolean c() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 d() {
            return this.d;
        }

        public final List e() {
            return this.f35681a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.f35681a, fVar.f35681a) && Intrinsics.f(this.f35682b, fVar.f35682b) && Intrinsics.f(this.f35683c, fVar.f35683c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 getTitle() {
            return this.f;
        }

        public int hashCode() {
            int iHashCode = ((((this.f35681a.hashCode() * 31) + this.f35682b.hashCode()) * 31) + this.f35683c.hashCode()) * 31;
            kd1 kd1Var = this.d;
            return ((iHashCode + (kd1Var == null ? 0 : kd1Var.hashCode())) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            return "WithMenu(items=" + this.f35681a + ", description=" + this.f35682b + ", primaryButtonIntent=" + this.f35683c + ", secondaryButtonIntent=" + this.d + ", requiresAnnouncement=" + this.e + ")";
        }

        public /* synthetic */ f(List list, c81 c81Var, kd1 kd1Var, kd1 kd1Var2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, c81Var, kd1Var, (i & 8) != 0 ? null : kd1Var2, (i & 16) != 0 ? false : z);
        }
    }

    public static final class a implements zp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f35663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p70 f35664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f35665c;
        private final kd1 d;
        private final kd1 e;
        private final boolean f;

        public a(c81 title, p70 lottieSource, c81 c81Var, kd1 primaryButtonIntent, kd1 kd1Var, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
            Intrinsics.checkNotNullParameter(primaryButtonIntent, "primaryButtonIntent");
            this.f35663a = title;
            this.f35664b = lottieSource;
            this.f35665c = c81Var;
            this.d = primaryButtonIntent;
            this.e = kd1Var;
            this.f = z;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 a() {
            return this.f35665c;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 b() {
            return this.d;
        }

        @Override // com.fourthline.orca.internal.zp0
        public boolean c() {
            return this.f;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 d() {
            return this.e;
        }

        public final p70 e() {
            return this.f35664b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f35663a, aVar.f35663a) && Intrinsics.f(this.f35664b, aVar.f35664b) && Intrinsics.f(this.f35665c, aVar.f35665c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 getTitle() {
            return this.f35663a;
        }

        public int hashCode() {
            int iHashCode = ((this.f35663a.hashCode() * 31) + this.f35664b.hashCode()) * 31;
            c81 c81Var = this.f35665c;
            int iHashCode2 = (((iHashCode + (c81Var == null ? 0 : c81Var.hashCode())) * 31) + this.d.hashCode()) * 31;
            kd1 kd1Var = this.e;
            return ((iHashCode2 + (kd1Var != null ? kd1Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f);
        }

        public String toString() {
            return "Animated(title=" + this.f35663a + ", lottieSource=" + this.f35664b + ", description=" + this.f35665c + ", primaryButtonIntent=" + this.d + ", secondaryButtonIntent=" + this.e + ", requiresAnnouncement=" + this.f + ")";
        }

        public /* synthetic */ a(c81 c81Var, p70 p70Var, c81 c81Var2, kd1 kd1Var, kd1 kd1Var2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c81Var, p70Var, (i & 4) != 0 ? null : c81Var2, kd1Var, (i & 16) != 0 ? null : kd1Var2, (i & 32) != 0 ? false : z);
        }
    }

    public static final class c implements zp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f35672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f35673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kd1 f35674c;
        private final kd1 d;
        private final boolean e;
        private final c81 f;

        public c(c81 title, c81 description, kd1 kd1Var, kd1 kd1Var2, boolean z, c81 hint) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.f35672a = title;
            this.f35673b = description;
            this.f35674c = kd1Var;
            this.d = kd1Var2;
            this.e = z;
            this.f = hint;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 a() {
            return this.f35673b;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 b() {
            return this.f35674c;
        }

        @Override // com.fourthline.orca.internal.zp0
        public boolean c() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 d() {
            return this.d;
        }

        public final c81 e() {
            return this.f;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f35672a, cVar.f35672a) && Intrinsics.f(this.f35673b, cVar.f35673b) && Intrinsics.f(this.f35674c, cVar.f35674c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f);
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 getTitle() {
            return this.f35672a;
        }

        public int hashCode() {
            int iHashCode = ((this.f35672a.hashCode() * 31) + this.f35673b.hashCode()) * 31;
            kd1 kd1Var = this.f35674c;
            int iHashCode2 = (iHashCode + (kd1Var == null ? 0 : kd1Var.hashCode())) * 31;
            kd1 kd1Var2 = this.d;
            return ((((iHashCode2 + (kd1Var2 != null ? kd1Var2.hashCode() : 0)) * 31) + Boolean.hashCode(this.e)) * 31) + this.f.hashCode();
        }

        public String toString() {
            return "AnimatedWithHint(title=" + this.f35672a + ", description=" + this.f35673b + ", primaryButtonIntent=" + this.f35674c + ", secondaryButtonIntent=" + this.d + ", requiresAnnouncement=" + this.e + ", hint=" + this.f + ")";
        }

        public /* synthetic */ c(c81 c81Var, c81 c81Var2, kd1 kd1Var, kd1 kd1Var2, boolean z, c81 c81Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c81Var, c81Var2, (i & 4) != 0 ? null : kd1Var, (i & 8) != 0 ? null : kd1Var2, (i & 16) != 0 ? false : z, c81Var3);
        }
    }

    public static final class g implements zp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f35684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function2 f35685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f35686c;
        private final kd1 d;
        private final kd1 e;
        private final z10 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f35687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final c81 f35688h;
        private final c81 i;

        public g(List pages, Function2 onPageViewed, boolean z, kd1 primaryButtonIntent, kd1 kd1Var, z10 arrowIcon, boolean z3) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(onPageViewed, "onPageViewed");
            Intrinsics.checkNotNullParameter(primaryButtonIntent, "primaryButtonIntent");
            Intrinsics.checkNotNullParameter(arrowIcon, "arrowIcon");
            this.f35684a = pages;
            this.f35685b = onPageViewed;
            this.f35686c = z;
            this.d = primaryButtonIntent;
            this.e = kd1Var;
            this.f = arrowIcon;
            this.f35687g = z3;
            c81.b bVar = c81.b.f27406b;
            this.f35688h = bVar;
            this.i = bVar;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 a() {
            return this.i;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 b() {
            return this.d;
        }

        @Override // com.fourthline.orca.internal.zp0
        public boolean c() {
            return this.f35686c;
        }

        @Override // com.fourthline.orca.internal.zp0
        public kd1 d() {
            return this.e;
        }

        public final z10 e() {
            return this.f;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.f35684a, gVar.f35684a) && Intrinsics.f(this.f35685b, gVar.f35685b) && this.f35686c == gVar.f35686c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f35687g == gVar.f35687g;
        }

        public final Function2 f() {
            return this.f35685b;
        }

        public final List g() {
            return this.f35684a;
        }

        @Override // com.fourthline.orca.internal.zp0
        public c81 getTitle() {
            return this.f35688h;
        }

        public final boolean h() {
            return this.f35687g;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f35684a.hashCode() * 31) + this.f35685b.hashCode()) * 31) + Boolean.hashCode(this.f35686c)) * 31) + this.d.hashCode()) * 31;
            kd1 kd1Var = this.e;
            return ((((iHashCode + (kd1Var == null ? 0 : kd1Var.hashCode())) * 31) + this.f.hashCode()) * 31) + Boolean.hashCode(this.f35687g);
        }

        public String toString() {
            return "WithPages(pages=" + this.f35684a + ", onPageViewed=" + this.f35685b + ", requiresAnnouncement=" + this.f35686c + ", primaryButtonIntent=" + this.d + ", secondaryButtonIntent=" + this.e + ", arrowIcon=" + this.f + ", showBackground=" + this.f35687g + ")";
        }

        public /* synthetic */ g(List list, Function2 function2, boolean z, kd1 kd1Var, kd1 kd1Var2, z10 z10Var, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, function2, (i & 4) != 0 ? false : z, kd1Var, (i & 16) != 0 ? null : kd1Var2, z10Var, (i & 64) != 0 ? true : z3);
        }
    }
}
