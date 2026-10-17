package do3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116427c;

    public o(String name, String country, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f116425a = name;
        this.f116426b = country;
        this.f116427c = str;
    }

    public final String a() {
        return this.f116427c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f116425a, oVar.f116425a) && Intrinsics.f(this.f116426b, oVar.f116426b) && Intrinsics.f(this.f116427c, oVar.f116427c);
    }

    public final String getCountry() {
        return this.f116426b;
    }

    public final String getName() {
        return this.f116425a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f116425a.hashCode() * 31, 31, this.f116426b);
        String str = this.f116427c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
