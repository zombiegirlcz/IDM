package ea0;

import aii.r;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import ss6.e;
import zhm.q0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements qii.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f124044b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f124043a = i;
        this.f124044b = obj2;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b p17) {
        switch (this.f124043a) {
            case 0:
                m90.b p0 = (m90.b) rVar;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                if (!(p0 instanceof m90.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                p17.J2();
                return;
            default:
                fd1.b result = (fd1.b) rVar;
                Intrinsics.checkNotNullParameter(result, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(p17, "wrapperFlowModel");
                if (result instanceof fd1.a) {
                    knm.b.j(p17.l1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("CATALOGUE_SINGLE_PICK_ARGS", ((fd1.a) result).f133855a)), null, 4)));
                    return;
                } else {
                    p17.J2();
                    return;
                }
        }
    }

    public final boolean equals(Object obj2) {
        switch (this.f124043a) {
            case 0:
                if ((obj2 instanceof qii.a) && (obj2 instanceof n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof qii.a) && (obj2 instanceof n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f124043a) {
            case 0:
                return new q(2, 0, c.class, (c) this.f124044b, "backendFlowResultHandler", "backendFlowResultHandler(Lcom/revolut/core/backend_flow/api/model/BackendFlowResult;Lcom/revolut/kompot/common/flow/WrapperFlowModel;)V");
            default:
                return new q(2, 0, e.class, (e) this.f124044b, "handleCatalogueSinglePickResult", "handleCatalogueSinglePickResult(Lcom/revolut/feature/acquiring/lite_pos/api/ui/flow/root/LitePosRootFlowOutputData;Lcom/revolut/kompot/common/flow/WrapperFlowModel;)V");
        }
    }

    public final int hashCode() {
        switch (this.f124043a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
