package com.revolut.feature.credit.application.plugins.impl.ui.document.pdf;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Document;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import v25.k;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements v94.f {
    public final CreditPdfDocumentControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hk0.a f67554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zk0.b f67555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n80.d f67556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tqi.g f67557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f67558t;

    public g(CreditPdfDocumentControllerContract$InputData inputData, hk0.a networkFileRepository, zk0.b fileSystemRepository, n80.d packageManagerResolver, tqi.g shareNaviCommandFactory, n stateMapper) {
        v94.g gVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(packageManagerResolver, "packageManagerResolver");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f67554p = networkFileRepository;
        this.f67555q = fileSystemRepository;
        this.f67556r = packageManagerResolver;
        this.f67557s = shareNaviCommandFactory;
        CreditPdfDocumentControllerContract$Document creditPdfDocumentControllerContract$Document = inputData.f67549c;
        if (creditPdfDocumentControllerContract$Document instanceof CreditPdfDocumentControllerContract$Document.Local) {
            gVar = new v94.g(new Data(((CreditPdfDocumentControllerContract$Document.Local) creditPdfDocumentControllerContract$Document).f67544a, null, false, 6, null));
        } else {
            if (!(creditPdfDocumentControllerContract$Document instanceof CreditPdfDocumentControllerContract$Document.Remote)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = new v94.g(new Data(null, null, true, 3, null));
        }
        this.f67558t = mra.d.b(this, gVar, stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g r4, com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Document.Remote r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.e
            if (r0 == 0) goto L13
            r0 = r6
            com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.e r0 = (com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.e) r0
            int r1 = r0.f67552w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67552w = r1
            goto L18
        L13:
            com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.e r0 = new com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f67552w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            hk0.a r4 = r4.f67554p
            java.lang.String r6 = r5.f67545a
            boolean r5 = r5.f67546b
            com.revolut.core.model.FileExtension$Pdf r2 = com.revolut.core.model.FileExtension.Pdf.f51406b
            ufm.n r4 = r4.b(r6, r5, r2)
            r0.f67552w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g.I2(com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g, com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Document$Remote, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        J2();
    }

    public final void J2() {
        CreditPdfDocumentControllerContract$Document creditPdfDocumentControllerContract$Document = this.o.f67549c;
        if (!(creditPdfDocumentControllerContract$Document instanceof CreditPdfDocumentControllerContract$Document.Remote)) {
            if (!(creditPdfDocumentControllerContract$Document instanceof CreditPdfDocumentControllerContract$Document.Local)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = jli.h.f175850a;
        } else {
            H2(this.f67558t, new v80.a(5));
            l2(new f(this, creditPdfDocumentControllerContract$Document, null), new k(this, 21));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f67558t;
    }
}
