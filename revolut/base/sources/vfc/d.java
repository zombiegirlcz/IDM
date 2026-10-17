package vfc;

import com.revolut.feature.revpro.pro_merchant.toggles.impl.data.network.ProMerchantFeatureToggleService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public tfc.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f288565x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f288565x = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new d(this.f288565x, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new d(this.f288565x, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean hasCardReader;
        tfc.a aVar;
        switch (this.u) {
            case 0:
                f fVar = this.f288565x;
                tfc.a aVar2 = fVar.f288568c;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.f288564w;
                if (i == 0) {
                    o.b(obj2);
                    ufc.b dto = (ufc.b) y.t(ufc.b.class, fVar.d, "ProMerchantTogglesRepositoryImpl:CardReaderUsage:Storage");
                    if (dto != null) {
                        if (!dto.getHasCardReader()) {
                            dto = null;
                        }
                        if (dto != null) {
                            aVar2.getClass();
                            Intrinsics.checkNotNullParameter(dto, "dto");
                            hasCardReader = dto.getHasCardReader();
                            return new kf1.d(hasCardReader);
                        }
                    }
                    ProMerchantFeatureToggleService proMerchantFeatureToggleService = fVar.f288566a;
                    this.v = aVar2;
                    this.f288564w = 1;
                    obj2 = proMerchantFeatureToggleService.getCardReaderUsageToggles(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = this.v;
                    o.b(obj2);
                }
                ufc.b dto2 = (ufc.b) obj2;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(dto2, "dto");
                hasCardReader = dto2.getHasCardReader();
                return new kf1.d(hasCardReader);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f288564w;
                if (i2 == 0) {
                    o.b(obj2);
                    f fVar2 = this.f288565x;
                    tfc.a aVar5 = fVar2.f288568c;
                    ProMerchantFeatureToggleService proMerchantFeatureToggleService2 = fVar2.f288566a;
                    this.v = aVar5;
                    this.f288564w = 1;
                    obj2 = proMerchantFeatureToggleService2.getFeatureToggles(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                    aVar = aVar5;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.v;
                    o.b(obj2);
                }
                aVar.getClass();
                return tfc.a.a((ufc.d) obj2);
        }
    }
}
