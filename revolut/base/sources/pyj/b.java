package pyj;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.u;
import u09.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f240844b;

    public /* synthetic */ b(v vVar, int i) {
        this.f240843a = i;
        this.f240844b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f240843a) {
            case 0:
                Boolean glossaryEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(glossaryEnabled, "glossaryEnabled");
                if (!glossaryEnabled.booleanValue()) {
                    return rfm.h.f253943a;
                }
                u uVarG = k.g(new LearnKompotFeatureConfig.GlossaryHome(this.f240844b));
                Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                return uVarG;
            case 1:
                ListSubheaderDelegate.Model it8 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new LearnKompotFeatureConfig.Home.Destination(this.f240844b), false, (Integer) null, 0, 61));
            default:
                SmallCardDelegate.Model item = (SmallCardDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj3 = item.f53364p;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.learn.shared.models.domain.LearnCourse");
                return new FeatureCommand(new LearnKompotFeatureConfig.CourseOverview(((u09.f) obj3).f276109a, this.f240844b, null));
        }
    }
}
