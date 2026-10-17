package if5;

import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenController;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.error.ErrorScreenController;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.loading.LoadingScreenController;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview.EarnAssetsPreviewScreenController;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.EarnAssetsRootScreenContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yki.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b f160909b;

    public /* synthetic */ c(com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b bVar, int i) {
        this.f160908a = i;
        this.f160909b = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f160908a) {
            case 0:
                l FlowCoordinator = (l) obj2;
                EarnAssetsRootScreenContract$Step it8 = (EarnAssetsRootScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                EarnAssetsRootScreenContract$Step earnAssetsRootScreenContract$Step = (EarnAssetsRootScreenContract$Step) FlowCoordinator.d();
                boolean zF = Intrinsics.f(earnAssetsRootScreenContract$Step, EarnAssetsRootScreenContract$Step.Loading.f70806a);
                com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b bVar = this.f160909b;
                if (zF) {
                    bVar.getClass();
                    return new LoadingScreenController();
                }
                if (Intrinsics.f(earnAssetsRootScreenContract$Step, EarnAssetsRootScreenContract$Step.Preview.f70807a)) {
                    bVar.getClass();
                    return new EarnAssetsPreviewScreenController();
                }
                if (Intrinsics.f(earnAssetsRootScreenContract$Step, EarnAssetsRootScreenContract$Step.Assets.f70804a)) {
                    bVar.getClass();
                    return new EarnAssetsScreenController();
                }
                if (!Intrinsics.f(earnAssetsRootScreenContract$Step, EarnAssetsRootScreenContract$Step.Error.f70805a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.getClass();
                return new ErrorScreenController();
            default:
                com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b.I2(this.f160909b, EarnAssetsRootScreenContract$Step.Error.f70805a);
                return Unit.f186387a;
        }
    }
}
