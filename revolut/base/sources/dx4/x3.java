package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x3 implements e1, n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120833c;
    public final String d;
    public final boolean e;
    public final List f;

    public x3(String id10, String title, List links, String str, String parameterKey, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f120831a = id10;
        this.f120832b = title;
        this.f120833c = str;
        this.d = parameterKey;
        this.e = z;
        this.f = links;
    }

    @Override // dx4.n1
    public final List a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj2;
        return Intrinsics.f(this.f120831a, x3Var.f120831a) && Intrinsics.f(this.f120832b, x3Var.f120832b) && Intrinsics.f(this.f120833c, x3Var.f120833c) && Intrinsics.f(this.d, x3Var.d) && this.e == x3Var.e && Intrinsics.f(this.f, x3Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120831a.hashCode() * 31, 31, this.f120832b);
        String str = this.f120833c;
        return this.f.hashCode() + j6.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
