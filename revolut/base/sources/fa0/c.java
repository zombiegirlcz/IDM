package fa0;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.impl.ui.card_photo.BackendFlowCardPhotoFlowContract$InputData;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlowCardPhotoFlowContract$InputData f133020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlow f133021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f133022c;
    public final c d = this;
    public final e4m.e e;
    public final e4m.e f;

    public c(k kVar, BackendFlowCardPhotoFlowContract$InputData backendFlowCardPhotoFlowContract$InputData, BackendFlow backendFlow) {
        this.f133022c = kVar;
        this.f133020a = backendFlowCardPhotoFlowContract$InputData;
        this.f133021b = backendFlow;
        int i = 26;
        this.e = e4m.b.b(new eyd.j(kVar, this, 0, i));
        this.f = e4m.b.b(new eyd.j(kVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
