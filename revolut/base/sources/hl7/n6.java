package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n6 {

    @NotNull
    public static final m6 Companion = new m6();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7 f153228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x7 f153229c;
    public final List d;

    public /* synthetic */ n6(int i, String str, x7 x7Var, x7 x7Var2, List list) {
        if (15 != (i & 15)) {
            qlm.j1.f(l6.f153186a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153227a = str;
        this.f153228b = x7Var;
        this.f153229c = x7Var2;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj2;
        return Intrinsics.f(this.f153227a, n6Var.f153227a) && Intrinsics.f(this.f153228b, n6Var.f153228b) && Intrinsics.f(this.f153229c, n6Var.f153229c) && Intrinsics.f(this.d, n6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f153229c.hashCode() + ((this.f153228b.hashCode() + (this.f153227a.hashCode() * 31)) * 31)) * 31);
    }
}
