package u97;

import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import wtc.a1;
import wtc.w;
import wtc.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rul.e f278414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f278415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t97.c productCellProvider, rul.e securityHubFeatureChecker) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(securityHubFeatureChecker, "securityHubFeatureChecker");
        this.f278414b = securityHubFeatureChecker;
        this.f278415c = t97.d.WEALTH_PROTECTION;
    }

    @Override // r97.b
    public final Flow d() {
        a1 a1Var = (a1) ((ptc.a) this.f278414b.f257630b);
        a1Var.getClass();
        return new w(new v1(new y0(a1Var, null)), 0);
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f278415c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.d(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.WealthProtection.f85392a, false, (String) null, true, 22));
    }
}
