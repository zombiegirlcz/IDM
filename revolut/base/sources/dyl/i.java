package dyl;

import android.view.animation.Animation;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lki.z;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToChatTransitionFlowContainerLayout f121155b;

    public /* synthetic */ i(TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout, int i) {
        this.f121154a = i;
        this.f121155b = transferToChatTransitionFlowContainerLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f121154a;
        TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout = this.f121155b;
        Animation it8 = (Animation) obj2;
        switch (i) {
            case 0:
                int i2 = TransferToChatTransitionFlowContainerLayout.f107124p;
                Intrinsics.checkNotNullParameter(it8, "it");
                z zVar = transferToChatTransitionFlowContainerLayout.f107127h;
                if (zVar != null) {
                    zVar.p();
                }
                break;
            case 1:
                int i3 = TransferToChatTransitionFlowContainerLayout.f107124p;
                Intrinsics.checkNotNullParameter(it8, "it");
                z zVar2 = transferToChatTransitionFlowContainerLayout.f107127h;
                if (zVar2 != null) {
                    zVar2.r();
                }
                z zVar3 = transferToChatTransitionFlowContainerLayout.f107127h;
                if (zVar3 != null) {
                    zVar3.q();
                }
                break;
            default:
                int i5 = TransferToChatTransitionFlowContainerLayout.f107124p;
                Intrinsics.checkNotNullParameter(it8, "it");
                z zVar4 = transferToChatTransitionFlowContainerLayout.f107127h;
                if (zVar4 != null) {
                    zVar4.r();
                }
                z zVar5 = transferToChatTransitionFlowContainerLayout.f107127h;
                if (zVar5 != null) {
                    zVar5.q();
                }
                break;
        }
        return Unit.f186387a;
    }
}
