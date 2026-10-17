package boh;

import cli.y;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreen;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MostTradedAssetsScreen f17469w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(MostTradedAssetsScreen mostTradedAssetsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f17469w = mostTradedAssetsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f17469w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f17469w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep selectSection;
        int i = this.u;
        MostTradedAssetsScreen mostTradedAssetsScreen = this.f17469w;
        switch (i) {
            case 0:
                o filter = (o) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.collection.most_traded.a aVar2 = (com.revolut.feature.wealth_discovery.impl.collection.most_traded.a) ((m) mostTradedAssetsScreen.R.getValue());
                y yVar = aVar2.v;
                Intrinsics.checkNotNullParameter(filter, "filter");
                int i2 = s.f17481a[filter.ordinal()];
                if (i2 == 1) {
                    selectSection = new MostTradedAssetsScreenContract$ModalStep.SelectSection(((n) ((j2) yVar.f22677a).getValue()).d);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    selectSection = new MostTradedAssetsScreenContract$ModalStep.SelectTimeSpan(((n) ((j2) yVar.f22677a).getValue()).f17473c);
                }
                oki.h.v2(aVar2.f96133w, selectSection, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            default:
                l parcel = (l) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.collection.most_traded.a aVar4 = (com.revolut.feature.wealth_discovery.impl.collection.most_traded.a) ((m) mostTradedAssetsScreen.R.getValue());
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                aVar4.l2(new t(aVar4, parcel, null), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
