package dqg;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.vaults.common.SavingsDocumentToAccept;
import com.revolut.feature.vaults.impl.network.SavingsService;
import com.youTransactor.uCube.rpc.Constants;
import dkk.a0;
import dmb.m;
import efm.d0;
import ehe.n;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsService f116981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f116982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f116983c;
    public final w4l.f d;

    static {
        new TypeToken<Boolean>() { // from class: com.revolut.feature.vaults.impl.repository.SavingsRepositoryImpl$Companion$BOOLEAN_TYPE$1
        }.getType();
    }

    public e(SavingsService savingsService, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(savingsService, "savingsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116981a = savingsService;
        this.f116982b = memoryCache;
        this.f116983c = storage;
        m mVar = new m(this, 18);
        final int i = 4;
        Function1 function1 = new Function1(this) { // from class: dqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116980b;

            {
                this.f116980b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String productId = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        return (List) v7.r("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId, this.f116980b.f116982b);
                    case 1:
                        String productId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        ue0.c cVar = this.f116980b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2);
                        Type type = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list = (List) cVar.T2(strQ, type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zpg.c.b((fqg.a) it8.next()));
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f116980b.f116982b.get("CACHE_KEY_DOCUMENTS_TO_ACCEPT");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar2 = this.f116980b.f116983c;
                        Type type2 = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type2, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list3 = (List) cVar2.T2("STORAGE_KEY_DOCUMENTS_TO_ACCEPT", type2);
                        if (list3 == null) {
                            return null;
                        }
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(zpg.c.b((fqg.a) it11.next()));
                        }
                        return arrayList2;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        Intrinsics.checkNotNullParameter(null, "it");
                        return (String) this.f116980b.f116982b.get("params_key_transaction_statement");
                }
            }
        };
        final int i2 = 6;
        new w4l.f(mVar, function1, new Function2(this) { // from class: dqg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116978b;

            {
                this.f116978b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String productId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        d0<List<bqg.b>> documentsToAccept = this.f116978b.f116981a.getDocumentsToAccept(productId);
                        a0 a0Var = new a0(new dmj.a(23), 7);
                        documentsToAccept.getClass();
                        ufm.i iVar = new ufm.i(documentsToAccept, a0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String productId2 = (String) obj2;
                        List documents = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        n.z("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2, this.f116978b.f116982b, documents);
                        return Unit.f186387a;
                    case 2:
                        String productId3 = (String) obj2;
                        List documents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId3, "productId");
                        Intrinsics.checkNotNullParameter(documents2, "documents");
                        ue0.c cVar = this.f116978b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId3);
                        List<SavingsDocumentToAccept> list = documents2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept : list) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept, "<this>");
                            arrayList.add(new fqg.a(savingsDocumentToAccept.f94741a, savingsDocumentToAccept.f94742b, savingsDocumentToAccept.f94743c, savingsDocumentToAccept.d.f86607a, savingsDocumentToAccept.e));
                        }
                        cVar.G(arrayList, strQ, kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<bqg.b>> documentsToAccept2 = this.f116978b.f116981a.getDocumentsToAccept();
                        a0 a0Var2 = new a0(new dmj.a(22), 6);
                        documentsToAccept2.getClass();
                        ufm.i iVar2 = new ufm.i(documentsToAccept2, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List documents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents3, "documents");
                        this.f116978b.f116982b.f("CACHE_KEY_DOCUMENTS_TO_ACCEPT", documents3);
                        return Unit.f186387a;
                    case 5:
                        List documents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents4, "documents");
                        ue0.c cVar2 = this.f116978b.f116983c;
                        List<SavingsDocumentToAccept> list2 = documents4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept2 : list2) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept2, "<this>");
                            arrayList2.add(new fqg.a(savingsDocumentToAccept2.f94741a, savingsDocumentToAccept2.f94742b, savingsDocumentToAccept2.f94743c, savingsDocumentToAccept2.d.f86607a, savingsDocumentToAccept2.e));
                        }
                        cVar2.G(arrayList2, "STORAGE_KEY_DOCUMENTS_TO_ACCEPT", kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        String html = (String) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(html, "html");
                        this.f116978b.f116982b.f("params_key_transaction_statement", html);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 0;
        final int i5 = 0;
        final int i6 = 1;
        final int i21 = 1;
        final int i22 = 2;
        new w4l.f(new Function2(this) { // from class: dqg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116978b;

            {
                this.f116978b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String productId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        d0<List<bqg.b>> documentsToAccept = this.f116978b.f116981a.getDocumentsToAccept(productId);
                        a0 a0Var = new a0(new dmj.a(23), 7);
                        documentsToAccept.getClass();
                        ufm.i iVar = new ufm.i(documentsToAccept, a0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String productId2 = (String) obj2;
                        List documents = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        n.z("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2, this.f116978b.f116982b, documents);
                        return Unit.f186387a;
                    case 2:
                        String productId3 = (String) obj2;
                        List documents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId3, "productId");
                        Intrinsics.checkNotNullParameter(documents2, "documents");
                        ue0.c cVar = this.f116978b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId3);
                        List<SavingsDocumentToAccept> list = documents2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept : list) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept, "<this>");
                            arrayList.add(new fqg.a(savingsDocumentToAccept.f94741a, savingsDocumentToAccept.f94742b, savingsDocumentToAccept.f94743c, savingsDocumentToAccept.d.f86607a, savingsDocumentToAccept.e));
                        }
                        cVar.G(arrayList, strQ, kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<bqg.b>> documentsToAccept2 = this.f116978b.f116981a.getDocumentsToAccept();
                        a0 a0Var2 = new a0(new dmj.a(22), 6);
                        documentsToAccept2.getClass();
                        ufm.i iVar2 = new ufm.i(documentsToAccept2, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List documents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents3, "documents");
                        this.f116978b.f116982b.f("CACHE_KEY_DOCUMENTS_TO_ACCEPT", documents3);
                        return Unit.f186387a;
                    case 5:
                        List documents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents4, "documents");
                        ue0.c cVar2 = this.f116978b.f116983c;
                        List<SavingsDocumentToAccept> list2 = documents4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept2 : list2) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept2, "<this>");
                            arrayList2.add(new fqg.a(savingsDocumentToAccept2.f94741a, savingsDocumentToAccept2.f94742b, savingsDocumentToAccept2.f94743c, savingsDocumentToAccept2.d.f86607a, savingsDocumentToAccept2.e));
                        }
                        cVar2.G(arrayList2, "STORAGE_KEY_DOCUMENTS_TO_ACCEPT", kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        String html = (String) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(html, "html");
                        this.f116978b.f116982b.f("params_key_transaction_statement", html);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: dqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116980b;

            {
                this.f116980b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        String productId = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        return (List) v7.r("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId, this.f116980b.f116982b);
                    case 1:
                        String productId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        ue0.c cVar = this.f116980b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2);
                        Type type = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list = (List) cVar.T2(strQ, type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zpg.c.b((fqg.a) it8.next()));
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f116980b.f116982b.get("CACHE_KEY_DOCUMENTS_TO_ACCEPT");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar2 = this.f116980b.f116983c;
                        Type type2 = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type2, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list3 = (List) cVar2.T2("STORAGE_KEY_DOCUMENTS_TO_ACCEPT", type2);
                        if (list3 == null) {
                            return null;
                        }
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(zpg.c.b((fqg.a) it11.next()));
                        }
                        return arrayList2;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        Intrinsics.checkNotNullParameter(null, "it");
                        return (String) this.f116980b.f116982b.get("params_key_transaction_statement");
                }
            }
        }, new Function2(this) { // from class: dqg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116978b;

            {
                this.f116978b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String productId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        d0<List<bqg.b>> documentsToAccept = this.f116978b.f116981a.getDocumentsToAccept(productId);
                        a0 a0Var = new a0(new dmj.a(23), 7);
                        documentsToAccept.getClass();
                        ufm.i iVar = new ufm.i(documentsToAccept, a0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String productId2 = (String) obj2;
                        List documents = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        n.z("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2, this.f116978b.f116982b, documents);
                        return Unit.f186387a;
                    case 2:
                        String productId3 = (String) obj2;
                        List documents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId3, "productId");
                        Intrinsics.checkNotNullParameter(documents2, "documents");
                        ue0.c cVar = this.f116978b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId3);
                        List<SavingsDocumentToAccept> list = documents2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept : list) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept, "<this>");
                            arrayList.add(new fqg.a(savingsDocumentToAccept.f94741a, savingsDocumentToAccept.f94742b, savingsDocumentToAccept.f94743c, savingsDocumentToAccept.d.f86607a, savingsDocumentToAccept.e));
                        }
                        cVar.G(arrayList, strQ, kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<bqg.b>> documentsToAccept2 = this.f116978b.f116981a.getDocumentsToAccept();
                        a0 a0Var2 = new a0(new dmj.a(22), 6);
                        documentsToAccept2.getClass();
                        ufm.i iVar2 = new ufm.i(documentsToAccept2, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List documents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents3, "documents");
                        this.f116978b.f116982b.f("CACHE_KEY_DOCUMENTS_TO_ACCEPT", documents3);
                        return Unit.f186387a;
                    case 5:
                        List documents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents4, "documents");
                        ue0.c cVar2 = this.f116978b.f116983c;
                        List<SavingsDocumentToAccept> list2 = documents4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept2 : list2) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept2, "<this>");
                            arrayList2.add(new fqg.a(savingsDocumentToAccept2.f94741a, savingsDocumentToAccept2.f94742b, savingsDocumentToAccept2.f94743c, savingsDocumentToAccept2.d.f86607a, savingsDocumentToAccept2.e));
                        }
                        cVar2.G(arrayList2, "STORAGE_KEY_DOCUMENTS_TO_ACCEPT", kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        String html = (String) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(html, "html");
                        this.f116978b.f116982b.f("params_key_transaction_statement", html);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: dqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116980b;

            {
                this.f116980b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        String productId = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        return (List) v7.r("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId, this.f116980b.f116982b);
                    case 1:
                        String productId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        ue0.c cVar = this.f116980b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2);
                        Type type = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list = (List) cVar.T2(strQ, type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zpg.c.b((fqg.a) it8.next()));
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f116980b.f116982b.get("CACHE_KEY_DOCUMENTS_TO_ACCEPT");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar2 = this.f116980b.f116983c;
                        Type type2 = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type2, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list3 = (List) cVar2.T2("STORAGE_KEY_DOCUMENTS_TO_ACCEPT", type2);
                        if (list3 == null) {
                            return null;
                        }
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(zpg.c.b((fqg.a) it11.next()));
                        }
                        return arrayList2;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        Intrinsics.checkNotNullParameter(null, "it");
                        return (String) this.f116980b.f116982b.get("params_key_transaction_statement");
                }
            }
        }, new Function2(this) { // from class: dqg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116978b;

            {
                this.f116978b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String productId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        d0<List<bqg.b>> documentsToAccept = this.f116978b.f116981a.getDocumentsToAccept(productId);
                        a0 a0Var = new a0(new dmj.a(23), 7);
                        documentsToAccept.getClass();
                        ufm.i iVar = new ufm.i(documentsToAccept, a0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String productId2 = (String) obj2;
                        List documents = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        n.z("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2, this.f116978b.f116982b, documents);
                        return Unit.f186387a;
                    case 2:
                        String productId3 = (String) obj2;
                        List documents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId3, "productId");
                        Intrinsics.checkNotNullParameter(documents2, "documents");
                        ue0.c cVar = this.f116978b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId3);
                        List<SavingsDocumentToAccept> list = documents2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept : list) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept, "<this>");
                            arrayList.add(new fqg.a(savingsDocumentToAccept.f94741a, savingsDocumentToAccept.f94742b, savingsDocumentToAccept.f94743c, savingsDocumentToAccept.d.f86607a, savingsDocumentToAccept.e));
                        }
                        cVar.G(arrayList, strQ, kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<bqg.b>> documentsToAccept2 = this.f116978b.f116981a.getDocumentsToAccept();
                        a0 a0Var2 = new a0(new dmj.a(22), 6);
                        documentsToAccept2.getClass();
                        ufm.i iVar2 = new ufm.i(documentsToAccept2, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List documents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents3, "documents");
                        this.f116978b.f116982b.f("CACHE_KEY_DOCUMENTS_TO_ACCEPT", documents3);
                        return Unit.f186387a;
                    case 5:
                        List documents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents4, "documents");
                        ue0.c cVar2 = this.f116978b.f116983c;
                        List<SavingsDocumentToAccept> list2 = documents4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept2 : list2) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept2, "<this>");
                            arrayList2.add(new fqg.a(savingsDocumentToAccept2.f94741a, savingsDocumentToAccept2.f94742b, savingsDocumentToAccept2.f94743c, savingsDocumentToAccept2.d.f86607a, savingsDocumentToAccept2.e));
                        }
                        cVar2.G(arrayList2, "STORAGE_KEY_DOCUMENTS_TO_ACCEPT", kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        String html = (String) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(html, "html");
                        this.f116978b.f116982b.f("params_key_transaction_statement", html);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i32 = 3;
        final int i33 = 2;
        final int i43 = 4;
        final int i59 = 3;
        final int i66 = 5;
        this.d = new w4l.f(new Function2(this) { // from class: dqg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116978b;

            {
                this.f116978b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String productId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        d0<List<bqg.b>> documentsToAccept = this.f116978b.f116981a.getDocumentsToAccept(productId);
                        a0 a0Var = new a0(new dmj.a(23), 7);
                        documentsToAccept.getClass();
                        ufm.i iVar = new ufm.i(documentsToAccept, a0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String productId2 = (String) obj2;
                        List documents = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        n.z("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2, this.f116978b.f116982b, documents);
                        return Unit.f186387a;
                    case 2:
                        String productId3 = (String) obj2;
                        List documents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId3, "productId");
                        Intrinsics.checkNotNullParameter(documents2, "documents");
                        ue0.c cVar = this.f116978b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId3);
                        List<SavingsDocumentToAccept> list = documents2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept : list) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept, "<this>");
                            arrayList.add(new fqg.a(savingsDocumentToAccept.f94741a, savingsDocumentToAccept.f94742b, savingsDocumentToAccept.f94743c, savingsDocumentToAccept.d.f86607a, savingsDocumentToAccept.e));
                        }
                        cVar.G(arrayList, strQ, kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<bqg.b>> documentsToAccept2 = this.f116978b.f116981a.getDocumentsToAccept();
                        a0 a0Var2 = new a0(new dmj.a(22), 6);
                        documentsToAccept2.getClass();
                        ufm.i iVar2 = new ufm.i(documentsToAccept2, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List documents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents3, "documents");
                        this.f116978b.f116982b.f("CACHE_KEY_DOCUMENTS_TO_ACCEPT", documents3);
                        return Unit.f186387a;
                    case 5:
                        List documents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents4, "documents");
                        ue0.c cVar2 = this.f116978b.f116983c;
                        List<SavingsDocumentToAccept> list2 = documents4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept2 : list2) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept2, "<this>");
                            arrayList2.add(new fqg.a(savingsDocumentToAccept2.f94741a, savingsDocumentToAccept2.f94742b, savingsDocumentToAccept2.f94743c, savingsDocumentToAccept2.d.f86607a, savingsDocumentToAccept2.e));
                        }
                        cVar2.G(arrayList2, "STORAGE_KEY_DOCUMENTS_TO_ACCEPT", kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        String html = (String) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(html, "html");
                        this.f116978b.f116982b.f("params_key_transaction_statement", html);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: dqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116980b;

            {
                this.f116980b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        String productId = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        return (List) v7.r("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId, this.f116980b.f116982b);
                    case 1:
                        String productId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        ue0.c cVar = this.f116980b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2);
                        Type type = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list = (List) cVar.T2(strQ, type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zpg.c.b((fqg.a) it8.next()));
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f116980b.f116982b.get("CACHE_KEY_DOCUMENTS_TO_ACCEPT");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar2 = this.f116980b.f116983c;
                        Type type2 = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type2, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list3 = (List) cVar2.T2("STORAGE_KEY_DOCUMENTS_TO_ACCEPT", type2);
                        if (list3 == null) {
                            return null;
                        }
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(zpg.c.b((fqg.a) it11.next()));
                        }
                        return arrayList2;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        Intrinsics.checkNotNullParameter(null, "it");
                        return (String) this.f116980b.f116982b.get("params_key_transaction_statement");
                }
            }
        }, new Function2(this) { // from class: dqg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116978b;

            {
                this.f116978b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String productId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        d0<List<bqg.b>> documentsToAccept = this.f116978b.f116981a.getDocumentsToAccept(productId);
                        a0 a0Var = new a0(new dmj.a(23), 7);
                        documentsToAccept.getClass();
                        ufm.i iVar = new ufm.i(documentsToAccept, a0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String productId2 = (String) obj2;
                        List documents = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        n.z("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2, this.f116978b.f116982b, documents);
                        return Unit.f186387a;
                    case 2:
                        String productId3 = (String) obj2;
                        List documents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId3, "productId");
                        Intrinsics.checkNotNullParameter(documents2, "documents");
                        ue0.c cVar = this.f116978b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId3);
                        List<SavingsDocumentToAccept> list = documents2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept : list) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept, "<this>");
                            arrayList.add(new fqg.a(savingsDocumentToAccept.f94741a, savingsDocumentToAccept.f94742b, savingsDocumentToAccept.f94743c, savingsDocumentToAccept.d.f86607a, savingsDocumentToAccept.e));
                        }
                        cVar.G(arrayList, strQ, kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<bqg.b>> documentsToAccept2 = this.f116978b.f116981a.getDocumentsToAccept();
                        a0 a0Var2 = new a0(new dmj.a(22), 6);
                        documentsToAccept2.getClass();
                        ufm.i iVar2 = new ufm.i(documentsToAccept2, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List documents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents3, "documents");
                        this.f116978b.f116982b.f("CACHE_KEY_DOCUMENTS_TO_ACCEPT", documents3);
                        return Unit.f186387a;
                    case 5:
                        List documents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents4, "documents");
                        ue0.c cVar2 = this.f116978b.f116983c;
                        List<SavingsDocumentToAccept> list2 = documents4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept2 : list2) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept2, "<this>");
                            arrayList2.add(new fqg.a(savingsDocumentToAccept2.f94741a, savingsDocumentToAccept2.f94742b, savingsDocumentToAccept2.f94743c, savingsDocumentToAccept2.d.f86607a, savingsDocumentToAccept2.e));
                        }
                        cVar2.G(arrayList2, "STORAGE_KEY_DOCUMENTS_TO_ACCEPT", kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        String html = (String) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(html, "html");
                        this.f116978b.f116982b.f("params_key_transaction_statement", html);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: dqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116980b;

            {
                this.f116980b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i59) {
                    case 0:
                        String productId = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        return (List) v7.r("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId, this.f116980b.f116982b);
                    case 1:
                        String productId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        ue0.c cVar = this.f116980b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2);
                        Type type = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list = (List) cVar.T2(strQ, type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(zpg.c.b((fqg.a) it8.next()));
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f116980b.f116982b.get("CACHE_KEY_DOCUMENTS_TO_ACCEPT");
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar2 = this.f116980b.f116983c;
                        Type type2 = f.f116984a;
                        Intrinsics.checkNotNullExpressionValue(type2, "<get-DOCUMENTS_TO_ACCEPT>(...)");
                        List list3 = (List) cVar2.T2("STORAGE_KEY_DOCUMENTS_TO_ACCEPT", type2);
                        if (list3 == null) {
                            return null;
                        }
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(zpg.c.b((fqg.a) it11.next()));
                        }
                        return arrayList2;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        Intrinsics.checkNotNullParameter(null, "it");
                        return (String) this.f116980b.f116982b.get("params_key_transaction_statement");
                }
            }
        }, new Function2(this) { // from class: dqg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116978b;

            {
                this.f116978b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String productId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        d0<List<bqg.b>> documentsToAccept = this.f116978b.f116981a.getDocumentsToAccept(productId);
                        a0 a0Var = new a0(new dmj.a(23), 7);
                        documentsToAccept.getClass();
                        ufm.i iVar = new ufm.i(documentsToAccept, a0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String productId2 = (String) obj2;
                        List documents = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId2, "productId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        n.z("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId2, this.f116978b.f116982b, documents);
                        return Unit.f186387a;
                    case 2:
                        String productId3 = (String) obj2;
                        List documents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(productId3, "productId");
                        Intrinsics.checkNotNullParameter(documents2, "documents");
                        ue0.c cVar = this.f116978b.f116983c;
                        String strQ = j6.a.q("CACHE_KEY_DOCUMENTS_TO_ACCEPT_", productId3);
                        List<SavingsDocumentToAccept> list = documents2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept : list) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept, "<this>");
                            arrayList.add(new fqg.a(savingsDocumentToAccept.f94741a, savingsDocumentToAccept.f94742b, savingsDocumentToAccept.f94743c, savingsDocumentToAccept.d.f86607a, savingsDocumentToAccept.e));
                        }
                        cVar.G(arrayList, strQ, kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<bqg.b>> documentsToAccept2 = this.f116978b.f116981a.getDocumentsToAccept();
                        a0 a0Var2 = new a0(new dmj.a(22), 6);
                        documentsToAccept2.getClass();
                        ufm.i iVar2 = new ufm.i(documentsToAccept2, a0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        List documents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents3, "documents");
                        this.f116978b.f116982b.f("CACHE_KEY_DOCUMENTS_TO_ACCEPT", documents3);
                        return Unit.f186387a;
                    case 5:
                        List documents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(documents4, "documents");
                        ue0.c cVar2 = this.f116978b.f116983c;
                        List<SavingsDocumentToAccept> list2 = documents4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (SavingsDocumentToAccept savingsDocumentToAccept2 : list2) {
                            Intrinsics.checkNotNullParameter(savingsDocumentToAccept2, "<this>");
                            arrayList2.add(new fqg.a(savingsDocumentToAccept2.f94741a, savingsDocumentToAccept2.f94742b, savingsDocumentToAccept2.f94743c, savingsDocumentToAccept2.d.f86607a, savingsDocumentToAccept2.e));
                        }
                        cVar2.G(arrayList2, "STORAGE_KEY_DOCUMENTS_TO_ACCEPT", kii.e.o(fqg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        String html = (String) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(html, "html");
                        this.f116978b.f116982b.f("params_key_transaction_statement", html);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
