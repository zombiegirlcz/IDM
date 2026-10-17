package opf;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.transfer.core.models.CountryProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ood.o0;
import yhm.m;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jx0.a f227627w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(jx0.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f227627w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f227627w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f227627w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        List list = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(list, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        switch (this.u) {
            case 0:
                List<zlg.c> list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ArrayList arrayList = new ArrayList();
                for (zlg.c cVar : list) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        Address address = cVar.f323250a.e;
                        if (address != null) {
                            Intrinsics.checkNotNullParameter(address, "<this>");
                            objA = nz8.d.g(address);
                        } else {
                            objA = null;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (objA == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Throwable thA = yhm.m.a(objA);
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    wi0.b bVar = (wi0.b) objA;
                    CountryProfile countryProfile = bVar != null ? new CountryProfile(cVar.f323250a.f116395a, bVar, cVar.f323252c) : null;
                    if (countryProfile != null) {
                        arrayList.add(countryProfile);
                    }
                }
                return arrayList;
            default:
                List list2 = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return list2.isEmpty() ? nim.a.v(this.f227627w.t(), new o0(15)) : new go.g(new Data(list2, null, false, 6, null), 2);
        }
    }
}
