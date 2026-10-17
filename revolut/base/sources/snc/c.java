package snc;

import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f264500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f264501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dlc.f f264502c;

    public c(b buildPortfolioIcon, a subtitleBuilder, dlc.f roboSettingsMapper) {
        Intrinsics.checkNotNullParameter(buildPortfolioIcon, "buildPortfolioIcon");
        Intrinsics.checkNotNullParameter(subtitleBuilder, "subtitleBuilder");
        Intrinsics.checkNotNullParameter(roboSettingsMapper, "roboSettingsMapper");
        this.f264500a = buildPortfolioIcon;
        this.f264501b = subtitleBuilder;
        this.f264502c = roboSettingsMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r9) {
        /*
            r8 = this;
            snc.e r9 = (snc.e) r9
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.revolut.data.model.Data r0 = r9.f264503a
            r1 = 0
            if (r0 == 0) goto L36
            java.lang.Object r2 = r0.getContent()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            hmc.c0 r2 = (hmc.c0) r2     // Catch: java.lang.Throwable -> L1b
            hmc.b0 r2 = r2.f153631b     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            com.revolut.feature.wealth.models.robo.Template r2 = r2.f153627b     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r2 = move-exception
            goto L2c
        L1d:
            r2 = r1
        L1e:
            java.lang.Throwable r3 = r0.getError()     // Catch: java.lang.Throwable -> L1b
            boolean r4 = r0.getLoading()     // Catch: java.lang.Throwable -> L1b
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L1b
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L1b
            goto L37
        L2c:
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            boolean r0 = r0.getLoading()
            r5.<init>(r1, r2, r0)
            goto L37
        L36:
            r5 = r1
        L37:
            com.revolut.data.model.Data r0 = r9.f264504b
            snc.b r2 = r8.f264500a
            gte.a r3 = r2.f264499b
            com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles$RoboStrategies r4 = com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles.RoboStrategies.f95863c
            jte.d r3 = (jte.d) r3
            boolean r3 = r3.c(r4)
            if (r3 == 0) goto L49
        L47:
            r0 = r1
            goto L59
        L49:
            if (r0 == 0) goto L47
            java.lang.Object r0 = r0.getContent()
            com.revolut.feature.wealth.models.robo.RoboPortfolioInfo r0 = (com.revolut.feature.wealth.models.robo.RoboPortfolioInfo) r0
            if (r0 == 0) goto L47
            nmc.d r2 = r2.f264498a
            com.revolut.core.ui_kit_core.displayers.image.Image r0 = r2.b(r0)
        L59:
            if (r5 == 0) goto L79
            sl3.i r2 = new sl3.i
            r3 = 16
            r2.<init>(r3)
            sl5.g r3 = new sl5.g
            r4 = 5
            r3.<init>(r4)
            sa5.b r4 = new sa5.b
            r6 = 10
            snc.a r7 = r8.f264501b
            r4.<init>(r7, r6)
            java.lang.Object r2 = iii.c.f(r5, r2, r3, r4)
            snc.h r2 = (snc.h) r2
            if (r2 != 0) goto L7b
        L79:
            snc.g r2 = snc.g.f264506a
        L7b:
            com.revolut.data.model.Data r9 = r9.f264503a
            if (r9 == 0) goto La6
            dlc.f r1 = r8.f264502c
            hmc.o r1 = (hmc.o) r1
            r1.getClass()
            java.lang.String r3 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            ay2.k r3 = new ay2.k
            r4 = 2
            r5 = 1
            r6 = 0
            r3.<init>(r5, r6, r1, r4)
            hkb.e r4 = new hkb.e
            r5 = 7
            r4.<init>(r5)
            ajd.t r5 = new ajd.t
            r7 = 3
            r5.<init>(r6, r1, r7)
            java.lang.Object r9 = iii.c.f(r9, r3, r4, r5)
            r1 = r9
            java.util.List r1 = (java.util.List) r1
        La6:
            if (r1 != 0) goto Laa
            zhm.f0 r1 = zhm.f0.f322471a
        Laa:
            snc.i r9 = new snc.i
            r9.<init>(r0, r2, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: snc.c.a(jki.i):jki.m");
    }
}
