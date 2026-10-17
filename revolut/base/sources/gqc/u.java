package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145666c;

    public /* synthetic */ u(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(s.f145663a.getDescriptor(), i, 7);
            throw null;
        }
        this.f145664a = str;
        this.f145665b = str2;
        this.f145666c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f145664a, uVar.f145664a) && Intrinsics.f(this.f145665b, uVar.f145665b) && Intrinsics.f(this.f145666c, uVar.f145666c);
    }

    public final int hashCode() {
        return this.f145666c.hashCode() + p.a.c(this.f145664a.hashCode() * 31, 31, this.f145665b);
    }

    public u(String type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("BR", "issuer");
        this.f145664a = type;
        this.f145665b = value;
        this.f145666c = "BR";
    }
}
