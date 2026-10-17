package hu1;

import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsContract$InputData;
import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f155539b;

    public /* synthetic */ t(e0 e0Var, int i) {
        this.f155538a = i;
        this.f155539b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f155538a) {
            case 0:
                e0 e0Var = this.f155539b;
                e0Var.l2(new d0(e0Var, null), new yi5.b(26));
                break;
            case 1:
                hrf.f fVar = hrf.f.OUTGOING;
                e0 e0Var2 = this.f155539b;
                e0Var2.C1(new com.revolut.kompot.common.b(e0Var2.e1(e0Var2.f155517w.g(fVar)), (ModalDestination.Style) null, 6));
                break;
            case 2:
                e0 e0Var3 = this.f155539b;
                e0Var3.C1(new com.revolut.kompot.common.b(e0Var3.e1(e0Var3.v.h(null)), (ModalDestination.Style) null, 6));
                break;
            default:
                e0 e0Var4 = this.f155539b;
                e0Var4.C1(new com.revolut.kompot.common.b(new BlikSettingsScreen(new BlikSettingsContract$InputData(((o) e0Var4.t2()).f155536h, ((o) e0Var4.t2()).i)), (ModalDestination.Style) null, 6));
                break;
        }
        return Unit.f186387a;
    }
}
