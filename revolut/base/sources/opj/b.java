package opj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f227687a;

    public b(zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f227687a = fileSystemRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(byte[] r10, java.lang.String r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof opj.a
            if (r0 == 0) goto L13
            r0 = r12
            opj.a r0 = (opj.a) r0
            int r1 = r0.f227686x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227686x = r1
            goto L18
        L13:
            opj.a r0 = new opj.a
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227686x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r11 = r0.u
            yhm.o.b(r12)
            goto L41
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r12)
            r0.u = r11
            r0.f227686x = r3
            zk0.b r12 = r9.f227687a
            java.lang.Object r12 = zk0.b.a(r12, r10, r11, r0)
            if (r12 != r1) goto L41
            return r1
        L41:
            java.io.File r12 = (java.io.File) r12
            if (r12 == 0) goto L65
            com.revolut.feature_pdf_view.PdfViewFeatureConfiguration r0 = new com.revolut.feature_pdf_view.PdfViewFeatureConfiguration
            com.revolut.feature_pdf_view.Source$Local r1 = new com.revolut.feature_pdf_view.Source$Local
            r1.<init>(r12)
            grl.k9 r10 = grl.k9.RetailShop
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r11 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r11 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r6 = com.google.android.gms.internal.mlkit_vision_face.a.h(r10, r11, r10)
            r7 = 0
            r8 = 428(0x1ac, float:6.0E-43)
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = zh9.u0.c(r0)
            return r10
        L65:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r12 = "Failed to save PDF invoice to temporary file with a name "
            java.lang.String r11 = h30.l.r(r12, r11)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: opj.b.a(byte[], java.lang.String, gim.c):java.lang.Object");
    }
}
