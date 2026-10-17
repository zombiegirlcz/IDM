package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143795c;

    public x(String icon, String title, String description) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f143793a = icon;
        this.f143794b = title;
        this.f143795c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f143793a, xVar.f143793a) && Intrinsics.f(this.f143794b, xVar.f143794b) && Intrinsics.f(this.f143795c, xVar.f143795c);
    }

    public final int hashCode() {
        return this.f143795c.hashCode() + p.a.c(this.f143793a.hashCode() * 31, 31, this.f143794b);
    }
}
