package wf6;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements ke6.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f297009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.a f297010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f297011c;
    public final zfe.g d;

    public s(sri.m navigator, oe6.a externalInstitutionsInteractor, wsg.n walletInteractor, zfe.g productAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        this.f297009a = navigator;
        this.f297010b = externalInstitutionsInteractor;
        this.f297011c = walletInteractor;
        this.d = productAccountDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(wf6.s r11, java.lang.String r12, java.lang.String r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf6.s.b(wf6.s, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public static final Object c(s sVar, String str, vq5.w wVar) {
        return ((she.g) sVar.d).c(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), ProductId.LINKED), null, wVar);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "linked-accounts");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof wf6.q
            if (r0 == 0) goto L13
            r0 = r8
            wf6.q r0 = (wf6.q) r0
            int r1 = r0.f297005w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f297005w = r1
            goto L1a
        L13:
            wf6.q r0 = new wf6.q
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f297005w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r8)
            goto L62
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            kotlinx.coroutines.d r8 = skm.p0.f264003c
            vq5.w r2 = new vq5.w
            r4 = 0
            r5 = 26
            r2.<init>(r7, r6, r4, r5)
            ufm.b r7 = te0.w.o0(r8, r2)
            wf6.p r8 = new wf6.p
            r2 = 1
            r8.<init>(r2)
            wf6.o r2 = new wf6.o
            r4 = 2
            r2.<init>(r4, r8)
            ufm.i r8 = new ufm.i
            r4 = 1
            r8.<init>(r7, r2, r4)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            r0.f297005w = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wf6.s.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(new ufm.f(te0.w.o0(p0.f264003c, new vq5.w(deeplink, this, null, 26)), new o(0, new wdb.b(this, 10)), 3), new o(1, new p(0)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
