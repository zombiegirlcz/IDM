package com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog;

import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientSettingsNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.ApmRecipientSettingsFlowContract$Step;
import d8l.d;
import dt4.p;
import e2j.j;
import e42.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements c {
    public final ApmRecipientSettingsNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e42.a f62406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z32.h f62407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f62408r;

    public b(ApmRecipientSettingsNavigation$InputData inputData, e42.a dialogProvider, z32.h apmRecipientInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(apmRecipientInteractor, "apmRecipientInteractor");
        this.o = inputData;
        this.f62406p = dialogProvider;
        this.f62407q = apmRecipientInteractor;
        this.f62408r = d.a(this, new p(this, 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b r4, com.revolut.feature.apm.core.models.recipients.ApmRecipient r5, com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue.BlockIncomingMoneyRequests r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof e42.d
            if (r0 == 0) goto L13
            r0 = r7
            e42.d r0 = (e42.d) r0
            int r1 = r0.f122376x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122376x = r1
            goto L18
        L13:
            e42.d r0 = new e42.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122376x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.ApmRecipient r5 = r0.u
            yhm.o.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r7)
            boolean r6 = r6.f62115a
            r6 = r6 ^ r3
            com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue$BlockIncomingMoneyRequests r7 = new com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue$BlockIncomingMoneyRequests
            r7.<init>(r6)
            z32.h r4 = r4.f62407q
            r0.u = r5
            r0.f122376x = r3
            java.lang.Object r7 = r4.c(r5, r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            com.revolut.feature.apm.core.models.recipients.ApmRecipient r7 = (com.revolut.feature.apm.core.models.recipients.ApmRecipient) r7
            if (r7 != 0) goto L4e
            return r5
        L4e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b.I2(com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b, com.revolut.feature.apm.core.models.recipients.ApmRecipient, com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue$BlockIncomingMoneyRequests, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        ApmRecipientSettingsNavigation$InputData apmRecipientSettingsNavigation$InputData = this.o;
        if (apmRecipientSettingsNavigation$InputData instanceof ApmRecipientSettingsNavigation$InputData.Id) {
            a aVar = new a(this, ((ApmRecipientSettingsNavigation$InputData.Id) apmRecipientSettingsNavigation$InputData).f62268a, null);
            l2(new e38.c(this, "getRecipient", aVar, (Continuation) null), new j(this, 10));
        } else {
            if (!(apmRecipientSettingsNavigation$InputData instanceof ApmRecipientSettingsNavigation$InputData.Recipient)) {
                throw new NoWhenBranchMatchedException();
            }
            h.u2(this, this.f62408r, new ApmRecipientSettingsFlowContract$Step.Dialog(((ApmRecipientSettingsNavigation$InputData.Recipient) apmRecipientSettingsNavigation$InputData).f62270a), null, 6);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62408r;
    }
}
