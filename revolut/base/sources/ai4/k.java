package ai4;

import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionsBottomSheetController f5191b;

    public /* synthetic */ k(ActionsBottomSheetController actionsBottomSheetController, int i) {
        this.f5190a = i;
        this.f5191b = actionsBottomSheetController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5190a) {
            case 0:
                this.f5191b.c3(dii.e.f115068a);
                return Unit.f186387a;
            default:
                ActionsBottomSheetController actionsBottomSheetController = this.f5191b;
                return n14.e.a(actionsBottomSheetController, actionsBottomSheetController.R);
        }
    }
}
