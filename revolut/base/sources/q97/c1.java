package q97;

import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class c1 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final myj.e f243662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(t97.c productCellProvider, myj.e learnFeatureStateChecker) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(learnFeatureStateChecker, "learnFeatureStateChecker");
        this.f243662b = learnFeatureStateChecker;
        this.f243663c = t97.d.LEARN;
    }

    @Override // r97.b
    public final Flow d() {
        return new b1(rd0.e.b(this.f243662b.b()), 0);
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243663c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.l(new FeatureCommand(new LearnKompotFeatureConfig.Home(null)));
    }
}
