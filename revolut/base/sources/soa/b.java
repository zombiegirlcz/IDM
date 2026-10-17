package soa;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f264801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f264802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f264803c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;

    public /* synthetic */ b(c cVar, boolean z, boolean z3) {
        this(cVar, z, z3, null, null, null);
    }

    public static b a(b bVar, boolean z, Boolean bool, Boolean bool2, int i) {
        c type = bVar.f264801a;
        boolean z3 = bVar.f264802b;
        if ((i & 4) != 0) {
            z = bVar.f264803c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            bool = bVar.d;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            bool2 = bVar.e;
        }
        Boolean bool4 = bVar.f;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        return new b(type, z3, z4, bool3, bool2, bool4);
    }

    public final c b() {
        return this.f264801a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f264801a == bVar.f264801a && this.f264802b == bVar.f264802b && this.f264803c == bVar.f264803c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f264801a.hashCode() * 31, 31, this.f264802b), 31, this.f264803c);
        Boolean bool = this.d;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public b(c type, boolean z, boolean z3, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f264801a = type;
        this.f264802b = z;
        this.f264803c = z3;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
    }
}
