package s6h;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.n {

    @NotNull
    public static final a Companion = new a();
    public static final BigDecimal d = new BigDecimal(100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f260358a = w.y0(new s1g.a(20));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f260359b = w.y0(new s1g.a(21));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f260360c = w.y0(new s1g.a(22));

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r8) {
        /*
            r7 = this;
            s6h.d r8 = (s6h.d) r8
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            s6h.j r0 = new s6h.j
            com.revolut.data.model.Data r8 = r8.f260346a
            if (r8 == 0) goto L28
            s6h.k r1 = new s6h.k
            r2 = 0
            r1.<init>(r7)
            s6d.r r2 = new s6d.r
            r3 = 9
            r2.<init>(r3)
            s6h.l r3 = new s6h.l
            r4 = 0
            r3.<init>(r7)
            java.lang.Object r1 = iii.c.f(r8, r1, r2, r3)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L2a
        L28:
            zhm.f0 r1 = zhm.f0.f322471a
        L2a:
            r2 = 0
            if (r8 == 0) goto L47
            s6h.k r3 = new s6h.k
            r4 = 1
            r3.<init>(r7)
            s42.f r4 = new s42.f
            r5 = 10
            r4.<init>(r7, r5)
            s6h.l r5 = new s6h.l
            r6 = 1
            r5.<init>(r7)
            java.lang.Object r3 = iii.c.f(r8, r3, r4, r5)
            s6h.i r3 = (s6h.i) r3
            goto L48
        L47:
            r3 = r2
        L48:
            if (r8 == 0) goto L87
            java.lang.Object r8 = r8.getContent()
            od0.i r8 = (od0.i) r8
            if (r8 == 0) goto L87
            java.lang.Object r8 = r8.f224257a
            com.revolut.feature.wealth.models.margin.WealthMarginStatus r8 = (com.revolut.feature.wealth.models.margin.WealthMarginStatus) r8
            if (r8 == 0) goto L87
            com.revolut.feature.wealth.models.margin.WealthMarginBorrowingStatus r8 = r8.e
            if (r8 == 0) goto L87
            udh.c r8 = r8.f95670a
            if (r8 == 0) goto L87
            int[] r2 = s6h.n.f260361a
            int r8 = r8.ordinal()
            r8 = r2[r8]
            r2 = 1
            if (r8 == r2) goto L84
            r2 = 2
            if (r8 == r2) goto L81
            r2 = 3
            if (r8 == r2) goto L81
            r2 = 4
            if (r8 == r2) goto L84
            r2 = 5
            if (r8 != r2) goto L7b
            com.revolut.core.ui_kit.background.AnimatedBackgroundType$Base r8 = com.revolut.core.ui_kit.background.AnimatedBackgroundType.Base.STATUS_WARNING
        L79:
            r2 = r8
            goto L87
        L7b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L81:
            com.revolut.core.ui_kit.background.AnimatedBackgroundType$Base r8 = com.revolut.core.ui_kit.background.AnimatedBackgroundType.Base.PERFORMANCE_NEGATIVE
            goto L79
        L84:
            com.revolut.core.ui_kit.background.AnimatedBackgroundType$Base r8 = com.revolut.core.ui_kit.background.AnimatedBackgroundType.Base.PERFORMANCE_POSITIVE
            goto L79
        L87:
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s6h.m.c(cli.j):cli.o");
    }
}
