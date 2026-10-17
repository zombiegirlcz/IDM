package df5;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f113789a;

    public b(f userInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f113789a = userInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f113789a = userInteractor;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof df5.a
            if (r0 == 0) goto L13
            r0 = r5
            df5.a r0 = (df5.a) r0
            int r1 = r0.f113788w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113788w = r1
            goto L18
        L13:
            df5.a r0 = new df5.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113788w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f113789a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f113788w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            r0 = 0
            if (r5 == 0) goto L50
            com.revolut.feature.address.models.Address r5 = r5.k
            if (r5 == 0) goto L50
            wi0.b r5 = nz8.d.g(r5)
            goto L51
        L50:
            r5 = r0
        L51:
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.p0
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r5, r1)
            r2 = 14
            if (r1 == 0) goto L68
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.crypto.earn.assets.shared.impl.R$string.crypto_staking_staking_overview_disclaimer_uk
            r5.<init>(r1, r0, r0, r2)
            return r5
        L68:
            wi0.b r1 = wi0.b.f297734c
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r1)
            if (r5 == 0) goto L78
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.crypto.earn.assets.shared.impl.R$string.crypto_staking_staking_overview_disclaimer_uae
            r5.<init>(r1, r0, r0, r2)
            return r5
        L78:
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.crypto.earn.assets.shared.impl.R$string.crypto_staking_staking_overview_disclaimer_global
            r5.<init>(r1, r0, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: df5.b.a(gim.c):java.lang.Object");
    }
}
