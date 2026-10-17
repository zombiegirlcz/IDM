package ejd;

import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.shops.api.navigation.AdsFullScreenPromptType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import pfm.t;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public k u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f126858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f126859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AdsFullScreenPromptType f126860y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, boolean z, AdsFullScreenPromptType adsFullScreenPromptType, Continuation continuation) {
        super(2, continuation);
        this.f126858w = kVar;
        this.f126859x = z;
        this.f126860y = adsFullScreenPromptType;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.f126858w, this.f126859x, this.f126860y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        k kVar2 = this.f126858w;
        if (i == 0) {
            o.b(obj2);
            y21.c cVar = kVar2.f126863p;
            cVar.getClass();
            t tVarC = cVar.c(SecuritySettings.PERSONALIZED_THIRD_PARTY_PROMOTION, this.f126859x);
            this.v = 1;
            if (nim.a.a(tVarC, this) != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar3 = this.u;
            o.b(obj2);
            kVar = kVar3;
            return yji.l.a1(kVar, (Flow) obj2, null, null, new ec8.c(kVar2, null, 12), 3);
        }
        o.b(obj2);
        if (!((AdsFullScreenPromptType.AdsPersonalizedOffers) this.f126860y).f87080a) {
            k.y2(kVar2);
            return Unit.f186387a;
        }
        lzb.c cVar2 = kVar2.f126866s;
        this.u = kVar2;
        this.v = 2;
        obj2 = cVar2.Z2(this);
        if (obj2 != aVar) {
            kVar = kVar2;
            return yji.l.a1(kVar, (Flow) obj2, null, null, new ec8.c(kVar2, null, 12), 3);
        }
        return aVar;
    }
}
