package a0b;

import com.revolut.feature.restricted_access.impl.ui.flow.RestrictedAccessPromptFlowContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RestrictedAccessPromptFlowContract$InputData f313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f314b;

    public f(d dVar, RestrictedAccessPromptFlowContract$InputData restrictedAccessPromptFlowContract$InputData) {
        this.f313a = restrictedAccessPromptFlowContract$InputData;
        this.f314b = e4m.b.b(new c(dVar, this));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
