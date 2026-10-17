package avj;

import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$State;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import o23.w;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Address f10064b;

    public /* synthetic */ p(Address address, int i) {
        this.f10063a = i;
        this.f10064b = address;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        switch (this.f10063a) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a.a(update, null, null, null, this.f10064b, 7);
            case 1:
                cp7.e eVar = (cp7.e) obj2;
                Address address = eVar.f107891c;
                Address address2 = this.f10064b;
                if (address == null) {
                    address = address2;
                }
                return cp7.e.a(eVar, null, address, address2, 19);
            case 2:
                UserOnboardingFlowContract$State update2 = (UserOnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return UserOnboardingFlowContract$State.a(update2, null, null, this.f10064b, 3);
            case 3:
                UserOnboardingFlowContract$State update3 = (UserOnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return UserOnboardingFlowContract$State.a(update3, null, null, this.f10064b, 3);
            case 4:
                d4c.e update4 = (d4c.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return d4c.e.a(update4, null, this.f10064b, 1);
            case 5:
                gi1.k update5 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                sh1.h hVarM2 = com.revolut.feature.address.common.impl.flow.screen.add.a.M2(this.f10064b);
                m70.a.c(t0.f186434a);
                return gi1.k.a(update5, hVarM2, null, null, "", false, null, null, null, null, null, null, 65506);
            case 6:
                gi1.k update6 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                Address address3 = this.f10064b;
                sh1.h hVarM22 = com.revolut.feature.address.common.impl.flow.screen.add.a.M2(address3);
                Address.Type type = address3.getType();
                String fullAddress = address3.getFullAddress();
                if (fullAddress == null) {
                    fullAddress = "";
                }
                return gi1.k.a(update6, hVarM22, null, type, fullAddress, true, null, null, null, null, null, null, 65506);
            case 7:
                kbi.f update7 = (kbi.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return kbi.f.a(update7, null, null, this.f10064b, 11);
            case 8:
                sh1.h it8 = (sh1.h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.O2(this.f10064b);
            case 9:
                w update8 = (w) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                String fullAddress2 = this.f10064b.getFullAddress();
                if (fullAddress2 == null) {
                    fullAddress2 = "";
                }
                return w.a(update8, null, null, fullAddress2, null, null, true, null, null, null, null, false, null, 32695);
            case 10:
                sh1.h it9 = (sh1.h) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.O2(this.f10064b);
            case 11:
                w update9 = (w) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                String fullAddress3 = this.f10064b.getFullAddress();
                if (fullAddress3 == null) {
                    fullAddress3 = "";
                }
                return w.a(update9, null, null, fullAddress3, null, null, true, null, null, null, null, false, null, 32695);
            case 12:
                w update10 = (w) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                Address address4 = this.f10064b;
                return w.a(update10, null, null, null, address4, address4, false, null, null, null, null, false, null, 32719);
            case 13:
                sh1.h it10 = (sh1.h) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.O2(this.f10064b);
            case 14:
                w update11 = (w) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return w.a(update11, null, null, null, null, this.f10064b, false, null, null, null, null, false, null, 32735);
            case 15:
                Address empty = Address.INSTANCE.getEMPTY();
                sh1.h hVarO2 = com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.O2(empty.copy((32704 & 1) != 0 ? empty.streetLine1 : null, (32704 & 2) != 0 ? empty.streetLine2 : null, (32704 & 4) != 0 ? empty.region : null, (32704 & 8) != 0 ? empty.city : null, (32704 & 16) != 0 ? empty.postcode : null, (32704 & 32) != 0 ? empty.country : this.f10064b.getCountry(), (32704 & 64) != 0 ? empty.fullAddress : null, (32704 & 128) != 0 ? empty.streetType : null, (32704 & 256) != 0 ? empty.street : null, (32704 & 512) != 0 ? empty.houseNumber : null, (32704 & 1024) != 0 ? empty.flat : null, (32704 & 2048) != 0 ? empty.neighborhood : null, (32704 & 4096) != 0 ? empty.houseName : null, (32704 & 8192) != 0 ? empty.type : null, (32704 & 16384) != 0 ? empty.landmark : null));
                m70.a.c(t0.f186434a);
                return w.a((w) obj2, hVarO2, null, "", null, null, true, null, null, null, null, false, null, 32694);
            case 16:
                return ovb.e.a((ovb.e) obj2, null, null, null, null, null, this.f10064b, false, 95);
            case 17:
                q23.q update12 = (q23.q) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return q23.q.a(update12, zi0.c.P(this.f10064b, false, null, 3), false, null, null, null, null, null, null, null, false, null, 4078);
            case 18:
                q23.q update13 = (q23.q) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return q23.q.a(update13, null, false, null, null, this.f10064b, null, null, null, null, false, null, 4079);
            case 19:
                q23.q update14 = (q23.q) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return q23.q.a(update14, zi0.c.P(this.f10064b, false, null, 3), false, null, null, null, null, null, null, null, false, null, 3966);
            case 20:
                Address address5 = this.f10064b;
                return q23.q.a((q23.q) obj2, null, false, null, address5, address5, null, null, null, null, false, null, 4071);
            default:
                Map map = ((e7l.f) obj2).f123378k1;
                return (map == null || (list = (List) map.get(nz8.d.g(this.f10064b))) == null) ? f0.f322471a : list;
        }
    }

    public /* synthetic */ p(oki.h hVar, Address address, int i) {
        this.f10063a = i;
        this.f10064b = address;
    }
}
