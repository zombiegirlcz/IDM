package ya6;

import androidx.room.util.DBUtil;
import com.revolut.feature.donations.impl.network.service.DonationsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ya6.j;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements e {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonationsService f311973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja6.f f311974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f311975c;
    public final w4l.f d;

    public l(DonationsService service, ja6.f dao, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f311973a = service;
        this.f311974b = dao;
        this.f311975c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: ya6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f311966b;

            {
                this.f311966b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object objC;
                switch (i) {
                    case 0:
                        DonationsService donationsService = this.f311966b.f311973a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        j request = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        if (request instanceof j.a) {
                            efm.d0<List<va6.c>> charitiesCollections = donationsService.getCharitiesCollections();
                            f fVar = new f(new y99.x(10), 0);
                            charitiesCollections.getClass();
                            ufm.i iVar = new ufm.i(charitiesCollections, fVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(request instanceof k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.c> charityCollection = donationsService.getCharityCollection(((k) request).f311972a);
                        f fVar2 = new f(new y99.x(11), 1);
                        charityCollection.getClass();
                        ufm.i iVar2 = new ufm.i(charityCollection, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        ne0.d dVar = this.f311966b.f311975c;
                        j request2 = (j) obj2;
                        List collections = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(collections, "collections");
                        if (request2 instanceof j.a) {
                            dVar.f("mem_cache_key_charities_collections", collections);
                        } else {
                            if (!(request2 instanceof k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            za6.b bVar = (za6.b) zhm.d0.d0(collections);
                            if (bVar != null) {
                                List list = (List) dVar.get("mem_cache_key_charities_collections");
                                if (list != null) {
                                    List list2 = list;
                                    objC = new ArrayList(zhm.w.t(list2, 10));
                                    for (Object obj4 : list2) {
                                        if (Intrinsics.f(((za6.b) obj4).f320569a, bVar.f320569a)) {
                                            obj4 = bVar;
                                        }
                                        objC.add(obj4);
                                    }
                                } else {
                                    objC = zhm.u.c(bVar);
                                }
                                dVar.f("mem_cache_key_charities_collections", objC);
                            }
                        }
                        return Unit.f186387a;
                    default:
                        ja6.f fVar3 = this.f311966b.f311974b;
                        j request3 = (j) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (request3 instanceof j.a) {
                            List<za6.b> list3 = collections2;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                            for (za6.b bVar2 : list3) {
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                arrayList.add(new la6.c(bVar2.f320569a, bVar2.f320570b, bVar2.e, bVar2.f320571c, bVar2.d, bVar2.f));
                            }
                            DBUtil.performBlocking(fVar3.f172454a, false, true, new ja6.c(fVar3, arrayList, 1));
                        } else {
                            if (!(request3 instanceof k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List<za6.b> list4 = collections2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (za6.b bVar3 : list4) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                arrayList2.add(new la6.c(bVar3.f320569a, bVar3.f320570b, bVar3.e, bVar3.f320571c, bVar3.d, bVar3.f));
                            }
                            DBUtil.performBlocking(fVar3.f172454a, false, true, new ja6.c(fVar3, arrayList2, 0));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: ya6.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f311968b;

            {
                this.f311968b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        ne0.d dVar = this.f311968b.f311975c;
                        j request = (j) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        if (request instanceof j.a) {
                            return (List) dVar.get("mem_cache_key_charities_collections");
                        }
                        if (!(request instanceof k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List list = (List) dVar.get("mem_cache_key_charities_collections");
                        if (list == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (Intrinsics.f(((za6.b) obj3).f320569a, ((k) request).f311972a)) {
                                arrayList.add(obj3);
                            }
                        }
                        return c6d.b.N(arrayList);
                    default:
                        ja6.f fVar = this.f311968b.f311974b;
                        j request2 = (j) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        if (request2 instanceof j.a) {
                            List<la6.c> list2 = (List) DBUtil.performBlocking(fVar.f172454a, true, false, new ja6.e(fVar, 1));
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (la6.c cVar : list2) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                arrayList2.add(new za6.b(cVar.f193323a, cVar.f193324b, cVar.e, cVar.f193325c, cVar.d, cVar.f));
                            }
                            return arrayList2;
                        }
                        if (!(request2 instanceof k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        la6.c cVar2 = (la6.c) DBUtil.performBlocking(fVar.f172454a, true, false, new ja6.d(fVar, ((k) request2).f311972a, 0));
                        if (cVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar2, "<this>");
                        return zhm.u.c(new za6.b(cVar2.f193323a, cVar2.f193324b, cVar2.e, cVar2.f193325c, cVar2.d, cVar2.f));
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: ya6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f311966b;

            {
                this.f311966b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object objC;
                switch (i2) {
                    case 0:
                        DonationsService donationsService = this.f311966b.f311973a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        j request = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        if (request instanceof j.a) {
                            efm.d0<List<va6.c>> charitiesCollections = donationsService.getCharitiesCollections();
                            f fVar = new f(new y99.x(10), 0);
                            charitiesCollections.getClass();
                            ufm.i iVar = new ufm.i(charitiesCollections, fVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(request instanceof k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.c> charityCollection = donationsService.getCharityCollection(((k) request).f311972a);
                        f fVar2 = new f(new y99.x(11), 1);
                        charityCollection.getClass();
                        ufm.i iVar2 = new ufm.i(charityCollection, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        ne0.d dVar = this.f311966b.f311975c;
                        j request2 = (j) obj2;
                        List collections = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(collections, "collections");
                        if (request2 instanceof j.a) {
                            dVar.f("mem_cache_key_charities_collections", collections);
                        } else {
                            if (!(request2 instanceof k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            za6.b bVar = (za6.b) zhm.d0.d0(collections);
                            if (bVar != null) {
                                List list = (List) dVar.get("mem_cache_key_charities_collections");
                                if (list != null) {
                                    List list2 = list;
                                    objC = new ArrayList(zhm.w.t(list2, 10));
                                    for (Object obj4 : list2) {
                                        if (Intrinsics.f(((za6.b) obj4).f320569a, bVar.f320569a)) {
                                            obj4 = bVar;
                                        }
                                        objC.add(obj4);
                                    }
                                } else {
                                    objC = zhm.u.c(bVar);
                                }
                                dVar.f("mem_cache_key_charities_collections", objC);
                            }
                        }
                        return Unit.f186387a;
                    default:
                        ja6.f fVar3 = this.f311966b.f311974b;
                        j request3 = (j) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (request3 instanceof j.a) {
                            List<za6.b> list3 = collections2;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                            for (za6.b bVar2 : list3) {
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                arrayList.add(new la6.c(bVar2.f320569a, bVar2.f320570b, bVar2.e, bVar2.f320571c, bVar2.d, bVar2.f));
                            }
                            DBUtil.performBlocking(fVar3.f172454a, false, true, new ja6.c(fVar3, arrayList, 1));
                        } else {
                            if (!(request3 instanceof k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List<za6.b> list4 = collections2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (za6.b bVar3 : list4) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                arrayList2.add(new la6.c(bVar3.f320569a, bVar3.f320570b, bVar3.e, bVar3.f320571c, bVar3.d, bVar3.f));
                            }
                            DBUtil.performBlocking(fVar3.f172454a, false, true, new ja6.c(fVar3, arrayList2, 0));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: ya6.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f311968b;

            {
                this.f311968b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        ne0.d dVar = this.f311968b.f311975c;
                        j request = (j) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        if (request instanceof j.a) {
                            return (List) dVar.get("mem_cache_key_charities_collections");
                        }
                        if (!(request instanceof k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List list = (List) dVar.get("mem_cache_key_charities_collections");
                        if (list == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (Intrinsics.f(((za6.b) obj3).f320569a, ((k) request).f311972a)) {
                                arrayList.add(obj3);
                            }
                        }
                        return c6d.b.N(arrayList);
                    default:
                        ja6.f fVar = this.f311968b.f311974b;
                        j request2 = (j) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        if (request2 instanceof j.a) {
                            List<la6.c> list2 = (List) DBUtil.performBlocking(fVar.f172454a, true, false, new ja6.e(fVar, 1));
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (la6.c cVar : list2) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                arrayList2.add(new za6.b(cVar.f193323a, cVar.f193324b, cVar.e, cVar.f193325c, cVar.d, cVar.f));
                            }
                            return arrayList2;
                        }
                        if (!(request2 instanceof k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        la6.c cVar2 = (la6.c) DBUtil.performBlocking(fVar.f172454a, true, false, new ja6.d(fVar, ((k) request2).f311972a, 0));
                        if (cVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar2, "<this>");
                        return zhm.u.c(new za6.b(cVar2.f193323a, cVar2.f193324b, cVar2.e, cVar2.f193325c, cVar2.d, cVar2.f));
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: ya6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f311966b;

            {
                this.f311966b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object objC;
                switch (i3) {
                    case 0:
                        DonationsService donationsService = this.f311966b.f311973a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        j request = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        if (request instanceof j.a) {
                            efm.d0<List<va6.c>> charitiesCollections = donationsService.getCharitiesCollections();
                            f fVar = new f(new y99.x(10), 0);
                            charitiesCollections.getClass();
                            ufm.i iVar = new ufm.i(charitiesCollections, fVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(request instanceof k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.c> charityCollection = donationsService.getCharityCollection(((k) request).f311972a);
                        f fVar2 = new f(new y99.x(11), 1);
                        charityCollection.getClass();
                        ufm.i iVar2 = new ufm.i(charityCollection, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        ne0.d dVar = this.f311966b.f311975c;
                        j request2 = (j) obj2;
                        List collections = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(collections, "collections");
                        if (request2 instanceof j.a) {
                            dVar.f("mem_cache_key_charities_collections", collections);
                        } else {
                            if (!(request2 instanceof k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            za6.b bVar = (za6.b) zhm.d0.d0(collections);
                            if (bVar != null) {
                                List list = (List) dVar.get("mem_cache_key_charities_collections");
                                if (list != null) {
                                    List list2 = list;
                                    objC = new ArrayList(zhm.w.t(list2, 10));
                                    for (Object obj4 : list2) {
                                        if (Intrinsics.f(((za6.b) obj4).f320569a, bVar.f320569a)) {
                                            obj4 = bVar;
                                        }
                                        objC.add(obj4);
                                    }
                                } else {
                                    objC = zhm.u.c(bVar);
                                }
                                dVar.f("mem_cache_key_charities_collections", objC);
                            }
                        }
                        return Unit.f186387a;
                    default:
                        ja6.f fVar3 = this.f311966b.f311974b;
                        j request3 = (j) obj2;
                        List collections2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(collections2, "collections");
                        if (request3 instanceof j.a) {
                            List<za6.b> list3 = collections2;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                            for (za6.b bVar2 : list3) {
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                arrayList.add(new la6.c(bVar2.f320569a, bVar2.f320570b, bVar2.e, bVar2.f320571c, bVar2.d, bVar2.f));
                            }
                            DBUtil.performBlocking(fVar3.f172454a, false, true, new ja6.c(fVar3, arrayList, 1));
                        } else {
                            if (!(request3 instanceof k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List<za6.b> list4 = collections2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (za6.b bVar3 : list4) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                arrayList2.add(new la6.c(bVar3.f320569a, bVar3.f320570b, bVar3.e, bVar3.f320571c, bVar3.d, bVar3.f));
                            }
                            DBUtil.performBlocking(fVar3.f172454a, false, true, new ja6.c(fVar3, arrayList2, 0));
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
