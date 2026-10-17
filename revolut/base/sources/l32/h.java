package l32;

import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.wrapper.ApmConsentWrapperFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements g {
    public final ApmConsentNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tak.d f191845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f191846q;

    public h(ApmConsentNavigation$InputData inputData, tak.d extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.o = inputData;
        this.f191845p = extension;
        v vVar = new v(this, 3);
        this.f191846q = cp5.d.a(this, ApmConsentWrapperFlowContract$Step.f62362a, f0.f322471a, vVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f191846q;
    }
}
