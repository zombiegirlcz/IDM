package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3381c;
    public final e1 d;

    public /* synthetic */ f(int i, String str, String str2, String str3, e1 e1Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(d.f3373a.getDescriptor(), i, 15);
            throw null;
        }
        this.f3379a = str;
        this.f3380b = str2;
        this.f3381c = str3;
        this.d = e1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f3379a, fVar.f3379a) && Intrinsics.f(this.f3380b, fVar.f3380b) && Intrinsics.f(this.f3381c, fVar.f3381c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f3379a.hashCode() * 31, 31, this.f3380b), 31, this.f3381c);
    }

    public f(String id10, String title, String icon, e1 info) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f3379a = id10;
        this.f3380b = title;
        this.f3381c = icon;
        this.d = info;
    }
}
