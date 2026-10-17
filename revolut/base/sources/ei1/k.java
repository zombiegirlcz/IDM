package ei1;

import cli.y;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import skm.a2;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends oki.h implements dli.b {
    public final FieldSearchScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rh1.b f126350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f126351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f126352r;

    public k(cli.n stateMapper, FieldSearchScreenContract$InputData inputData, rh1.b addressFlowInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        this.o = inputData;
        this.f126350p = addressFlowInteractor;
        String str = inputData.e;
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        this.f126352r = mra.d.b(this, new e(null, str), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String str = this.o.e;
        if (str != null) {
            I2(str);
        }
    }

    public final void I2(String query) {
        vkm.d dVarA;
        FieldSearchScreenContract$InputData fieldSearchScreenContract$InputData = this.o;
        n nVar = fieldSearchScreenContract$InputData.f60976c;
        wi0.b country = fieldSearchScreenContract$InputData.f60974a;
        int i = j.f126349a[nVar.ordinal()];
        rh1.b bVar = this.f126350p;
        if (i == 1) {
            lj1.a aVar = (lj1.a) bVar;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(query, "query");
            dVarA = aVar.d.a(query, country);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lj1.a aVar2 = (lj1.a) bVar;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(query, "query");
            zi1.a aVar3 = aVar2.d;
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(query, "query");
            cj1.i iVar = aVar3.f322488a;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(query, "query");
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            dVarA = iVar.e.b(new cj1.g(country.f297794a, query), loadingStrategy);
        }
        this.f126351q = yji.l.a1(this, dVarA, null, null, new chf.a(this, query, null, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f126352r;
    }
}
