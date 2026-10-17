package f8i;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.feature_move_money.impl.flow.MoveMoneyFlow;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f132784a = y0.b(new a());

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof y5i.a)) {
            return null;
        }
        y5i.a aVar = (y5i.a) descriptor;
        MoveMoneyInputData moveMoneyInputDataB = aVar.b();
        h hVar = i.Companion;
        i1j.a aVarC = aVar.c();
        hVar.getClass();
        return aVar.a(new MoveMoneyFlow(moveMoneyInputDataB, h.a(aVarC), i.f224256b));
    }

    @Override // nte.a
    public final List e() {
        return MoveMoneyFeatureApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof MoveMoneyDestination)) {
            return null;
        }
        MoveMoneyInputData f97235a = ((MoveMoneyDestination) destination).getF97235a();
        i.Companion.getClass();
        i iVar = i.f224256b;
        return new MoveMoneyFlow(f97235a, iVar, iVar);
    }

    @Override // aii.p
    public final Set h() {
        return this.f132784a;
    }
}
