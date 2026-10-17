package q81;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kii.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import oma.r;
import pfm.h;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f242959b;

    public /* synthetic */ b(d dVar, int i) {
        this.f242958a = i;
        this.f242959b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f242958a;
        d dVar = this.f242959b;
        switch (i) {
            case 0:
                if (!dVar.e.get()) {
                    dVar.a();
                }
                return Unit.f186387a;
            default:
                List experiments = (List) obj2;
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                ArrayList<p81.c> arrayList = new ArrayList();
                Iterator it8 = experiments.iterator();
                while (true) {
                    r81.b bVar = null;
                    if (!it8.hasNext()) {
                        for (p81.c cVar : arrayList) {
                            final String strS = j6.a.s("Unsupported strategy for experiment:", cVar.f233818a, ". Strategy:", cVar.f233820c, " is invalid.");
                            Exception exc2 = new Exception(strS) { // from class: com.revolut.feature.abexperiments.impl.repository.SkywalkerRepositoryImpl$FetchedExperimentStrategyException

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final String f60551a;

                                {
                                    Intrinsics.checkNotNullParameter(strS, "message");
                                    this.f60551a = strS;
                                }

                                @Override // java.lang.Throwable
                                public final String getMessage() {
                                    return this.f60551a;
                                }
                            };
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "SkywalkerRepositoryImpl", null, exc2, h0Var);
                        }
                        dVar.f242962b.G(experiments, "memoryCacheKey", e.o(p81.c.class, KTypeProjection.INSTANCE, List.class));
                        h hVar = new h(new r(dVar, 13), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                        return w.g0(hVar);
                    }
                    Object next = it8.next();
                    String str = ((p81.c) next).f233820c;
                    if (str != null) {
                        r81.b[] bVarArrValues = r81.b.values();
                        int length = bVarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                r81.b bVar2 = bVarArrValues[i2];
                                if (a0.z(bVar2.name(), str, true)) {
                                    bVar = bVar2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    if (bVar == null) {
                        arrayList.add(next);
                    }
                }
                break;
        }
    }
}
