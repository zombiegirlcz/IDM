package xsh;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f308504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f308505c;

    public /* synthetic */ j(List list, int i, int i2) {
        this.f308503a = i2;
        this.f308504b = list;
        this.f308505c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f308503a) {
            case 0:
                d updateState = (d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return new d(this.f308504b, this.f308505c);
            case 1:
                SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return SotFlowContract$FlowState.a(update, false, null, null, null, (DocumentType) this.f308504b.get(this.f308505c + 1), null, null, null, null, null, null, null, null, false, 16367);
            default:
                SotFlowContract$FlowState update2 = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return SotFlowContract$FlowState.a(update2, false, null, null, null, (DocumentType) this.f308504b.get(this.f308505c - 1), null, null, null, null, null, null, null, null, false, 16367);
        }
    }
}
