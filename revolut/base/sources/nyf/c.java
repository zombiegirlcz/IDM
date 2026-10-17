package nyf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f220868c;
    public final String d;
    public final a e;

    public c(String experienceId, String name, String str, String image, a parameters) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f220866a = experienceId;
        this.f220867b = name;
        this.f220868c = str;
        this.d = image;
        this.e = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f220866a, cVar.f220866a) && Intrinsics.f(this.f220867b, cVar.f220867b) && Intrinsics.f(this.f220868c, cVar.f220868c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f220866a.hashCode() * 31, 31, this.f220867b);
        String str = this.f220868c;
        return this.e.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
