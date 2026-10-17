package vea;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class s0 implements z87.d {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f288237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g48.r0 f288238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f288239c;
    public final o97.r d;

    public s0(f01.c uiKitResources, l delegate, g48.r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f288237a = delegate;
        this.f288238b = jointAccountsInteractor;
        this.f288239c = yhm.j.b(new vch.a(this, 4));
        Function1 nVar = new n(9);
        Function1 nVar2 = new n(10);
        o97.r rVar = o97.r.JOINT_ACCOUNTS;
        delegate.e(nVar, nVar2, rVar, "JOINT_ACCOUNTS_SECTION_LIST_ID", y0.b(uiKitResources.b(new TextLocalisedClause(R$string.joint_search_block_joint_accounts_title, null, null, 14)).toString()), null);
        this.d = rVar;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        return pd.b.r((efm.r) this.f288239c.getValue(), new v73.c(this, searchQuery, 17));
    }

    @Override // z87.f
    public final o97.r h() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, o97.y r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof vea.r0
            if (r0 == 0) goto L13
            r0 = r7
            vea.r0 r0 = (vea.r0) r0
            int r1 = r0.f288234w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288234w = r1
            goto L1a
        L13:
            vea.r0 r0 = new vea.r0
            gim.c r7 = (gim.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288234w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            vea.l r7 = r4.f288237a
            efm.d0 r5 = r7.d(r5, r6)
            r0.f288234w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vea.s0.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
