package ggk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143765c;
    public final ArrayList d;

    public o0(String id10, String title, String str, ArrayList benefits) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.f143763a = id10;
        this.f143764b = title;
        this.f143765c = str;
        this.d = benefits;
    }

    public static o0 a(o0 o0Var, ArrayList benefits) {
        String id10 = o0Var.f143763a;
        String title = o0Var.f143764b;
        String str = o0Var.f143765c;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        return new o0(id10, title, str, benefits);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return this.f143763a.equals(o0Var.f143763a) && Intrinsics.f(this.f143764b, o0Var.f143764b) && Intrinsics.f(this.f143765c, o0Var.f143765c) && this.d.equals(o0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f143763a.hashCode() * 31, 31, this.f143764b);
        String str = this.f143765c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
