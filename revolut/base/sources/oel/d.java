package oel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f224629c;

    public d(String icon, String name, String url2) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f224627a = icon;
        this.f224628b = name;
        this.f224629c = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f224627a, dVar.f224627a) && Intrinsics.f(this.f224628b, dVar.f224628b) && Intrinsics.f(this.f224629c, dVar.f224629c);
    }

    public final int hashCode() {
        return this.f224629c.hashCode() + p.a.c(this.f224627a.hashCode() * 31, 31, this.f224628b);
    }
}
