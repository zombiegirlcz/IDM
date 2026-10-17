package mnh;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import v60.g;
import zhm.a1;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f207506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f207507c;
    public static final Set d;
    public static final Set e;
    public static final LinkedHashSet f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f207508a;

    static {
        z[] elements = {z.EQUITY, z.ADR, z.SPAC, z.WARRANT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        f207506b = setY0;
        Set setB = y0.b(z.ETF);
        f207507c = setB;
        Set setB2 = y0.b(z.BOND);
        d = setB2;
        Set setB3 = y0.b(z.CFD);
        e = setB3;
        f = a1.l(a1.l(a1.l(a1.l(setY0, setB), setB2), setB3), y0.b(z.COMMODITY));
    }

    public c(g recentlyViewedAssetsInteractor) {
        Intrinsics.checkNotNullParameter(recentlyViewedAssetsInteractor, "recentlyViewedAssetsInteractor");
        this.f207508a = recentlyViewedAssetsInteractor;
    }
}
