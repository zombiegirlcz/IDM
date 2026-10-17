package vi1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f289493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f289494b;

    public b(d addressFieldsConfigurationProvider, h addressFlowFieldsSet) {
        Intrinsics.checkNotNullParameter(addressFieldsConfigurationProvider, "addressFieldsConfigurationProvider");
        Intrinsics.checkNotNullParameter(addressFlowFieldsSet, "addressFlowFieldsSet");
        this.f289493a = addressFieldsConfigurationProvider;
        this.f289494b = addressFlowFieldsSet;
    }

    public final wi1.a a(sh1.n countriesConfiguration, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(countriesConfiguration, "countriesConfiguration");
        return bVar == null ? wi1.a.MANUAL : countriesConfiguration.f263380a.contains(bVar) ? wi1.a.POST_CODE_LOOKUP : countriesConfiguration.f263381b.contains(bVar) ? wi1.a.AUTO_COMPLETE : wi1.a.MANUAL;
    }
}
