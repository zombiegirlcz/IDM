package uua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283190c;
    public final String d;
    public final String e;

    public a(String id10, String name, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f283188a = id10;
        this.f283189b = name;
        this.f283190c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f283188a, aVar.f283188a) && Intrinsics.f(this.f283189b, aVar.f283189b) && Intrinsics.f(this.f283190c, aVar.f283190c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f283188a.hashCode() * 31, 31, this.f283189b);
        String str = this.f283190c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
