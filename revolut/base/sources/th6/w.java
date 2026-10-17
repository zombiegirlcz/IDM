package th6;

import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.external_accounts.impl.repository.network.MandateService;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import tc7.m0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MandateService f271298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f271299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sh6.a f271300c;
    public final w4l.f d;
    public final w4l.f e;

    public w(MandateService mandateService, x storage, ne0.j memoryCache, sh6.a riskSignalsProvider) {
        Intrinsics.checkNotNullParameter(mandateService, "mandateService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(riskSignalsProvider, "riskSignalsProvider");
        this.f271298a = mandateService;
        this.f271299b = storage;
        this.f271300c = riskSignalsProvider;
        final int i = 3;
        final int i2 = 0;
        this.d = new w4l.f(new Function2(this) { // from class: th6.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f271297b;

            {
                this.f271297b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i;
                w wVar = this.f271297b;
                switch (i3) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        x xVar = wVar.f271299b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List list = domain;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(ngm.n.E((Mandate) it8.next()));
                        }
                        ((y) xVar).b(arrayList);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<uh6.j> mandate = wVar.f271298a.getMandate(id10);
                        v vVar = v.f;
                        m0 m0Var = new m0(2);
                        mandate.getClass();
                        ufm.i iVar = new ufm.i(mandate, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Mandate domain2 = (Mandate) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        x xVar2 = wVar.f271299b;
                        ai6.b entity = ngm.n.E(domain2);
                        y yVar = (y) xVar2;
                        yVar.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List listA = yVar.a();
                        if (listA == null) {
                            listA = f0.f322471a;
                        }
                        int size = listA.size();
                        ArrayList arrayListF1 = zhm.d0.f1(listA);
                        Iterator it9 = arrayListF1.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i5 = -1;
                            } else if (!Intrinsics.f(((ai6.b) it9.next()).getId(), entity.getId())) {
                                i5++;
                            }
                        }
                        if (i5 >= 0) {
                            arrayListF1.set(i5, entity);
                        } else {
                            arrayListF1.add(size, entity);
                        }
                        yVar.b(arrayListF1);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<uh6.j>> mandates = wVar.f271298a.getMandates();
                        tcg.q qVar = new tcg.q(28, new tfh.a(7));
                        mandates.getClass();
                        ufm.i iVar2 = new ufm.i(mandates, qVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new bek.c(memoryCache, 6), new bek.d(memoryCache, 6), new Function1(this) { // from class: th6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f271295b;

            {
                this.f271295b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ai6.b bVar;
                Object next;
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List listA = ((y) this.f271295b.f271299b).a();
                        if (listA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(listA, "<this>");
                        List list = listA;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(ngm.n.w((ai6.b) it9.next()));
                        }
                        return arrayList;
                    default:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        y yVar = (y) this.f271295b.f271299b;
                        yVar.getClass();
                        Intrinsics.checkNotNullParameter(id10, "id");
                        List listA2 = yVar.a();
                        if (listA2 != null) {
                            Iterator it10 = listA2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next = it10.next();
                                    if (Intrinsics.f(((ai6.b) next).getId(), id10)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            bVar = (ai6.b) next;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            return ngm.n.w(bVar);
                        }
                        return null;
                }
            }
        }, new Function2(this) { // from class: th6.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f271297b;

            {
                this.f271297b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i2;
                w wVar = this.f271297b;
                switch (i3) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        x xVar = wVar.f271299b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List list = domain;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(ngm.n.E((Mandate) it8.next()));
                        }
                        ((y) xVar).b(arrayList);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<uh6.j> mandate = wVar.f271298a.getMandate(id10);
                        v vVar = v.f;
                        m0 m0Var = new m0(2);
                        mandate.getClass();
                        ufm.i iVar = new ufm.i(mandate, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Mandate domain2 = (Mandate) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        x xVar2 = wVar.f271299b;
                        ai6.b entity = ngm.n.E(domain2);
                        y yVar = (y) xVar2;
                        yVar.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List listA = yVar.a();
                        if (listA == null) {
                            listA = f0.f322471a;
                        }
                        int size = listA.size();
                        ArrayList arrayListF1 = zhm.d0.f1(listA);
                        Iterator it9 = arrayListF1.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i5 = -1;
                            } else if (!Intrinsics.f(((ai6.b) it9.next()).getId(), entity.getId())) {
                                i5++;
                            }
                        }
                        if (i5 >= 0) {
                            arrayListF1.set(i5, entity);
                        } else {
                            arrayListF1.add(size, entity);
                        }
                        yVar.b(arrayListF1);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<uh6.j>> mandates = wVar.f271298a.getMandates();
                        tcg.q qVar = new tcg.q(28, new tfh.a(7));
                        mandates.getClass();
                        ufm.i iVar2 = new ufm.i(mandates, qVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i3 = 1;
        Function2 function2 = new Function2(this) { // from class: th6.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f271297b;

            {
                this.f271297b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i3;
                w wVar = this.f271297b;
                switch (i32) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        x xVar = wVar.f271299b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List list = domain;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(ngm.n.E((Mandate) it8.next()));
                        }
                        ((y) xVar).b(arrayList);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<uh6.j> mandate = wVar.f271298a.getMandate(id10);
                        v vVar = v.f;
                        m0 m0Var = new m0(2);
                        mandate.getClass();
                        ufm.i iVar = new ufm.i(mandate, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Mandate domain2 = (Mandate) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        x xVar2 = wVar.f271299b;
                        ai6.b entity = ngm.n.E(domain2);
                        y yVar = (y) xVar2;
                        yVar.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List listA = yVar.a();
                        if (listA == null) {
                            listA = f0.f322471a;
                        }
                        int size = listA.size();
                        ArrayList arrayListF1 = zhm.d0.f1(listA);
                        Iterator it9 = arrayListF1.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i5 = -1;
                            } else if (!Intrinsics.f(((ai6.b) it9.next()).getId(), entity.getId())) {
                                i5++;
                            }
                        }
                        if (i5 >= 0) {
                            arrayListF1.set(i5, entity);
                        } else {
                            arrayListF1.add(size, entity);
                        }
                        yVar.b(arrayListF1);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<uh6.j>> mandates = wVar.f271298a.getMandates();
                        tcg.q qVar = new tcg.q(28, new tfh.a(7));
                        mandates.getClass();
                        ufm.i iVar2 = new ufm.i(mandates, qVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        bek.c cVar = new bek.c(memoryCache, 5);
        bek.d dVar = new bek.d(memoryCache, 5);
        final int i5 = 1;
        Function1 function1 = new Function1(this) { // from class: th6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f271295b;

            {
                this.f271295b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ai6.b bVar;
                Object next;
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List listA = ((y) this.f271295b.f271299b).a();
                        if (listA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(listA, "<this>");
                        List list = listA;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(ngm.n.w((ai6.b) it9.next()));
                        }
                        return arrayList;
                    default:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        y yVar = (y) this.f271295b.f271299b;
                        yVar.getClass();
                        Intrinsics.checkNotNullParameter(id10, "id");
                        List listA2 = yVar.a();
                        if (listA2 != null) {
                            Iterator it10 = listA2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next = it10.next();
                                    if (Intrinsics.f(((ai6.b) next).getId(), id10)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            bVar = (ai6.b) next;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            return ngm.n.w(bVar);
                        }
                        return null;
                }
            }
        };
        final int i6 = 2;
        this.e = new w4l.f(function2, cVar, dVar, function1, new Function2(this) { // from class: th6.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f271297b;

            {
                this.f271297b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i6;
                w wVar = this.f271297b;
                switch (i32) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        x xVar = wVar.f271299b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List list = domain;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(ngm.n.E((Mandate) it8.next()));
                        }
                        ((y) xVar).b(arrayList);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<uh6.j> mandate = wVar.f271298a.getMandate(id10);
                        v vVar = v.f;
                        m0 m0Var = new m0(2);
                        mandate.getClass();
                        ufm.i iVar = new ufm.i(mandate, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Mandate domain2 = (Mandate) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        x xVar2 = wVar.f271299b;
                        ai6.b entity = ngm.n.E(domain2);
                        y yVar = (y) xVar2;
                        yVar.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List listA = yVar.a();
                        if (listA == null) {
                            listA = f0.f322471a;
                        }
                        int size = listA.size();
                        ArrayList arrayListF1 = zhm.d0.f1(listA);
                        Iterator it9 = arrayListF1.iterator();
                        int i59 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i59 = -1;
                            } else if (!Intrinsics.f(((ai6.b) it9.next()).getId(), entity.getId())) {
                                i59++;
                            }
                        }
                        if (i59 >= 0) {
                            arrayListF1.set(i59, entity);
                        } else {
                            arrayListF1.add(size, entity);
                        }
                        yVar.b(arrayListF1);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<uh6.j>> mandates = wVar.f271298a.getMandates();
                        tcg.q qVar = new tcg.q(28, new tfh.a(7));
                        mandates.getClass();
                        ufm.i iVar2 = new ufm.i(mandates, qVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new t8e.c(this, memoryCache, 18), null, null, 192);
    }
}
