package ga9;

import com.revolut.feature_retail_user_declarations.purpose.flow.PurposeOfAccountFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewController f142078b;

    public /* synthetic */ h(ViewController viewController, int i) {
        this.f142077a = i;
        this.f142078b = viewController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f142077a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                ViewController viewController = this.f142078b;
                PurposeOfAccountFlow purposeOfAccountFlow = viewController instanceof PurposeOfAccountFlow ? (PurposeOfAccountFlow) viewController : null;
                if (purposeOfAccountFlow != null) {
                    purposeOfAccountFlow.d3();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                ViewController viewController2 = this.f142078b;
                PurposeOfAccountFlow purposeOfAccountFlow2 = viewController2 instanceof PurposeOfAccountFlow ? (PurposeOfAccountFlow) viewController2 : null;
                if (purposeOfAccountFlow2 != null) {
                    purposeOfAccountFlow2.d3();
                }
                break;
        }
        return Boolean.FALSE;
    }
}
