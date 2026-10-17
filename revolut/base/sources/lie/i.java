package lie;

import cie.v;
import com.revolut.feature.tab.accounts.api.TabAccountsApi$Toggles;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import n30.n;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f195489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f195490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vge.d f195491c;
    public final n d;
    public final v e;
    public final skd.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final emg.a f195492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final emg.a f195493h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qge.b f195494j;
    public final wxl.a k;

    public i(gte.a featureToggleInteractor, ang.f userInteractor, vge.d accountInteractor, n chatInteractor, v productAccountIntroChecker, skd.i slotManagerInteractor, emg.a adoptionJourneyInteractor, emg.a fincrimeChecklistInteractor, l tabAccountsNudgeResolver, qge.b accountsNudgeSessionTracker, wxl.a nudgeInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(accountInteractor, "accountInteractor");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(productAccountIntroChecker, "productAccountIntroChecker");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(adoptionJourneyInteractor, "adoptionJourneyInteractor");
        Intrinsics.checkNotNullParameter(fincrimeChecklistInteractor, "fincrimeChecklistInteractor");
        Intrinsics.checkNotNullParameter(tabAccountsNudgeResolver, "tabAccountsNudgeResolver");
        Intrinsics.checkNotNullParameter(accountsNudgeSessionTracker, "accountsNudgeSessionTracker");
        Intrinsics.checkNotNullParameter(nudgeInteractor, "nudgeInteractor");
        this.f195489a = featureToggleInteractor;
        this.f195490b = userInteractor;
        this.f195491c = accountInteractor;
        this.d = chatInteractor;
        this.e = productAccountIntroChecker;
        this.f = slotManagerInteractor;
        this.f195492g = adoptionJourneyInteractor;
        this.f195493h = fincrimeChecklistInteractor;
        this.i = tabAccountsNudgeResolver;
        this.f195494j = accountsNudgeSessionTracker;
        this.k = nudgeInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(lie.i r8, com.revolut.feature.tab.accounts.api.model.AccountContent r9, gim.c r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof lie.h
            if (r0 == 0) goto L16
            r0 = r10
            lie.h r0 = (lie.h) r0
            int r1 = r0.f195488w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f195488w = r1
            goto L1b
        L16:
            lie.h r0 = new lie.h
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195488w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r10)
            goto L56
        L3a:
            yhm.o.b(r10)
            boolean r10 = r8.b()
            if (r10 != 0) goto L44
            goto L5e
        L44:
            cie.v r10 = r8.e
            boolean r9 = r10.a(r9)
            if (r9 == 0) goto L4d
            goto L5e
        L4d:
            r0.f195488w = r4
            java.lang.Object r10 = r8.e(r0)
            if (r10 != r1) goto L56
            goto Lac
        L56:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L5f
        L5e:
            return r5
        L5f:
            ang.f r9 = r8.f195490b
            w4l.h r10 = w4l.h.f294642c
            akg.n r9 = r9.j(r10)
            zfd.e r9 = zi0.c.w(r9)
            vge.d r10 = r8.f195491c
            qfe.j r2 = qfe.j.f245295a
            vge.x r10 = (vge.x) r10
            kotlinx.coroutines.flow.Flow r10 = r10.f(r2)
            zfd.e r10 = zi0.c.w(r10)
            hy9.b r2 = new hy9.b
            r4 = 1
            r2.<init>(r10, r4)
            lb0.b0 r10 = new lb0.b0
            r4 = 13
            r10.<init>(r8, r5, r4)
            vkm.v1 r4 = new vkm.v1
            r4.<init>(r10)
            klf.l1 r10 = new klf.l1
            r6 = 3
            r7 = 15
            r10.<init>(r6, r7, r5)
            zhm.h0 r6 = zhm.h0.f322473a
            vkm.y r10 = rd0.e.e(r4, r6, r10)
            ate.b r4 = new ate.b
            r6 = 8
            r4.<init>(r8, r5, r6)
            v0b.b r8 = ta6.a.h(r9, r2, r10, r4)
            r0.f195488w = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto Lad
        Lac:
            return r1
        Lad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lie.i.a(lie.i, com.revolut.feature.tab.accounts.api.model.AccountContent, gim.c):java.lang.Object");
    }

    public final boolean b() {
        if (!((jte.d) this.f195489a).c(TabAccountsApi$Toggles.HomeNudges.f89456c)) {
            return false;
        }
        EnumEntries enumEntriesA = a.a();
        if (enumEntriesA != null && enumEntriesA.isEmpty()) {
            return false;
        }
        Iterator<E> it8 = enumEntriesA.iterator();
        while (it8.hasNext()) {
            if (this.k.a(((a) it8.next()).b())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof lie.d
            if (r0 == 0) goto L13
            r0 = r6
            lie.d r0 = (lie.d) r0
            int r1 = r0.f195483w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195483w = r1
            goto L18
        L13:
            lie.d r0 = new lie.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195483w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L4d
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            com.revolut.feature.slot_manager.api.model.SlotContext r6 = new com.revolut.feature.slot_manager.api.model.SlotContext
            akd.s r2 = akd.s.HOME
            r6.<init>(r2)
            skd.i r2 = r5.f
            akg.n r6 = r2.a(r6, r3)
            zfd.e r6 = zi0.c.w(r6)
            r0.f195483w = r4
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            if (r6 == 0) goto L58
            java.lang.Object r6 = r6.getContent()
            com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist r6 = (com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist) r6
            goto L59
        L58:
            r6 = 0
        L59:
            if (r6 == 0) goto L5c
            r3 = r4
        L5c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lie.i.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(emg.a r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lie.e
            if (r0 == 0) goto L13
            r0 = r8
            lie.e r0 = (lie.e) r0
            int r1 = r0.f195485x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195485x = r1
            goto L18
        L13:
            lie.e r0 = new lie.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195485x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            emg.a r7 = r0.u
            yhm.o.b(r8)
            goto L4a
        L38:
            yhm.o.b(r8)
            kotlinx.coroutines.flow.Flow r8 = r7.d()
            r0.u = r7
            r0.f195485x = r4
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L4a
            goto L74
        L4a:
            cmg.a r8 = (cmg.a) r8
            r2 = -1
            if (r8 != 0) goto L51
            r8 = r2
            goto L59
        L51:
            int[] r5 = lie.c.f195482a
            int r8 = r8.ordinal()
            r8 = r5[r8]
        L59:
            if (r8 == r2) goto L76
            if (r8 == r4) goto L77
            if (r8 == r3) goto L69
            r7 = 3
            if (r8 != r7) goto L63
            goto L76
        L63:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L69:
            r8 = 0
            r0.u = r8
            r0.f195485x = r3
            java.lang.Object r7 = r7.g(r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            return r7
        L76:
            r4 = 0
        L77:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lie.i.d(emg.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof lie.f
            if (r0 == 0) goto L13
            r0 = r7
            lie.f r0 = (lie.f) r0
            int r1 = r0.f195486w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195486w = r1
            goto L18
        L13:
            lie.f r0 = new lie.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195486w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            yhm.o.b(r7)
            goto L5c
        L39:
            yhm.o.b(r7)
            goto L49
        L3d:
            yhm.o.b(r7)
            r0.f195486w = r5
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L49
            goto L6e
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L70
            r0.f195486w = r4
            emg.a r7 = r6.f195492g
            java.lang.Object r7 = r6.d(r7, r0)
            if (r7 != r1) goto L5c
            goto L6e
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L70
            r0.f195486w = r3
            emg.a r7 = r6.f195493h
            java.lang.Object r7 = r6.d(r7, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            return r7
        L70:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lie.i.e(gim.c):java.lang.Object");
    }
}
