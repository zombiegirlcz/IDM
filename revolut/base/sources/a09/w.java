package a09;

import androidx.room.util.DBUtil;
import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnService f288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz8.k f289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f290c;
    public final w4l.f d;

    public w(LearnService apiService, hz8.k glossaryTermDao, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(glossaryTermDao, "glossaryTermDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f288a = apiService;
        this.f289b = glossaryTermDao;
        this.f290c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: a09.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f284b;

            {
                this.f284b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strQ;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        v vVar = (v) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(vVar, "<destruct>");
                        u09.v vVar2 = vVar.f287a;
                        efm.d0<tz8.f> allGlossaryTerms = this.f284b.f288a.getAllGlossaryTerms(vVar2 != null ? vVar2.name() : null);
                        a05.a aVar = new a05.a(new a(7), 8);
                        allGlossaryTerms.getClass();
                        ufm.i iVar = new ufm.i(allGlossaryTerms, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        v vVar3 = (v) obj2;
                        List glossaryTerms = (List) obj3;
                        Intrinsics.checkNotNullParameter(vVar3, "<destruct>");
                        Intrinsics.checkNotNullParameter(glossaryTerms, "glossaryTerms");
                        u09.v vVar4 = vVar3.f287a;
                        ne0.d dVar = this.f284b.f290c;
                        if (vVar4 == null || (strQ = j6.a.q("LearnGlossaryTermsRepositoryImpl_", vVar4.name())) == null) {
                            strQ = "LearnGlossaryTermsRepositoryImpl_ALL_TERMS_CACHE_KEY";
                        }
                        dVar.f(strQ, glossaryTerms);
                        break;
                    default:
                        v vVar5 = (v) obj2;
                        List glossaryTerms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(vVar5, "<destruct>");
                        Intrinsics.checkNotNullParameter(glossaryTerms2, "glossaryTerms");
                        u09.v vVar6 = vVar5.f287a;
                        hz8.k kVar = this.f284b.f289b;
                        List<u09.p> list = glossaryTerms2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (u09.p pVar : list) {
                            Intrinsics.checkNotNullParameter(pVar, "<this>");
                            arrayList.add(new jz8.n(pVar.f276141a, pVar.f276142b, pVar.f276143c, pVar.d, pVar.e));
                        }
                        DBUtil.performBlocking(kVar.f157078a, false, true, new hsa.l(kVar, 8, vVar6, arrayList));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: a09.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f286b;

            {
                this.f286b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String strQ;
                switch (i) {
                    case 0:
                        v vVar = (v) obj2;
                        Intrinsics.checkNotNullParameter(vVar, "<destruct>");
                        u09.v vVar2 = vVar.f287a;
                        ne0.d dVar = this.f286b.f290c;
                        if (vVar2 == null || (strQ = j6.a.q("LearnGlossaryTermsRepositoryImpl_", vVar2.name())) == null) {
                            strQ = "LearnGlossaryTermsRepositoryImpl_ALL_TERMS_CACHE_KEY";
                        }
                        return (List) dVar.get(strQ);
                    default:
                        hz8.k kVar = this.f286b.f289b;
                        v vVar3 = (v) obj2;
                        Intrinsics.checkNotNullParameter(vVar3, "<destruct>");
                        u09.v vVar4 = vVar3.f287a;
                        List<jz8.n> list = vVar4 != null ? (List) DBUtil.performBlocking(kVar.f157078a, true, false, new hz8.i(kVar, vVar4, 0)) : (List) DBUtil.performBlocking(kVar.f157078a, true, false, new hw9.a(kVar, 17));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (jz8.n nVar : list) {
                            Intrinsics.checkNotNullParameter(nVar, "<this>");
                            arrayList.add(new u09.p(nVar.f179641a, nVar.f179642b, nVar.f179643c, nVar.d, nVar.e));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: a09.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f284b;

            {
                this.f284b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strQ;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        v vVar = (v) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(vVar, "<destruct>");
                        u09.v vVar2 = vVar.f287a;
                        efm.d0<tz8.f> allGlossaryTerms = this.f284b.f288a.getAllGlossaryTerms(vVar2 != null ? vVar2.name() : null);
                        a05.a aVar = new a05.a(new a(7), 8);
                        allGlossaryTerms.getClass();
                        ufm.i iVar = new ufm.i(allGlossaryTerms, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        v vVar3 = (v) obj2;
                        List glossaryTerms = (List) obj3;
                        Intrinsics.checkNotNullParameter(vVar3, "<destruct>");
                        Intrinsics.checkNotNullParameter(glossaryTerms, "glossaryTerms");
                        u09.v vVar4 = vVar3.f287a;
                        ne0.d dVar = this.f284b.f290c;
                        if (vVar4 == null || (strQ = j6.a.q("LearnGlossaryTermsRepositoryImpl_", vVar4.name())) == null) {
                            strQ = "LearnGlossaryTermsRepositoryImpl_ALL_TERMS_CACHE_KEY";
                        }
                        dVar.f(strQ, glossaryTerms);
                        break;
                    default:
                        v vVar5 = (v) obj2;
                        List glossaryTerms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(vVar5, "<destruct>");
                        Intrinsics.checkNotNullParameter(glossaryTerms2, "glossaryTerms");
                        u09.v vVar6 = vVar5.f287a;
                        hz8.k kVar = this.f284b.f289b;
                        List<u09.p> list = glossaryTerms2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (u09.p pVar : list) {
                            Intrinsics.checkNotNullParameter(pVar, "<this>");
                            arrayList.add(new jz8.n(pVar.f276141a, pVar.f276142b, pVar.f276143c, pVar.d, pVar.e));
                        }
                        DBUtil.performBlocking(kVar.f157078a, false, true, new hsa.l(kVar, 8, vVar6, arrayList));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: a09.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f286b;

            {
                this.f286b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String strQ;
                switch (i2) {
                    case 0:
                        v vVar = (v) obj2;
                        Intrinsics.checkNotNullParameter(vVar, "<destruct>");
                        u09.v vVar2 = vVar.f287a;
                        ne0.d dVar = this.f286b.f290c;
                        if (vVar2 == null || (strQ = j6.a.q("LearnGlossaryTermsRepositoryImpl_", vVar2.name())) == null) {
                            strQ = "LearnGlossaryTermsRepositoryImpl_ALL_TERMS_CACHE_KEY";
                        }
                        return (List) dVar.get(strQ);
                    default:
                        hz8.k kVar = this.f286b.f289b;
                        v vVar3 = (v) obj2;
                        Intrinsics.checkNotNullParameter(vVar3, "<destruct>");
                        u09.v vVar4 = vVar3.f287a;
                        List<jz8.n> list = vVar4 != null ? (List) DBUtil.performBlocking(kVar.f157078a, true, false, new hz8.i(kVar, vVar4, 0)) : (List) DBUtil.performBlocking(kVar.f157078a, true, false, new hw9.a(kVar, 17));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (jz8.n nVar : list) {
                            Intrinsics.checkNotNullParameter(nVar, "<this>");
                            arrayList.add(new u09.p(nVar.f179641a, nVar.f179642b, nVar.f179643c, nVar.d, nVar.e));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: a09.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f284b;

            {
                this.f284b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strQ;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        v vVar = (v) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(vVar, "<destruct>");
                        u09.v vVar2 = vVar.f287a;
                        efm.d0<tz8.f> allGlossaryTerms = this.f284b.f288a.getAllGlossaryTerms(vVar2 != null ? vVar2.name() : null);
                        a05.a aVar = new a05.a(new a(7), 8);
                        allGlossaryTerms.getClass();
                        ufm.i iVar = new ufm.i(allGlossaryTerms, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        v vVar3 = (v) obj2;
                        List glossaryTerms = (List) obj3;
                        Intrinsics.checkNotNullParameter(vVar3, "<destruct>");
                        Intrinsics.checkNotNullParameter(glossaryTerms, "glossaryTerms");
                        u09.v vVar4 = vVar3.f287a;
                        ne0.d dVar = this.f284b.f290c;
                        if (vVar4 == null || (strQ = j6.a.q("LearnGlossaryTermsRepositoryImpl_", vVar4.name())) == null) {
                            strQ = "LearnGlossaryTermsRepositoryImpl_ALL_TERMS_CACHE_KEY";
                        }
                        dVar.f(strQ, glossaryTerms);
                        break;
                    default:
                        v vVar5 = (v) obj2;
                        List glossaryTerms2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(vVar5, "<destruct>");
                        Intrinsics.checkNotNullParameter(glossaryTerms2, "glossaryTerms");
                        u09.v vVar6 = vVar5.f287a;
                        hz8.k kVar = this.f284b.f289b;
                        List<u09.p> list = glossaryTerms2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (u09.p pVar : list) {
                            Intrinsics.checkNotNullParameter(pVar, "<this>");
                            arrayList.add(new jz8.n(pVar.f276141a, pVar.f276142b, pVar.f276143c, pVar.d, pVar.e));
                        }
                        DBUtil.performBlocking(kVar.f157078a, false, true, new hsa.l(kVar, 8, vVar6, arrayList));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
