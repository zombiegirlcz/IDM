package uel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f279487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f279488c;
    public final String d;

    public b(String id10, String name, String icon, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f279486a = id10;
        this.f279487b = name;
        this.f279488c = icon;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f279486a, bVar.f279486a) && Intrinsics.f(this.f279487b, bVar.f279487b) && Intrinsics.f(this.f279488c, bVar.f279488c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f279486a.hashCode() * 31, 31, this.f279487b), 31, this.f279488c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
