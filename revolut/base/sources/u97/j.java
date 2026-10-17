package u97;

import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t97.d f278412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t97.c productCellProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        this.f278412b = t97.d.PROFILE;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f278412b;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.l(new FeatureCommand(KompotProfileFeatureConfig.Settings.f81342g));
    }
}
