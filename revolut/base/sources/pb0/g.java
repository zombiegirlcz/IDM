package pb0;

import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackendEntityItem f234595b;

    public /* synthetic */ g(BackendEntityItem backendEntityItem, int i) {
        this.f234594a = i;
        this.f234595b = backendEntityItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List entities = (List) obj2;
        switch (this.f234594a) {
            case 0:
                Intrinsics.checkNotNullParameter(entities, "entities");
                break;
            default:
                Intrinsics.checkNotNullParameter(entities, "entities");
                break;
        }
        return this.f234595b.c3(entities);
    }
}
