package wa7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zhm.d0;
import zhm.z0;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements ra7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f295854a;

    public p(m hiddenAccountsInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
                this.f295854a = hiddenAccountsInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
                this.f295854a = hiddenAccountsInteractor;
                break;
        }
    }

    public static boolean c(a3 transaction, Set hiddenAccountIds) {
        tof.b bVar;
        tof.b bVar2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(hiddenAccountIds, "hiddenAccountIds");
        tof.a aVar = transaction.S0;
        String str = null;
        String str2 = aVar != null ? aVar.f272573b : null;
        String str3 = (aVar == null || (bVar2 = aVar.f272574c) == null) ? null : bVar2.f272634a;
        tof.a aVar2 = transaction.R0;
        String str4 = aVar2 != null ? aVar2.f272573b : null;
        if (aVar2 != null && (bVar = aVar2.f272574c) != null) {
            str = bVar.f272634a;
        }
        return !d0.h0(z0.i(str2, str3, str4, str, transaction.f272624y.f273143a), hiddenAccountIds).isEmpty();
    }

    public PopupMenuItem.Cell a(ProductAccountDescriptor$Value descriptor, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (z && this.f295854a.c()) {
            return com.revolut.core.ui_kit.models.popup.a.a("ACTION_HIDE_ID", new TextLocalisedClause(R$string.hidden_accounts_action_hide, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, descriptor, null, null, Constants.TAG_EMV_L2_CHECKSUM);
        }
        return null;
    }

    public ProductAccountListAction b(Object obj2, boolean z, boolean z3) {
        if (!z3 || !this.f295854a.c()) {
            return null;
        }
        if (z) {
            return new ProductAccountListAction(376, null, new TextLocalisedClause(R$string.hidden_accounts_action_unhide, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), obj2, "ACTION_UNHIDE_ID", null, null, false, false);
        }
        return new ProductAccountListAction(376, null, new TextLocalisedClause(R$string.hidden_accounts_action_hide, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), obj2, "ACTION_HIDE_ID", null, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(tof.a3 r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof wa7.n
            if (r0 == 0) goto L13
            r0 = r8
            wa7.n r0 = (wa7.n) r0
            int r1 = r0.f295851x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f295851x = r1
            goto L18
        L13:
            wa7.n r0 = new wa7.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f295851x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tof.a3 r7 = r0.u
            yhm.o.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            wa7.m r8 = r6.f295854a
            bo8.w r8 = r8.j()
            r0.u = r7
            r0.f295851x = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            na7.a r8 = (na7.a) r8
            java.util.Set r8 = r8.d
            java.lang.String r0 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "hiddenAccountIds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L64
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L64
            goto L94
        L64:
            java.util.Iterator r0 = r0.iterator()
        L68:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            tof.a r2 = r7.S0
            r4 = 0
            if (r2 == 0) goto L7c
            java.lang.String r2 = r2.f272573b
            goto L7d
        L7c:
            r2 = r4
        L7d:
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r2 != 0) goto Laa
            tof.a r2 = r7.S0
            if (r2 == 0) goto L8d
            tof.b r2 = r2.f272574c
            if (r2 == 0) goto L8d
            java.lang.String r4 = r2.f272634a
        L8d:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
            if (r1 == 0) goto L68
            goto Laa
        L94:
            dj0.d r0 = r7.k
            long r0 = r0.f115082a
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto La9
            tof.w5 r7 = r7.f272624y
            java.lang.String r7 = r7.f273143a
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto La9
            goto Laa
        La9:
            r3 = 0
        Laa:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wa7.p.d(tof.a3, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(tof.a3 r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof wa7.o
            if (r0 == 0) goto L13
            r0 = r8
            wa7.o r0 = (wa7.o) r0
            int r1 = r0.f295853x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f295853x = r1
            goto L18
        L13:
            wa7.o r0 = new wa7.o
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f295853x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tof.a3 r7 = r0.u
            yhm.o.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            wa7.m r8 = r6.f295854a
            bo8.w r8 = r8.j()
            r0.u = r7
            r0.f295853x = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            na7.a r8 = (na7.a) r8
            java.util.Set r8 = r8.d
            java.lang.String r0 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "hiddenAccountIds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L64
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L64
            goto L94
        L64:
            java.util.Iterator r0 = r0.iterator()
        L68:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            tof.a r2 = r7.R0
            r4 = 0
            if (r2 == 0) goto L7c
            java.lang.String r2 = r2.f272573b
            goto L7d
        L7c:
            r2 = r4
        L7d:
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r2 != 0) goto Laa
            tof.a r2 = r7.R0
            if (r2 == 0) goto L8d
            tof.b r2 = r2.f272574c
            if (r2 == 0) goto L8d
            java.lang.String r4 = r2.f272634a
        L8d:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
            if (r1 == 0) goto L68
            goto Laa
        L94:
            dj0.d r0 = r7.k
            long r0 = r0.f115082a
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto La9
            tof.w5 r7 = r7.f272624y
            java.lang.String r7 = r7.f273143a
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto La9
            goto Laa
        La9:
            r3 = 0
        Laa:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wa7.p.e(tof.a3, gim.c):java.lang.Object");
    }
}
