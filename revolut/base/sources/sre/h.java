package sre;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.terms.impl.network.TermsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import g2e.t;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import mif.e0;
import okhttp3.ResponseBody;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import rfm.o;
import rfm.z;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements nre.a {

    @NotNull
    public static final d Companion = new d();
    public static final Type k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Type f265196l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsService f265197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f265198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f265199c;
    public final ue0.c d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f265200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f265201h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f265202j;

    static {
        Type type = new TypeToken<List<? extends qre.e>>() { // from class: com.revolut.feature.terms.impl.repository.TermsRepositoryImpl$Companion$LIST_OF_TERMS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        k = type;
        Type type2 = new TypeToken<List<? extends qre.c>>() { // from class: com.revolut.feature.terms.impl.repository.TermsRepositoryImpl$Companion$ACCEPTED_TERMS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f265196l = type2;
    }

    public h(TermsService termsService, t rawUrlRequestRepository, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(termsService, "termsService");
        Intrinsics.checkNotNullParameter(rawUrlRequestRepository, "rawUrlRequestRepository");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f265197a = termsService;
        this.f265198b = rawUrlRequestRepository;
        this.f265199c = memoryCache;
        this.d = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i2 = 3;
        Function1 function1 = new Function1(this) { // from class: sre.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265189b;

            {
                this.f265189b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        lre.c termsSignatory = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        h hVar = this.f265189b;
                        ue0.c cVar = hVar.d;
                        h.c(hVar, termsSignatory);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        return arrayList;
                    case 1:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (String) this.f265189b.f265199c.get(params);
                    case 2:
                        String params2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) this.f265189b.f265199c.get(params2);
                    case 3:
                        g params3 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) this.f265189b.f265199c.get(params3.a());
                    case 4:
                        e params4 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f265189b.f265199c.get(params4.a());
                    case 5:
                        g params5 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        List list3 = (List) this.f265189b.d.T2(params5.a(), h.k);
                        if (list3 == null) {
                            return null;
                        }
                        List<qre.e> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        for (qre.e eVar : list4) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String id10 = eVar.getId();
                            String uri2 = eVar.getUri();
                            String htmlUri = eVar.getHtmlUri();
                            String pdfUri = eVar.getPdfUri();
                            LocalDate localDate = LocalDate.parse(eVar.getVersion());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList2.add(new Terms(id10, uri2, htmlUri, pdfUri, localDate, new TermsScope(eVar.getScope()), eVar.getTemplateId(), eVar.getTitle(), eVar.getVersion()));
                        }
                        return arrayList2;
                    case 6:
                        f params6 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (List) this.f265189b.f265199c.get(params6.a());
                    default:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        h hVar2 = this.f265189b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory2);
                        return (List) jVar.get("ACCEPTED_TERMS_KEY");
                }
            }
        };
        final int i3 = 9;
        Function2 function22 = new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i5 = 5;
        Function1 function12 = new Function1(this) { // from class: sre.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265189b;

            {
                this.f265189b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        lre.c termsSignatory = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        h hVar = this.f265189b;
                        ue0.c cVar = hVar.d;
                        h.c(hVar, termsSignatory);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        return arrayList;
                    case 1:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (String) this.f265189b.f265199c.get(params);
                    case 2:
                        String params2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) this.f265189b.f265199c.get(params2);
                    case 3:
                        g params3 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) this.f265189b.f265199c.get(params3.a());
                    case 4:
                        e params4 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f265189b.f265199c.get(params4.a());
                    case 5:
                        g params5 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        List list3 = (List) this.f265189b.d.T2(params5.a(), h.k);
                        if (list3 == null) {
                            return null;
                        }
                        List<qre.e> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        for (qre.e eVar : list4) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String id10 = eVar.getId();
                            String uri2 = eVar.getUri();
                            String htmlUri = eVar.getHtmlUri();
                            String pdfUri = eVar.getPdfUri();
                            LocalDate localDate = LocalDate.parse(eVar.getVersion());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList2.add(new Terms(id10, uri2, htmlUri, pdfUri, localDate, new TermsScope(eVar.getScope()), eVar.getTemplateId(), eVar.getTitle(), eVar.getVersion()));
                        }
                        return arrayList2;
                    case 6:
                        f params6 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (List) this.f265189b.f265199c.get(params6.a());
                    default:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        h hVar2 = this.f265189b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory2);
                        return (List) jVar.get("ACCEPTED_TERMS_KEY");
                }
            }
        };
        final int i6 = 10;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 11;
        Function2 function23 = new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i22 = 6;
        Function1 function13 = new Function1(this) { // from class: sre.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265189b;

            {
                this.f265189b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        lre.c termsSignatory = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        h hVar = this.f265189b;
                        ue0.c cVar = hVar.d;
                        h.c(hVar, termsSignatory);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        return arrayList;
                    case 1:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (String) this.f265189b.f265199c.get(params);
                    case 2:
                        String params2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) this.f265189b.f265199c.get(params2);
                    case 3:
                        g params3 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) this.f265189b.f265199c.get(params3.a());
                    case 4:
                        e params4 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f265189b.f265199c.get(params4.a());
                    case 5:
                        g params5 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        List list3 = (List) this.f265189b.d.T2(params5.a(), h.k);
                        if (list3 == null) {
                            return null;
                        }
                        List<qre.e> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        for (qre.e eVar : list4) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String id10 = eVar.getId();
                            String uri2 = eVar.getUri();
                            String htmlUri = eVar.getHtmlUri();
                            String pdfUri = eVar.getPdfUri();
                            LocalDate localDate = LocalDate.parse(eVar.getVersion());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList2.add(new Terms(id10, uri2, htmlUri, pdfUri, localDate, new TermsScope(eVar.getScope()), eVar.getTemplateId(), eVar.getTitle(), eVar.getVersion()));
                        }
                        return arrayList2;
                    case 6:
                        f params6 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (List) this.f265189b.f265199c.get(params6.a());
                    default:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        h hVar2 = this.f265189b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory2);
                        return (List) jVar.get("ACCEPTED_TERMS_KEY");
                }
            }
        };
        final int i32 = 12;
        this.f = new w4l.f(function23, function13, new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i33 = 13;
        Function2 function24 = new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i43 = 7;
        Function1 function14 = new Function1(this) { // from class: sre.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265189b;

            {
                this.f265189b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i43) {
                    case 0:
                        lre.c termsSignatory = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        h hVar = this.f265189b;
                        ue0.c cVar = hVar.d;
                        h.c(hVar, termsSignatory);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        return arrayList;
                    case 1:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (String) this.f265189b.f265199c.get(params);
                    case 2:
                        String params2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) this.f265189b.f265199c.get(params2);
                    case 3:
                        g params3 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) this.f265189b.f265199c.get(params3.a());
                    case 4:
                        e params4 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f265189b.f265199c.get(params4.a());
                    case 5:
                        g params5 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        List list3 = (List) this.f265189b.d.T2(params5.a(), h.k);
                        if (list3 == null) {
                            return null;
                        }
                        List<qre.e> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        for (qre.e eVar : list4) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String id10 = eVar.getId();
                            String uri2 = eVar.getUri();
                            String htmlUri = eVar.getHtmlUri();
                            String pdfUri = eVar.getPdfUri();
                            LocalDate localDate = LocalDate.parse(eVar.getVersion());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList2.add(new Terms(id10, uri2, htmlUri, pdfUri, localDate, new TermsScope(eVar.getScope()), eVar.getTemplateId(), eVar.getTitle(), eVar.getVersion()));
                        }
                        return arrayList2;
                    case 6:
                        f params6 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (List) this.f265189b.f265199c.get(params6.a());
                    default:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        h hVar2 = this.f265189b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory2);
                        return (List) jVar.get("ACCEPTED_TERMS_KEY");
                }
            }
        };
        final int i59 = 1;
        Function2 function25 = new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i66 = 0;
        Function1 function15 = new Function1(this) { // from class: sre.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265189b;

            {
                this.f265189b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i66) {
                    case 0:
                        lre.c termsSignatory = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        h hVar = this.f265189b;
                        ue0.c cVar = hVar.d;
                        h.c(hVar, termsSignatory);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        return arrayList;
                    case 1:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (String) this.f265189b.f265199c.get(params);
                    case 2:
                        String params2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) this.f265189b.f265199c.get(params2);
                    case 3:
                        g params3 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) this.f265189b.f265199c.get(params3.a());
                    case 4:
                        e params4 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f265189b.f265199c.get(params4.a());
                    case 5:
                        g params5 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        List list3 = (List) this.f265189b.d.T2(params5.a(), h.k);
                        if (list3 == null) {
                            return null;
                        }
                        List<qre.e> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        for (qre.e eVar : list4) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String id10 = eVar.getId();
                            String uri2 = eVar.getUri();
                            String htmlUri = eVar.getHtmlUri();
                            String pdfUri = eVar.getPdfUri();
                            LocalDate localDate = LocalDate.parse(eVar.getVersion());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList2.add(new Terms(id10, uri2, htmlUri, pdfUri, localDate, new TermsScope(eVar.getScope()), eVar.getTemplateId(), eVar.getTitle(), eVar.getVersion()));
                        }
                        return arrayList2;
                    case 6:
                        f params6 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (List) this.f265189b.f265199c.get(params6.a());
                    default:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        h hVar2 = this.f265189b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory2);
                        return (List) jVar.get("ACCEPTED_TERMS_KEY");
                }
            }
        };
        final int i74 = 2;
        this.f265200g = new w4l.f(function24, function14, function25, function15, new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i92 = 3;
        Function2 function26 = new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i96 = 1;
        Function1 function16 = new Function1(this) { // from class: sre.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265189b;

            {
                this.f265189b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i96) {
                    case 0:
                        lre.c termsSignatory = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        h hVar = this.f265189b;
                        ue0.c cVar = hVar.d;
                        h.c(hVar, termsSignatory);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        return arrayList;
                    case 1:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (String) this.f265189b.f265199c.get(params);
                    case 2:
                        String params2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) this.f265189b.f265199c.get(params2);
                    case 3:
                        g params3 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) this.f265189b.f265199c.get(params3.a());
                    case 4:
                        e params4 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f265189b.f265199c.get(params4.a());
                    case 5:
                        g params5 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        List list3 = (List) this.f265189b.d.T2(params5.a(), h.k);
                        if (list3 == null) {
                            return null;
                        }
                        List<qre.e> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        for (qre.e eVar : list4) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String id10 = eVar.getId();
                            String uri2 = eVar.getUri();
                            String htmlUri = eVar.getHtmlUri();
                            String pdfUri = eVar.getPdfUri();
                            LocalDate localDate = LocalDate.parse(eVar.getVersion());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList2.add(new Terms(id10, uri2, htmlUri, pdfUri, localDate, new TermsScope(eVar.getScope()), eVar.getTemplateId(), eVar.getTitle(), eVar.getVersion()));
                        }
                        return arrayList2;
                    case 6:
                        f params6 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (List) this.f265189b.f265199c.get(params6.a());
                    default:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        h hVar2 = this.f265189b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory2);
                        return (List) jVar.get("ACCEPTED_TERMS_KEY");
                }
            }
        };
        final int i99 = 4;
        this.f265201h = new w4l.f(function26, function16, new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i99) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i100 = 5;
        Function2 function27 = new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i100) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i101 = 2;
        Function1 function17 = new Function1(this) { // from class: sre.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265189b;

            {
                this.f265189b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i101) {
                    case 0:
                        lre.c termsSignatory = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        h hVar = this.f265189b;
                        ue0.c cVar = hVar.d;
                        h.c(hVar, termsSignatory);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        return arrayList;
                    case 1:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (String) this.f265189b.f265199c.get(params);
                    case 2:
                        String params2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) this.f265189b.f265199c.get(params2);
                    case 3:
                        g params3 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) this.f265189b.f265199c.get(params3.a());
                    case 4:
                        e params4 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f265189b.f265199c.get(params4.a());
                    case 5:
                        g params5 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        List list3 = (List) this.f265189b.d.T2(params5.a(), h.k);
                        if (list3 == null) {
                            return null;
                        }
                        List<qre.e> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        for (qre.e eVar : list4) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String id10 = eVar.getId();
                            String uri2 = eVar.getUri();
                            String htmlUri = eVar.getHtmlUri();
                            String pdfUri = eVar.getPdfUri();
                            LocalDate localDate = LocalDate.parse(eVar.getVersion());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList2.add(new Terms(id10, uri2, htmlUri, pdfUri, localDate, new TermsScope(eVar.getScope()), eVar.getTemplateId(), eVar.getTitle(), eVar.getVersion()));
                        }
                        return arrayList2;
                    case 6:
                        f params6 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (List) this.f265189b.f265199c.get(params6.a());
                    default:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        h hVar2 = this.f265189b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory2);
                        return (List) jVar.get("ACCEPTED_TERMS_KEY");
                }
            }
        };
        final int i102 = 6;
        this.i = new w4l.f(function27, function17, new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i102) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i103 = 7;
        Function2 function28 = new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i103) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i104 = 4;
        Function1 function18 = new Function1(this) { // from class: sre.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265189b;

            {
                this.f265189b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i104) {
                    case 0:
                        lre.c termsSignatory = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        h hVar = this.f265189b;
                        ue0.c cVar = hVar.d;
                        h.c(hVar, termsSignatory);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        return arrayList;
                    case 1:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (String) this.f265189b.f265199c.get(params);
                    case 2:
                        String params2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (String) this.f265189b.f265199c.get(params2);
                    case 3:
                        g params3 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) this.f265189b.f265199c.get(params3.a());
                    case 4:
                        e params4 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f265189b.f265199c.get(params4.a());
                    case 5:
                        g params5 = (g) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        List list3 = (List) this.f265189b.d.T2(params5.a(), h.k);
                        if (list3 == null) {
                            return null;
                        }
                        List<qre.e> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        for (qre.e eVar : list4) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String id10 = eVar.getId();
                            String uri2 = eVar.getUri();
                            String htmlUri = eVar.getHtmlUri();
                            String pdfUri = eVar.getPdfUri();
                            LocalDate localDate = LocalDate.parse(eVar.getVersion());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList2.add(new Terms(id10, uri2, htmlUri, pdfUri, localDate, new TermsScope(eVar.getScope()), eVar.getTemplateId(), eVar.getTitle(), eVar.getVersion()));
                        }
                        return arrayList2;
                    case 6:
                        f params6 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (List) this.f265189b.f265199c.get(params6.a());
                    default:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        h hVar2 = this.f265189b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory2);
                        return (List) jVar.get("ACCEPTED_TERMS_KEY");
                }
            }
        };
        final int i105 = 8;
        this.f265202j = new w4l.f(function28, function18, new Function2(this) { // from class: sre.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265187b;

            {
                this.f265187b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i105) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g params = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<qre.d>> terms = this.f265187b.f265197a.getTerms(params.f265194a, params.f265195b);
                        sp5.h hVar = new sp5.h(15, new soi.a(22));
                        terms.getClass();
                        ufm.i iVar = new ufm.i(terms, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        lre.c termsSignatory = (lre.c) obj2;
                        List terms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms2, "terms");
                        h hVar2 = this.f265187b;
                        ne0.j jVar = hVar2.f265199c;
                        h.c(hVar2, termsSignatory);
                        jVar.f("ACCEPTED_TERMS_KEY", terms2);
                        return Unit.f186387a;
                    case 2:
                        lre.c termsSignatory2 = (lre.c) obj2;
                        List terms3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                        Intrinsics.checkNotNullParameter(terms3, "terms");
                        h hVar3 = this.f265187b;
                        ue0.c cVar = hVar3.d;
                        h.c(hVar3, termsSignatory2);
                        List<lre.a> list = terms3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (lre.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new qre.c(aVar.f199501a.getMillis(), aVar.f199502b.f90390a));
                        }
                        cVar.G(arrayList, "ACCEPTED_TERMS_KEY", kii.e.o(qre.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String termsId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        d0<ResponseBody> termsHtmlPage = this.f265187b.f265197a.getTermsHtmlPage(termsId);
                        sp5.h hVar4 = new sp5.h(11, new soi.a(19));
                        termsHtmlPage.getClass();
                        ufm.i iVar2 = new ufm.i(termsHtmlPage, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String params2 = (String) obj2;
                        String terms4 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(terms4, "terms");
                        this.f265187b.f265199c.f(params2, terms4);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ufm.i iVar3 = new ufm.i(this.f265187b.f265198b.l(url2, false), new sp5.h(12, new soi.a(18)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String params3 = (String) obj2;
                        String terms5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(terms5, "terms");
                        this.f265187b.f265199c.f(params3, terms5);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        e params4 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<List<qre.d>> termsByDocumentId = this.f265187b.f265197a.getTermsByDocumentId(params4.f265190a, params4.f265191b);
                        sp5.h hVar5 = new sp5.h(16, new soi.a(23));
                        termsByDocumentId.getClass();
                        ufm.i iVar4 = new ufm.i(termsByDocumentId, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        e params5 = (e) obj2;
                        List terms6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(terms6, "terms");
                        this.f265187b.f265199c.f(params5.a(), terms6);
                        return Unit.f186387a;
                    case 9:
                        g params6 = (g) obj2;
                        List terms7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(terms7, "terms");
                        this.f265187b.f265199c.f(params6.a(), terms7);
                        return Unit.f186387a;
                    case 10:
                        g params7 = (g) obj2;
                        List terms8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(terms8, "terms");
                        ue0.c cVar2 = this.f265187b.d;
                        String strA = params7.a();
                        List<Terms> list2 = terms8;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (Terms terms9 : list2) {
                            Intrinsics.checkNotNullParameter(terms9, "<this>");
                            String str = terms9.f90355a;
                            String str2 = terms9.f90356b;
                            String str3 = terms9.f90357c;
                            String str4 = terms9.d;
                            String string = terms9.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new qre.e(str, str2, str3, str4, string, terms9.f.f90390a, terms9.f90358g, terms9.f90359h));
                        }
                        cVar2.G(arrayList2, strA, kii.e.o(qre.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        f params8 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params8, "params");
                        TermsService termsService2 = this.f265187b.f265197a;
                        String str5 = params8.f265192a;
                        String[] strArr = (String[]) params8.f265193b.toArray(new String[0]);
                        d0<List<qre.d>> terms10 = termsService2.getTerms(str5, (String[]) Arrays.copyOf(strArr, strArr.length));
                        sp5.h hVar6 = new sp5.h(14, new soi.a(21));
                        terms10.getClass();
                        ufm.i iVar5 = new ufm.i(terms10, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 12:
                        f params9 = (f) obj2;
                        List terms11 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(terms11, "terms");
                        this.f265187b.f265199c.f(params9.a(), terms11);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        lre.c termsSignatory3 = (lre.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(termsSignatory3, "termsSignatory");
                        if (!Intrinsics.f(termsSignatory3, lre.c.f199507a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0<List<qre.b>> acceptedTerms = this.f265187b.f265197a.getAcceptedTerms(null);
                        sp5.h hVar7 = new sp5.h(13, new soi.a(20));
                        acceptedTerms.getClass();
                        ufm.i iVar6 = new ufm.i(acceptedTerms, hVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String c(h hVar, lre.c cVar) {
        hVar.getClass();
        if (Intrinsics.f(cVar, lre.c.f199507a)) {
            return "ACCEPTED_TERMS_KEY";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final z d() {
        lre.c termsSignatory = lre.c.f199507a;
        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
        final int i = 0;
        o oVar = new o(new Callable(this) { // from class: sre.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265185b;

            {
                this.f265185b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i) {
                    case 0:
                        h hVar = this.f265185b;
                        ue0.c cVar = hVar.d;
                        lre.c cVar2 = lre.c.f199507a;
                        h.c(hVar, cVar2);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        ne0.j jVar = hVar.f265199c;
                        if (!Intrinsics.f(cVar2, cVar2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jVar.f("accepted_terms_cache_check_key", arrayList);
                        return arrayList;
                    default:
                        h hVar2 = this.f265185b;
                        ne0.j jVar2 = hVar2.f265199c;
                        lre.c cVar3 = lre.c.f199507a;
                        h.c(hVar2, cVar3);
                        List list3 = (List) jVar2.get("ACCEPTED_TERMS_KEY");
                        if (list3 != null) {
                            return list3;
                        }
                        if (Intrinsics.f(cVar3, cVar3)) {
                            return (List) jVar2.get("accepted_terms_cache_check_key");
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        final int i2 = 1;
        z zVarM = new o(new Callable(this) { // from class: sre.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f265185b;

            {
                this.f265185b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i2) {
                    case 0:
                        h hVar = this.f265185b;
                        ue0.c cVar = hVar.d;
                        lre.c cVar2 = lre.c.f199507a;
                        h.c(hVar, cVar2);
                        List list = (List) cVar.T2("ACCEPTED_TERMS_KEY", h.f265196l);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(e0.G((qre.c) it8.next()));
                        }
                        ne0.j jVar = hVar.f265199c;
                        if (!Intrinsics.f(cVar2, cVar2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jVar.f("accepted_terms_cache_check_key", arrayList);
                        return arrayList;
                    default:
                        h hVar2 = this.f265185b;
                        ne0.j jVar2 = hVar2.f265199c;
                        lre.c cVar3 = lre.c.f199507a;
                        h.c(hVar2, cVar3);
                        List list3 = (List) jVar2.get("ACCEPTED_TERMS_KEY");
                        if (list3 != null) {
                            return list3;
                        }
                        if (Intrinsics.f(cVar3, cVar3)) {
                            return (List) jVar2.get("accepted_terms_cache_check_key");
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        }).m(te0.w.h0(oVar));
        Intrinsics.checkNotNullExpressionValue(zVarM, "switchIfEmpty(...)");
        return zVarM;
    }
}
