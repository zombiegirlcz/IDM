package lge;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final elb.b f195102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f195103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f195104c;
    public volatile int d;
    public volatile int e;
    public final hlm.c f;

    public h(ang.f userInteractor, elb.b savingsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(savingsFeatureInteractor, "savingsFeatureInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f195102a = savingsFeatureInteractor;
        this.f195103b = userInteractor;
        this.f = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lge.c
            if (r0 == 0) goto L13
            r0 = r5
            lge.c r0 = (lge.c) r0
            int r1 = r0.f195093w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195093w = r1
            goto L18
        L13:
            lge.c r0 = new lge.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195093w
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
            ang.f r5 = r4.f195103b
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f195093w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            boolean r5 = te0.w.V(r5)
            if (r5 == 0) goto L4d
            int r5 = com.revolut.feature.tab.accounts.api.R$string.account_switcher_sub_space_accounts_title_mx
            goto L4f
        L4d:
            int r5 = com.revolut.feature.tab.accounts.api.R$string.account_switcher_sub_space_accounts_title
        L4f:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lge.h.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:39:0x0083, B:41:0x0087), top: B:77:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1 A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #3 {all -> 0x00eb, blocks: (B:61:0x00cd, B:63:0x00d1), top: B:83:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier r11, gim.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lge.h.b(com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof lge.e
            if (r0 == 0) goto L13
            r0 = r9
            lge.e r0 = (lge.e) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            lge.e r0 = new lge.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f195098x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 14
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            lge.h r8 = r0.v
            hlm.a r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L81
        L31:
            r8 = move-exception
            goto L94
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            int r8 = r0.f195097w
            hlm.a r2 = r0.u
            yhm.o.b(r9)
            goto L6c
        L43:
            yhm.o.b(r9)
            boolean r8 = r8 instanceof com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier.Youth
            if (r8 == 0) goto L56
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            uib.c r9 = uib.c.SAVINGS
            int r9 = oc.c.r(r9)
            r8.<init>(r9, r6, r6, r3)
            return r8
        L56:
            int r8 = r7.f195104c
            if (r8 != 0) goto L98
            hlm.c r8 = r7.f
            r0.u = r8
            r9 = 0
            r0.f195097w = r9
            r0.z = r5
            java.lang.Object r2 = r8.lock(r6, r0)
            if (r2 != r1) goto L6a
            goto L7e
        L6a:
            r2 = r8
            r8 = r9
        L6c:
            int r9 = r7.f195104c     // Catch: java.lang.Throwable -> L8a
            if (r9 != 0) goto L8d
            r0.u = r2     // Catch: java.lang.Throwable -> L8a
            r0.v = r7     // Catch: java.lang.Throwable -> L8a
            r0.f195097w = r8     // Catch: java.lang.Throwable -> L8a
            r0.z = r4     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r9 = r7.f(r0)     // Catch: java.lang.Throwable -> L8a
            if (r9 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r8 = r7
            r0 = r2
        L81:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L31
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L31
            r8.f195104c = r9     // Catch: java.lang.Throwable -> L31
            goto L8e
        L8a:
            r8 = move-exception
            r0 = r2
            goto L94
        L8d:
            r0 = r2
        L8e:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L31
            r0.unlock(r6)
            goto L98
        L94:
            r0.unlock(r6)
            throw r8
        L98:
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r9 = r7.f195104c
            r8.<init>(r9, r6, r6, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lge.h.c(com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier, gim.c):java.lang.Object");
    }

    public final Object d(ProductSpaceIdentifier productSpaceIdentifier, v vVar, gim.i iVar) {
        switch (b.f195092a[vVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("No subspace title for the " + v.FLAT_ROOT);
            case 2:
                return b(productSpaceIdentifier, iVar);
            case 3:
                return new TextLocalisedClause(R$string.account_switcher_sub_space_pockets_title, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.account_switcher_sub_space_credit_title, null, null, 14);
            case 5:
                return c(productSpaceIdentifier, iVar);
            case 6:
                return new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.account_switcher_sub_space_bereavement_title, null, null, 14), new ImageClause(R$drawable.uikit_icn_16_lock_closed, (Integer) null, (Float) null, (Float) null, 30)), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lge.f
            if (r0 == 0) goto L13
            r0 = r5
            lge.f r0 = (lge.f) r0
            int r1 = r0.f195100w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195100w = r1
            goto L18
        L13:
            lge.f r0 = new lge.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195100w
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
            ang.f r5 = r4.f195103b
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f195100w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            kotlin.jvm.internal.Intrinsics.h(r5)
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.O
            boolean r0 = te0.w.S(r5, r0)
            if (r0 == 0) goto L57
            int r5 = com.revolut.feature.tab.accounts.api.R$string.account_switcher_sub_space_functionalities_title_co
            goto L64
        L57:
            wi0.b r0 = wi0.b.Y1
            boolean r5 = te0.w.S(r5, r0)
            if (r5 == 0) goto L62
            int r5 = com.revolut.feature.tab.accounts.api.R$string.account_switcher_sub_space_accounts_title_mx
            goto L64
        L62:
            int r5 = com.revolut.feature.tab.accounts.api.R$string.account_switcher_sub_space_accounts_title
        L64:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lge.h.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof lge.g
            if (r0 == 0) goto L13
            r0 = r6
            lge.g r0 = (lge.g) r0
            int r1 = r0.f195101w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195101w = r1
            goto L18
        L13:
            lge.g r0 = new lge.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195101w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            elb.b r6 = r5.f195102a
            w4l.j r2 = w4l.j.f294644c
            cxe.u r6 = r6.a(r2)
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f195101w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            uib.a r6 = (uib.a) r6
            uib.c r6 = r6.f280366a
            int r6 = oc.c.r(r6)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lge.h.f(gim.c):java.lang.Object");
    }
}
