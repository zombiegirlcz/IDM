package gu7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p4 {

    @NotNull
    public static final o4 Companion = new o4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146809c = {null, yhm.j.c(yhm.k.PUBLICATION, new v1(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146811b;

    public /* synthetic */ p4(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(n4.f146804a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146810a = str;
        this.f146811b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj2;
        return Intrinsics.f(this.f146810a, p4Var.f146810a) && Intrinsics.f(this.f146811b, p4Var.f146811b);
    }

    public final int hashCode() {
        return this.f146811b.hashCode() + (this.f146810a.hashCode() * 31);
    }

    public p4(String title, List products) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f146810a = title;
        this.f146811b = products;
    }
}
