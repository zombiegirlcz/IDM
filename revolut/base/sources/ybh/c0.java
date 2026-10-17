package ybh;

import com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements ylm.k, tji.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f312297a;

    public /* synthetic */ c0(Object obj2) {
        this.f312297a = obj2;
    }

    @Override // ylm.k
    public ylm.s a() throws Throwable {
        ylm.z zVarC;
        IOException iOException = null;
        while (!((ylm.v) this.f312297a).f314813l.f314790r) {
            try {
                zVarC = ((ylm.v) this.f312297a).c();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    yhm.f.a(iOException, e);
                }
                if (!((ylm.v) this.f312297a).b(null)) {
                    throw iOException;
                }
            }
            if (!zVarC.isReady()) {
                ylm.y yVarF = zVarC.f();
                if (yVarF.f314821b == null && yVarF.f314822c == null) {
                    yVarF = zVarC.d();
                }
                ylm.z zVar = yVarF.f314821b;
                Throwable th10 = yVarF.f314822c;
                if (th10 != null) {
                    throw th10;
                }
                if (zVar != null) {
                    ((ylm.v) this.f312297a).f314817q.addFirst(zVar);
                }
            }
            return zVarC.a();
        }
        throw new IOException("Canceled");
    }

    @Override // ylm.k
    public ylm.a0 b() {
        return (ylm.v) this.f312297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zt6.e
            if (r0 == 0) goto L13
            r0 = r6
            zt6.e r0 = (zt6.e) r0
            int r1 = r0.f325086w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f325086w = r1
            goto L18
        L13:
            zt6.e r0 = new zt6.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f325086w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f312297a
            com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService r6 = (com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService) r6
            r0.f325086w = r3
            java.lang.Object r6 = r6.deleteTemplate(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            retrofit2.Response r6 = (retrofit2.Response) r6
            hx7.e.g(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ybh.c0.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable d(r9d.a r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zt6.f
            if (r0 == 0) goto L13
            r0 = r6
            zt6.f r0 = (zt6.f) r0
            int r1 = r0.f325087w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f325087w = r1
            goto L18
        L13:
            zt6.f r0 = new zt6.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f325087w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f312297a
            com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService r6 = (com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService) r6
            r0.f325087w = r3
            java.lang.Object r6 = r6.previewTemplate(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            retrofit2.Response r6 = (retrofit2.Response) r6
            java.lang.Object r5 = r6.body()
            okhttp3.ResponseBody r5 = (okhttp3.ResponseBody) r5
            if (r5 == 0) goto L50
            byte[] r5 = r5.bytes()
            if (r5 == 0) goto L50
            return r5
        L50:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "The response body was empty or corrupted"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ybh.c0.d(r9d.a, gim.c):java.io.Serializable");
    }

    @Override // tji.n
    public void dismiss() {
        ((kz0.i) this.f312297a).dismiss();
    }

    @Override // tji.n
    public void show() throws Throwable {
        ((kz0.i) this.f312297a).show();
    }

    public c0(lr.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f312297a = repository;
    }

    public c0(qd0.b languageProvider, ez.a languageListProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(languageListProvider, "languageListProvider");
        this.f312297a = languageProvider;
    }

    public c0(y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f312297a = accountsProductFeatureChecker;
    }

    public c0(InvoiceTemplateService api2) {
        Intrinsics.checkNotNullParameter(api2, "api");
        this.f312297a = api2;
    }

    public c0(ylm.v routePlanner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        this.f312297a = routePlanner;
    }

    public c0(ync.e viewPagerItemMapper) {
        Intrinsics.checkNotNullParameter(viewPagerItemMapper, "viewPagerItemMapper");
        this.f312297a = viewPagerItemMapper;
    }

    public c0(m1h.o toolbarMapper) {
        Intrinsics.checkNotNullParameter(toolbarMapper, "toolbarMapper");
        this.f312297a = toolbarMapper;
    }
}
