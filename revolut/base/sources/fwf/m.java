package fwf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends jki.g implements h {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransportHubTicketsScreenContract$InputData f138630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ouf.a f138631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rvf.d f138632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jvf.c f138633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final pvf.c f138634t;
    public final l80.e u;
    public final z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f138635w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TransportHubTicketsScreenContract$InputData inputData, ouf.a transportInteractor, rvf.d activationModelExtension, jvf.c timerExtension, pvf.c notificationProvider, l80.e dateProvider, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(activationModelExtension, "activationModelExtension");
        Intrinsics.checkNotNullParameter(timerExtension, "timerExtension");
        Intrinsics.checkNotNullParameter(notificationProvider, "notificationProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f138630p = inputData;
        this.f138631q = transportInteractor;
        this.f138632r = activationModelExtension;
        this.f138633s = timerExtension;
        this.f138634t = notificationProvider;
        this.u = dateProvider;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.v = z1VarB;
        this.f138635w = new f(new Data(null, null, true, 3, null), ((l80.f) dateProvider).f());
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(vkm.q.Q(this.v, new f5h.b(continuation, this, 15)), new j(this, 0)), null, null, new fna.f(this, continuation, 16), 3);
        int i = l.f138629b[this.f138630p.f92542a.ordinal()];
        if (i == 1) {
            X1(new mii.k("SHOT_DIALOG_ID_TICKET_ACTIVATED", new TextLocalisedClause(R$string.transport_ticket_activate_success_title, null, null, 14), null, null, null, 28));
        } else if (i == 2) {
            X1(new mii.k("SHOT_DIALOG_ID_TICKET_EXTENDED", new TextLocalisedClause(R$string.transport_ticket_extend_success_title, null, null, 14), null, null, null, 28));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.f186387a;
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f138635w;
    }
}
