package cd0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xl2.h0;
import xl2.v;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackendScreen f23141b;

    public /* synthetic */ b(BackendScreen backendScreen, int i) {
        this.f23140a = i;
        this.f23141b = backendScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f23140a) {
            case 0:
                h0 item = (h0) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return new e(((v) this.f23141b).getF63326a(), item);
            default:
                List updatedItems = (List) obj2;
                Intrinsics.checkNotNullParameter(updatedItems, "updatedItems");
                BackendScreen backendScreen = this.f23141b;
                if (backendScreen instanceof FormScreen) {
                    return FormScreen.J((FormScreen) backendScreen, updatedItems, null, null, null, 65533);
                }
                if (backendScreen instanceof BottomPromptScreen) {
                    return BottomPromptScreen.J((BottomPromptScreen) backendScreen, updatedItems, null, null, 991);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
