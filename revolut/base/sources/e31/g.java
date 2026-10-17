package e31;

import com.revolut.data.network.models.topup.TopupSourceDto;
import com.revolut.data.network.services.TopupService;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import wim.z;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g71.a f122177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f122178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f122179y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, g71.a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f122177w = aVar;
        this.f122178x = str;
        this.f122179y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f122177w, this.f122178x, this.f122179y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g71.a aVar = this.f122177w;
        TopupMethodType topupMethodType = aVar.f141070a;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            TopupService topupService = jVar.f122181b;
            TopupSourceDto topupSourceDto = new TopupSourceDto(topupMethodType, new TopupSourceDto.Details(this.f122178x, this.f122179y));
            this.u = 1;
            obj2 = topupService.createTopupSource(topupSourceDto, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        yte.e eVarA = kue.a.a((sue.j) obj2);
        if (eVarA.f316708b != yte.d.ACTIVE) {
            ue0.c cVar = jVar.f122180a;
            String str = "TOPUP_INDIA_MCY_PENDING_INFO_KEY_" + eVarA.f316707a;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            cVar.G(new o21.a(mo3.a.p(aVar.f141071b), topupMethodType.name()), str, z.d(o0.b(o21.a.class)));
        }
        return eVarA;
    }
}
