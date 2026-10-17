package jte;

import ag.x;
import az0.r1;
import cn0.g;
import com.revolut.domain.interactors.experiments.ExperimentsFetchingInteractor$ExperimentType;
import efm.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mm0.n;
import mm0.o;
import mm0.p;
import oma.r;
import pfm.h;
import pfm.t;
import skm.p0;
import te0.w;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m81.a f178496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lte.c f178497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lte.d f178498c;
    public final ArrayList d;

    public c(m81.a skywalkerExperimentsInteractor, lte.c firebaseExperimentsRepository, lte.d mutableFeatureToggleRepository) {
        Intrinsics.checkNotNullParameter(skywalkerExperimentsInteractor, "skywalkerExperimentsInteractor");
        Intrinsics.checkNotNullParameter(firebaseExperimentsRepository, "firebaseExperimentsRepository");
        Intrinsics.checkNotNullParameter(mutableFeatureToggleRepository, "mutableFeatureToggleRepository");
        this.f178496a = skywalkerExperimentsInteractor;
        this.f178497b = firebaseExperimentsRepository;
        this.f178498c = mutableFeatureToggleRepository;
        this.d = new ArrayList();
    }

    public static t a(c cVar, ExperimentsFetchingInteractor$ExperimentType experimentsFetchingInteractor$ExperimentType, int i) {
        efm.b aVar;
        int i2 = 1;
        ExperimentsFetchingInteractor$ExperimentType experimentType = (i & 1) != 0 ? ExperimentsFetchingInteractor$ExperimentType.ALL : experimentsFetchingInteractor$ExperimentType;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(experimentType, "experimentType");
        lte.c cVar2 = cVar.f178497b;
        cVar2.getClass();
        f fVarV = ue0.e.v(ue0.e.v(w.g0(pd.b.n(p0.f264003c, new r1(cVar2, null, 8)))));
        q81.d dVar = (q81.d) cVar.f178496a.f203417a;
        o oVarD = ((g) dVar.d).d();
        int i3 = 0;
        int i5 = 2;
        if ((oVarD instanceof n) || (oVarD instanceof p)) {
            ufm.f fVar = new ufm.f(w.i0(dVar.f242961a.getExperiments()), new q3d.c(20, new q81.b(dVar, i3)), i2);
            Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
            aVar = new pfm.a(w.n0(fVar, dVar.f242963c), new q3d.c(21, new q81.b(dVar, i2)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        } else {
            h hVar = new h(new r(dVar, 13), i5);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            pfm.r rVarG0 = w.g0(hVar);
            q3d.c cVar3 = new q3d.c(22, new q75.n(19));
            dfm.c cVar4 = mfm.f.d;
            en.a aVar2 = mfm.f.f205043c;
            aVar = new t(rVarG0, cVar3, cVar4, aVar2, aVar2, aVar2, aVar2);
        }
        pfm.a aVarV = ue0.e.v(aVar);
        int i6 = b.f178495a[experimentType.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                fVarV = aVarV;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fVarV = efm.b.p(fVarV, aVarV);
                Intrinsics.checkNotNullExpressionValue(fVarV, "mergeArray(...)");
            }
        }
        lte.d dVar2 = cVar.f178498c;
        dVar2.getClass();
        pfm.n nVar = new pfm.n(new h4d.d(dVar2, 18), i2);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        pfm.r rVarY = nVar.y(hhm.f.f152430b);
        Intrinsics.checkNotNullExpressionValue(rVarY, "subscribeOn(...)");
        t tVarL = efm.b.p(rVarY, fVarV).l(new hc7.a(cVar, experimentType, 14));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    public final Map b(ExperimentsFetchingInteractor$ExperimentType experimentType) {
        Intrinsics.checkNotNullParameter(experimentType, "experimentType");
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: jte.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f178494b;

            {
                this.f178494b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strD;
                switch (i) {
                    case 0:
                        HashMap mapA = ((ii0.b) this.f178494b.f178497b.a()).c().a();
                        Intrinsics.checkNotNullExpressionValue(mapA, "getAll(...)");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapA.size()));
                        for (Map.Entry entry : mapA.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                            try {
                                strD = ((x) ((zf.c) value)).d();
                            } catch (Exception unused) {
                                strD = "";
                            }
                            linkedHashMap.put(key, strD);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            Object key2 = entry2.getKey();
                            b0m.a aVar = b0m.b.Companion;
                            String str = (String) entry2.getValue();
                            aVar.getClass();
                            r81.c cVarA = b0m.a.a(str);
                            if (cVarA == null) {
                                cVarA = new lte.a((String) entry2.getValue());
                            }
                            linkedHashMap2.put(key2, cVarA);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
                        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                            linkedHashMap3.put(entry3.getKey(), ((r81.c) entry3.getValue()).getValue());
                        }
                        return linkedHashMap3;
                    default:
                        Map mapB = ((q81.d) this.f178494b.f178496a.f203417a).b();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(q0.b(mapB.size()));
                        for (Map.Entry entry4 : mapB.entrySet()) {
                            linkedHashMap4.put(entry4.getKey(), ((p81.d) entry4.getValue()).f233822b);
                        }
                        return linkedHashMap4;
                }
            }
        };
        final int i2 = 1;
        Function0 function02 = new Function0(this) { // from class: jte.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f178494b;

            {
                this.f178494b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strD;
                switch (i2) {
                    case 0:
                        HashMap mapA = ((ii0.b) this.f178494b.f178497b.a()).c().a();
                        Intrinsics.checkNotNullExpressionValue(mapA, "getAll(...)");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapA.size()));
                        for (Map.Entry entry : mapA.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                            try {
                                strD = ((x) ((zf.c) value)).d();
                            } catch (Exception unused) {
                                strD = "";
                            }
                            linkedHashMap.put(key, strD);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            Object key2 = entry2.getKey();
                            b0m.a aVar = b0m.b.Companion;
                            String str = (String) entry2.getValue();
                            aVar.getClass();
                            r81.c cVarA = b0m.a.a(str);
                            if (cVarA == null) {
                                cVarA = new lte.a((String) entry2.getValue());
                            }
                            linkedHashMap2.put(key2, cVarA);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
                        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                            linkedHashMap3.put(entry3.getKey(), ((r81.c) entry3.getValue()).getValue());
                        }
                        return linkedHashMap3;
                    default:
                        Map mapB = ((q81.d) this.f178494b.f178496a.f203417a).b();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(q0.b(mapB.size()));
                        for (Map.Entry entry4 : mapB.entrySet()) {
                            linkedHashMap4.put(entry4.getKey(), ((p81.d) entry4.getValue()).f233822b);
                        }
                        return linkedHashMap4;
                }
            }
        };
        int i3 = b.f178495a[experimentType.ordinal()];
        if (i3 == 1) {
            return (Map) function0.invoke();
        }
        if (i3 == 2) {
            return (Map) function02.invoke();
        }
        if (i3 == 3) {
            return r0.p((Map) function02.invoke(), (Map) function0.invoke());
        }
        throw new NoWhenBranchMatchedException();
    }
}
