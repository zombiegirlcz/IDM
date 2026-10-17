package hl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h9 {

    @NotNull
    public static final g9 Companion = new g9();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f153131c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153133b;

    public /* synthetic */ h9(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(f9.f153104a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153132a = str;
        this.f153133b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj2;
        return Intrinsics.f(this.f153132a, h9Var.f153132a) && Intrinsics.f(this.f153133b, h9Var.f153133b);
    }

    public final int hashCode() {
        return this.f153133b.hashCode() + (this.f153132a.hashCode() * 31);
    }

    public h9(String title, ArrayList points) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f153132a = title;
        this.f153133b = points;
    }
}
