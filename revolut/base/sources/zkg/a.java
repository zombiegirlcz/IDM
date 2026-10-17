package zkg;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f322976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f322977c;
    public final boolean d;

    public a(String name, LinkedHashMap properties, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f322975a = name;
        this.f322976b = properties;
        this.f322977c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f322975a, aVar.f322975a) && this.f322976b.equals(aVar.f322976b) && this.f322977c == aVar.f322977c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(r6.b.e(this.f322976b, this.f322975a.hashCode() * 31, 31), 31, this.f322977c);
    }
}
