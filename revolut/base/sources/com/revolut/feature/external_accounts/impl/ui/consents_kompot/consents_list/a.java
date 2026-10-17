package com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$FlowType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oe6.m;
import oki.h;
import ql6.n;
import ql6.r;
import vkm.j2;
import yi5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements n {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f72788p;

    public a(m openBankingInteractor, cli.n stateMapper, ConsentsListScreenContract$InputData inputData) {
        Data data;
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = openBankingInteractor;
        OutboundOpenBankingClient outboundOpenBankingClient = inputData.f72781a;
        OpenBankingConsentsFlowContract$FlowType openBankingConsentsFlowContract$FlowType = inputData.f72782b;
        Data data2 = new Data(null, null, false, 7, null);
        if (Intrinsics.f(openBankingConsentsFlowContract$FlowType, OpenBankingConsentsFlowContract$FlowType.Default.f72742a)) {
            data = null;
        } else {
            if (!Intrinsics.f(openBankingConsentsFlowContract$FlowType, OpenBankingConsentsFlowContract$FlowType.Australia.f72741a)) {
                throw new NoWhenBranchMatchedException();
            }
            data = new Data(null, null, true, 3, null);
        }
        this.f72788p = d.b(this, new ql6.m(outboundOpenBankingClient, openBankingConsentsFlowContract$FlowType, data2, data), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        OpenBankingConsentsFlowContract$FlowType openBankingConsentsFlowContract$FlowType = ((ql6.m) ((j2) this.f72788p.f22677a).getValue()).f247212b;
        Continuation continuation = null;
        if (Intrinsics.f(openBankingConsentsFlowContract$FlowType, OpenBankingConsentsFlowContract$FlowType.Default.f72742a)) {
            l2(new qg4.d(this, continuation, 10), new b(26));
        } else {
            if (!Intrinsics.f(openBankingConsentsFlowContract$FlowType, OpenBankingConsentsFlowContract$FlowType.Australia.f72741a)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new r(this, continuation, 0), new b(26));
            l2(new r(this, continuation, 1), new b(26));
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f72788p;
    }
}
