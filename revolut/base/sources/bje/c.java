package bje;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class c implements qf1.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f15597c = {null, yhm.j.c(yhm.k.PUBLICATION, new bi2.g(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f15599b;

    public /* synthetic */ c(int i, String str, n nVar) {
        if (3 != (i & 3)) {
            j1.f(a.f15596a.getDescriptor(), i, 3);
            throw null;
        }
        this.f15598a = str;
        this.f15599b = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f15598a, cVar.f15598a) && Intrinsics.f(this.f15599b, cVar.f15599b);
    }

    public final int hashCode() {
        return this.f15599b.hashCode() + (this.f15598a.hashCode() * 31);
    }

    public c(String itemId, n productItem) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(productItem, "productItem");
        this.f15598a = itemId;
        this.f15599b = productItem;
    }
}
