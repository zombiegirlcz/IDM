package hyk;

import com.revolut.retail.feature.trading_onboarding.impl.data.network.OnboardingService;
import efm.d0;
import fyk.n;
import fyk.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingService f156904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f156905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yxk.a f156906c;
    public final w4l.f d;
    public final w4l.f e;

    public l(OnboardingService onboardingService, ne0.j memoryCache, yxk.a tradingOnboardingKycDao) {
        Intrinsics.checkNotNullParameter(onboardingService, "onboardingService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(tradingOnboardingKycDao, "tradingOnboardingKycDao");
        this.f156904a = onboardingService;
        this.f156905b = memoryCache;
        this.f156906c = tradingOnboardingKycDao;
        final int i = 0;
        this.d = new w4l.f(new Function2(this) { // from class: hyk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f156901b;

            {
                this.f156901b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<n>> kycDocuments = this.f156901b.f156904a.getKycDocuments();
                        hy2.l lVar = new hy2.l(new hy2.k(9), 12);
                        kycDocuments.getClass();
                        ufm.i iVar = new ufm.i(kycDocuments, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<w> kyc2 = this.f156901b.f156904a.getKyc();
                        hy2.l lVar2 = new hy2.l(new hy2.k(8), 11);
                        kyc2.getClass();
                        ufm.i iVar2 = new ufm.i(kyc2, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        xel.b data = (xel.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f156901b.f156905b.f("TRADING_ONBOARDING_KYC_MEM_KEY", data);
                        break;
                    default:
                        xel.b data2 = (xel.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        yxk.a aVar = this.f156901b.f156906c;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        List list = data2.f304703b;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList.add(((wi0.b) it10.next()).f297794a);
                            }
                        } else {
                            arrayList = null;
                        }
                        ArrayList arrayList2 = arrayList;
                        Boolean bool = data2.f304704c;
                        Boolean bool2 = data2.d;
                        ArrayList arrayList3 = data2.f304702a;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it11 = arrayList3.iterator();
                        while (it11.hasNext()) {
                            xel.c cVar = (xel.c) it11.next();
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            String str = cVar.f304705a.f297794a;
                            String str2 = cVar.f304706b;
                            String str3 = cVar.f304707c;
                            String str4 = cVar.i;
                            String str5 = cVar.e;
                            Iterator it12 = it11;
                            arrayList4.add(new byk.a(cVar.f, str, str2, str3, str5, cVar.f304708g, cVar.d, cVar.f304709h, cVar.f304710j, str4));
                            it11 = it12;
                        }
                        aVar.d(new byk.b(null, arrayList2, bool, bool2, arrayList4));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, null, null, 254);
        final int i2 = 1;
        Function2 function2 = new Function2(this) { // from class: hyk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f156901b;

            {
                this.f156901b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<n>> kycDocuments = this.f156901b.f156904a.getKycDocuments();
                        hy2.l lVar = new hy2.l(new hy2.k(9), 12);
                        kycDocuments.getClass();
                        ufm.i iVar = new ufm.i(kycDocuments, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<w> kyc2 = this.f156901b.f156904a.getKyc();
                        hy2.l lVar2 = new hy2.l(new hy2.k(8), 11);
                        kyc2.getClass();
                        ufm.i iVar2 = new ufm.i(kyc2, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        xel.b data = (xel.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f156901b.f156905b.f("TRADING_ONBOARDING_KYC_MEM_KEY", data);
                        break;
                    default:
                        xel.b data2 = (xel.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        yxk.a aVar = this.f156901b.f156906c;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        List list = data2.f304703b;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList.add(((wi0.b) it10.next()).f297794a);
                            }
                        } else {
                            arrayList = null;
                        }
                        ArrayList arrayList2 = arrayList;
                        Boolean bool = data2.f304704c;
                        Boolean bool2 = data2.d;
                        ArrayList arrayList3 = data2.f304702a;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it11 = arrayList3.iterator();
                        while (it11.hasNext()) {
                            xel.c cVar = (xel.c) it11.next();
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            String str = cVar.f304705a.f297794a;
                            String str2 = cVar.f304706b;
                            String str3 = cVar.f304707c;
                            String str4 = cVar.i;
                            String str5 = cVar.e;
                            Iterator it12 = it11;
                            arrayList4.add(new byk.a(cVar.f, str, str2, str3, str5, cVar.f304708g, cVar.d, cVar.f304709h, cVar.f304710j, str4));
                            it11 = it12;
                        }
                        aVar.d(new byk.b(null, arrayList2, bool, bool2, arrayList4));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 0;
        Function1 function1 = new Function1(this) { // from class: hyk.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f156903b;

            {
                this.f156903b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (xel.b) this.f156903b.f156905b.get("TRADING_ONBOARDING_KYC_MEM_KEY");
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        byk.b bVarB = this.f156903b.f156906c.b();
                        ArrayList arrayList = null;
                        if (bVarB == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVarB, "<this>");
                        List list = bVarB.f19848b;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                kii.e.B(wi0.b.Companion, (String) it10.next(), arrayList);
                            }
                        }
                        Boolean bool = bVarB.f19849c;
                        Boolean bool2 = bVarB.d;
                        List<byk.a> list3 = bVarB.e;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        for (byk.a aVar : list3) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String countryCode = aVar.getCountryCode();
                            wi0.b.Companion.getClass();
                            wi0.b bVarA = wi0.a.a(countryCode);
                            String key = aVar.getKey();
                            String name = aVar.getName();
                            String validation = aVar.getValidation();
                            String check = aVar.getCheck();
                            arrayList2.add(new xel.c(bVarA, key, name, aVar.getHint(), aVar.getSubtitle(), aVar.getCanSkip(), validation, check, aVar.getValue(), aVar.getInfoLink()));
                        }
                        return new xel.b(arrayList2, arrayList, bool, bool2);
                }
            }
        };
        final int i5 = 2;
        Function2 function22 = new Function2(this) { // from class: hyk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f156901b;

            {
                this.f156901b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<n>> kycDocuments = this.f156901b.f156904a.getKycDocuments();
                        hy2.l lVar = new hy2.l(new hy2.k(9), 12);
                        kycDocuments.getClass();
                        ufm.i iVar = new ufm.i(kycDocuments, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<w> kyc2 = this.f156901b.f156904a.getKyc();
                        hy2.l lVar2 = new hy2.l(new hy2.k(8), 11);
                        kyc2.getClass();
                        ufm.i iVar2 = new ufm.i(kyc2, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        xel.b data = (xel.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f156901b.f156905b.f("TRADING_ONBOARDING_KYC_MEM_KEY", data);
                        break;
                    default:
                        xel.b data2 = (xel.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        yxk.a aVar = this.f156901b.f156906c;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        List list = data2.f304703b;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList.add(((wi0.b) it10.next()).f297794a);
                            }
                        } else {
                            arrayList = null;
                        }
                        ArrayList arrayList2 = arrayList;
                        Boolean bool = data2.f304704c;
                        Boolean bool2 = data2.d;
                        ArrayList arrayList3 = data2.f304702a;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it11 = arrayList3.iterator();
                        while (it11.hasNext()) {
                            xel.c cVar = (xel.c) it11.next();
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            String str = cVar.f304705a.f297794a;
                            String str2 = cVar.f304706b;
                            String str3 = cVar.f304707c;
                            String str4 = cVar.i;
                            String str5 = cVar.e;
                            Iterator it12 = it11;
                            arrayList4.add(new byk.a(cVar.f, str, str2, str3, str5, cVar.f304708g, cVar.d, cVar.f304709h, cVar.f304710j, str4));
                            it11 = it12;
                        }
                        aVar.d(new byk.b(null, arrayList2, bool, bool2, arrayList4));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i6 = 1;
        Function1 function12 = new Function1(this) { // from class: hyk.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f156903b;

            {
                this.f156903b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (xel.b) this.f156903b.f156905b.get("TRADING_ONBOARDING_KYC_MEM_KEY");
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        byk.b bVarB = this.f156903b.f156906c.b();
                        ArrayList arrayList = null;
                        if (bVarB == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVarB, "<this>");
                        List list = bVarB.f19848b;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                kii.e.B(wi0.b.Companion, (String) it10.next(), arrayList);
                            }
                        }
                        Boolean bool = bVarB.f19849c;
                        Boolean bool2 = bVarB.d;
                        List<byk.a> list3 = bVarB.e;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        for (byk.a aVar : list3) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String countryCode = aVar.getCountryCode();
                            wi0.b.Companion.getClass();
                            wi0.b bVarA = wi0.a.a(countryCode);
                            String key = aVar.getKey();
                            String name = aVar.getName();
                            String validation = aVar.getValidation();
                            String check = aVar.getCheck();
                            arrayList2.add(new xel.c(bVarA, key, name, aVar.getHint(), aVar.getSubtitle(), aVar.getCanSkip(), validation, check, aVar.getValue(), aVar.getInfoLink()));
                        }
                        return new xel.b(arrayList2, arrayList, bool, bool2);
                }
            }
        };
        final int i21 = 3;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: hyk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f156901b;

            {
                this.f156901b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<n>> kycDocuments = this.f156901b.f156904a.getKycDocuments();
                        hy2.l lVar = new hy2.l(new hy2.k(9), 12);
                        kycDocuments.getClass();
                        ufm.i iVar = new ufm.i(kycDocuments, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<w> kyc2 = this.f156901b.f156904a.getKyc();
                        hy2.l lVar2 = new hy2.l(new hy2.k(8), 11);
                        kyc2.getClass();
                        ufm.i iVar2 = new ufm.i(kyc2, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        xel.b data = (xel.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f156901b.f156905b.f("TRADING_ONBOARDING_KYC_MEM_KEY", data);
                        break;
                    default:
                        xel.b data2 = (xel.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        yxk.a aVar = this.f156901b.f156906c;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        List list = data2.f304703b;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                arrayList.add(((wi0.b) it10.next()).f297794a);
                            }
                        } else {
                            arrayList = null;
                        }
                        ArrayList arrayList2 = arrayList;
                        Boolean bool = data2.f304704c;
                        Boolean bool2 = data2.d;
                        ArrayList arrayList3 = data2.f304702a;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it11 = arrayList3.iterator();
                        while (it11.hasNext()) {
                            xel.c cVar = (xel.c) it11.next();
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            String str = cVar.f304705a.f297794a;
                            String str2 = cVar.f304706b;
                            String str3 = cVar.f304707c;
                            String str4 = cVar.i;
                            String str5 = cVar.e;
                            Iterator it12 = it11;
                            arrayList4.add(new byk.a(cVar.f, str, str2, str3, str5, cVar.f304708g, cVar.d, cVar.f304709h, cVar.f304710j, str4));
                            it11 = it12;
                        }
                        aVar.d(new byk.b(null, arrayList2, bool, bool2, arrayList4));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
