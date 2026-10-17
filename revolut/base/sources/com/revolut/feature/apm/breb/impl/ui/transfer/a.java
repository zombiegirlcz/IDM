package com.revolut.feature.apm.breb.impl.ui.transfer;

import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import com.revolut.feature.apm.breb.impl.ui.transfer.BrebTransferFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rv1.z;
import tp8.l;
import tw1.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final bv1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ev1.b f61770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kz9.a f61771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f61772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f61773s;

    public a(bv1.a apmNavigationProvider, ev1.b brebRecipientListNavigationProvider, kz9.a chatNaviProvider, z qrHandler, BrebTransferNavigation$InputData inputData) {
        FlowStep newContact;
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(brebRecipientListNavigationProvider, "brebRecipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(chatNaviProvider, "chatNaviProvider");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = apmNavigationProvider;
        this.f61770p = brebRecipientListNavigationProvider;
        this.f61771q = chatNaviProvider;
        this.f61772r = qrHandler;
        if (inputData instanceof BrebTransferNavigation$InputData.NewContact) {
            newContact = new BrebTransferFlowContract$Step.NewContact((BrebTransferNavigation$InputData.NewContact) inputData);
        } else {
            if (!Intrinsics.f(inputData, BrebTransferNavigation$InputData.Send.f61707a)) {
                throw new NoWhenBranchMatchedException();
            }
            newContact = BrebTransferFlowContract$Step.Send.f61766a;
        }
        this.f61773s = d.a(this, newContact, f0.f322471a, new l(this, 13));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61773s;
    }
}
