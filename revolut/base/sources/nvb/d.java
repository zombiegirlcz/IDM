package nvb;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import com.revolut.feature.rev_points.buying.api.navigation.RevPointsBuyingDestination;
import com.revolut.feature.rev_points.exclusive_store.api.R$string;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.RevPointsExclusiveStoreProductFlowContract$Step;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.a;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import nii.z;
import nuc.n;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a f219573b;

    public /* synthetic */ d(com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar, int i) {
        this.f219572a = i;
        this.f219573b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f219572a) {
            case 0:
                ((Boolean) obj2).getClass();
                com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar = this.f219573b;
                aVar.H2(aVar.f83595t, new n(10));
                aVar.K2(aVar.o.getF83576a());
                return Unit.f186387a;
            case 1:
                hub.b it8 = (hub.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f219573b.B2();
                return Unit.f186387a;
            default:
                com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar2 = this.f219573b;
                qki.d dVar = aVar2.f83595t;
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.a output = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                Continuation continuation = null;
                if (output instanceof ovb.f) {
                    aVar2.H2(dVar, new n(12));
                    fvb.f fVar = ((ovb.f) output).f230017a;
                    String str = fVar.d;
                    String str2 = fVar.e;
                    if (str == null || str2 == null) {
                        aVar2.N2();
                    } else {
                        yji.l.a1(aVar2, aVar2.X1(new y0(null, new j0((Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.exclusive_store_common_actions_gotIt, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, h0.CONFETTI, (ResourceImage) null, 3052), false, 5)), null, null, new l(aVar2, continuation, 1), 3);
                    }
                } else if (output instanceof a.c) {
                    aVar2.H2(dVar, new n(7));
                    yji.l.a1(aVar2, aVar2.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new l(aVar2, continuation, 0), 3);
                } else if (output instanceof a.C0528a) {
                    aVar2.H2(dVar, new n(8));
                    aVar2.C1(new RevPointsBuyingDestination(aVar2.f83594s));
                } else if (output instanceof a.b) {
                    aVar2.C1(new BridgeDestination(gc0.c.f(new RevPointsFeatureConfig.RevPointsEarnConfig(0))));
                } else {
                    if (!(output instanceof a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.H2(dVar, new n(9));
                    oki.h.t2(aVar2, aVar2.u, RevPointsExclusiveStoreProductFlowContract$Step.OptIn.f83582a, true, null, false, 12);
                }
                return Unit.f186387a;
        }
    }
}
