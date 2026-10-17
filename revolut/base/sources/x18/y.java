package x18;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements cli.n {

    @NotNull
    private static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f302349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ykh.a f302350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r18.n f302351c;
    public final q1 d;
    public final q18.i e;

    public y(x globalNewsMapper, ykh.a navBarFiltersMapper, r18.n recentInsightsMapper, q1 wealthDisclaimerMapper, q18.i navBarMenuItemsMapper) {
        Intrinsics.checkNotNullParameter(globalNewsMapper, "globalNewsMapper");
        Intrinsics.checkNotNullParameter(navBarFiltersMapper, "navBarFiltersMapper");
        Intrinsics.checkNotNullParameter(recentInsightsMapper, "recentInsightsMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimerMapper, "wealthDisclaimerMapper");
        Intrinsics.checkNotNullParameter(navBarMenuItemsMapper, "navBarMenuItemsMapper");
        this.f302349a = globalNewsMapper;
        this.f302350b = navBarFiltersMapper;
        this.f302351c = recentInsightsMapper;
        this.d = wealthDisclaimerMapper;
        this.e = navBarMenuItemsMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r11) {
        /*
            r10 = this;
            x18.q r11 = (x18.q) r11
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r18.n r0 = r10.f302351c
            com.revolut.data.model.Data r1 = r11.f302340b
            java.util.List r0 = a18.f.a(r0, r1)
            com.revolut.data.model.Data r1 = r11.f302341c
            if (r1 == 0) goto L30
            x1.n r2 = new x1.n
            x18.x r3 = r10.f302349a
            r2.<init>(r3)
            wyg.s r4 = new wyg.s
            r5 = 19
            r4.<init>(r3, r5)
            wp4.j0 r5 = new wp4.j0
            r6 = 16
            r5.<init>(r3, r6)
            java.lang.Object r1 = iii.c.f(r1, r2, r4, r5)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L32
        L30:
            zhm.f0 r1 = zhm.f0.f322471a
        L32:
            com.revolut.data.model.Data r2 = r11.d
            z0h.q1 r3 = r10.d
            aah.m r3 = (aah.m) r3
            java.util.List r2 = r3.b(r2)
            x18.v r3 = new x18.v
            q18.i r4 = r10.e
            r5 = 1
            java.util.List r4 = r4.a(r5)
            com.revolut.data.model.Data r11 = r11.f302339a
            java.lang.String r5 = "selectedFilters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r5)
            yjj.j r5 = new yjj.j
            r6 = 6
            ykh.a r7 = r10.f302350b
            r5.<init>(r7, r6)
            yi3.d r6 = new yi3.d
            r8 = 2
            r6.<init>(r7, r8)
            xo8.j0 r8 = new xo8.j0
            r9 = 27
            r8.<init>(r7, r9)
            java.lang.Object r11 = iii.c.f(r11, r5, r6, r8)
            java.util.List r11 = (java.util.List) r11
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r0 = zhm.d0.E0(r1, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = zhm.d0.E0(r2, r0)
            r3.<init>(r0, r4, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x18.y.c(cli.j):cli.o");
    }
}
