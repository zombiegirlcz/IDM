package eki;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreenContract$InputData;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import kotlin.jvm.internal.f0;
import rp0.o;
import skm.e0;
import xl2.r;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e extends f0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i2, Class cls, Object obj2, String str, String str2) {
        super(obj2, cls, str, str2, i);
        this.f = i2;
    }

    @Override // kotlin.jvm.internal.f0, wim.o
    public final Object get() {
        BottomExpandableDialogView bottomExpandableDialogViewC;
        cr0.h state;
        switch (this.f) {
            case 0:
                return ((BaseScrollerFlow) this.receiver).P2().f127178m;
            case 1:
                return ((PurposeOfAccountScreenContract$InputData) this.receiver).f97719a;
            case 2:
                return LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) this.receiver);
            case 3:
                return LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) this.receiver);
            case 4:
                return LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) this.receiver);
            case 5:
                return LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) this.receiver);
            case 6:
                o oVar = ((rp0.m) this.receiver).f;
                return (oVar == null || (bottomExpandableDialogViewC = oVar.c()) == null || (state = bottomExpandableDialogViewC.getState()) == null) ? cr0.h.HIDDEN : state;
            case 7:
                return ((OccupationChooserScreenContract$InputData) this.receiver).f97702a;
            case 8:
                return ((FormScreen) this.receiver).f63473l;
            case 9:
                return ((r) this.receiver).a();
            case 10:
                return ((TransactionCellItem) this.receiver).f63703c;
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rp0.m mVar) {
        super(mVar, rp0.m.class, "state", "getState$ui_kit_components_release()Lcom/revolut/core/ui_kit/internal/dialogs/BottomExpandableDialogView$State;", 0);
        this.f = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zkm.j jVar) {
        super(jVar, e0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        this.f = 11;
    }
}
