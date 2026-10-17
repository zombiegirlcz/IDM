package znd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f323805a;

    static {
        yld.d[] elements = {yld.d.SPENDING, yld.d.INCOME, yld.d.CASHFLOW};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f323805a = kotlin.collections.d.y0(elements);
    }
}
