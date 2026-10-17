package cj1;

import com.revolut.data.network.models.address.AddressModel;
import com.revolut.feature.address.impl.data.network.AddressService;
import com.revolut.feature.address.models.Address;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f24593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f24594x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f24593w = str;
        this.f24594x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f24593w, this.f24594x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object addressList;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            AddressService addressService = this.v.f24595a;
            this.u = 1;
            addressList = addressService.getAddressList(this.f24593w, this.f24594x, null, null, null, null, this);
            if (addressList == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            addressList = obj2;
        }
        Iterable<AddressModel> iterable = (Iterable) addressList;
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        for (AddressModel addressModel : iterable) {
            String country = addressModel.getCountry();
            String postcode = addressModel.getPostcode();
            arrayList.add(new Address(addressModel.getStreetLine1(), addressModel.getStreetLine2(), addressModel.getRegion(), addressModel.getCity(), postcode, country, addressModel.getFullAddress(), null, null, null, null, addressModel.getNeighborhood(), null, null, null, 30592, null));
        }
        return arrayList;
    }
}
