package oel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f224643c;

    public i(String icon, String title, String description) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f224641a = icon;
        this.f224642b = title;
        this.f224643c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f224641a, iVar.f224641a) && Intrinsics.f(this.f224642b, iVar.f224642b) && Intrinsics.f(this.f224643c, iVar.f224643c);
    }

    public final int hashCode() {
        return this.f224643c.hashCode() + p.a.c(this.f224641a.hashCode() * 31, 31, this.f224642b);
    }
}
