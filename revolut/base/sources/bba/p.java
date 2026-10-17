package bba;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.pix.api.model.PixBeneficiary;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public s u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f14211w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f14212x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(2, continuation);
        this.f14211w = sVar;
        this.f14212x = valid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.f14211w, this.f14212x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        s sVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s sVar2 = this.f14211w;
            f8a.c cVar = sVar2.f14217p;
            this.u = sVar2;
            this.v = 1;
            Object objA = ((s8a.m) cVar).a(this.f14212x, this);
            if (objA == aVar) {
                return aVar;
            }
            sVar = sVar2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = this.u;
            yhm.o.b(obj2);
        }
        sVar.C2(new f((PixBeneficiary) obj2));
        return Unit.f186387a;
    }
}
