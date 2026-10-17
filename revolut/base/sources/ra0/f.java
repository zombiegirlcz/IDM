package ra0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements jc0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlow f252767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ul2.c f252768b;

    public f(BackendFlow backendFlow, ul2.c fileRepository) {
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(fileRepository, "fileRepository");
        this.f252767a = backendFlow;
        this.f252768b = fileRepository;
    }
}
