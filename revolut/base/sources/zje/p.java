package zje;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements cli.n {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final itb.c f322813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f322814b;

    public p(itb.c headerUiProvider, ImmutableSet accountsStateMappers) {
        Intrinsics.checkNotNullParameter(headerUiProvider, "headerUiProvider");
        Intrinsics.checkNotNullParameter(accountsStateMappers, "accountsStateMappers");
        this.f322813a = headerUiProvider;
        this.f322814b = accountsStateMappers;
    }

    public static AccountsExtensionContract$AccountsState b(TabCryptoFlowV2Contract$FlowState tabCryptoFlowV2Contract$FlowState) {
        Object next;
        Iterator it8 = tabCryptoFlowV2Contract$FlowState.f89812b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((AccountsExtensionContract$AccountsState) next).a7(tabCryptoFlowV2Contract$FlowState.f89811a.f)) {
                break;
            }
        }
        return (AccountsExtensionContract$AccountsState) next;
    }

    public final dje.c a(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState) {
        Object next;
        Iterator it8 = this.f322814b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((dje.c) next).c(accountsExtensionContract$AccountsState)) {
                break;
            }
        }
        return (dje.c) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState r1 = (com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState) r1
            java.lang.String r2 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState r2 = b(r1)
            java.util.List r3 = r1.f89812b
            qje.o r4 = r1.f89811a
            com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState r1 = b(r1)
            r5 = 0
            if (r1 == 0) goto L1f
            dje.c r1 = r0.a(r1)
            goto L20
        L1f:
            r1 = r5
        L20:
            itb.b r6 = r4.f246841b
            itb.c r7 = r0.f322813a
            kbb.f r7 = (kbb.f) r7
            itb.a r9 = r7.b(r6)
            aim.e r6 = zhm.u.b()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r7 = r3.iterator()
        L34:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L50
            java.lang.Object r8 = r7.next()
            com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState r8 = (com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState) r8
            dje.c r10 = r0.a(r8)
            if (r10 == 0) goto L34
            java.util.List r8 = r10.a(r8)
            java.util.Collection r8 = (java.util.Collection) r8
            r6.addAll(r8)
            goto L34
        L50:
            aim.e r10 = zhm.u.a(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L5d:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r3.next()
            com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState r7 = (com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState) r7
            java.util.List r7 = r7.v6()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            zhm.a0.x(r7, r6)
            goto L5d
        L73:
            int r3 = r6.size()
            r6 = 2
            if (r3 < r6) goto L8d
            tx0.o r3 = new tx0.o
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature.tab.crypto.impl.R$string.crypto_home_button_accounts
            r8 = 14
            r6.<init>(r7, r5, r5, r8)
            r7 = 0
            r8 = 62
            r3.<init>(r6, r7, r5, r8)
        L8b:
            r11 = r3
            goto L90
        L8d:
            tx0.p r3 = tx0.p.f275219a
            goto L8b
        L90:
            java.lang.String r12 = r4.f
            if (r2 == 0) goto La1
            if (r1 == 0) goto L9b
            java.util.List r3 = r1.b(r2, r12)
            goto L9c
        L9b:
            r3 = r5
        L9c:
            if (r3 != 0) goto L9f
            goto La1
        L9f:
            r13 = r3
            goto La4
        La1:
            zhm.f0 r3 = zhm.f0.f322471a
            goto L9f
        La4:
            if (r2 == 0) goto Lac
            if (r1 == 0) goto Lac
            com.revolut.core.ui_kit.models.Clause r5 = r1.g(r2)
        Lac:
            r14 = r5
            boolean r15 = r4.f246842c
            com.revolut.core.ui_kit.models.navbar.NavBarMessage r1 = r4.d
            zje.k r8 = new zje.k
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zje.p.c(cli.j):cli.o");
    }
}
