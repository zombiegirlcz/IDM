package com.revolut.kompot.common.screens.layout_viewer;

import aii.q;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxScreen;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import jki.h;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import sji.b;
import yhm.d;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/kompot/common/screens/layout_viewer/LayoutViewerScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxScreen;", "Ljki/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/d1;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class LayoutViewerScreen extends BaseRxScreen<k, IOData$EmptyInput, q> implements d1 {
    public final int O;
    public final Lazy P;
    public final Lazy Q;

    public LayoutViewerScreen(int i) {
        super(IOData$EmptyInput.f98299a);
        this.O = i;
        final int i2 = 0;
        this.P = j.b(new Function0(this) { // from class: dji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LayoutViewerScreen f115397b;

            {
                this.f115397b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        eji.a aVar = new eji.a();
                        LayoutViewerScreen layoutViewerScreen = this.f115397b;
                        layoutViewerScreen.getClass();
                        aVar.f126905a = layoutViewerScreen;
                        return (eji.b) aVar.mo3800build();
                    default:
                        return (b) ((eji.b) this.f115397b.P.getValue()).f126907b.get();
                }
            }
        });
        final int i3 = 1;
        this.Q = j.b(new Function0(this) { // from class: dji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LayoutViewerScreen f115397b;

            {
                this.f115397b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        eji.a aVar = new eji.a();
                        LayoutViewerScreen layoutViewerScreen = this.f115397b;
                        layoutViewerScreen.getClass();
                        aVar.f126905a = layoutViewerScreen;
                        return (eji.b) aVar.mo3800build();
                    default:
                        return (b) ((eji.b) this.f115397b.P.getValue()).f126907b.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (eji.b) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (dji.b) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }
}
