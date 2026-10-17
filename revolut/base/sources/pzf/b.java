package pzf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f241006c;
    public final String d;
    public final a e;

    public b(String experienceId, String name, String str, String image, a parameters) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f241004a = experienceId;
        this.f241005b = name;
        this.f241006c = str;
        this.d = image;
        this.e = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f241004a, bVar.f241004a) && Intrinsics.f(this.f241005b, bVar.f241005b) && Intrinsics.f(this.f241006c, bVar.f241006c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f241004a.hashCode() * 31, 31, this.f241005b);
        String str = this.f241006c;
        return this.e.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
