package dx4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p5 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120723c;
    public final ArrayList d;

    public p5(String id10, String title, String parameterKey, ArrayList variants) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.f120721a = id10;
        this.f120722b = title;
        this.f120723c = parameterKey;
        this.d = variants;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj2;
        return Intrinsics.f(this.f120721a, p5Var.f120721a) && Intrinsics.f(this.f120722b, p5Var.f120722b) && Intrinsics.f(this.f120723c, p5Var.f120723c) && this.d.equals(p5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f120721a.hashCode() * 31, 31, this.f120722b), 31, this.f120723c);
    }
}
