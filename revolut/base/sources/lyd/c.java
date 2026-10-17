package lyd;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f200786a;

    static {
        io3.k[] elements = {io3.k.ACTIVE, io3.k.INACTIVE, io3.k.DELISTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f200786a = kotlin.collections.d.y0(elements);
    }

    public static final List a(List list, io3.l pocketType) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        return y.J(y.x(y.n(d0.Q(list), new kxd.b(pocketType, 1)), new b(0)));
    }

    public static final List b(List list, Set vaultTypes) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(vaultTypes, "vaultTypes");
        return y.J(y.x(y.n(d0.Q(list), new imk.e(8, vaultTypes)), new lv9.c(29)));
    }
}
