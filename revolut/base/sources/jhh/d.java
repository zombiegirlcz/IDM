package jhh;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m1h.e;
import z0h.o1;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z0h.a f174253l;

    public d(z0h.a wealthClauseDestinationProvider) {
        Intrinsics.checkNotNullParameter(wealthClauseDestinationProvider, "wealthClauseDestinationProvider");
        this.f174253l = wealthClauseDestinationProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object parcel) {
        NaviCommand naviCommandI0;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        o1 o1Var = parcel instanceof o1 ? (o1) parcel : null;
        if (o1Var != null && (naviCommandI0 = this.f174253l.I0(o1Var)) != null) {
            A2(u0.b(naviCommandI0));
        }
        return Unit.f186387a;
    }
}
