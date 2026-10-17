package fc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowEntitiesPage;
import do2.o;
import java.util.List;
import kotlin.jvm.functions.Function1;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133595a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackendFlowEntitiesPage f133596b;

    public /* synthetic */ d(BackendFlowEntitiesPage backendFlowEntitiesPage) {
        this.f133596b = backendFlowEntitiesPage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f133595a) {
            case 0:
                BackendFlowEntitiesPage backendFlowEntitiesPage = (BackendFlowEntitiesPage) obj2;
                return BackendFlowEntitiesPage.a(backendFlowEntitiesPage, d0.E0(backendFlowEntitiesPage.f63271c, this.f133596b.f63271c));
            default:
                return f.c(this.f133596b, new o((List) obj2, 19));
        }
    }

    public /* synthetic */ d(f fVar, BackendFlowEntitiesPage backendFlowEntitiesPage) {
        this.f133596b = backendFlowEntitiesPage;
    }
}
