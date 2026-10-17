package ocb;

import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.rev_points.api.navigation.RevPointsPersonalisationDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ String u;
    public final /* synthetic */ x v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, x xVar, Continuation continuation) {
        super(2, continuation);
        this.u = str;
        this.v = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.r rVarH;
        efm.r rVarH2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = this.u;
        int iHashCode = str.hashCode();
        x xVar = this.v;
        if (iHashCode != -869410001) {
            if (iHashCode != 1642012480) {
                if (iHashCode == 1975625858 && str.equals("ID_PAYMENTS_STATUS_DISCOVERABLE")) {
                    rcb.e eVar = xVar.v;
                    rcb.c features = ((g) xVar.t2()).f224180m;
                    com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b bVar = (com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b) eVar;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(features, "features");
                    boolean z = features.f253244a;
                    y21.c cVar = bVar.o;
                    cVar.getClass();
                    SecuritySettings securitySettings = SecuritySettings.USERNAME;
                    w4l.h hVar = w4l.h.f294642c;
                    efm.r rVarW = nim.a.w(cVar.b(securitySettings, hVar), new y07.m(28));
                    int i = 4;
                    y yVar = y.f224204a;
                    if (z) {
                        rVarH = rVarW.map(new rbf.c(new rbj.g(i), 17));
                        Intrinsics.h(rVarH);
                    } else {
                        rVarH = te0.w.h(yVar);
                    }
                    boolean z3 = features.f253245b;
                    efm.r rVarW2 = nim.a.w(nim.a.w(cVar.b(SecuritySettings.INCOGNITO, hVar), new y07.m(28)), new rbj.g(3));
                    if (z3) {
                        rVarH2 = rVarW2.map(new rbf.c(new rbj.g(i), 17));
                        Intrinsics.h(rVarH2);
                    } else {
                        rVarH2 = te0.w.h(yVar);
                    }
                    bVar.f82791q = yji.n.j2(bVar, rd0.e.b(te0.w.m(rVarH, rVarH2, m70.a.g(bVar.f82789n.k(false), null, null, 3))), null, new r83.g(bVar, null, 11), 3);
                    return Unit.f186387a;
                }
            } else if (str.equals("ID_PERMISSIONS")) {
                return xVar.C1(new BridgeDestination(new FeatureCommand(ExternalAccountsFeatureConfig.Permissions.f72324a)));
            }
        } else if (str.equals("ID_REV_POINTS_PERSONALISATION")) {
            return xVar.C1(RevPointsPersonalisationDestination.f83534b);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "RetailPrivacyScreenModel", "no click handling logic for ".concat(str), null, null, 16);
        return Unit.f186387a;
    }
}
