package tb6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.kompot.common.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import skm.a2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c f269497b;

    public /* synthetic */ t(com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar, int i) {
        this.f269496a = i;
        this.f269497b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f269496a) {
            case 0:
                List charities = (List) obj2;
                Intrinsics.checkNotNullParameter(charities, "charities");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : charities) {
                    if (!Intrinsics.f(((ba6.l) obj3).f13938a, this.f269497b.o.f72063a)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                fb6.h output = (fb6.h) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof fb6.e;
                com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar = this.f269497b;
                if (z) {
                    cVar.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
                } else if (output instanceof fb6.g) {
                    ((kb6.c) cVar.E).Z2(((fb6.g) output).f133450a, null);
                    a2 a2Var = cVar.H;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    cVar.H = yji.l.a1(cVar, blm.g.a(cVar.F.f220812a.g()), null, null, null, 7);
                } else {
                    if (!(output instanceof fb6.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenEarnHub(2)));
                }
                return Unit.f186387a;
        }
    }
}
