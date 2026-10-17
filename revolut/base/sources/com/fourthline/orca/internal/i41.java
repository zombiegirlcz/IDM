package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i41 {
    public static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29491c;
    private final Coordinate d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i41(String language, String region, String model, Coordinate location) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f29489a = language;
        this.f29490b = region;
        this.f29491c = model;
        this.d = location;
    }

    public final String a() {
        return this.f29489a;
    }

    public final Coordinate b() {
        return this.d;
    }

    public final String c() {
        return this.f29491c;
    }

    public final String d() {
        return this.f29490b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i41)) {
            return false;
        }
        i41 i41Var = (i41) obj2;
        return Intrinsics.f(this.f29489a, i41Var.f29489a) && Intrinsics.f(this.f29490b, i41Var.f29490b) && Intrinsics.f(this.f29491c, i41Var.f29491c) && Intrinsics.f(this.d, i41Var.d);
    }

    public int hashCode() {
        return (((((this.f29489a.hashCode() * 31) + this.f29490b.hashCode()) * 31) + this.f29491c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "StartSignatureMetadata(language=" + this.f29489a + ", region=" + this.f29490b + ", model=" + this.f29491c + ", location=" + this.d + ")";
    }
}
