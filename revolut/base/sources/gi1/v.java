package gi1;

import com.revolut.feature.address.models.CountryState;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.address.common.impl.flow.screen.add.a f144054w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, com.revolut.feature.address.common.impl.flow.screen.add.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f144054w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, this.f144054w, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((CountryState) next).getCode(), this.v)) {
                break;
            }
        }
        CountryState countryState = (CountryState) next;
        if (countryState != null) {
            com.revolut.feature.address.common.impl.flow.screen.add.a aVar2 = this.f144054w;
            aVar2.B = countryState;
            aVar2.H2(aVar2.C, new u(countryState, 0));
        }
        return Unit.f186387a;
    }
}
