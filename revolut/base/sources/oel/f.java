package oel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f224634c;
    public final String d;

    public f(String imageUrl, String position, String name, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f224632a = imageUrl;
        this.f224633b = position;
        this.f224634c = name;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f224632a, fVar.f224632a) && Intrinsics.f(this.f224633b, fVar.f224633b) && Intrinsics.f(this.f224634c, fVar.f224634c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f224632a.hashCode() * 31, 31, this.f224633b), 31, this.f224634c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
