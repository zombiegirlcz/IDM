package zc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class l2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2 f321080a = new l2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return Boolean.valueOf(obj2 instanceof BackendFlowUploadItem);
    }
}
