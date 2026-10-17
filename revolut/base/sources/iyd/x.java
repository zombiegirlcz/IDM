package iyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169697c;
    public final String d;
    public final c e;

    public /* synthetic */ x(int i, String str, String str2, String str3, String str4, c cVar) {
        if (31 != (i & 31)) {
            j1.f(v.f169694a.getDescriptor(), i, 31);
            throw null;
        }
        this.f169695a = str;
        this.f169696b = str2;
        this.f169697c = str3;
        this.d = str4;
        this.e = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f169695a, xVar.f169695a) && Intrinsics.f(this.f169696b, xVar.f169696b) && Intrinsics.f(this.f169697c, xVar.f169697c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f169695a.hashCode() * 31, 31, this.f169696b);
        String str = this.f169697c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public x(String id10, String title, String str, String str2, c action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f169695a = id10;
        this.f169696b = title;
        this.f169697c = str;
        this.d = str2;
        this.e = action;
    }
}
