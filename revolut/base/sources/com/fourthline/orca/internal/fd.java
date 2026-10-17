package com.fourthline.orca.internal;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fd implements a01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f28415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f28416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28417c;
    private final String d;
    private final String e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c81 f28418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Pair f28419h;

    public fd(c81 name, Function0 presentation, String alpha2, String alpha3, String flag, String prefix, c81 nationality) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        Intrinsics.checkNotNullParameter(alpha2, "alpha2");
        Intrinsics.checkNotNullParameter(alpha3, "alpha3");
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        this.f28415a = name;
        this.f28416b = presentation;
        this.f28417c = alpha2;
        this.d = alpha3;
        this.e = flag;
        this.f = prefix;
        this.f28418g = nationality;
        this.f28419h = new Pair("country_code", alpha3);
    }

    @Override // com.fourthline.orca.internal.a01
    public Function0 a() {
        return this.f28416b;
    }

    public final String b() {
        return this.f28417c;
    }

    public final String c() {
        return this.d;
    }

    public final Pair d() {
        return this.f28419h;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj2;
        return Intrinsics.f(this.f28415a, fdVar.f28415a) && Intrinsics.f(this.f28416b, fdVar.f28416b) && Intrinsics.f(this.f28417c, fdVar.f28417c) && Intrinsics.f(this.d, fdVar.d) && Intrinsics.f(this.e, fdVar.e) && Intrinsics.f(this.f, fdVar.f) && Intrinsics.f(this.f28418g, fdVar.f28418g);
    }

    public final c81 f() {
        return this.f28418g;
    }

    public final String g() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.a01
    public c81 getName() {
        return this.f28415a;
    }

    public int hashCode() {
        return (((((((((((this.f28415a.hashCode() * 31) + this.f28416b.hashCode()) * 31) + this.f28417c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f28418g.hashCode();
    }

    public String toString() {
        return "Country(name=" + this.f28415a + ", presentation=" + this.f28416b + ", alpha2=" + this.f28417c + ", alpha3=" + this.d + ", flag=" + this.e + ", prefix=" + this.f + ", nationality=" + this.f28418g + ")";
    }
}
