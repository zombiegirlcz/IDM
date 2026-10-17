package aah;

import aii.u;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import wli.x;
import yji.n;
import z0h.o1;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends n implements z0h.d, z0h.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z0h.d f2828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z0h.a f2829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f2830n;

    public h(z0h.d dataProvider, z0h.a clauseDestinationProvider, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(clauseDestinationProvider, "clauseDestinationProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f2828l = dataProvider;
        this.f2829m = clauseDestinationProvider;
        this.f2830n = deeplinkHandler;
    }

    @Override // z0h.a
    public final NaviCommand I0(o1 o1Var) {
        return this.f2829m.I0(o1Var);
    }

    @Override // z0h.a
    public final u M0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        return this.f2829m.M0(clickData);
    }

    @Override // z0h.a
    public final aii.x f0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        return this.f2829m.f0(clickData);
    }

    @Override // z0h.d
    public final Flow s1() {
        return this.f2828l.s1();
    }

    @Override // z0h.d
    public final Flow w0() {
        return this.f2828l.w0();
    }
}
