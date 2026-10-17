package ymi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f315014c;
    public final String d;
    public final String e;

    public g(String id10, String name, String logo, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f315012a = id10;
        this.f315013b = name;
        this.f315014c = logo;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f315012a, gVar.f315012a) && Intrinsics.f(this.f315013b, gVar.f315013b) && Intrinsics.f(this.f315014c, gVar.f315014c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f315012a.hashCode() * 31, 31, this.f315013b), 31, this.f315014c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
