package elf;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bmf.b f127382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.m1 f127383n;
    public final mjf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final klf.i f127384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f127385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f127386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fal.b f127387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n63.j f127388t;

    public n1(klf.h0 commonDataSource, bmf.b modalFactory, klf.m1 juniorDataSource, mjf.b antiFraudInteractor, klf.i cardDataSource, l93.f cardsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, fal.b suspiciousTransactionInteractor, n63.j revolutCardsNavigationFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(antiFraudInteractor, "antiFraudInteractor");
        Intrinsics.checkNotNullParameter(cardDataSource, "cardDataSource");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(suspiciousTransactionInteractor, "suspiciousTransactionInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsNavigationFactory, "revolutCardsNavigationFactory");
        this.f127381l = commonDataSource;
        this.f127382m = modalFactory;
        this.f127383n = juniorDataSource;
        this.o = antiFraudInteractor;
        this.f127384p = cardDataSource;
        this.f127385q = cardsInteractor;
        this.f127386r = transactionsInteractor;
        this.f127387s = suspiciousTransactionInteractor;
        this.f127388t = revolutCardsNavigationFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(elf.n1 r5, tof.p6 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof elf.k1
            if (r0 == 0) goto L13
            r0 = r7
            elf.k1 r0 = (elf.k1) r0
            int r1 = r0.f127361w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127361w = r1
            goto L18
        L13:
            elf.k1 r0 = new elf.k1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127361w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4a
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r7)
            if (r6 == 0) goto L38
            java.lang.String r6 = r6.f272993c
            goto L39
        L38:
            r6 = r4
        L39:
            if (r6 != 0) goto L5a
            klf.i r5 = r5.f127384p
            kotlinx.coroutines.flow.SharedFlow r5 = r5.a()
            r0.f127361w = r3
            java.lang.Object r7 = vkm.q.x(r5, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            h93.f0 r7 = (h93.f0) r7
            if (r7 == 0) goto L54
            b93.j r5 = r7.f150114h
            if (r5 == 0) goto L54
            java.lang.String r4 = r5.f13640b
        L54:
            if (r4 != 0) goto L59
            java.lang.String r5 = ""
            return r5
        L59:
            return r4
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.n1.Z2(elf.n1, tof.p6, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ec, code lost:
    
        if (r1 == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0170, code lost:
    
        if (r18.d3(r12, r4, r2) == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015d, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0145 -> B:62:0x0173). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(elf.n1 r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.n1.b3(elf.n1, gim.c):java.lang.Object");
    }

    public static final Object c3(n1 n1Var, String str, gim.i iVar) {
        if (str == null) {
            return null;
        }
        pfm.h hVar = new pfm.h(((ha3.x) n1Var.f127385q).D(str), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        Object objA = nim.a.a(ue0.e.v(hVar), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_BUTTON_PAYMENT_VERIFICATION_CONFIRM")) {
            N2(bmf.a.b(this.f127382m, new TextLocalisedClause(R$string.transactions_fraud_confirm_alert_title, null, null, 14), new TextLocalisedClause(R$string.transactions_fraud_confirm_alert_message, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), null, new TextLocalisedClause(R.string.card_suspicious_dialog_confirm, null, null, 14), null, 472), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new e1(this, 1));
            z = true;
        } else {
            if (Intrinsics.f(str, "ID_BUTTON_PAYMENT_VERIFICATION_DENY")) {
                return e3((gim.c) continuation);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object d3(String groupId, tof.t0 fraudState, l1 l1Var) {
        mjf.b0 b0Var = (mjf.b0) this.f127386r;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(fraudState, "fraudState");
        Priority.STANDARD standard = Priority.STANDARD.f60263b;
        b0Var.h(standard);
        x71.e eVar = b0Var.f205982a;
        BreadcrumbException timeoutBreadcrumb = new BreadcrumbException();
        xif.s sVar = (xif.s) eVar;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(fraudState, "fraudState");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        fif.b bVar = sVar.d;
        String fraudState2 = le.u1.g(fraudState, r11.a.h());
        fif.m mVar = (fif.m) bVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(fraudState2, "fraudState");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        tif.q qVar = (tif.q) mVar.f135410a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(fraudState2, "fraudState");
        Object objA = nim.a.a(te0.w.g0(qVar.e.d(standard, new tif.f(qVar, groupId, fraudState2, timeoutBreadcrumb, 1))), l1Var);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof elf.m1
            if (r0 == 0) goto L13
            r0 = r10
            elf.m1 r0 = (elf.m1) r0
            int r1 = r0.f127376w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127376w = r1
            goto L18
        L13:
            elf.m1 r0 = new elf.m1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127376w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L41
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2f:
            yhm.o.b(r10)
            klf.h0 r10 = r9.f127381l
            kotlinx.coroutines.flow.SharedFlow r10 = r10.d()
            r0.f127376w = r3
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L41
            return r1
        L41:
            tof.a3 r10 = (tof.a3) r10
            tof.h3 r10 = r10.A
            tof.p6 r10 = r10.f272780b
            r0 = 0
            if (r10 == 0) goto L4d
            java.lang.String r10 = r10.f272992b
            goto L4e
        L4d:
            r10 = r0
        L4e:
            if (r10 != 0) goto L52
            java.lang.String r10 = ""
        L52:
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.transactions.impl.R$string.transactions_fraud_deny_alert_title
            r3 = 14
            r2.<init>(r1, r0, r0, r3)
            r1 = r3
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.transactions.impl.R$string.transactions_fraud_deny_alert_message
            java.util.List r10 = zhm.u.c(r10)
            r5 = 12
            r3.<init>(r4, r10, r0, r5)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.retail.common.ui.R$string.common_action_cancel
            r4.<init>(r10, r0, r0, r1)
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r10 = 2131959520(0x7f131ee0, float:1.9555683E38)
            r6.<init>(r10, r0, r0, r1)
            r7 = 0
            r8 = 472(0x1d8, float:6.61E-43)
            bmf.b r1 = r9.f127382m
            r5 = 0
            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController r10 = bmf.a.b(r1, r2, r3, r4, r5, r6, r7, r8)
            elf.e1 r0 = new elf.e1
            r1 = 0
            r0.<init>(r9, r1)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r9.N2(r10, r1, r0)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.n1.e3(gim.c):java.lang.Object");
    }
}
