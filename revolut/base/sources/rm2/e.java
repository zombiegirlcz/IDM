package rm2;

import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockReason;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r40.n0;
import vkm.j2;
import zhm.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BackgroundCatalogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BackgroundCatalogController backgroundCatalogController, Continuation continuation) {
        super(2, continuation);
        this.v = backgroundCatalogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((BackgroundSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BackgroundSelectionDelegate.Model model = (BackgroundSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) jVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51698j;
        if (obj3 instanceof String) {
            String str = (String) obj3;
            y yVar = bVar.v;
            if (!Intrinsics.f(((h) ((j2) yVar.f22677a).getValue()).f255187b, str)) {
                bVar.H2(yVar, new n0(str, 17));
                Map map = ((h) ((j2) yVar.f22677a).getValue()).f255186a;
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Collection collectionValues = map.values();
                ArrayList<em2.e> arrayList = new ArrayList();
                Iterator it8 = collectionValues.iterator();
                while (it8.hasNext()) {
                    Iterable iterable = (List) ((bn2.t) it8.next()).f17041a.getContent();
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    a0.x(iterable, arrayList);
                }
                for (em2.e eVar : arrayList) {
                    if (Intrinsics.f(eVar.a(), str)) {
                        bVar.C2(new k(eVar));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } else if (obj3 instanceof UiAssetLockReason.Plan) {
            bVar.C1(bVar.f63755t.a(((UiAssetLockReason.Plan) obj3).f63804a));
        } else if (obj3 instanceof UiAssetLockReason.Challenge) {
            ChecklistChallenge checklistChallenge = ((UiAssetLockReason.Challenge) obj3).f63802a;
            KompotFeatureConfig kompotFeatureConfigD = ((pg3.b) bVar.f63753r).d(checklistChallenge, new AnalyticsProduct.Shared(k9.Profile, x0.RevolutUIKit, q6.RevolutUiKit, w2.Profile, od.RevolutUIKit));
            if (kompotFeatureConfigD != null) {
                bVar.C1(new BridgeDestination(gc0.c.f(kompotFeatureConfigD)));
            }
        }
        return Unit.f186387a;
    }
}
