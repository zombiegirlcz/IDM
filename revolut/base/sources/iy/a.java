package iy;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f169574b;

    public a(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f169573a = name;
        this.f169574b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f169573a.equals(aVar.f169573a) && this.f169574b == aVar.f169574b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f169574b) + (this.f169573a.hashCode() * 31);
    }
}
