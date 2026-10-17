package vuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f292393b;

    public s(String name, r logo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f292392a = name;
        this.f292393b = logo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f292392a, sVar.f292392a) && Intrinsics.f(this.f292393b, sVar.f292393b);
    }

    public final int hashCode() {
        return this.f292393b.hashCode() + (this.f292392a.hashCode() * 31);
    }
}
