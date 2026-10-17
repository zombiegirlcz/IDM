package au6;

import androidx.room.util.DBUtil;
import au6.s0;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCustomersService;
import ip0.wk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements o0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerCustomersService f9626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is6.e f9628c;
    public final w4l.f d;

    public u0(FreelancerCustomersService api2, ne0.j memoryCache, is6.e customersDao) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(customersDao, "customersDao");
        this.f9626a = api2;
        this.f9627b = memoryCache;
        this.f9628c = customersDao;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: au6.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f9601b;

            {
                this.f9601b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i2 = i;
                int i3 = 10;
                u0 u0Var = this.f9601b;
                switch (i2) {
                    case 0:
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter((s0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        is6.e eVar = u0Var.f9628c;
                        List<FreelancerCustomer> list2 = sales;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (FreelancerCustomer freelancerCustomer : list2) {
                            Intrinsics.checkNotNullParameter(freelancerCustomer, "<this>");
                            String str = freelancerCustomer.f73281a;
                            if (str == null) {
                                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                                str = "";
                            }
                            String str2 = str;
                            String str3 = freelancerCustomer.f73282b;
                            String str4 = freelancerCustomer.f73283c;
                            String str5 = freelancerCustomer.d;
                            String str6 = freelancerCustomer.e;
                            Address address = freelancerCustomer.f;
                            arrayList.add(new ks6.v(str2, str3, str4, str5, str6, address != null ? oc.c.D(address) : null, freelancerCustomer.f73284g.getMillis(), freelancerCustomer.f73285h.getMillis()));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f168130a, false, true, new wk(eVar, arrayList, 29));
                        return Unit.f186387a;
                    case 1:
                        FreelancerCustomersService freelancerCustomersService = u0Var.f9626a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        s0 param = (s0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof s0.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.l>> customers = freelancerCustomersService.getCustomers();
                            atg.n nVar = new atg.n(i3, new au0.j0(2));
                            customers.getClass();
                            ufm.i iVar = new ufm.i(customers, nVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(param instanceof t0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l> customer = freelancerCustomersService.getCustomer(((t0) param).f9622a);
                        atg.n nVar2 = new atg.n(11, new au0.j0(3));
                        customer.getClass();
                        ufm.i iVar2 = new ufm.i(customer, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        ne0.j jVar = u0Var.f9627b;
                        s0 param2 = (s0) obj2;
                        List customers2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(customers2, "customers");
                        if (param2 instanceof s0.a) {
                            jVar.f("CACHE_KEY_CUSTOMERS", customers2);
                        } else {
                            if (!(param2 instanceof t0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerCustomer freelancerCustomer2 = (FreelancerCustomer) zhm.d0.d0(customers2);
                            if (freelancerCustomer2 != null && (list = (List) jVar.get("CACHE_KEY_CUSTOMERS")) != null) {
                                List list3 = list;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                for (Object obj4 : list3) {
                                    FreelancerCustomer it8 = (FreelancerCustomer) obj4;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (Intrinsics.f(it8.f73281a, freelancerCustomer2.f73281a)) {
                                        obj4 = freelancerCustomer2;
                                    }
                                    arrayList2.add(obj4);
                                }
                                jVar.f("CACHE_KEY_CUSTOMERS", arrayList2);
                                Unit unit = Unit.f186387a;
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: au6.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f9594b;

            {
                this.f9594b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i) {
                    case 0:
                        is6.e eVar = this.f9594b.f9628c;
                        s0 param = (s0) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof s0.a) {
                            List list = (List) DBUtil.performBlocking(eVar.f168130a, true, false, new is2.t(eVar, 4));
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(mif.e0.D((ks6.v) it8.next()));
                            }
                            return arrayList;
                        }
                        if (!(param instanceof t0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ks6.v vVar = (ks6.v) DBUtil.performBlocking(eVar.f168130a, true, false, new wk(eVar, ((t0) param).f9622a, 28));
                        if (vVar != null) {
                            return zhm.u.c(mif.e0.D(vVar));
                        }
                        return null;
                    default:
                        ne0.j jVar = this.f9594b.f9627b;
                        s0 param2 = (s0) obj2;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        if (param2 instanceof s0.a) {
                            return (List) jVar.get("CACHE_KEY_CUSTOMERS");
                        }
                        if (!(param2 instanceof t0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List list2 = (List) jVar.get("CACHE_KEY_CUSTOMERS");
                        if (list2 != null) {
                            Iterator it9 = list2.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    next = it9.next();
                                    FreelancerCustomer it10 = (FreelancerCustomer) next;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    if (Intrinsics.f(it10.f73281a, ((t0) param2).f9622a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            FreelancerCustomer freelancerCustomer = (FreelancerCustomer) next;
                            if (freelancerCustomer != null) {
                                return zhm.u.c(freelancerCustomer);
                            }
                        }
                        return null;
                }
            }
        };
        final int i2 = 2;
        Function2 function22 = new Function2(this) { // from class: au6.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f9601b;

            {
                this.f9601b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i22 = i2;
                int i3 = 10;
                u0 u0Var = this.f9601b;
                switch (i22) {
                    case 0:
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter((s0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        is6.e eVar = u0Var.f9628c;
                        List<FreelancerCustomer> list2 = sales;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (FreelancerCustomer freelancerCustomer : list2) {
                            Intrinsics.checkNotNullParameter(freelancerCustomer, "<this>");
                            String str = freelancerCustomer.f73281a;
                            if (str == null) {
                                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                                str = "";
                            }
                            String str2 = str;
                            String str3 = freelancerCustomer.f73282b;
                            String str4 = freelancerCustomer.f73283c;
                            String str5 = freelancerCustomer.d;
                            String str6 = freelancerCustomer.e;
                            Address address = freelancerCustomer.f;
                            arrayList.add(new ks6.v(str2, str3, str4, str5, str6, address != null ? oc.c.D(address) : null, freelancerCustomer.f73284g.getMillis(), freelancerCustomer.f73285h.getMillis()));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f168130a, false, true, new wk(eVar, arrayList, 29));
                        return Unit.f186387a;
                    case 1:
                        FreelancerCustomersService freelancerCustomersService = u0Var.f9626a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        s0 param = (s0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof s0.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.l>> customers = freelancerCustomersService.getCustomers();
                            atg.n nVar = new atg.n(i3, new au0.j0(2));
                            customers.getClass();
                            ufm.i iVar = new ufm.i(customers, nVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(param instanceof t0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l> customer = freelancerCustomersService.getCustomer(((t0) param).f9622a);
                        atg.n nVar2 = new atg.n(11, new au0.j0(3));
                        customer.getClass();
                        ufm.i iVar2 = new ufm.i(customer, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        ne0.j jVar = u0Var.f9627b;
                        s0 param2 = (s0) obj2;
                        List customers2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(customers2, "customers");
                        if (param2 instanceof s0.a) {
                            jVar.f("CACHE_KEY_CUSTOMERS", customers2);
                        } else {
                            if (!(param2 instanceof t0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerCustomer freelancerCustomer2 = (FreelancerCustomer) zhm.d0.d0(customers2);
                            if (freelancerCustomer2 != null && (list = (List) jVar.get("CACHE_KEY_CUSTOMERS")) != null) {
                                List list3 = list;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                for (Object obj4 : list3) {
                                    FreelancerCustomer it8 = (FreelancerCustomer) obj4;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (Intrinsics.f(it8.f73281a, freelancerCustomer2.f73281a)) {
                                        obj4 = freelancerCustomer2;
                                    }
                                    arrayList2.add(obj4);
                                }
                                jVar.f("CACHE_KEY_CUSTOMERS", arrayList2);
                                Unit unit = Unit.f186387a;
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 0;
        this.d = new w4l.f(function2, function1, function22, new Function1(this) { // from class: au6.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f9594b;

            {
                this.f9594b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i3) {
                    case 0:
                        is6.e eVar = this.f9594b.f9628c;
                        s0 param = (s0) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof s0.a) {
                            List list = (List) DBUtil.performBlocking(eVar.f168130a, true, false, new is2.t(eVar, 4));
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(mif.e0.D((ks6.v) it8.next()));
                            }
                            return arrayList;
                        }
                        if (!(param instanceof t0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ks6.v vVar = (ks6.v) DBUtil.performBlocking(eVar.f168130a, true, false, new wk(eVar, ((t0) param).f9622a, 28));
                        if (vVar != null) {
                            return zhm.u.c(mif.e0.D(vVar));
                        }
                        return null;
                    default:
                        ne0.j jVar = this.f9594b.f9627b;
                        s0 param2 = (s0) obj2;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        if (param2 instanceof s0.a) {
                            return (List) jVar.get("CACHE_KEY_CUSTOMERS");
                        }
                        if (!(param2 instanceof t0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List list2 = (List) jVar.get("CACHE_KEY_CUSTOMERS");
                        if (list2 != null) {
                            Iterator it9 = list2.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    next = it9.next();
                                    FreelancerCustomer it10 = (FreelancerCustomer) next;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    if (Intrinsics.f(it10.f73281a, ((t0) param2).f9622a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            FreelancerCustomer freelancerCustomer = (FreelancerCustomer) next;
                            if (freelancerCustomer != null) {
                                return zhm.u.c(freelancerCustomer);
                            }
                        }
                        return null;
                }
            }
        }, new Function2(this) { // from class: au6.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f9601b;

            {
                this.f9601b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i22 = i3;
                int i32 = 10;
                u0 u0Var = this.f9601b;
                switch (i22) {
                    case 0:
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter((s0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        is6.e eVar = u0Var.f9628c;
                        List<FreelancerCustomer> list2 = sales;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (FreelancerCustomer freelancerCustomer : list2) {
                            Intrinsics.checkNotNullParameter(freelancerCustomer, "<this>");
                            String str = freelancerCustomer.f73281a;
                            if (str == null) {
                                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                                str = "";
                            }
                            String str2 = str;
                            String str3 = freelancerCustomer.f73282b;
                            String str4 = freelancerCustomer.f73283c;
                            String str5 = freelancerCustomer.d;
                            String str6 = freelancerCustomer.e;
                            Address address = freelancerCustomer.f;
                            arrayList.add(new ks6.v(str2, str3, str4, str5, str6, address != null ? oc.c.D(address) : null, freelancerCustomer.f73284g.getMillis(), freelancerCustomer.f73285h.getMillis()));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f168130a, false, true, new wk(eVar, arrayList, 29));
                        return Unit.f186387a;
                    case 1:
                        FreelancerCustomersService freelancerCustomersService = u0Var.f9626a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        s0 param = (s0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof s0.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.l>> customers = freelancerCustomersService.getCustomers();
                            atg.n nVar = new atg.n(i32, new au0.j0(2));
                            customers.getClass();
                            ufm.i iVar = new ufm.i(customers, nVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(param instanceof t0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l> customer = freelancerCustomersService.getCustomer(((t0) param).f9622a);
                        atg.n nVar2 = new atg.n(11, new au0.j0(3));
                        customer.getClass();
                        ufm.i iVar2 = new ufm.i(customer, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        ne0.j jVar = u0Var.f9627b;
                        s0 param2 = (s0) obj2;
                        List customers2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(customers2, "customers");
                        if (param2 instanceof s0.a) {
                            jVar.f("CACHE_KEY_CUSTOMERS", customers2);
                        } else {
                            if (!(param2 instanceof t0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerCustomer freelancerCustomer2 = (FreelancerCustomer) zhm.d0.d0(customers2);
                            if (freelancerCustomer2 != null && (list = (List) jVar.get("CACHE_KEY_CUSTOMERS")) != null) {
                                List list3 = list;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                for (Object obj4 : list3) {
                                    FreelancerCustomer it8 = (FreelancerCustomer) obj4;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (Intrinsics.f(it8.f73281a, freelancerCustomer2.f73281a)) {
                                        obj4 = freelancerCustomer2;
                                    }
                                    arrayList2.add(obj4);
                                }
                                jVar.f("CACHE_KEY_CUSTOMERS", arrayList2);
                                Unit unit = Unit.f186387a;
                            }
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
