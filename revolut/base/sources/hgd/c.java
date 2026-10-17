package hgd;

import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlow;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import hg0.n;
import igd.b;
import jgd.l;
import jgd.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared_separate_favourites.converter.ui.flow.b f152165b;

    public /* synthetic */ c(com.revolut.feature.shared_separate_favourites.converter.ui.flow.b bVar, int i) {
        this.f152164a = i;
        this.f152165b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f152164a) {
            case 0:
                m outputData = (m) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                SharedAddAssetFlow sharedAddAssetFlow = new SharedAddAssetFlow(new SharedAddAssetFlowContract$InputData(((l) outputData).f173975a));
                com.revolut.feature.shared_separate_favourites.converter.ui.flow.b bVar = this.f152165b;
                bVar.d2(sharedAddAssetFlow, ModalDestination.Style.FULLSCREEN_FADE.f98307a, new c(bVar, 1));
                return Unit.f186387a;
            default:
                igd.b result = (igd.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof igd.c) {
                    com.revolut.feature.shared_separate_favourites.converter.ui.flow.b bVar2 = this.f152165b;
                    bVar2.l2(new n(bVar2, (igd.c) result, null, 3), new yi5.b(26));
                } else if (!(result instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
