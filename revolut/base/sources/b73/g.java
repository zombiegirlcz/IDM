package b73;

import com.revolut.feature.card_screen.api.navigation.CardSelectionNavigationData$InputData;
import d73.u;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f12875b;

    public /* synthetic */ g(i iVar, int i) {
        this.f12874a = i;
        this.f12875b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12874a) {
            case 0:
                Boolean juniorFeatureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                if (!juniorFeatureEnabled.booleanValue()) {
                    return w.h(f0.f322471a);
                }
                return rd0.e.c(this.f12875b.f12881t.c(null, w4l.h.f294642c), kotlin.coroutines.g.f186406a).filter(new b0a.h(21, new b4g.f0(28))).map(new b0a.h(22, new b4g.f0(29)));
            default:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                i iVar = this.f12875b;
                u uVar = iVar.f12879r;
                CardSelectionNavigationData$InputData cardSelectionNavigationData$InputData = iVar.o;
                return uVar.b(it8, cardSelectionNavigationData$InputData.e, cardSelectionNavigationData$InputData.d);
        }
    }
}
