package dee;

import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreenContract$InputData;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.w40;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements cli.n {

    @NotNull
    private static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InboundSwiftTransferStatusScreenContract$InputData f113402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f113403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f113404c;
    public final d4m.a d;
    public final d4m.a e;
    public final d4m.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d4m.a f113405g;

    public c0(InboundSwiftTransferStatusScreenContract$InputData inputData, d4m.a inTransitMapper, d4m.a creditedMapper, d4m.a onHoldMapper, d4m.a delayedMapper, d4m.a returnedMapper, d4m.a notFoundMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inTransitMapper, "inTransitMapper");
        Intrinsics.checkNotNullParameter(creditedMapper, "creditedMapper");
        Intrinsics.checkNotNullParameter(onHoldMapper, "onHoldMapper");
        Intrinsics.checkNotNullParameter(delayedMapper, "delayedMapper");
        Intrinsics.checkNotNullParameter(returnedMapper, "returnedMapper");
        Intrinsics.checkNotNullParameter(notFoundMapper, "notFoundMapper");
        this.f113402a = inputData;
        this.f113403b = inTransitMapper;
        this.f113404c = creditedMapper;
        this.d = onHoldMapper;
        this.e = delayedMapper;
        this.f = returnedMapper;
        this.f113405g = notFoundMapper;
    }

    public static r a() {
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        eVarB2.add(nb0.a(pb0.Companion, "TIMELINE_LOADING_TITLE_ID", false, 4));
        int i = 0;
        while (i < 3) {
            i++;
            eVarB2.add(new w40(a0.d.n("TIMELINE_LOADING_STEP_", i)));
        }
        aim.e eVarA = zhm.u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        nb0 nb0Var = pb0.Companion;
        eVarB.addAll(yp0.b.h(zhm.v.k(nb0.a(nb0Var, "INFORMATION_LOADING_ON_TRACK_ID", false, 6), nb0.a(nb0Var, "INFORMATION_LOADING_NOTIFICATION_ID", false, 6)), new gu("INFORMATION_SUBHEADER_ID", 0, 0, 30), null, 0, 126));
        return new r(zhm.u.a(eVarB));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f113413a, new x(this, 1), new a0(0), new cab.m(this, domainState, 21));
    }
}
