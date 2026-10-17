package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class dn implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p70 f27828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f27829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f27830c;
    private final c81 d;
    private final kd1 e;
    private final kd1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f27831g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z10 f27832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f27833b;

        public a(z10 imageSource, c81 text) {
            Intrinsics.checkNotNullParameter(imageSource, "imageSource");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f27832a = imageSource;
            this.f27833b = text;
        }

        public final z10 a() {
            return this.f27832a;
        }

        public final c81 b() {
            return this.f27833b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f27832a, aVar.f27832a) && Intrinsics.f(this.f27833b, aVar.f27833b);
        }

        public int hashCode() {
            return (this.f27832a.hashCode() * 31) + this.f27833b.hashCode();
        }

        public String toString() {
            return "BulletPoint(imageSource=" + this.f27832a + ", text=" + this.f27833b + ")";
        }
    }

    public dn(p70 lottieSource, c81 header, c81 title, c81 description, kd1 primaryButtonIntent, kd1 secondaryButtonIntent, List bulletPoints) {
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonIntent, "primaryButtonIntent");
        Intrinsics.checkNotNullParameter(secondaryButtonIntent, "secondaryButtonIntent");
        Intrinsics.checkNotNullParameter(bulletPoints, "bulletPoints");
        this.f27828a = lottieSource;
        this.f27829b = header;
        this.f27830c = title;
        this.d = description;
        this.e = primaryButtonIntent;
        this.f = secondaryButtonIntent;
        this.f27831g = bulletPoints;
    }

    public final c81 a() {
        return this.d;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dn)) {
            return false;
        }
        dn dnVar = (dn) obj2;
        return Intrinsics.f(this.f27828a, dnVar.f27828a) && Intrinsics.f(this.f27829b, dnVar.f27829b) && Intrinsics.f(this.f27830c, dnVar.f27830c) && Intrinsics.f(this.d, dnVar.d) && Intrinsics.f(this.e, dnVar.e) && Intrinsics.f(this.f, dnVar.f) && Intrinsics.f(this.f27831g, dnVar.f27831g);
    }

    public final c81 getTitle() {
        return this.f27830c;
    }

    public int hashCode() {
        return (((((((((((this.f27828a.hashCode() * 31) + this.f27829b.hashCode()) * 31) + this.f27830c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f27831g.hashCode();
    }

    public final List n() {
        return this.f27831g;
    }

    public final c81 o() {
        return this.f27829b;
    }

    public final p70 p() {
        return this.f27828a;
    }

    public String toString() {
        return "State(lottieSource=" + this.f27828a + ", header=" + this.f27829b + ", title=" + this.f27830c + ", description=" + this.d + ", primaryButtonIntent=" + this.e + ", secondaryButtonIntent=" + this.f + ", bulletPoints=" + this.f27831g + ")";
    }
}
