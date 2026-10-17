package ow1;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.MutableStateFlow;
import rv1.v;
import vkm.z1;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends oki.h implements dli.b {
    public final MutableStateFlow o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f230270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tqi.g f230271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f230272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f230273s;

    public q(cli.n stateMapper, MutableStateFlow sharedParamsFlow, v qrCodeInteractor, tqi.g shareNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(sharedParamsFlow, "sharedParamsFlow");
        Intrinsics.checkNotNullParameter(qrCodeInteractor, "qrCodeInteractor");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        this.o = sharedParamsFlow;
        this.f230270p = qrCodeInteractor;
        this.f230271q = shareNaviCommandFactory;
        this.f230272r = mra.d.b(this, new i(((BrebQrRequestScreenContract$InputData) sharedParamsFlow.getValue()).f61760a, new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f230273s = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f230273s, new o(0, continuation, this)), null, null, new p(0, continuation, this), 3);
        yji.l.a1(this, this.o, null, null, new p(1, continuation, this), 3);
    }

    public final void I2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode == -1657680663) {
            if (listId.equals("RESET_QR_ID")) {
                C2(l.f230264a);
            }
        } else if (iHashCode == -1247975686) {
            if (listId.equals("SET_AMOUNT_ACTION_ID")) {
                C2(j.f230262a);
            }
        } else if (iHashCode == -820718727 && listId.equals("SHARE_QR_ID")) {
            String str = ((BrebQrRequestScreenContract$InputData) this.o.getValue()).f61760a.f61879b;
            m70.a.c(t0.f186434a);
            C1(u0.b(this.f230271q.f(0, "", str)));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f230272r;
    }
}
