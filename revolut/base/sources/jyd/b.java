package jyd;

import ang.f;
import gyd.c;
import kotlin.jvm.internal.Intrinsics;
import vkm.d;
import w4l.k;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nyd.a f179413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f179414b;

    public b(nyd.a repository, f userInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f179413a = repository;
        this.f179414b = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(jyd.b r10, com.revolut.data.model.Data r11, gim.c r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof jyd.a
            if (r0 == 0) goto L16
            r0 = r12
            jyd.a r0 = (jyd.a) r0
            int r1 = r0.f179412y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f179412y = r1
            goto L1b
        L16:
            jyd.a r0 = new jyd.a
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f179410w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179412y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            com.revolut.feature.statements.api.models.StatementUrlState$InPreparation r10 = r0.v
            com.revolut.data.model.Data r11 = r0.u
            yhm.o.b(r12)
        L2e:
            r4 = r11
            goto L63
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            yhm.o.b(r12)
            java.lang.Object r12 = r11.getContent()
            boolean r2 = r12 instanceof com.revolut.feature.statements.api.models.StatementUrlState.InPreparation
            if (r2 == 0) goto L46
            com.revolut.feature.statements.api.models.StatementUrlState$InPreparation r12 = (com.revolut.feature.statements.api.models.StatementUrlState.InPreparation) r12
            goto L47
        L46:
            r12 = r3
        L47:
            if (r12 != 0) goto L4a
            return r11
        L4a:
            ang.f r10 = r10.f179414b
            zmg.d r10 = r10.d
            efm.k r10 = r10.c()
            r0.u = r11
            r0.v = r12
            r0.f179412y = r4
            java.lang.Object r10 = nim.a.i(r10, r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            r4 = r12
            r12 = r10
            r10 = r4
            goto L2e
        L63:
            do3.n r12 = (do3.n) r12
            if (r12 == 0) goto L69
            java.lang.String r3 = r12.f116411g
        L69:
            com.revolut.feature.statements.api.models.StatementUrlState$InPreparation r5 = r10.copy(r3)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            com.revolut.data.model.Data r10 = com.revolut.data.model.Data.copy$default(r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jyd.b.a(jyd.b, com.revolut.data.model.Data, gim.c):java.lang.Object");
    }

    public final d b(String value, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubType$-type$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c cVar = gyd.d.Companion;
        Intrinsics.checkNotNullParameter(value, "value");
        nyd.k kVar = (nyd.k) this.f179413a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-statements-impl-documents_hub-domain-DocumentsHubProductPathType$-type$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return kVar.f.b(new gyd.d(value), loadingStrategy);
    }

    public final d c(String str, String str2, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubType$-type$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        nyd.k kVar = (nyd.k) this.f179413a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubType$-type$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return kVar.d.b(new nyd.f(str, str2), loadingStrategy);
    }
}
