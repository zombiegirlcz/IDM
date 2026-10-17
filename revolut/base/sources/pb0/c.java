package pb0;

import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CardCellItem;
import com.revolut.feature.backend_flow.domain.models.CardSelectionItem;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlow f234584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f234585c;

    public c(BackendFlow backendFlow, oc0.f cardsRepository, int i) {
        this.f234583a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
                Intrinsics.checkNotNullParameter(cardsRepository, "cardsRepository");
                this.f234584b = backendFlow;
                this.f234585c = cardsRepository;
                break;
            default:
                Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
                Intrinsics.checkNotNullParameter(cardsRepository, "cardsRepository");
                this.f234584b = backendFlow;
                this.f234585c = cardsRepository;
                break;
        }
    }

    @Override // pb0.a
    public final Flow a(BackendItem backendItem) {
        switch (this.f234583a) {
            case 0:
                CardCellItem item = (CardCellItem) backendItem;
                Intrinsics.checkNotNullParameter(item, "item");
                return nim.a.v(oc0.f.a((oc0.f) this.f234585c, new oc0.a(this.f234584b.f63264b, item.f63340b, item.f63341c)), new b(item, 0));
            case 1:
                CardSelectionItem item2 = (CardSelectionItem) backendItem;
                Intrinsics.checkNotNullParameter(item2, "item");
                return nim.a.v(oc0.f.b((oc0.f) this.f234585c, new oc0.b(this.f234584b.f63264b, item2.f63345a)), new d(item2, 0));
            default:
                BackendEntityItem item3 = (BackendEntityItem) backendItem;
                Intrinsics.checkNotNullParameter(item3, "item");
                fc0.f fVar = (fc0.f) this.f234585c;
                BackendFlow backendFlow = this.f234584b;
                return nim.a.v(fc0.f.b(fVar, backendFlow.f63264b, item3.getId(), backendFlow.f63267h, ebm.a.o(item3), item3.getF63424b()), new g(item3, 0));
        }
    }

    public c(BackendFlow backendFlow, fc0.f entitiesInteractor) {
        this.f234583a = 2;
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(entitiesInteractor, "entitiesInteractor");
        this.f234584b = backendFlow;
        this.f234585c = entitiesInteractor;
    }
}
