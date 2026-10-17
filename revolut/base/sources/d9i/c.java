package d9i;

import aii.p;
import aii.u;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9i.b f112392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hk0.a f112393b;

    public c(f9i.b pdfExternalDestinationFactory, hk0.a networkFileRepository) {
        Intrinsics.checkNotNullParameter(pdfExternalDestinationFactory, "pdfExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        this.f112392a = pdfExternalDestinationFactory;
        this.f112393b = networkFileRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(f9i.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d9i.b
            if (r0 == 0) goto L13
            r0 = r7
            d9i.b r0 = (d9i.b) r0
            int r1 = r0.f112391w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112391w = r1
            goto L18
        L13:
            d9i.b r0 = new d9i.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112391w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L58
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            f9i.f r6 = r6.f132975a
            boolean r7 = r6 instanceof f9i.d
            if (r7 == 0) goto L3d
            f9i.d r6 = (f9i.d) r6
            java.io.File r6 = r6.f132976a
            return r6
        L3d:
            boolean r7 = r6 instanceof f9i.e
            if (r7 == 0) goto L60
            f9i.e r6 = (f9i.e) r6
            java.lang.String r7 = r6.f132977a
            boolean r6 = r6.f132978b
            com.revolut.core.model.FileExtension$Pdf r2 = com.revolut.core.model.FileExtension.Pdf.f51406b
            hk0.a r4 = r5.f112393b
            ufm.n r6 = r4.b(r7, r6, r2)
            r0.f112391w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            java.io.File r7 = (java.io.File) r7
            return r7
        L60:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d9i.c.a(f9i.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nhi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(aii.x r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9i.c.d(aii.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
