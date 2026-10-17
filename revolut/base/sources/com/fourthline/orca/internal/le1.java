package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class le1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z10 f30596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t70 f30597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f30598c;

    public le1(z10 maskImageSource, t70 animationOrientation, a aVar) {
        Intrinsics.checkNotNullParameter(maskImageSource, "maskImageSource");
        Intrinsics.checkNotNullParameter(animationOrientation, "animationOrientation");
        this.f30596a = maskImageSource;
        this.f30597b = animationOrientation;
        this.f30598c = aVar;
    }

    public final le1 a(z10 maskImageSource, t70 animationOrientation, a aVar) {
        Intrinsics.checkNotNullParameter(maskImageSource, "maskImageSource");
        Intrinsics.checkNotNullParameter(animationOrientation, "animationOrientation");
        return new le1(maskImageSource, animationOrientation, aVar);
    }

    public final z10 b() {
        return this.f30596a;
    }

    public final a c() {
        return this.f30598c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof le1)) {
            return false;
        }
        le1 le1Var = (le1) obj2;
        return Intrinsics.f(this.f30596a, le1Var.f30596a) && this.f30597b == le1Var.f30597b && Intrinsics.f(this.f30598c, le1Var.f30598c);
    }

    public int hashCode() {
        int iHashCode = ((this.f30596a.hashCode() * 31) + this.f30597b.hashCode()) * 31;
        a aVar = this.f30598c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "VisionScannerMaskState(maskImageSource=" + this.f30596a + ", animationOrientation=" + this.f30597b + ", overlay=" + this.f30598c + ")";
    }

    public static /* synthetic */ le1 a(le1 le1Var, z10 z10Var, t70 t70Var, a aVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            z10Var = le1Var.f30596a;
        }
        if ((i & 2) != 0) {
            t70Var = le1Var.f30597b;
        }
        if ((i & 4) != 0) {
            aVar = le1Var.f30598c;
        }
        return le1Var.a(z10Var, t70Var, aVar);
    }

    public interface a {

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final z10 f30602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f30603b;

            public b(z10 imageSource, boolean z) {
                Intrinsics.checkNotNullParameter(imageSource, "imageSource");
                this.f30602a = imageSource;
                this.f30603b = z;
            }

            @Override // com.fourthline.orca.internal.le1.a
            public z10 a() {
                return this.f30602a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f30602a, bVar.f30602a) && this.f30603b == bVar.f30603b;
            }

            public int hashCode() {
                return (this.f30602a.hashCode() * 31) + Boolean.hashCode(this.f30603b);
            }

            public String toString() {
                return "Default(imageSource=" + this.f30602a + ", isWarning=" + this.f30603b + ")";
            }

            public /* synthetic */ b(z10 z10Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z10Var, (i & 2) != 0 ? false : z);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final z10 f30604a;

            public c(z10 imageSource) {
                Intrinsics.checkNotNullParameter(imageSource, "imageSource");
                this.f30604a = imageSource;
            }

            @Override // com.fourthline.orca.internal.le1.a
            public z10 a() {
                return this.f30604a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f30604a, ((c) obj2).f30604a);
            }

            public int hashCode() {
                return this.f30604a.hashCode();
            }

            public String toString() {
                return "Success(imageSource=" + this.f30604a + ")";
            }
        }

        z10 a();

        /* JADX INFO: renamed from: com.fourthline.orca.internal.le1$a$a, reason: collision with other inner class name */
        public static final class C0242a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final z10 f30599a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f30600b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f30601c;

            public C0242a(z10 imageSource, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(imageSource, "imageSource");
                this.f30599a = imageSource;
                this.f30600b = z;
                this.f30601c = z3;
            }

            @Override // com.fourthline.orca.internal.le1.a
            public z10 a() {
                return this.f30599a;
            }

            public final boolean b() {
                return this.f30601c;
            }

            public final boolean c() {
                return this.f30600b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0242a)) {
                    return false;
                }
                C0242a c0242a = (C0242a) obj2;
                return Intrinsics.f(this.f30599a, c0242a.f30599a) && this.f30600b == c0242a.f30600b && this.f30601c == c0242a.f30601c;
            }

            public int hashCode() {
                return (((this.f30599a.hashCode() * 31) + Boolean.hashCode(this.f30600b)) * 31) + Boolean.hashCode(this.f30601c);
            }

            public String toString() {
                return "AutoDetect(imageSource=" + this.f30599a + ", isWarning=" + this.f30600b + ", isAnimating=" + this.f30601c + ")";
            }

            public /* synthetic */ C0242a(z10 z10Var, boolean z, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z10Var, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z3);
            }
        }
    }

    public final t70 a() {
        return this.f30597b;
    }
}
