package jz3;

/* JADX INFO: loaded from: classes22.dex */
public final class c {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.kompot.common.ParcelableDestination a(ry3.a r10) {
        /*
            java.lang.String r0 = "document"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.io.File r10 = r10.f258207a
            java.lang.String r0 = o80.c.d(r10)
            if (r0 == 0) goto L28
            java.lang.String r1 = "image/"
            r2 = 0
            boolean r1 = kotlin.text.a0.H(r0, r1, r2)
            if (r1 == 0) goto L19
            jz3.a r0 = jz3.a.IMAGE
            goto L26
        L19:
            java.lang.String r1 = "application/pdf"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            jz3.a r0 = jz3.a.PDF
            goto L26
        L24:
            jz3.a r0 = jz3.a.OTHER
        L26:
            if (r0 != 0) goto L2a
        L28:
            jz3.a r0 = jz3.a.OTHER
        L2a:
            int[] r1 = jz3.b.f179583a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L7d
            r1 = 2
            if (r0 == r1) goto L58
            r1 = 3
            if (r0 != r1) goto L52
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r10 = lim.o.n(r10)
            java.lang.String r2 = "Unknown file extension: "
            java.lang.String r10 = j6.a.q(r2, r10)
            java.lang.String r2 = "DocumentPreviewNavigationProvider"
            r3 = 0
            rd0.d.a(r1, r2, r10, r3, r0)
            return r3
        L52:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L58:
            com.revolut.feature_pdf_view.PdfViewFeatureConfiguration r0 = new com.revolut.feature_pdf_view.PdfViewFeatureConfiguration
            com.revolut.feature_pdf_view.Source$Local r1 = new com.revolut.feature_pdf_view.Source$Local
            r1.<init>(r10)
            com.revolut.core.ui_kit.models.TextClause r2 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r3 = lim.o.o(r10)
            r8 = 0
            r9 = 126(0x7e, float:1.77E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r7 = 0
            r8 = 508(0x1fc, float:7.12E-43)
            r3 = 0
            r4 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = zh9.u0.c(r0)
            return r10
        L7d:
            com.revolut.feature.view.image.api.navigation.ViewImageDestination r0 = new com.revolut.feature.view.image.api.navigation.ViewImageDestination
            com.revolut.feature.view.image.api.navigation.ViewImageDestination$InputData$Local r1 = new com.revolut.feature.view.image.api.navigation.ViewImageDestination$InputData$Local
            r1.<init>(r10)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.c.a(ry3.a):com.revolut.kompot.common.ParcelableDestination");
    }
}
