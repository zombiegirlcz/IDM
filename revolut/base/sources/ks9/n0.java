package ks9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.api.navigation.ManualTransferFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import vr9.l;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class n0 extends yji.n implements i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rr9.d f189354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final utf.a f189355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jt0.b f189356n;
    public final vr9.r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vr9.d f189357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f189358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f189359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f189360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f189361t;
    public final wr9.e u;

    public n0(rr9.d settlementInteractor, utf.a transferRequestApprovalHandler, jt0.b debtsInteractor, vr9.r settlementMapper, vr9.d balanceMapper, c groupAppFraudExtension, g groupPaymentExtension, j60.a bottomExpandableDialog, gte.a featureToggleInteractor, wr9.e memberDialogMapper) {
        Intrinsics.checkNotNullParameter(settlementInteractor, "settlementInteractor");
        Intrinsics.checkNotNullParameter(transferRequestApprovalHandler, "transferRequestApprovalHandler");
        Intrinsics.checkNotNullParameter(debtsInteractor, "debtsInteractor");
        Intrinsics.checkNotNullParameter(settlementMapper, "settlementMapper");
        Intrinsics.checkNotNullParameter(balanceMapper, "balanceMapper");
        Intrinsics.checkNotNullParameter(groupAppFraudExtension, "groupAppFraudExtension");
        Intrinsics.checkNotNullParameter(groupPaymentExtension, "groupPaymentExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(memberDialogMapper, "memberDialogMapper");
        this.f189354l = settlementInteractor;
        this.f189355m = transferRequestApprovalHandler;
        this.f189356n = debtsInteractor;
        this.o = settlementMapper;
        this.f189357p = balanceMapper;
        this.f189358q = groupAppFraudExtension;
        this.f189359r = groupPaymentExtension;
        this.f189360s = bottomExpandableDialog;
        this.f189361t = featureToggleInteractor;
        this.u = memberDialogMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(ks9.n0 r18, qq9.d r19, com.revolut.feature.payments.groups.api.models.PaymentGroup r20, java.util.ArrayList r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.n0.Z2(ks9.n0, qq9.d, com.revolut.feature.payments.groups.api.models.PaymentGroup, java.util.ArrayList, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(ks9.n0 r11, qq9.d r12, com.revolut.feature.payments.groups.api.models.PaymentGroup r13, java.util.ArrayList r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.n0.b3(ks9.n0, qq9.d, com.revolut.feature.payments.groups.api.models.PaymentGroup, java.util.ArrayList, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, rd0.e.b(this.f189360s.C()), null, new i0(this, null), 3);
    }

    public final void c3(dj0.d dVar) {
        this.f189357p.getClass();
        yji.n.j2(this, L2(new y0("BALANCE_DIALOG_ID", new nii.l0(new TextLocalisedClause(R$string.groups_insufficient_funds_title, null, null, 14), new TextLocalisedClause(R$string.groups_insufficient_funds_description, null, null, 14), null, new TextLocalisedClause(R.string.common_dialog_action_top_up, null, null, 14), new TextLocalisedClause(R.string.common_dialog_action_exchange, null, null, 14), null, false, null, 996), false, 4)), null, new h0(this, dVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d3(com.revolut.feature.payments.groups.api.models.PaymentGroup r9, do3.n r10, hr9.c r11, java.util.List r12) {
        /*
            r8 = this;
            java.lang.String r0 = "group"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "currentUser"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            j60.a r0 = r8.f189360s
            r1 = 0
            if (r11 == 0) goto L53
            java.util.ArrayList r4 = r11.f154796c
            hr9.a r11 = r11.f154794a
            if (r12 == 0) goto L53
            vr9.l$b r2 = vr9.l.Companion
            r2.getClass()
            vr9.l r2 = vr9.l.b.a(r11)
            boolean r2 = r2 instanceof vr9.l.d
            if (r2 == 0) goto L3d
            dj0.d r10 = edl.a.t(r4)
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$GroupBillsApproval r11 = new com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$GroupBillsApproval
            r11.<init>(r10, r9, r4)
            com.revolut.retail.core.navigation.FeatureCommand r9 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.transfer_request_approval.api.navigation.ManualTransferFeatureConfig r10 = new com.revolut.feature.transfer_request_approval.api.navigation.ManualTransferFeatureConfig
            r10.<init>(r11)
            r9.<init>(r10)
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = zh9.u0.b(r9)
            r8.A2(r9)
            goto L50
        L3d:
            com.revolut.feature.payments.groups.models.GroupSettings r9 = r9.f79290j
            st9.b r6 = r9.f79506a
            vr9.r r2 = r8.o
            vr9.l r3 = vr9.l.b.a(r11)
            r7 = r10
            r5 = r12
            rp0.y r9 = r2.f(r3, r4, r5, r6, r7)
            r0.x(r9)
        L50:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            goto L54
        L53:
            r9 = r1
        L54:
            if (r9 != 0) goto L5b
            r9 = 0
            r10 = 3
            j60.a.v(r0, r9, r1, r10)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.n0.d3(com.revolut.feature.payments.groups.api.models.PaymentGroup, do3.n, hr9.c, java.util.List):void");
    }

    public final void e3(vr9.j parcel, PaymentGroup group) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(group, "group");
        j60.a aVar = this.f189360s;
        Continuation continuation = null;
        j60.a.v(aVar, false, null, 3);
        List listA = parcel.a();
        ArrayList members = new ArrayList();
        for (Object obj2 : listA) {
            if (((GroupMemberSettleInfo) obj2).f79505c) {
                members.add(obj2);
            }
        }
        if (parcel instanceof vr9.f) {
            vr9.l type = ((vr9.f) parcel).f291523b;
            this.o.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(members, "settleMembers");
            if (type instanceof l.a) {
                int i = vr9.q.f291536a[((l.a) type).f291528a.ordinal()];
                if (i == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.group_bills_mark_as_paid_owed_confirmation_description, null, null, 14);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.group_bills_mark_as_paid_owe_confirmation_description, null, null, 14);
                }
            } else if (type.equals(l.c.f291529a)) {
                textLocalisedClause = new TextLocalisedClause(R$string.group_bills_mark_as_paid_owed_confirmation_description, null, null, 14);
            } else {
                if (!type.equals(l.d.f291530a)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.group_bills_mark_as_paid_owe_confirmation_description, null, null, 14);
            }
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.group_bills_mark_as_paid_confirmation_title, null, null, 14), textLocalisedClause, null, 28);
            List listK = zhm.v.k(new LargeActionButtonDelegate.Model("SETTLEMENT_BUTTON_MARK_PAID_CONFIRM_POSITIVE_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.group_bills_mark_as_paid_dialog_confirm_action, null, null, 14), false, null, new vr9.g(members, true), R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 6512), new LargeActionButtonDelegate.Model("SETTLEMENT_BUTTON_MARK_PAID_CONFIRM_NEGATIVE_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), false, null, new vr9.g(members, false), 0, R$attr.uikit_dp16, 0, 0, 7024));
            yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            aVar.x(new rp0.y(listK, tVar, null, null, null, null, 1020));
            return;
        }
        boolean z = parcel instanceof vr9.g;
        g gVar = this.f189359r;
        if (z) {
            if (((vr9.g) parcel).f291525b) {
                ((b0) gVar).b3(qq9.d.MARK_PAID, group, members);
                return;
            }
            return;
        }
        if (parcel instanceof vr9.h) {
            T2(new km2.n(10, this, qq9.d.TRANSFER, group, members, (Continuation) null), new yi5.b(27));
            return;
        }
        if (!(parcel instanceof vr9.i)) {
            if (!(parcel instanceof vr9.e)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((vr9.e) parcel).f291521a;
            A2(u0.b(new FeatureCommand(new ManualTransferFeatureConfig(new TransferRequestApprovalData.GroupBillsApproval(edl.a.t(list), group, list)))));
            return;
        }
        b0 b0Var = (b0) gVar;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(members, "members");
        b0Var.T2(new knd.h0(b0Var, group, members, continuation, 8), new yi5.b(27));
    }
}
