package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f182002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f182003x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(z zVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f182002w = zVar;
        this.f182003x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f182002w, this.f182003x, continuation, 0);
            default:
                return new t(this.f182002w, this.f182003x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object jVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                z zVar = this.f182002w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    RevolutPayService revolutPayService = zVar.f182025a;
                    this.v = 1;
                    obj2 = revolutPayService.getCardIssuerInfo(this.f182003x, this);
                    if (obj2 != jVar) {
                    }
                    return jVar;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                g7c.a dto = (g7c.a) obj2;
                d7c.b bVar = zVar.d;
                Intrinsics.checkNotNullParameter(dto, "dto");
                String bin = dto.getBin();
                String country = dto.getCountry();
                boolean postcodeRequired = dto.getPostcodeRequired();
                Integer errorCode = dto.getErrorCode();
                jVar = new u6c.j(bin, country, postcodeRequired, errorCode != null && errorCode.intValue() == 1020);
                return jVar;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    RevolutPayService revolutPayService2 = this.f182002w.f182025a;
                    this.v = 1;
                    obj2 = revolutPayService2.getPaymentMethods(this.f182003x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return d7c.g.b((List) obj2);
        }
    }
}
