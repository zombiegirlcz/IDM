package kme;

import ip0.ep;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements e {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f185790a;

    public g(b lifestyleHomeProductsIconMapper) {
        Intrinsics.checkNotNullParameter(lifestyleHomeProductsIconMapper, "lifestyleHomeProductsIconMapper");
        this.f185790a = lifestyleHomeProductsIconMapper;
    }

    public final List a() {
        IntRange intRange = new IntRange(0, 7, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new ep(a0.d.n("LIFESTYLE_HOME_ICONS_ID", it8.nextInt())));
        }
        xk xkVar = new xk("LIFESTYLE_HOME_ICONS_ID", arrayList, 4, null, null, 56);
        yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
        return u.c(xkVar);
    }
}
