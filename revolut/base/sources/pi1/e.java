package pi1;

import c5a.m0;
import cj1.k;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.feature.address.models.AddressVerificationUseCase;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.address.common.impl.flow.validation_flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Address f236376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AddressVerificationUseCase f236377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AddressFormat f236378y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.address.common.impl.flow.validation_flow.c cVar, Address address, AddressVerificationUseCase addressVerificationUseCase, AddressFormat addressFormat, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f236376w = address;
        this.f236377x = addressVerificationUseCase;
        this.f236378y = addressFormat;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f236376w, this.f236377x, this.f236378y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        rh1.b bVar = this.v.f61033p;
        Address address = this.f236376w;
        Address addressCopy = address.copy((32704 & 1) != 0 ? address.streetLine1 : null, (32704 & 2) != 0 ? address.streetLine2 : null, (32704 & 4) != 0 ? address.region : null, (32704 & 8) != 0 ? address.city : null, (32704 & 16) != 0 ? address.postcode : null, (32704 & 32) != 0 ? address.country : null, (32704 & 64) != 0 ? address.fullAddress : null, (32704 & 128) != 0 ? address.streetType : null, (32704 & 256) != 0 ? address.street : null, (32704 & 512) != 0 ? address.houseNumber : null, (32704 & 1024) != 0 ? address.flat : null, (32704 & 2048) != 0 ? address.neighborhood : null, (32704 & 4096) != 0 ? address.houseName : null, (32704 & 8192) != 0 ? address.type : null, (32704 & 16384) != 0 ? address.landmark : null);
        this.u = 1;
        k kVar = ((lj1.a) bVar).f195590b.f322492a;
        kVar.getClass();
        m0 m0Var = new m0(11, kVar, this.f236377x, addressCopy, this.f236378y, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, m0Var, this);
        return objJ == aVar ? aVar : objJ;
    }
}
