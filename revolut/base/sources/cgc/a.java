package cgc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23906c;
    public final int d;

    public a(int i, String id10, String name, List perkIds) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(perkIds, "perkIds");
        this.f23904a = id10;
        this.f23905b = name;
        this.f23906c = perkIds;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f23904a, aVar.f23904a) && Intrinsics.f(this.f23905b, aVar.f23905b) && Intrinsics.f(this.f23906c, aVar.f23906c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.d(p.a.c(this.f23904a.hashCode() * 31, 31, this.f23905b), 31, this.f23906c);
    }
}
