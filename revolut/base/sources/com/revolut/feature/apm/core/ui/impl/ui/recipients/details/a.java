package com.revolut.feature.apm.core.ui.impl.ui.recipients.details;

import ahe.m0;
import b6k.e;
import by9.j;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientSettingsNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsContract$ModalStep;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.r;
import fy1.q;
import go.g;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lx1.i;
import mra.d;
import oki.h;
import te0.w;
import vkm.j2;
import yji.l;
import yv1.k;
import yz4.b;
import z32.c;
import z32.f;
import z32.p;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements c {
    public final z32.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d2a.a f62401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f62402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f62403r;

    public a(z32.h apmRecipientInteractor, i apmRecipientMapper, d2a.a wallpaperPickerControllerModelExtension, ApmRecipientDetailsContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(apmRecipientInteractor, "apmRecipientInteractor");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(wallpaperPickerControllerModelExtension, "wallpaperPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = apmRecipientInteractor;
        this.f62401p = wallpaperPickerControllerModelExtension;
        ApmRecipient apmRecipient = inputData.f62397a;
        this.f62402q = d.b(this, new z32.a(apmRecipient, ((q) apmRecipientMapper).c(apmRecipient), new Data(null, null, true, 3, null), new e(null, null), null), stateMapper, null, false, 12);
        this.f62403r = hx7.e.a(this, new b(this, 8));
    }

    @Override // yji.l
    public final void I1() {
        Flow m0Var;
        l2(new p(this, null), new yi5.b(26));
        ApmRecipient recipient = I2();
        z32.h hVar = this.o;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        l.a1(this, vkm.q.H(new k(this, null, 19), rd0.e.b(whf.b.a(hVar.f319129a, w.h(z32.h.b(recipient)), null, null, null, 14))), null, null, new z32.q(this, null), 3);
        ApmRecipient recipient2 = I2();
        Intrinsics.checkNotNullParameter(recipient2, "recipient");
        if (recipient2.E3()) {
            oz1.l lVar = (oz1.l) hVar.f319131c;
            Intrinsics.checkNotNullParameter(recipient2, "recipient");
            r rVarDistinctUntilChanged = zi0.c.o(((j) lVar.f231115a).a()).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
            m0Var = new m0(rd0.e.e(mo3.a.g(zi0.c.w(rd0.e.b(nim.a.w(rVarDistinctUntilChanged, new oz1.k(lVar, recipient2)))), null, null, 3), h0.f322473a, new f(3, null)), 25);
        } else {
            m0Var = new g(null, 2);
        }
        l.a1(this, m0Var, null, null, new z32.r(this, null), 3);
    }

    public final ApmRecipient I2() {
        return ((z32.a) ((j2) this.f62402q.f22677a).getValue()).f319117a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void J2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f62403r;
        switch (iHashCode) {
            case -1773916826:
                if (listId.equals("ITEM_ID_REPORT_ISSUE")) {
                    C1(new BridgeDestination(new FeatureCommand(SupportFeatureConfig.f89363a)));
                    break;
                }
                break;
            case -1668528987:
                if (listId.equals("ITEM_ID_CHANGE_BACKGROUND")) {
                    h.v2(aVar, ApmRecipientDetailsContract$ModalStep.ChangeBackgroundDialog.f62399a, ModalDestination.Style.POPUP.f98311a);
                    break;
                }
                break;
            case 166243244:
                if (listId.equals("ITEM_ID_GRID_BLOCK")) {
                    ApmRecipient apmRecipientI2 = I2();
                    ApmRecipientSettings f62151h = apmRecipientI2.getF62151h();
                    ApmRecipientSettingsValue.BlockIncomingMoneyRequests blockIncomingMoneyRequests = f62151h != null ? f62151h.f62114a : null;
                    if (blockIncomingMoneyRequests == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("ApmRecipientSettingBlock clicked but no corresponding settings (" + blockIncomingMoneyRequests + ") found for recipient: " + apmRecipientI2);
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        h.v2(aVar, new ApmRecipientDetailsContract$ModalStep.BlockRecipient(new ApmRecipientSettingsNavigation$InputData.Recipient(apmRecipientI2, blockIncomingMoneyRequests)), bottom_dialog);
                    }
                    break;
                }
                break;
            case 652606243:
                if (listId.equals("ITEM_ID_DELETE")) {
                    h.v2(aVar, ApmRecipientDetailsContract$ModalStep.DeleteRecipient.f62400a, bottom_dialog);
                    break;
                }
                break;
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f62403r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f62402q;
    }
}
