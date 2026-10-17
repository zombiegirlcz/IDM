package hn;

import efm.d0;
import efm.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.f0;
import qfm.j0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f154007b;

    public /* synthetic */ b(d dVar, int i) {
        this.f154006a = i;
        this.f154007b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f154006a) {
            case 0:
                npi.d configuration = (npi.d) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                ((npi.c) this.f154007b.f154010j).Q(configuration);
                return Unit.f186387a;
            default:
                npi.e result = (npi.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                d dVar = this.f154007b;
                Set set = dVar.f154009h;
                ArrayList arrayList = new ArrayList(w.t(set, 10));
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((a) it8.next()).c(result));
                }
                return new pfm.a(new f0(new j0(d0.h(i.h(arrayList)), new hje.e(new hmc.a(9), 10), 0), Boolean.FALSE), new hje.e(new hm3.b(dVar, result, 6), 11), 4);
        }
    }
}
