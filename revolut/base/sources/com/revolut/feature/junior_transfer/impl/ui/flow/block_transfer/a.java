package com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer;

import ar8.b;
import ar8.c;
import ar8.e;
import ar8.f;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.JuniorBlockInboundTransferFlowContract$Step;
import cp5.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ogm.i;
import oki.h;
import org.jmrtd.lds.LDSFile;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f77437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ou5.b f77438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pq8.a f77439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f77440s;

    public a(c inputData, i juniorTransferSettingsInteractor, ou5.b juniorPayeesTransferSettingsInteractor, pq8.a juniorBlockInboundTransferShotDialogDispatcher) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorTransferSettingsInteractor, "juniorTransferSettingsInteractor");
        Intrinsics.checkNotNullParameter(juniorPayeesTransferSettingsInteractor, "juniorPayeesTransferSettingsInteractor");
        Intrinsics.checkNotNullParameter(juniorBlockInboundTransferShotDialogDispatcher, "juniorBlockInboundTransferShotDialogDispatcher");
        this.o = inputData;
        this.f77437p = juniorTransferSettingsInteractor;
        this.f77438q = juniorPayeesTransferSettingsInteractor;
        this.f77439r = juniorBlockInboundTransferShotDialogDispatcher;
        anc.b bVar = new anc.b(this, 8);
        this.f77440s = d.a(this, JuniorBlockInboundTransferFlowContract$Step.Block.f77436a, f0.f322471a, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        if (r12.K2(r13, r14, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a r12, com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode.Block r13, gim.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a.I2(com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a, com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode$Block, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r6.K2(r7, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a r6, com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode.Unblock r7, gim.c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof ar8.i
            if (r0 == 0) goto L16
            r0 = r8
            ar8.i r0 = (ar8.i) r0
            int r1 = r0.f8533w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8533w = r1
            goto L1b
        L16:
            ar8.i r0 = new ar8.i
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8533w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L61
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r8)
            goto L54
        L39:
            yhm.o.b(r8)
            ar8.c r8 = r6.o
            com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Junior r8 = r8.f8527a
            com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Sender r7 = r7.f77412a
            ogm.i r2 = r6.f77437p
            java.lang.String r8 = r8.f77408a
            r5 = 0
            kq8.g r7 = ngm.n.J(r7, r5)
            r0.f8533w = r4
            java.lang.Object r7 = r2.l(r8, r7, r0)
            if (r7 != r1) goto L54
            goto L60
        L54:
            int r7 = com.revolut.feature.junior_transfer.impl.R$string.junior_payments_unblock_sender_success_toast_title
            kq8.a r8 = kq8.a.UNBLOCKED
            r0.f8533w = r3
            java.lang.Object r6 = r6.K2(r7, r8, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a.J2(com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a, com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode$Unblock, gim.c):java.lang.Object");
    }

    public final Object K2(int i, kq8.a aVar, gim.c cVar) throws Throwable {
        h.D2(this.f77440s);
        f fVar = this.o.f8529c;
        if (fVar instanceof ar8.d) {
            if (((ar8.d) fVar).f8530a) {
                X1(new mii.f("CONFIRMATION_DIALOG_ID", new TextLocalisedClause(i, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_16_check_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
            } else {
                C2(lq8.b.f199211a);
            }
            return Unit.f186387a;
        }
        if (!(fVar instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objEmit = this.f77439r.f238704a.emit(aVar, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objEmit != aVar2) {
            objEmit = Unit.f186387a;
        }
        return objEmit == aVar2 ? objEmit : Unit.f186387a;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77440s;
    }
}
