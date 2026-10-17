package au6;

import androidx.room.util.DBUtil;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTaxRate;
import com.revolut.feature.freelancer.impl.network.services.FreelancerInvoiceService;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements v0 {

    @NotNull
    public static final b1 Companion = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoiceService f9546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is6.u f9548c;
    public final is6.y d;
    public final zk0.b e;
    public final f80.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final it6.c f9549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f9550h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f9551j;

    public k1(FreelancerInvoiceService api2, ne0.j memoryCache, is6.u taxRatesDao, is6.y invoicesDao, zk0.b fileSystemRepository, f80.a uriHelper, it6.c serverErrorParser) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(taxRatesDao, "taxRatesDao");
        Intrinsics.checkNotNullParameter(invoicesDao, "invoicesDao");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f9546a = api2;
        this.f9547b = memoryCache;
        this.f9548c = taxRatesDao;
        this.d = invoicesDao;
        this.e = fileSystemRepository;
        this.f = uriHelper;
        this.f9549g = serverErrorParser;
        final int i = 0;
        final int i2 = 3;
        final int i3 = 4;
        this.f9550h = new w4l.f(new Function2(this) { // from class: au6.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f9492b;

            {
                this.f9492b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5;
                switch (i) {
                    case 0:
                        FreelancerInvoiceService freelancerInvoiceService = this.f9492b.f9546a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g1 param = (g1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof c1) {
                            efm.d0<List<qt6.b>> invoices = freelancerInvoiceService.getInvoices(ft6.h.a(((c1) param).f9502a));
                            z0 z0Var = new z0(new au0.j0(18), 2);
                            invoices.getClass();
                            ufm.i iVar = new ufm.i(invoices, z0Var, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (param instanceof d1) {
                            efm.d0<List<qt6.b>> invoices2 = freelancerInvoiceService.getInvoices(ft6.h.a(((d1) param).f9513a));
                            z0 z0Var2 = new z0(new au0.j0(19), 3);
                            invoices2.getClass();
                            ufm.i iVar2 = new ufm.i(invoices2, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (param instanceof f1) {
                            efm.d0<qt6.b> invoice = freelancerInvoiceService.getInvoice(((f1) param).f9528a);
                            z0 z0Var3 = new z0(new au0.j0(20), 4);
                            invoice.getClass();
                            ufm.i iVar3 = new ufm.i(invoice, z0Var3, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            return iVar3;
                        }
                        if (!(param instanceof e1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<List<qt6.b>> recurringHistory = freelancerInvoiceService.getRecurringHistory(((e1) param).f9519a);
                        atg.n nVar = new atg.n(13, new au0.j0(6));
                        recurringHistory.getClass();
                        ufm.i iVar4 = new ufm.i(recurringHistory, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 1:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f9492b.f9547b.f("CACHE_KEY_TAX_RATES", taxRates);
                        return Unit.f186387a;
                    case 2:
                        List taxRates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates2, "taxRates");
                        is6.u uVar = this.f9492b.f9548c;
                        List<FreelancerInvoiceTaxRate> list = taxRates2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (FreelancerInvoiceTaxRate freelancerInvoiceTaxRate : list) {
                            Intrinsics.checkNotNullParameter(freelancerInvoiceTaxRate, "<this>");
                            arrayList.add(new ks6.d0(freelancerInvoiceTaxRate.f73420c, freelancerInvoiceTaxRate.f73418a, freelancerInvoiceTaxRate.f73419b));
                        }
                        uVar.getClass();
                        DBUtil.performBlocking(uVar.f168138a, false, true, new is6.t(uVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        ne0.j jVar = this.f9492b.f9547b;
                        g1 param2 = (g1) obj2;
                        List invoices3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(invoices3, "invoices");
                        if (param2 instanceof c1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", invoices3);
                        } else if (param2 instanceof d1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", invoices3);
                        } else if (param2 instanceof f1) {
                            FreelancerInvoice freelancerInvoice = (FreelancerInvoice) zhm.d0.d0(invoices3);
                            if (freelancerInvoice != null) {
                                String str = freelancerInvoice.f73374a;
                                Collection collection = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                Collection collection2 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
                                if (collection2 == null) {
                                    collection2 = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF12 = zhm.d0.f1(collection2);
                                Iterator it8 = arrayListF1.iterator();
                                int i6 = 0;
                                while (true) {
                                    i5 = -1;
                                    if (!it8.hasNext()) {
                                        i6 = -1;
                                    } else if (!Intrinsics.f(((FreelancerInvoice) it8.next()).f73374a, str)) {
                                        i6++;
                                    }
                                }
                                Iterator it9 = arrayListF12.iterator();
                                int i21 = 0;
                                while (true) {
                                    if (it9.hasNext()) {
                                        if (Intrinsics.f(((FreelancerInvoice) it9.next()).f73374a, str)) {
                                            i5 = i21;
                                        } else {
                                            i21++;
                                        }
                                    }
                                }
                                if (freelancerInvoice.d()) {
                                    if (i5 >= 0) {
                                        arrayListF12.set(i5, freelancerInvoice);
                                    } else {
                                        arrayListF12.add(0, freelancerInvoice);
                                    }
                                    if (i6 >= 0) {
                                        arrayListF1.remove(i6);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                } else {
                                    if (i6 >= 0) {
                                        arrayListF1.set(i6, freelancerInvoice);
                                    } else {
                                        arrayListF1.add(0, freelancerInvoice);
                                    }
                                    if (i5 >= 0) {
                                        arrayListF12.remove(i5);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                }
                            }
                        } else {
                            if (!(param2 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ehe.n.z("FreelancerInvoiceRepository:RecurringHistory:", ((e1) param2).f9519a, jVar, invoices3);
                        }
                        return Unit.f186387a;
                    case 4:
                        is6.y yVar = this.f9492b.d;
                        g1 param3 = (g1) obj2;
                        List invoices4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param3, "param");
                        Intrinsics.checkNotNullParameter(invoices4, "invoices");
                        if (param3 instanceof c1) {
                            List list2 = invoices4;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList2.add(ft6.h.m((FreelancerInvoice) it10.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList2, 2));
                        } else if (param3 instanceof d1) {
                            List list3 = invoices4;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                arrayList3.add(ft6.h.m((FreelancerInvoice) it11.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList3, 2));
                        } else if (param3 instanceof f1) {
                            FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) zhm.d0.d0(invoices4);
                            if (freelancerInvoice2 != null) {
                                ks6.x xVarM = ft6.h.m(freelancerInvoice2, null);
                                yVar.getClass();
                                DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, xVarM, 1));
                            }
                        } else {
                            if (!(param3 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list4 = invoices4;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ft6.h.m((FreelancerInvoice) it12.next(), ((e1) param3).f9519a));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList4, 2));
                        }
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<qt6.f> invoiceSettings = this.f9492b.f9546a.getInvoiceSettings();
                        atg.n nVar2 = new atg.n(17, new au0.j0(5));
                        invoiceSettings.getClass();
                        ufm.i iVar5 = new ufm.i(invoiceSettings, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 6:
                        FreelancerInvoiceSettings invoiceSettings2 = (FreelancerInvoiceSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invoiceSettings2, "invoiceSettings");
                        this.f9492b.f9547b.f("CACHE_KEY_INVOICE_SETTINGS", invoiceSettings2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<qt6.l>> taxRates3 = this.f9492b.f9546a.getTaxRates();
                        atg.n nVar3 = new atg.n(26, new au0.j0(10));
                        taxRates3.getClass();
                        ufm.i iVar6 = new ufm.i(taxRates3, nVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, new x0(this, 7), new Function2(this) { // from class: au6.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f9492b;

            {
                this.f9492b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5;
                switch (i2) {
                    case 0:
                        FreelancerInvoiceService freelancerInvoiceService = this.f9492b.f9546a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g1 param = (g1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof c1) {
                            efm.d0<List<qt6.b>> invoices = freelancerInvoiceService.getInvoices(ft6.h.a(((c1) param).f9502a));
                            z0 z0Var = new z0(new au0.j0(18), 2);
                            invoices.getClass();
                            ufm.i iVar = new ufm.i(invoices, z0Var, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (param instanceof d1) {
                            efm.d0<List<qt6.b>> invoices2 = freelancerInvoiceService.getInvoices(ft6.h.a(((d1) param).f9513a));
                            z0 z0Var2 = new z0(new au0.j0(19), 3);
                            invoices2.getClass();
                            ufm.i iVar2 = new ufm.i(invoices2, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (param instanceof f1) {
                            efm.d0<qt6.b> invoice = freelancerInvoiceService.getInvoice(((f1) param).f9528a);
                            z0 z0Var3 = new z0(new au0.j0(20), 4);
                            invoice.getClass();
                            ufm.i iVar3 = new ufm.i(invoice, z0Var3, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            return iVar3;
                        }
                        if (!(param instanceof e1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<List<qt6.b>> recurringHistory = freelancerInvoiceService.getRecurringHistory(((e1) param).f9519a);
                        atg.n nVar = new atg.n(13, new au0.j0(6));
                        recurringHistory.getClass();
                        ufm.i iVar4 = new ufm.i(recurringHistory, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 1:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f9492b.f9547b.f("CACHE_KEY_TAX_RATES", taxRates);
                        return Unit.f186387a;
                    case 2:
                        List taxRates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates2, "taxRates");
                        is6.u uVar = this.f9492b.f9548c;
                        List<FreelancerInvoiceTaxRate> list = taxRates2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (FreelancerInvoiceTaxRate freelancerInvoiceTaxRate : list) {
                            Intrinsics.checkNotNullParameter(freelancerInvoiceTaxRate, "<this>");
                            arrayList.add(new ks6.d0(freelancerInvoiceTaxRate.f73420c, freelancerInvoiceTaxRate.f73418a, freelancerInvoiceTaxRate.f73419b));
                        }
                        uVar.getClass();
                        DBUtil.performBlocking(uVar.f168138a, false, true, new is6.t(uVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        ne0.j jVar = this.f9492b.f9547b;
                        g1 param2 = (g1) obj2;
                        List invoices3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(invoices3, "invoices");
                        if (param2 instanceof c1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", invoices3);
                        } else if (param2 instanceof d1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", invoices3);
                        } else if (param2 instanceof f1) {
                            FreelancerInvoice freelancerInvoice = (FreelancerInvoice) zhm.d0.d0(invoices3);
                            if (freelancerInvoice != null) {
                                String str = freelancerInvoice.f73374a;
                                Collection collection = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                Collection collection2 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
                                if (collection2 == null) {
                                    collection2 = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF12 = zhm.d0.f1(collection2);
                                Iterator it8 = arrayListF1.iterator();
                                int i6 = 0;
                                while (true) {
                                    i5 = -1;
                                    if (!it8.hasNext()) {
                                        i6 = -1;
                                    } else if (!Intrinsics.f(((FreelancerInvoice) it8.next()).f73374a, str)) {
                                        i6++;
                                    }
                                }
                                Iterator it9 = arrayListF12.iterator();
                                int i21 = 0;
                                while (true) {
                                    if (it9.hasNext()) {
                                        if (Intrinsics.f(((FreelancerInvoice) it9.next()).f73374a, str)) {
                                            i5 = i21;
                                        } else {
                                            i21++;
                                        }
                                    }
                                }
                                if (freelancerInvoice.d()) {
                                    if (i5 >= 0) {
                                        arrayListF12.set(i5, freelancerInvoice);
                                    } else {
                                        arrayListF12.add(0, freelancerInvoice);
                                    }
                                    if (i6 >= 0) {
                                        arrayListF1.remove(i6);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                } else {
                                    if (i6 >= 0) {
                                        arrayListF1.set(i6, freelancerInvoice);
                                    } else {
                                        arrayListF1.add(0, freelancerInvoice);
                                    }
                                    if (i5 >= 0) {
                                        arrayListF12.remove(i5);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                }
                            }
                        } else {
                            if (!(param2 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ehe.n.z("FreelancerInvoiceRepository:RecurringHistory:", ((e1) param2).f9519a, jVar, invoices3);
                        }
                        return Unit.f186387a;
                    case 4:
                        is6.y yVar = this.f9492b.d;
                        g1 param3 = (g1) obj2;
                        List invoices4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param3, "param");
                        Intrinsics.checkNotNullParameter(invoices4, "invoices");
                        if (param3 instanceof c1) {
                            List list2 = invoices4;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList2.add(ft6.h.m((FreelancerInvoice) it10.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList2, 2));
                        } else if (param3 instanceof d1) {
                            List list3 = invoices4;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                arrayList3.add(ft6.h.m((FreelancerInvoice) it11.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList3, 2));
                        } else if (param3 instanceof f1) {
                            FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) zhm.d0.d0(invoices4);
                            if (freelancerInvoice2 != null) {
                                ks6.x xVarM = ft6.h.m(freelancerInvoice2, null);
                                yVar.getClass();
                                DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, xVarM, 1));
                            }
                        } else {
                            if (!(param3 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list4 = invoices4;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ft6.h.m((FreelancerInvoice) it12.next(), ((e1) param3).f9519a));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList4, 2));
                        }
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<qt6.f> invoiceSettings = this.f9492b.f9546a.getInvoiceSettings();
                        atg.n nVar2 = new atg.n(17, new au0.j0(5));
                        invoiceSettings.getClass();
                        ufm.i iVar5 = new ufm.i(invoiceSettings, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 6:
                        FreelancerInvoiceSettings invoiceSettings2 = (FreelancerInvoiceSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invoiceSettings2, "invoiceSettings");
                        this.f9492b.f9547b.f("CACHE_KEY_INVOICE_SETTINGS", invoiceSettings2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<qt6.l>> taxRates3 = this.f9492b.f9546a.getTaxRates();
                        atg.n nVar3 = new atg.n(26, new au0.j0(10));
                        taxRates3.getClass();
                        ufm.i iVar6 = new ufm.i(taxRates3, nVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, new x0(this, 8), new Function2(this) { // from class: au6.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f9492b;

            {
                this.f9492b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5;
                switch (i3) {
                    case 0:
                        FreelancerInvoiceService freelancerInvoiceService = this.f9492b.f9546a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g1 param = (g1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof c1) {
                            efm.d0<List<qt6.b>> invoices = freelancerInvoiceService.getInvoices(ft6.h.a(((c1) param).f9502a));
                            z0 z0Var = new z0(new au0.j0(18), 2);
                            invoices.getClass();
                            ufm.i iVar = new ufm.i(invoices, z0Var, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (param instanceof d1) {
                            efm.d0<List<qt6.b>> invoices2 = freelancerInvoiceService.getInvoices(ft6.h.a(((d1) param).f9513a));
                            z0 z0Var2 = new z0(new au0.j0(19), 3);
                            invoices2.getClass();
                            ufm.i iVar2 = new ufm.i(invoices2, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (param instanceof f1) {
                            efm.d0<qt6.b> invoice = freelancerInvoiceService.getInvoice(((f1) param).f9528a);
                            z0 z0Var3 = new z0(new au0.j0(20), 4);
                            invoice.getClass();
                            ufm.i iVar3 = new ufm.i(invoice, z0Var3, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            return iVar3;
                        }
                        if (!(param instanceof e1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<List<qt6.b>> recurringHistory = freelancerInvoiceService.getRecurringHistory(((e1) param).f9519a);
                        atg.n nVar = new atg.n(13, new au0.j0(6));
                        recurringHistory.getClass();
                        ufm.i iVar4 = new ufm.i(recurringHistory, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 1:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f9492b.f9547b.f("CACHE_KEY_TAX_RATES", taxRates);
                        return Unit.f186387a;
                    case 2:
                        List taxRates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates2, "taxRates");
                        is6.u uVar = this.f9492b.f9548c;
                        List<FreelancerInvoiceTaxRate> list = taxRates2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (FreelancerInvoiceTaxRate freelancerInvoiceTaxRate : list) {
                            Intrinsics.checkNotNullParameter(freelancerInvoiceTaxRate, "<this>");
                            arrayList.add(new ks6.d0(freelancerInvoiceTaxRate.f73420c, freelancerInvoiceTaxRate.f73418a, freelancerInvoiceTaxRate.f73419b));
                        }
                        uVar.getClass();
                        DBUtil.performBlocking(uVar.f168138a, false, true, new is6.t(uVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        ne0.j jVar = this.f9492b.f9547b;
                        g1 param2 = (g1) obj2;
                        List invoices3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(invoices3, "invoices");
                        if (param2 instanceof c1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", invoices3);
                        } else if (param2 instanceof d1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", invoices3);
                        } else if (param2 instanceof f1) {
                            FreelancerInvoice freelancerInvoice = (FreelancerInvoice) zhm.d0.d0(invoices3);
                            if (freelancerInvoice != null) {
                                String str = freelancerInvoice.f73374a;
                                Collection collection = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                Collection collection2 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
                                if (collection2 == null) {
                                    collection2 = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF12 = zhm.d0.f1(collection2);
                                Iterator it8 = arrayListF1.iterator();
                                int i6 = 0;
                                while (true) {
                                    i5 = -1;
                                    if (!it8.hasNext()) {
                                        i6 = -1;
                                    } else if (!Intrinsics.f(((FreelancerInvoice) it8.next()).f73374a, str)) {
                                        i6++;
                                    }
                                }
                                Iterator it9 = arrayListF12.iterator();
                                int i21 = 0;
                                while (true) {
                                    if (it9.hasNext()) {
                                        if (Intrinsics.f(((FreelancerInvoice) it9.next()).f73374a, str)) {
                                            i5 = i21;
                                        } else {
                                            i21++;
                                        }
                                    }
                                }
                                if (freelancerInvoice.d()) {
                                    if (i5 >= 0) {
                                        arrayListF12.set(i5, freelancerInvoice);
                                    } else {
                                        arrayListF12.add(0, freelancerInvoice);
                                    }
                                    if (i6 >= 0) {
                                        arrayListF1.remove(i6);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                } else {
                                    if (i6 >= 0) {
                                        arrayListF1.set(i6, freelancerInvoice);
                                    } else {
                                        arrayListF1.add(0, freelancerInvoice);
                                    }
                                    if (i5 >= 0) {
                                        arrayListF12.remove(i5);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                }
                            }
                        } else {
                            if (!(param2 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ehe.n.z("FreelancerInvoiceRepository:RecurringHistory:", ((e1) param2).f9519a, jVar, invoices3);
                        }
                        return Unit.f186387a;
                    case 4:
                        is6.y yVar = this.f9492b.d;
                        g1 param3 = (g1) obj2;
                        List invoices4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param3, "param");
                        Intrinsics.checkNotNullParameter(invoices4, "invoices");
                        if (param3 instanceof c1) {
                            List list2 = invoices4;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList2.add(ft6.h.m((FreelancerInvoice) it10.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList2, 2));
                        } else if (param3 instanceof d1) {
                            List list3 = invoices4;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                arrayList3.add(ft6.h.m((FreelancerInvoice) it11.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList3, 2));
                        } else if (param3 instanceof f1) {
                            FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) zhm.d0.d0(invoices4);
                            if (freelancerInvoice2 != null) {
                                ks6.x xVarM = ft6.h.m(freelancerInvoice2, null);
                                yVar.getClass();
                                DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, xVarM, 1));
                            }
                        } else {
                            if (!(param3 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list4 = invoices4;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ft6.h.m((FreelancerInvoice) it12.next(), ((e1) param3).f9519a));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList4, 2));
                        }
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<qt6.f> invoiceSettings = this.f9492b.f9546a.getInvoiceSettings();
                        atg.n nVar2 = new atg.n(17, new au0.j0(5));
                        invoiceSettings.getClass();
                        ufm.i iVar5 = new ufm.i(invoiceSettings, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 6:
                        FreelancerInvoiceSettings invoiceSettings2 = (FreelancerInvoiceSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invoiceSettings2, "invoiceSettings");
                        this.f9492b.f9547b.f("CACHE_KEY_INVOICE_SETTINGS", invoiceSettings2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<qt6.l>> taxRates3 = this.f9492b.f9546a.getTaxRates();
                        atg.n nVar3 = new atg.n(26, new au0.j0(10));
                        taxRates3.getClass();
                        ufm.i iVar6 = new ufm.i(taxRates3, nVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, new x0(this, 9), null, null, 192);
        final int i5 = 5;
        final int i6 = 6;
        this.i = new w4l.f(new Function2(this) { // from class: au6.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f9492b;

            {
                this.f9492b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59;
                switch (i5) {
                    case 0:
                        FreelancerInvoiceService freelancerInvoiceService = this.f9492b.f9546a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g1 param = (g1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof c1) {
                            efm.d0<List<qt6.b>> invoices = freelancerInvoiceService.getInvoices(ft6.h.a(((c1) param).f9502a));
                            z0 z0Var = new z0(new au0.j0(18), 2);
                            invoices.getClass();
                            ufm.i iVar = new ufm.i(invoices, z0Var, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (param instanceof d1) {
                            efm.d0<List<qt6.b>> invoices2 = freelancerInvoiceService.getInvoices(ft6.h.a(((d1) param).f9513a));
                            z0 z0Var2 = new z0(new au0.j0(19), 3);
                            invoices2.getClass();
                            ufm.i iVar2 = new ufm.i(invoices2, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (param instanceof f1) {
                            efm.d0<qt6.b> invoice = freelancerInvoiceService.getInvoice(((f1) param).f9528a);
                            z0 z0Var3 = new z0(new au0.j0(20), 4);
                            invoice.getClass();
                            ufm.i iVar3 = new ufm.i(invoice, z0Var3, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            return iVar3;
                        }
                        if (!(param instanceof e1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<List<qt6.b>> recurringHistory = freelancerInvoiceService.getRecurringHistory(((e1) param).f9519a);
                        atg.n nVar = new atg.n(13, new au0.j0(6));
                        recurringHistory.getClass();
                        ufm.i iVar4 = new ufm.i(recurringHistory, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 1:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f9492b.f9547b.f("CACHE_KEY_TAX_RATES", taxRates);
                        return Unit.f186387a;
                    case 2:
                        List taxRates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates2, "taxRates");
                        is6.u uVar = this.f9492b.f9548c;
                        List<FreelancerInvoiceTaxRate> list = taxRates2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (FreelancerInvoiceTaxRate freelancerInvoiceTaxRate : list) {
                            Intrinsics.checkNotNullParameter(freelancerInvoiceTaxRate, "<this>");
                            arrayList.add(new ks6.d0(freelancerInvoiceTaxRate.f73420c, freelancerInvoiceTaxRate.f73418a, freelancerInvoiceTaxRate.f73419b));
                        }
                        uVar.getClass();
                        DBUtil.performBlocking(uVar.f168138a, false, true, new is6.t(uVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        ne0.j jVar = this.f9492b.f9547b;
                        g1 param2 = (g1) obj2;
                        List invoices3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(invoices3, "invoices");
                        if (param2 instanceof c1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", invoices3);
                        } else if (param2 instanceof d1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", invoices3);
                        } else if (param2 instanceof f1) {
                            FreelancerInvoice freelancerInvoice = (FreelancerInvoice) zhm.d0.d0(invoices3);
                            if (freelancerInvoice != null) {
                                String str = freelancerInvoice.f73374a;
                                Collection collection = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                Collection collection2 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
                                if (collection2 == null) {
                                    collection2 = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF12 = zhm.d0.f1(collection2);
                                Iterator it8 = arrayListF1.iterator();
                                int i66 = 0;
                                while (true) {
                                    i59 = -1;
                                    if (!it8.hasNext()) {
                                        i66 = -1;
                                    } else if (!Intrinsics.f(((FreelancerInvoice) it8.next()).f73374a, str)) {
                                        i66++;
                                    }
                                }
                                Iterator it9 = arrayListF12.iterator();
                                int i21 = 0;
                                while (true) {
                                    if (it9.hasNext()) {
                                        if (Intrinsics.f(((FreelancerInvoice) it9.next()).f73374a, str)) {
                                            i59 = i21;
                                        } else {
                                            i21++;
                                        }
                                    }
                                }
                                if (freelancerInvoice.d()) {
                                    if (i59 >= 0) {
                                        arrayListF12.set(i59, freelancerInvoice);
                                    } else {
                                        arrayListF12.add(0, freelancerInvoice);
                                    }
                                    if (i66 >= 0) {
                                        arrayListF1.remove(i66);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                } else {
                                    if (i66 >= 0) {
                                        arrayListF1.set(i66, freelancerInvoice);
                                    } else {
                                        arrayListF1.add(0, freelancerInvoice);
                                    }
                                    if (i59 >= 0) {
                                        arrayListF12.remove(i59);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                }
                            }
                        } else {
                            if (!(param2 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ehe.n.z("FreelancerInvoiceRepository:RecurringHistory:", ((e1) param2).f9519a, jVar, invoices3);
                        }
                        return Unit.f186387a;
                    case 4:
                        is6.y yVar = this.f9492b.d;
                        g1 param3 = (g1) obj2;
                        List invoices4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param3, "param");
                        Intrinsics.checkNotNullParameter(invoices4, "invoices");
                        if (param3 instanceof c1) {
                            List list2 = invoices4;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList2.add(ft6.h.m((FreelancerInvoice) it10.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList2, 2));
                        } else if (param3 instanceof d1) {
                            List list3 = invoices4;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                arrayList3.add(ft6.h.m((FreelancerInvoice) it11.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList3, 2));
                        } else if (param3 instanceof f1) {
                            FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) zhm.d0.d0(invoices4);
                            if (freelancerInvoice2 != null) {
                                ks6.x xVarM = ft6.h.m(freelancerInvoice2, null);
                                yVar.getClass();
                                DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, xVarM, 1));
                            }
                        } else {
                            if (!(param3 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list4 = invoices4;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ft6.h.m((FreelancerInvoice) it12.next(), ((e1) param3).f9519a));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList4, 2));
                        }
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<qt6.f> invoiceSettings = this.f9492b.f9546a.getInvoiceSettings();
                        atg.n nVar2 = new atg.n(17, new au0.j0(5));
                        invoiceSettings.getClass();
                        ufm.i iVar5 = new ufm.i(invoiceSettings, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 6:
                        FreelancerInvoiceSettings invoiceSettings2 = (FreelancerInvoiceSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invoiceSettings2, "invoiceSettings");
                        this.f9492b.f9547b.f("CACHE_KEY_INVOICE_SETTINGS", invoiceSettings2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<qt6.l>> taxRates3 = this.f9492b.f9546a.getTaxRates();
                        atg.n nVar3 = new atg.n(26, new au0.j0(10));
                        taxRates3.getClass();
                        ufm.i iVar6 = new ufm.i(taxRates3, nVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, new x0(this, 10), new Function2(this) { // from class: au6.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f9492b;

            {
                this.f9492b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59;
                switch (i6) {
                    case 0:
                        FreelancerInvoiceService freelancerInvoiceService = this.f9492b.f9546a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g1 param = (g1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof c1) {
                            efm.d0<List<qt6.b>> invoices = freelancerInvoiceService.getInvoices(ft6.h.a(((c1) param).f9502a));
                            z0 z0Var = new z0(new au0.j0(18), 2);
                            invoices.getClass();
                            ufm.i iVar = new ufm.i(invoices, z0Var, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (param instanceof d1) {
                            efm.d0<List<qt6.b>> invoices2 = freelancerInvoiceService.getInvoices(ft6.h.a(((d1) param).f9513a));
                            z0 z0Var2 = new z0(new au0.j0(19), 3);
                            invoices2.getClass();
                            ufm.i iVar2 = new ufm.i(invoices2, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (param instanceof f1) {
                            efm.d0<qt6.b> invoice = freelancerInvoiceService.getInvoice(((f1) param).f9528a);
                            z0 z0Var3 = new z0(new au0.j0(20), 4);
                            invoice.getClass();
                            ufm.i iVar3 = new ufm.i(invoice, z0Var3, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            return iVar3;
                        }
                        if (!(param instanceof e1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<List<qt6.b>> recurringHistory = freelancerInvoiceService.getRecurringHistory(((e1) param).f9519a);
                        atg.n nVar = new atg.n(13, new au0.j0(6));
                        recurringHistory.getClass();
                        ufm.i iVar4 = new ufm.i(recurringHistory, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 1:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f9492b.f9547b.f("CACHE_KEY_TAX_RATES", taxRates);
                        return Unit.f186387a;
                    case 2:
                        List taxRates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates2, "taxRates");
                        is6.u uVar = this.f9492b.f9548c;
                        List<FreelancerInvoiceTaxRate> list = taxRates2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (FreelancerInvoiceTaxRate freelancerInvoiceTaxRate : list) {
                            Intrinsics.checkNotNullParameter(freelancerInvoiceTaxRate, "<this>");
                            arrayList.add(new ks6.d0(freelancerInvoiceTaxRate.f73420c, freelancerInvoiceTaxRate.f73418a, freelancerInvoiceTaxRate.f73419b));
                        }
                        uVar.getClass();
                        DBUtil.performBlocking(uVar.f168138a, false, true, new is6.t(uVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        ne0.j jVar = this.f9492b.f9547b;
                        g1 param2 = (g1) obj2;
                        List invoices3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(invoices3, "invoices");
                        if (param2 instanceof c1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", invoices3);
                        } else if (param2 instanceof d1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", invoices3);
                        } else if (param2 instanceof f1) {
                            FreelancerInvoice freelancerInvoice = (FreelancerInvoice) zhm.d0.d0(invoices3);
                            if (freelancerInvoice != null) {
                                String str = freelancerInvoice.f73374a;
                                Collection collection = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                Collection collection2 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
                                if (collection2 == null) {
                                    collection2 = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF12 = zhm.d0.f1(collection2);
                                Iterator it8 = arrayListF1.iterator();
                                int i66 = 0;
                                while (true) {
                                    i59 = -1;
                                    if (!it8.hasNext()) {
                                        i66 = -1;
                                    } else if (!Intrinsics.f(((FreelancerInvoice) it8.next()).f73374a, str)) {
                                        i66++;
                                    }
                                }
                                Iterator it9 = arrayListF12.iterator();
                                int i21 = 0;
                                while (true) {
                                    if (it9.hasNext()) {
                                        if (Intrinsics.f(((FreelancerInvoice) it9.next()).f73374a, str)) {
                                            i59 = i21;
                                        } else {
                                            i21++;
                                        }
                                    }
                                }
                                if (freelancerInvoice.d()) {
                                    if (i59 >= 0) {
                                        arrayListF12.set(i59, freelancerInvoice);
                                    } else {
                                        arrayListF12.add(0, freelancerInvoice);
                                    }
                                    if (i66 >= 0) {
                                        arrayListF1.remove(i66);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                } else {
                                    if (i66 >= 0) {
                                        arrayListF1.set(i66, freelancerInvoice);
                                    } else {
                                        arrayListF1.add(0, freelancerInvoice);
                                    }
                                    if (i59 >= 0) {
                                        arrayListF12.remove(i59);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                }
                            }
                        } else {
                            if (!(param2 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ehe.n.z("FreelancerInvoiceRepository:RecurringHistory:", ((e1) param2).f9519a, jVar, invoices3);
                        }
                        return Unit.f186387a;
                    case 4:
                        is6.y yVar = this.f9492b.d;
                        g1 param3 = (g1) obj2;
                        List invoices4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param3, "param");
                        Intrinsics.checkNotNullParameter(invoices4, "invoices");
                        if (param3 instanceof c1) {
                            List list2 = invoices4;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList2.add(ft6.h.m((FreelancerInvoice) it10.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList2, 2));
                        } else if (param3 instanceof d1) {
                            List list3 = invoices4;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                arrayList3.add(ft6.h.m((FreelancerInvoice) it11.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList3, 2));
                        } else if (param3 instanceof f1) {
                            FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) zhm.d0.d0(invoices4);
                            if (freelancerInvoice2 != null) {
                                ks6.x xVarM = ft6.h.m(freelancerInvoice2, null);
                                yVar.getClass();
                                DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, xVarM, 1));
                            }
                        } else {
                            if (!(param3 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list4 = invoices4;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ft6.h.m((FreelancerInvoice) it12.next(), ((e1) param3).f9519a));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList4, 2));
                        }
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<qt6.f> invoiceSettings = this.f9492b.f9546a.getInvoiceSettings();
                        atg.n nVar2 = new atg.n(17, new au0.j0(5));
                        invoiceSettings.getClass();
                        ufm.i iVar5 = new ufm.i(invoiceSettings, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 6:
                        FreelancerInvoiceSettings invoiceSettings2 = (FreelancerInvoiceSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invoiceSettings2, "invoiceSettings");
                        this.f9492b.f9547b.f("CACHE_KEY_INVOICE_SETTINGS", invoiceSettings2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<qt6.l>> taxRates3 = this.f9492b.f9546a.getTaxRates();
                        atg.n nVar3 = new atg.n(26, new au0.j0(10));
                        taxRates3.getClass();
                        ufm.i iVar6 = new ufm.i(taxRates3, nVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i21 = 7;
        final int i22 = 1;
        final int i32 = 2;
        this.f9551j = new w4l.f(new Function2(this) { // from class: au6.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f9492b;

            {
                this.f9492b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59;
                switch (i21) {
                    case 0:
                        FreelancerInvoiceService freelancerInvoiceService = this.f9492b.f9546a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g1 param = (g1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof c1) {
                            efm.d0<List<qt6.b>> invoices = freelancerInvoiceService.getInvoices(ft6.h.a(((c1) param).f9502a));
                            z0 z0Var = new z0(new au0.j0(18), 2);
                            invoices.getClass();
                            ufm.i iVar = new ufm.i(invoices, z0Var, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (param instanceof d1) {
                            efm.d0<List<qt6.b>> invoices2 = freelancerInvoiceService.getInvoices(ft6.h.a(((d1) param).f9513a));
                            z0 z0Var2 = new z0(new au0.j0(19), 3);
                            invoices2.getClass();
                            ufm.i iVar2 = new ufm.i(invoices2, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (param instanceof f1) {
                            efm.d0<qt6.b> invoice = freelancerInvoiceService.getInvoice(((f1) param).f9528a);
                            z0 z0Var3 = new z0(new au0.j0(20), 4);
                            invoice.getClass();
                            ufm.i iVar3 = new ufm.i(invoice, z0Var3, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            return iVar3;
                        }
                        if (!(param instanceof e1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<List<qt6.b>> recurringHistory = freelancerInvoiceService.getRecurringHistory(((e1) param).f9519a);
                        atg.n nVar = new atg.n(13, new au0.j0(6));
                        recurringHistory.getClass();
                        ufm.i iVar4 = new ufm.i(recurringHistory, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 1:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f9492b.f9547b.f("CACHE_KEY_TAX_RATES", taxRates);
                        return Unit.f186387a;
                    case 2:
                        List taxRates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates2, "taxRates");
                        is6.u uVar = this.f9492b.f9548c;
                        List<FreelancerInvoiceTaxRate> list = taxRates2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (FreelancerInvoiceTaxRate freelancerInvoiceTaxRate : list) {
                            Intrinsics.checkNotNullParameter(freelancerInvoiceTaxRate, "<this>");
                            arrayList.add(new ks6.d0(freelancerInvoiceTaxRate.f73420c, freelancerInvoiceTaxRate.f73418a, freelancerInvoiceTaxRate.f73419b));
                        }
                        uVar.getClass();
                        DBUtil.performBlocking(uVar.f168138a, false, true, new is6.t(uVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        ne0.j jVar = this.f9492b.f9547b;
                        g1 param2 = (g1) obj2;
                        List invoices3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(invoices3, "invoices");
                        if (param2 instanceof c1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", invoices3);
                        } else if (param2 instanceof d1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", invoices3);
                        } else if (param2 instanceof f1) {
                            FreelancerInvoice freelancerInvoice = (FreelancerInvoice) zhm.d0.d0(invoices3);
                            if (freelancerInvoice != null) {
                                String str = freelancerInvoice.f73374a;
                                Collection collection = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                Collection collection2 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
                                if (collection2 == null) {
                                    collection2 = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF12 = zhm.d0.f1(collection2);
                                Iterator it8 = arrayListF1.iterator();
                                int i66 = 0;
                                while (true) {
                                    i59 = -1;
                                    if (!it8.hasNext()) {
                                        i66 = -1;
                                    } else if (!Intrinsics.f(((FreelancerInvoice) it8.next()).f73374a, str)) {
                                        i66++;
                                    }
                                }
                                Iterator it9 = arrayListF12.iterator();
                                int i212 = 0;
                                while (true) {
                                    if (it9.hasNext()) {
                                        if (Intrinsics.f(((FreelancerInvoice) it9.next()).f73374a, str)) {
                                            i59 = i212;
                                        } else {
                                            i212++;
                                        }
                                    }
                                }
                                if (freelancerInvoice.d()) {
                                    if (i59 >= 0) {
                                        arrayListF12.set(i59, freelancerInvoice);
                                    } else {
                                        arrayListF12.add(0, freelancerInvoice);
                                    }
                                    if (i66 >= 0) {
                                        arrayListF1.remove(i66);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                } else {
                                    if (i66 >= 0) {
                                        arrayListF1.set(i66, freelancerInvoice);
                                    } else {
                                        arrayListF1.add(0, freelancerInvoice);
                                    }
                                    if (i59 >= 0) {
                                        arrayListF12.remove(i59);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                }
                            }
                        } else {
                            if (!(param2 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ehe.n.z("FreelancerInvoiceRepository:RecurringHistory:", ((e1) param2).f9519a, jVar, invoices3);
                        }
                        return Unit.f186387a;
                    case 4:
                        is6.y yVar = this.f9492b.d;
                        g1 param3 = (g1) obj2;
                        List invoices4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param3, "param");
                        Intrinsics.checkNotNullParameter(invoices4, "invoices");
                        if (param3 instanceof c1) {
                            List list2 = invoices4;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList2.add(ft6.h.m((FreelancerInvoice) it10.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList2, 2));
                        } else if (param3 instanceof d1) {
                            List list3 = invoices4;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                arrayList3.add(ft6.h.m((FreelancerInvoice) it11.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList3, 2));
                        } else if (param3 instanceof f1) {
                            FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) zhm.d0.d0(invoices4);
                            if (freelancerInvoice2 != null) {
                                ks6.x xVarM = ft6.h.m(freelancerInvoice2, null);
                                yVar.getClass();
                                DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, xVarM, 1));
                            }
                        } else {
                            if (!(param3 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list4 = invoices4;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ft6.h.m((FreelancerInvoice) it12.next(), ((e1) param3).f9519a));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList4, 2));
                        }
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<qt6.f> invoiceSettings = this.f9492b.f9546a.getInvoiceSettings();
                        atg.n nVar2 = new atg.n(17, new au0.j0(5));
                        invoiceSettings.getClass();
                        ufm.i iVar5 = new ufm.i(invoiceSettings, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 6:
                        FreelancerInvoiceSettings invoiceSettings2 = (FreelancerInvoiceSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invoiceSettings2, "invoiceSettings");
                        this.f9492b.f9547b.f("CACHE_KEY_INVOICE_SETTINGS", invoiceSettings2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<qt6.l>> taxRates3 = this.f9492b.f9546a.getTaxRates();
                        atg.n nVar3 = new atg.n(26, new au0.j0(10));
                        taxRates3.getClass();
                        ufm.i iVar6 = new ufm.i(taxRates3, nVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, new x0(this, 5), new Function2(this) { // from class: au6.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f9492b;

            {
                this.f9492b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59;
                switch (i22) {
                    case 0:
                        FreelancerInvoiceService freelancerInvoiceService = this.f9492b.f9546a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g1 param = (g1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof c1) {
                            efm.d0<List<qt6.b>> invoices = freelancerInvoiceService.getInvoices(ft6.h.a(((c1) param).f9502a));
                            z0 z0Var = new z0(new au0.j0(18), 2);
                            invoices.getClass();
                            ufm.i iVar = new ufm.i(invoices, z0Var, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (param instanceof d1) {
                            efm.d0<List<qt6.b>> invoices2 = freelancerInvoiceService.getInvoices(ft6.h.a(((d1) param).f9513a));
                            z0 z0Var2 = new z0(new au0.j0(19), 3);
                            invoices2.getClass();
                            ufm.i iVar2 = new ufm.i(invoices2, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (param instanceof f1) {
                            efm.d0<qt6.b> invoice = freelancerInvoiceService.getInvoice(((f1) param).f9528a);
                            z0 z0Var3 = new z0(new au0.j0(20), 4);
                            invoice.getClass();
                            ufm.i iVar3 = new ufm.i(invoice, z0Var3, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            return iVar3;
                        }
                        if (!(param instanceof e1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<List<qt6.b>> recurringHistory = freelancerInvoiceService.getRecurringHistory(((e1) param).f9519a);
                        atg.n nVar = new atg.n(13, new au0.j0(6));
                        recurringHistory.getClass();
                        ufm.i iVar4 = new ufm.i(recurringHistory, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 1:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f9492b.f9547b.f("CACHE_KEY_TAX_RATES", taxRates);
                        return Unit.f186387a;
                    case 2:
                        List taxRates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates2, "taxRates");
                        is6.u uVar = this.f9492b.f9548c;
                        List<FreelancerInvoiceTaxRate> list = taxRates2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (FreelancerInvoiceTaxRate freelancerInvoiceTaxRate : list) {
                            Intrinsics.checkNotNullParameter(freelancerInvoiceTaxRate, "<this>");
                            arrayList.add(new ks6.d0(freelancerInvoiceTaxRate.f73420c, freelancerInvoiceTaxRate.f73418a, freelancerInvoiceTaxRate.f73419b));
                        }
                        uVar.getClass();
                        DBUtil.performBlocking(uVar.f168138a, false, true, new is6.t(uVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        ne0.j jVar = this.f9492b.f9547b;
                        g1 param2 = (g1) obj2;
                        List invoices3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(invoices3, "invoices");
                        if (param2 instanceof c1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", invoices3);
                        } else if (param2 instanceof d1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", invoices3);
                        } else if (param2 instanceof f1) {
                            FreelancerInvoice freelancerInvoice = (FreelancerInvoice) zhm.d0.d0(invoices3);
                            if (freelancerInvoice != null) {
                                String str = freelancerInvoice.f73374a;
                                Collection collection = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                Collection collection2 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
                                if (collection2 == null) {
                                    collection2 = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF12 = zhm.d0.f1(collection2);
                                Iterator it8 = arrayListF1.iterator();
                                int i66 = 0;
                                while (true) {
                                    i59 = -1;
                                    if (!it8.hasNext()) {
                                        i66 = -1;
                                    } else if (!Intrinsics.f(((FreelancerInvoice) it8.next()).f73374a, str)) {
                                        i66++;
                                    }
                                }
                                Iterator it9 = arrayListF12.iterator();
                                int i212 = 0;
                                while (true) {
                                    if (it9.hasNext()) {
                                        if (Intrinsics.f(((FreelancerInvoice) it9.next()).f73374a, str)) {
                                            i59 = i212;
                                        } else {
                                            i212++;
                                        }
                                    }
                                }
                                if (freelancerInvoice.d()) {
                                    if (i59 >= 0) {
                                        arrayListF12.set(i59, freelancerInvoice);
                                    } else {
                                        arrayListF12.add(0, freelancerInvoice);
                                    }
                                    if (i66 >= 0) {
                                        arrayListF1.remove(i66);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                } else {
                                    if (i66 >= 0) {
                                        arrayListF1.set(i66, freelancerInvoice);
                                    } else {
                                        arrayListF1.add(0, freelancerInvoice);
                                    }
                                    if (i59 >= 0) {
                                        arrayListF12.remove(i59);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                }
                            }
                        } else {
                            if (!(param2 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ehe.n.z("FreelancerInvoiceRepository:RecurringHistory:", ((e1) param2).f9519a, jVar, invoices3);
                        }
                        return Unit.f186387a;
                    case 4:
                        is6.y yVar = this.f9492b.d;
                        g1 param3 = (g1) obj2;
                        List invoices4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param3, "param");
                        Intrinsics.checkNotNullParameter(invoices4, "invoices");
                        if (param3 instanceof c1) {
                            List list2 = invoices4;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList2.add(ft6.h.m((FreelancerInvoice) it10.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList2, 2));
                        } else if (param3 instanceof d1) {
                            List list3 = invoices4;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                arrayList3.add(ft6.h.m((FreelancerInvoice) it11.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList3, 2));
                        } else if (param3 instanceof f1) {
                            FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) zhm.d0.d0(invoices4);
                            if (freelancerInvoice2 != null) {
                                ks6.x xVarM = ft6.h.m(freelancerInvoice2, null);
                                yVar.getClass();
                                DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, xVarM, 1));
                            }
                        } else {
                            if (!(param3 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list4 = invoices4;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ft6.h.m((FreelancerInvoice) it12.next(), ((e1) param3).f9519a));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList4, 2));
                        }
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<qt6.f> invoiceSettings = this.f9492b.f9546a.getInvoiceSettings();
                        atg.n nVar2 = new atg.n(17, new au0.j0(5));
                        invoiceSettings.getClass();
                        ufm.i iVar5 = new ufm.i(invoiceSettings, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 6:
                        FreelancerInvoiceSettings invoiceSettings2 = (FreelancerInvoiceSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invoiceSettings2, "invoiceSettings");
                        this.f9492b.f9547b.f("CACHE_KEY_INVOICE_SETTINGS", invoiceSettings2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<qt6.l>> taxRates3 = this.f9492b.f9546a.getTaxRates();
                        atg.n nVar3 = new atg.n(26, new au0.j0(10));
                        taxRates3.getClass();
                        ufm.i iVar6 = new ufm.i(taxRates3, nVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, new x0(this, 6), new Function2(this) { // from class: au6.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f9492b;

            {
                this.f9492b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59;
                switch (i32) {
                    case 0:
                        FreelancerInvoiceService freelancerInvoiceService = this.f9492b.f9546a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g1 param = (g1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof c1) {
                            efm.d0<List<qt6.b>> invoices = freelancerInvoiceService.getInvoices(ft6.h.a(((c1) param).f9502a));
                            z0 z0Var = new z0(new au0.j0(18), 2);
                            invoices.getClass();
                            ufm.i iVar = new ufm.i(invoices, z0Var, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (param instanceof d1) {
                            efm.d0<List<qt6.b>> invoices2 = freelancerInvoiceService.getInvoices(ft6.h.a(((d1) param).f9513a));
                            z0 z0Var2 = new z0(new au0.j0(19), 3);
                            invoices2.getClass();
                            ufm.i iVar2 = new ufm.i(invoices2, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (param instanceof f1) {
                            efm.d0<qt6.b> invoice = freelancerInvoiceService.getInvoice(((f1) param).f9528a);
                            z0 z0Var3 = new z0(new au0.j0(20), 4);
                            invoice.getClass();
                            ufm.i iVar3 = new ufm.i(invoice, z0Var3, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            return iVar3;
                        }
                        if (!(param instanceof e1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<List<qt6.b>> recurringHistory = freelancerInvoiceService.getRecurringHistory(((e1) param).f9519a);
                        atg.n nVar = new atg.n(13, new au0.j0(6));
                        recurringHistory.getClass();
                        ufm.i iVar4 = new ufm.i(recurringHistory, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 1:
                        List taxRates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                        this.f9492b.f9547b.f("CACHE_KEY_TAX_RATES", taxRates);
                        return Unit.f186387a;
                    case 2:
                        List taxRates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxRates2, "taxRates");
                        is6.u uVar = this.f9492b.f9548c;
                        List<FreelancerInvoiceTaxRate> list = taxRates2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (FreelancerInvoiceTaxRate freelancerInvoiceTaxRate : list) {
                            Intrinsics.checkNotNullParameter(freelancerInvoiceTaxRate, "<this>");
                            arrayList.add(new ks6.d0(freelancerInvoiceTaxRate.f73420c, freelancerInvoiceTaxRate.f73418a, freelancerInvoiceTaxRate.f73419b));
                        }
                        uVar.getClass();
                        DBUtil.performBlocking(uVar.f168138a, false, true, new is6.t(uVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        ne0.j jVar = this.f9492b.f9547b;
                        g1 param2 = (g1) obj2;
                        List invoices3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(invoices3, "invoices");
                        if (param2 instanceof c1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", invoices3);
                        } else if (param2 instanceof d1) {
                            jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", invoices3);
                        } else if (param2 instanceof f1) {
                            FreelancerInvoice freelancerInvoice = (FreelancerInvoice) zhm.d0.d0(invoices3);
                            if (freelancerInvoice != null) {
                                String str = freelancerInvoice.f73374a;
                                Collection collection = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
                                if (collection == null) {
                                    collection = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF1 = zhm.d0.f1(collection);
                                Collection collection2 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
                                if (collection2 == null) {
                                    collection2 = zhm.f0.f322471a;
                                }
                                ArrayList arrayListF12 = zhm.d0.f1(collection2);
                                Iterator it8 = arrayListF1.iterator();
                                int i66 = 0;
                                while (true) {
                                    i59 = -1;
                                    if (!it8.hasNext()) {
                                        i66 = -1;
                                    } else if (!Intrinsics.f(((FreelancerInvoice) it8.next()).f73374a, str)) {
                                        i66++;
                                    }
                                }
                                Iterator it9 = arrayListF12.iterator();
                                int i212 = 0;
                                while (true) {
                                    if (it9.hasNext()) {
                                        if (Intrinsics.f(((FreelancerInvoice) it9.next()).f73374a, str)) {
                                            i59 = i212;
                                        } else {
                                            i212++;
                                        }
                                    }
                                }
                                if (freelancerInvoice.d()) {
                                    if (i59 >= 0) {
                                        arrayListF12.set(i59, freelancerInvoice);
                                    } else {
                                        arrayListF12.add(0, freelancerInvoice);
                                    }
                                    if (i66 >= 0) {
                                        arrayListF1.remove(i66);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                } else {
                                    if (i66 >= 0) {
                                        arrayListF1.set(i66, freelancerInvoice);
                                    } else {
                                        arrayListF1.add(0, freelancerInvoice);
                                    }
                                    if (i59 >= 0) {
                                        arrayListF12.remove(i59);
                                        jVar.f("FreelancerInvoiceRepository:Invoices:Recurring", arrayListF12);
                                    }
                                    jVar.f("FreelancerInvoiceRepository:Invoices:OneTime", arrayListF1);
                                }
                            }
                        } else {
                            if (!(param2 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ehe.n.z("FreelancerInvoiceRepository:RecurringHistory:", ((e1) param2).f9519a, jVar, invoices3);
                        }
                        return Unit.f186387a;
                    case 4:
                        is6.y yVar = this.f9492b.d;
                        g1 param3 = (g1) obj2;
                        List invoices4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(param3, "param");
                        Intrinsics.checkNotNullParameter(invoices4, "invoices");
                        if (param3 instanceof c1) {
                            List list2 = invoices4;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList2.add(ft6.h.m((FreelancerInvoice) it10.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList2, 2));
                        } else if (param3 instanceof d1) {
                            List list3 = invoices4;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                arrayList3.add(ft6.h.m((FreelancerInvoice) it11.next(), null));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList3, 2));
                        } else if (param3 instanceof f1) {
                            FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) zhm.d0.d0(invoices4);
                            if (freelancerInvoice2 != null) {
                                ks6.x xVarM = ft6.h.m(freelancerInvoice2, null);
                                yVar.getClass();
                                DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, xVarM, 1));
                            }
                        } else {
                            if (!(param3 instanceof e1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list4 = invoices4;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ft6.h.m((FreelancerInvoice) it12.next(), ((e1) param3).f9519a));
                            }
                            DBUtil.performBlocking(yVar.f168146a, false, true, new is6.t(yVar, arrayList4, 2));
                        }
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<qt6.f> invoiceSettings = this.f9492b.f9546a.getInvoiceSettings();
                        atg.n nVar2 = new atg.n(17, new au0.j0(5));
                        invoiceSettings.getClass();
                        ufm.i iVar5 = new ufm.i(invoiceSettings, nVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 6:
                        FreelancerInvoiceSettings invoiceSettings2 = (FreelancerInvoiceSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invoiceSettings2, "invoiceSettings");
                        this.f9492b.f9547b.f("CACHE_KEY_INVOICE_SETTINGS", invoiceSettings2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<qt6.l>> taxRates3 = this.f9492b.f9546a.getTaxRates();
                        atg.n nVar3 = new atg.n(26, new au0.j0(10));
                        taxRates3.getClass();
                        ufm.i iVar6 = new ufm.i(taxRates3, nVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au6.h1
            if (r0 == 0) goto L13
            r0 = r6
            au6.h1 r0 = (au6.h1) r0
            int r1 = r0.f9534w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9534w = r1
            goto L18
        L13:
            au6.h1 r0 = new au6.h1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f9534w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            akb.s r6 = new akb.s
            r2 = 20
            r4 = 0
            r6.<init>(r5, r4, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.f9534w = r3
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "onIo(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au6.k1.a(gim.c):java.lang.Object");
    }

    public final ufm.n b(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        efm.d0<ResponseBody> invoicePdf = this.f9546a.getInvoicePdf(invoiceId);
        atg.n nVar = new atg.n(14, new w0(this, invoiceId, 0));
        invoicePdf.getClass();
        ufm.i iVar = new ufm.i(invoicePdf, nVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return te0.w.i0(iVar);
    }

    public final efm.r c(sr6.k query, boolean z) {
        Intrinsics.checkNotNullParameter(query, "query");
        return te0.w.f0(this.f9550h.f(query.f265130a ? new d1(query) : new c1(query), z));
    }

    public final ufm.f d(ufm.i iVar) {
        ufm.f fVar = new ufm.f(iVar, new atg.n(20, new x0(this, 3)), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return fVar;
    }

    public final void e(String str) {
        Object next;
        Object next2;
        ne0.j jVar = this.f9547b;
        List list = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
        w4l.f fVar = this.f9550h;
        if (list != null) {
            List list2 = list;
            Iterator it8 = list2.iterator();
            while (true) {
                if (it8.hasNext()) {
                    next2 = it8.next();
                    if (Intrinsics.f(((FreelancerInvoice) next2).f73374a, str)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            if (((FreelancerInvoice) next2) != null) {
                c1 c1Var = new c1(new sr6.k(false, null, 30));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!Intrinsics.f(((FreelancerInvoice) obj2).f73374a, str)) {
                        arrayList.add(obj2);
                    }
                }
                fVar.k(c1Var, arrayList);
                return;
            }
        }
        List list3 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
        if (list3 != null) {
            List list4 = list3;
            Iterator it9 = list4.iterator();
            while (true) {
                if (it9.hasNext()) {
                    next = it9.next();
                    if (Intrinsics.f(((FreelancerInvoice) next).f73374a, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (((FreelancerInvoice) next) != null) {
                d1 d1Var = new d1(new sr6.k(true, null, 30));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list4) {
                    if (!Intrinsics.f(((FreelancerInvoice) obj3).f73374a, str)) {
                        arrayList2.add(obj3);
                    }
                }
                fVar.k(d1Var, arrayList2);
            }
        }
    }
}
