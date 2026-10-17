package qfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245331c;
    public final String d;

    public h(String id10, String name, String logoUrl, String unit) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f245329a = id10;
        this.f245330b = name;
        this.f245331c = logoUrl;
        this.d = unit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f245329a, hVar.f245329a) && Intrinsics.f(this.f245330b, hVar.f245330b) && Intrinsics.f(this.f245331c, hVar.f245331c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f245329a.hashCode() * 31, 31, this.f245330b), 31, this.f245331c);
    }
}
