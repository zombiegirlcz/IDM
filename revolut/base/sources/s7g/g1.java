package s7g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1 f260728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f260729c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new s77.x(15)), yhm.j.c(kVar, new s77.x(16))};
    }

    public g1(int i, String str, v1 v1Var, List list, List list2) {
        if (7 != (i & 7)) {
            qlm.j1.f(e1.f260703a.getDescriptor(), i, 7);
            throw null;
        }
        this.f260727a = str;
        this.f260728b = v1Var;
        this.f260729c = list;
        if ((i & 8) == 0) {
            this.d = zhm.f0.f322471a;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f260727a, g1Var.f260727a) && Intrinsics.f(this.f260728b, g1Var.f260728b) && Intrinsics.f(this.f260729c, g1Var.f260729c) && Intrinsics.f(this.d, g1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f260728b.hashCode() + (this.f260727a.hashCode() * 31)) * 31, 31, this.f260729c);
    }

    public g1(String itineraryOfferId, v1 primaryContact, ArrayList travellers, ArrayList selectedExtraProducts) {
        Intrinsics.checkNotNullParameter(itineraryOfferId, "itineraryOfferId");
        Intrinsics.checkNotNullParameter(primaryContact, "primaryContact");
        Intrinsics.checkNotNullParameter(travellers, "travellers");
        Intrinsics.checkNotNullParameter(selectedExtraProducts, "selectedExtraProducts");
        this.f260727a = itineraryOfferId;
        this.f260728b = primaryContact;
        this.f260729c = travellers;
        this.d = selectedExtraProducts;
    }
}
