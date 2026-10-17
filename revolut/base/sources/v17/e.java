package v17;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerSalesFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FreelancerSalesFiltersScreen freelancerSalesFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerSalesFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarH3 = this.v.T2();
        String id10 = model.f52708a;
        Object obj3 = model.f52715m;
        final r rVar = (r) mVarH3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        if (bool != null) {
            final boolean zBooleanValue = bool.booleanValue();
            switch (id10.hashCode()) {
                case -2067106592:
                    if (id10.equals("DATE_RANGE_HEADER")) {
                        rVar.y2(new v0k.g(10));
                    }
                    break;
                case -639493254:
                    if (id10.equals("STATUS_HEADER")) {
                        final int i = 1;
                        rVar.y2(new Function1() { // from class: v17.o
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Set set;
                                List list;
                                switch (i) {
                                    case 0:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                                        j jVar = (j) ((k) rVar.t2()).f285245b.getContent();
                                        Set set2 = null;
                                        if (jVar != null && (set = jVar.f285242a) != null && !zBooleanValue) {
                                            set2 = set;
                                        }
                                        if (set2 == null) {
                                            set2 = h0.f322473a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, null, null, null, null, null, null, set2, CertificateBody.profileType);
                                    case 1:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter2, "$this$updateFilter");
                                        List list2 = rVar.f285262t;
                                        if (zBooleanValue) {
                                            list2 = null;
                                        }
                                        if (list2 == null) {
                                            list2 = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter2, list2, null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                                    case 2:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter3 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter3, "$this$updateFilter");
                                        j jVar2 = (j) ((k) rVar.t2()).f285245b.getContent();
                                        if (jVar2 != null && (list = jVar2.f285243b) != null) {
                                            list = zBooleanValue ? null : list;
                                            if (list == null) {
                                                list = f0.f322471a;
                                            }
                                        }
                                        if (list == null) {
                                            list = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter3, null, list, null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
                                    default:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter4 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter4, "$this$updateFilter");
                                        Object obj5 = rVar.u;
                                        if (zBooleanValue) {
                                            obj5 = null;
                                        }
                                        if (obj5 == null) {
                                            obj5 = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter4, null, null, obj5, null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
                                }
                            }
                        });
                    }
                    break;
                case -22330094:
                    if (id10.equals("PAYMENT_METHOD_HEADER")) {
                        final int i2 = 2;
                        rVar.y2(new Function1() { // from class: v17.o
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Set set;
                                List list;
                                switch (i2) {
                                    case 0:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                                        j jVar = (j) ((k) rVar.t2()).f285245b.getContent();
                                        Set set2 = null;
                                        if (jVar != null && (set = jVar.f285242a) != null && !zBooleanValue) {
                                            set2 = set;
                                        }
                                        if (set2 == null) {
                                            set2 = h0.f322473a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, null, null, null, null, null, null, set2, CertificateBody.profileType);
                                    case 1:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter2, "$this$updateFilter");
                                        List list2 = rVar.f285262t;
                                        if (zBooleanValue) {
                                            list2 = null;
                                        }
                                        if (list2 == null) {
                                            list2 = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter2, list2, null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                                    case 2:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter3 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter3, "$this$updateFilter");
                                        j jVar2 = (j) ((k) rVar.t2()).f285245b.getContent();
                                        if (jVar2 != null && (list = jVar2.f285243b) != null) {
                                            list = zBooleanValue ? null : list;
                                            if (list == null) {
                                                list = f0.f322471a;
                                            }
                                        }
                                        if (list == null) {
                                            list = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter3, null, list, null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
                                    default:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter4 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter4, "$this$updateFilter");
                                        Object obj5 = rVar.u;
                                        if (zBooleanValue) {
                                            obj5 = null;
                                        }
                                        if (obj5 == null) {
                                            obj5 = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter4, null, null, obj5, null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
                                }
                            }
                        });
                    }
                    break;
                case 706665565:
                    if (id10.equals("CURRENCIES_HEADER")) {
                        final int i3 = 0;
                        rVar.y2(new Function1() { // from class: v17.o
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Set set;
                                List list;
                                switch (i3) {
                                    case 0:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                                        j jVar = (j) ((k) rVar.t2()).f285245b.getContent();
                                        Set set2 = null;
                                        if (jVar != null && (set = jVar.f285242a) != null && !zBooleanValue) {
                                            set2 = set;
                                        }
                                        if (set2 == null) {
                                            set2 = h0.f322473a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, null, null, null, null, null, null, set2, CertificateBody.profileType);
                                    case 1:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter2, "$this$updateFilter");
                                        List list2 = rVar.f285262t;
                                        if (zBooleanValue) {
                                            list2 = null;
                                        }
                                        if (list2 == null) {
                                            list2 = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter2, list2, null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                                    case 2:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter3 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter3, "$this$updateFilter");
                                        j jVar2 = (j) ((k) rVar.t2()).f285245b.getContent();
                                        if (jVar2 != null && (list = jVar2.f285243b) != null) {
                                            list = zBooleanValue ? null : list;
                                            if (list == null) {
                                                list = f0.f322471a;
                                            }
                                        }
                                        if (list == null) {
                                            list = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter3, null, list, null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
                                    default:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter4 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter4, "$this$updateFilter");
                                        Object obj5 = rVar.u;
                                        if (zBooleanValue) {
                                            obj5 = null;
                                        }
                                        if (obj5 == null) {
                                            obj5 = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter4, null, null, obj5, null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
                                }
                            }
                        });
                    }
                    break;
                case 1037997874:
                    if (id10.equals("TYPE_HEADER")) {
                        final int i5 = 3;
                        rVar.y2(new Function1() { // from class: v17.o
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Set set;
                                List list;
                                switch (i5) {
                                    case 0:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                                        j jVar = (j) ((k) rVar.t2()).f285245b.getContent();
                                        Set set2 = null;
                                        if (jVar != null && (set = jVar.f285242a) != null && !zBooleanValue) {
                                            set2 = set;
                                        }
                                        if (set2 == null) {
                                            set2 = h0.f322473a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, null, null, null, null, null, null, set2, CertificateBody.profileType);
                                    case 1:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter2, "$this$updateFilter");
                                        List list2 = rVar.f285262t;
                                        if (zBooleanValue) {
                                            list2 = null;
                                        }
                                        if (list2 == null) {
                                            list2 = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter2, list2, null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                                    case 2:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter3 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter3, "$this$updateFilter");
                                        j jVar2 = (j) ((k) rVar.t2()).f285245b.getContent();
                                        if (jVar2 != null && (list = jVar2.f285243b) != null) {
                                            list = zBooleanValue ? null : list;
                                            if (list == null) {
                                                list = f0.f322471a;
                                            }
                                        }
                                        if (list == null) {
                                            list = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter3, null, list, null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
                                    default:
                                        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter4 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj4;
                                        Intrinsics.checkNotNullParameter(updateFilter4, "$this$updateFilter");
                                        Object obj5 = rVar.u;
                                        if (zBooleanValue) {
                                            obj5 = null;
                                        }
                                        if (obj5 == null) {
                                            obj5 = f0.f322471a;
                                        }
                                        return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter4, null, null, obj5, null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
                                }
                            }
                        });
                    }
                    break;
                case 1369275476:
                    if (id10.equals("AMOUNT_HEADER")) {
                        rVar.y2(new v0k.g(11));
                    }
                    break;
            }
        }
        return Unit.f186387a;
    }
}
