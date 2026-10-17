package a2g;

import ajd.u;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.PassportService;
import org.jmrtd.lds.LDSFile;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f850b;

    public /* synthetic */ p(u uVar, boolean z) {
        this.f849a = 12;
        this.f850b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f849a) {
            case 0:
                return g.a((g) obj2, null, null, false, false, this.f850b, null, 191);
            case 1:
                return g.a((g) obj2, null, null, false, this.f850b, false, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 2:
                return a3i.l.a((a3i.l) obj2, null, null, this.f850b, 7);
            case 3:
                return a83.o.a((a83.o) obj2, null, null, null, null, null, null, null, null, this.f850b, null, null, false, null, null, 64511);
            case 4:
                return a83.o.a((a83.o) obj2, null, null, null, null, null, null, null, null, false, null, null, this.f850b, null, null, 57343);
            case 5:
                a91.d dVar = (a91.d) obj2;
                boolean z = dVar.f2290b;
                dVar.getClass();
                return new a91.d(this.f850b, z);
            case 6:
                a91.d dVar2 = (a91.d) obj2;
                boolean z3 = dVar2.f2289a;
                dVar2.getClass();
                return new a91.d(z3, this.f850b);
            case 7:
                return afg.e.a((afg.e) obj2, null, null, null, this.f850b, 7);
            case 8:
                return ahf.l.a((ahf.l) obj2, null, null, null, this.f850b, null, null, null, 0, 0, null, 2031);
            case 9:
                ai4.e update = (ai4.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ai4.e.a(update, this.f850b, null, 5);
            case 10:
                return aig.i.a((aig.i) obj2, null, null, null, false, this.f850b, null, null, LDSFile.EF_DG15_TAG);
            case 11:
                ajd.h updateState = (ajd.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ajd.h.a(updateState, null, null, null, this.f850b, null, 23);
            case 12:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return bjd.c.a(this.f850b);
            case 13:
                return aqh.i.a((aqh.i) obj2, null, null, null, this.f850b, CertificateBody.profileType);
            case 14:
                Map allWalletsWithPockets = (Map) obj2;
                Intrinsics.checkNotNullParameter(allWalletsWithPockets, "allWalletsWithPockets");
                ArrayList arrayList = new ArrayList();
                Iterator it9 = allWalletsWithPockets.entrySet().iterator();
                while (it9.hasNext()) {
                    List list = (List) ((Map.Entry) it9.next()).getValue();
                    ArrayList<Pair> arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        fo3.e eVar = ((fo3.c) ((Pair) obj3).f186385a).f136802b;
                        if (eVar == fo3.e.ACTIVE || eVar == fo3.e.LOCKED) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    for (Pair pairE : arrayList2) {
                        if (!this.f850b) {
                            pairE = ue8.c.E(pairE);
                        }
                        arrayList3.add(pairE);
                    }
                    a0.x(arrayList3, arrayList);
                }
                return arrayList;
            case 15:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(!this.f850b && cp5.d.z((xi0.b) pair.f186385a));
            case 16:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return Boolean.valueOf(!this.f850b && cp5.d.y((xi0.b) pair2.f186385a));
            case 17:
                baf.i update2 = (baf.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return baf.i.a(update2, null, null, null, false, this.f850b, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 18:
                be3.f updateState2 = (be3.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return be3.f.a(updateState2, 0L, this.f850b, null, null, 27);
            case 19:
                return TabInvestControllerContract$State.c((TabInvestControllerContract$State) obj2, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, this.f850b, null, null, null, null, null, null, null, null, 2143289343);
            case 20:
                return TabInvestControllerContract$State.c((TabInvestControllerContract$State) obj2, null, null, null, false, false, false, this.f850b, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483583);
            case 21:
                return bq5.a0.a((bq5.a0) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, this.f850b, false, null, null, null, null, 1065353215);
            case 22:
                return bs9.o.a((bs9.o) obj2, null, null, false, this.f850b, false, null, null, 0, null, null, null, 8183);
            case 23:
                return bs9.o.a((bs9.o) obj2, null, null, false, false, this.f850b, null, null, 0, null, null, null, 8175);
            case 24:
                return bxb.e.a((bxb.e) obj2, null, null, this.f850b, null, 11);
            case 25:
                return c5a.l.a((c5a.l) obj2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, this.f850b, false, null, false, null, 507903);
            case 26:
                return c5a.l.a((c5a.l) obj2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, false, null, this.f850b, null, 393215);
            case 27:
                return cbh.j.a((cbh.j) obj2, null, null, null, null, null, null, this.f850b, null, 895);
            case 28:
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, null, null, null, null, null, null, null, null, null, null, null, this.f850b, null, false, null, null, null, null, null, false, false, null, 4192255);
            default:
                return cjd.d.a((cjd.d) obj2, null, null, null, 0, false, null, this.f850b, false, 191);
        }
    }

    public /* synthetic */ p(boolean z, int i) {
        this.f849a = i;
        this.f850b = z;
    }
}
