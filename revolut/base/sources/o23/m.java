package o23;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.CountryState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nya.i0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b f221450b;

    public /* synthetic */ m(com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar, int i) {
        this.f221449a = i;
        this.f221450b = bVar;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Address addressCopy;
        switch (this.f221449a) {
            case 0:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar = this.f221450b;
                cli.y yVar = bVar.D;
                y7a.v output = (y7a.v) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                y7a.w wVar = output.f311454a;
                if (wVar instanceof e23.f) {
                    CountryState countryState = ((e23.f) wVar).f122018a;
                    String code = null;
                    if (!Intrinsics.f(countryState != null ? countryState.getName() : null, ((w) ((j2) yVar.f22677a).getValue()).f221464a.d.f263344a)) {
                        wi0.b bVarC = com.bumptech.glide.d.c(bVar.M2());
                        wi0.b.Companion.getClass();
                        if (bVarC.equals(wi0.b.f297734c)) {
                            if (countryState != null) {
                                code = countryState.getName();
                            }
                        } else if (countryState != null) {
                            code = countryState.getCode();
                        }
                        String str = code;
                        Address addressK2 = bVar.K2();
                        Address addressCopy2 = addressK2.copy((32704 & 1) != 0 ? addressK2.streetLine1 : null, (32704 & 2) != 0 ? addressK2.streetLine2 : null, (32704 & 4) != 0 ? addressK2.region : str, (32704 & 8) != 0 ? addressK2.city : null, (32704 & 16) != 0 ? addressK2.postcode : null, (32704 & 32) != 0 ? addressK2.country : null, (32704 & 64) != 0 ? addressK2.fullAddress : null, (32704 & 128) != 0 ? addressK2.streetType : null, (32704 & 256) != 0 ? addressK2.street : null, (32704 & 512) != 0 ? addressK2.houseNumber : null, (32704 & 1024) != 0 ? addressK2.flat : null, (32704 & 2048) != 0 ? addressK2.neighborhood : null, (32704 & 4096) != 0 ? addressK2.houseName : null, (32704 & 8192) != 0 ? addressK2.type : null, (32704 & 16384) != 0 ? addressK2.landmark : null);
                        com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar, new avj.p(bVar, addressCopy2, 8));
                        bVar.H2(yVar, new avj.p(addressCopy2, 9));
                    }
                }
                return Unit.f186387a;
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                e7l.f fVar = (e7l.f) pair.f186385a;
                gk3.e eVar = (gk3.e) pair.f186386b;
                List list = fVar.f123381n;
                List list2 = fVar.o;
                List list3 = fVar.i;
                n8b.a aVar = this.f221450b.u;
                ((o8b.c) aVar).getClass();
                List listD1 = zhm.d0.d1(o8b.c.f222983j.keySet());
                Map map = fVar.f123378k1;
                List listA = ((o8b.c) aVar).a();
                ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
                Iterator it8 = listA.iterator();
                while (it8.hasNext()) {
                    kii.e.B(wi0.b.Companion, (String) it8.next(), arrayList);
                }
                return new v(list, list2, list3, listD1, map, arrayList, eVar);
            case 2:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar2 = this.f221450b;
                cli.y yVar2 = bVar2.D;
                s7a.a0 output2 = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                s7a.c0 c0Var = output2.f260599a;
                if (c0Var instanceof f0) {
                    String id10 = ((f0) c0Var).f221446a.getId();
                    if (!Intrinsics.f(id10, ((w) ((j2) yVar2.f22677a).getValue()).f221464a.f.f263344a)) {
                        bVar2.H2(yVar2, new l(id10, 7));
                    }
                }
                return Unit.f186387a;
            case 3:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar3 = this.f221450b;
                cli.y yVar3 = bVar3.D;
                th1.h output3 = (th1.h) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof th1.f) {
                    Address empty = Address.INSTANCE.getEMPTY();
                    addressCopy = empty.copy((32704 & 1) != 0 ? empty.streetLine1 : null, (32704 & 2) != 0 ? empty.streetLine2 : null, (32704 & 4) != 0 ? empty.region : null, (32704 & 8) != 0 ? empty.city : null, (32704 & 16) != 0 ? empty.postcode : ((th1.f) output3).f271246a, (32704 & 32) != 0 ? empty.country : bVar3.M2(), (32704 & 64) != 0 ? empty.fullAddress : null, (32704 & 128) != 0 ? empty.streetType : null, (32704 & 256) != 0 ? empty.street : null, (32704 & 512) != 0 ? empty.houseNumber : null, (32704 & 1024) != 0 ? empty.flat : null, (32704 & 2048) != 0 ? empty.neighborhood : null, (32704 & 4096) != 0 ? empty.houseName : null, (32704 & 8192) != 0 ? empty.type : null, (32704 & 16384) != 0 ? empty.landmark : null);
                } else {
                    if (!(output3 instanceof th1.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Address address = ((th1.g) output3).f271247a;
                    addressCopy = address.copy((32704 & 1) != 0 ? address.streetLine1 : null, (32704 & 2) != 0 ? address.streetLine2 : null, (32704 & 4) != 0 ? address.region : null, (32704 & 8) != 0 ? address.city : null, (32704 & 16) != 0 ? address.postcode : null, (32704 & 32) != 0 ? address.country : null, (32704 & 64) != 0 ? address.fullAddress : "", (32704 & 128) != 0 ? address.streetType : null, (32704 & 256) != 0 ? address.street : null, (32704 & 512) != 0 ? address.houseNumber : null, (32704 & 1024) != 0 ? address.flat : null, (32704 & 2048) != 0 ? address.neighborhood : null, (32704 & 4096) != 0 ? address.houseName : null, (32704 & 8192) != 0 ? address.type : null, (32704 & 16384) != 0 ? address.landmark : null);
                }
                Address addressB = m33.a.b(addressCopy, ((w) ((j2) yVar3.f22677a).getValue()).f221470l);
                bVar3.H2(yVar3, new neg.q(new avj.p(bVar3, addressB, 10), 16, bVar3, hk3.a.ALL_FIELDS));
                bVar3.H2(yVar3, new avj.p(addressB, 11));
                return Unit.f186387a;
            default:
                y7a.v output4 = (y7a.v) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                y7a.w wVar2 = output4.f311454a;
                if (wVar2 instanceof b8a.a) {
                    String str2 = ((b8a.a) wVar2).f13146a;
                    Address empty2 = Address.INSTANCE.getEMPTY();
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar4 = this.f221450b;
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.P2(bVar4, new avj.p(bVar4, empty2.copy((32704 & 1) != 0 ? empty2.streetLine1 : null, (32704 & 2) != 0 ? empty2.streetLine2 : null, (32704 & 4) != 0 ? empty2.region : null, (32704 & 8) != 0 ? empty2.city : null, (32704 & 16) != 0 ? empty2.postcode : null, (32704 & 32) != 0 ? empty2.country : str2, (32704 & 64) != 0 ? empty2.fullAddress : null, (32704 & 128) != 0 ? empty2.streetType : null, (32704 & 256) != 0 ? empty2.street : null, (32704 & 512) != 0 ? empty2.houseNumber : null, (32704 & 1024) != 0 ? empty2.flat : null, (32704 & 2048) != 0 ? empty2.neighborhood : null, (32704 & 4096) != 0 ? empty2.houseName : null, (32704 & 8192) != 0 ? empty2.type : null, (32704 & 16384) != 0 ? empty2.landmark : null), 13));
                    bVar4.H2(bVar4.D, new o17.x(4));
                    bVar4.n2(new i0(bVar4, str2, null, 3), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
