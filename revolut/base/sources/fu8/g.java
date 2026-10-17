package fu8;

import com.revolut.data.model.Data;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import cu8.g1;
import cu8.n1;
import cu8.t0;
import efm.d0;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f138121b;

    public /* synthetic */ g(v vVar, int i) {
        this.f138120a = i;
        this.f138121b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a aVar;
        switch (this.f138120a) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                pfm.h hVar = new pfm.h(new aed.d((my8.r) rVar.f314201a, (e7l.f) rVar.f314202b, (wi0.b) rVar.f314203c, this.f138121b, 5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.kyc.impl.f fVar = (com.revolut.feature.kyc.impl.f) this.f138121b.o;
                efm.b bVarFlatMapCompletable = ((n1) ((com.revolut.feature.kyc.impl.b) fVar.f77669c).e).G0().c(te0.s.f270018a).flatMapCompletable(new cu8.n(26, new t0(fVar, 5)));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                return bVarFlatMapCompletable;
            case 2:
                a behavior = (a) obj2;
                Intrinsics.checkNotNullParameter(behavior, "behavior");
                v vVar = this.f138121b;
                return behavior.e(vVar.f138140l, vVar.f138138h.f77586b);
            case 3:
                ((a) obj2).g(this.f138121b.f138142n);
                return Unit.f186387a;
            case 4:
                a behavior2 = (a) obj2;
                Intrinsics.checkNotNullParameter(behavior2, "behavior");
                return behavior2.d(this.f138121b.f138138h.f77586b);
            case 5:
                Boolean docsAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(docsAvailable, "docsAvailable");
                if (docsAvailable.booleanValue()) {
                    return pfm.m.f235744a;
                }
                com.revolut.feature.kyc.impl.f fVar2 = (com.revolut.feature.kyc.impl.f) this.f138121b.o;
                return fVar2.i.c0(com.revolut.feature.kyc.impl.g.a((wi0.b) ((n1) fVar2.f77668b).y0().get()));
            case 6:
                String behaviorName = (String) obj2;
                Intrinsics.checkNotNullParameter(behaviorName, "behaviorName");
                phm.a aVar2 = (phm.a) this.f138121b.k.get(behaviorName);
                if (aVar2 == null || (aVar = (a) aVar2.get()) == null) {
                    throw new IllegalStateException(p.a.p("Behavior with name ", behaviorName, " is not found"));
                }
                return aVar;
            case 7:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                v vVar2 = this.f138121b;
                d0 d0VarFirstOrError = g1.W(vVar2.i).firstOrError();
                fs5.d dVar = new fs5.d(15, new g(vVar2, 8));
                d0VarFirstOrError.getClass();
                return new pfm.a(d0VarFirstOrError, dVar, 4);
            case 8:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                my8.o oVar = (my8.o) it10.getContent();
                List list = oVar != null ? oVar.f210392a : null;
                if (list == null) {
                    list = f0.f322471a;
                }
                List<my8.l> list2 = list;
                boolean z = list2 instanceof Collection;
                v vVar3 = this.f138121b;
                if (!z || !list2.isEmpty()) {
                    for (my8.l lVar : list2) {
                        DocType docType = lVar.f210384b;
                        DocType.INSTANCE.getClass();
                        if (docType.equals(DocType.f) && com.bumptech.glide.d.x(lVar.f210385c)) {
                            return ((com.revolut.feature.kyc.impl.b) vVar3.i).s3().flatMapCompletable(new fs5.d(16, new g(vVar3, 9)));
                        }
                    }
                }
                return ((com.revolut.feature.kyc.impl.f) vVar3.o).l3();
            case 9:
                wi0.b countryCode = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(countryCode, "homeCountry");
                com.revolut.feature.kyc.impl.b bVar = (com.revolut.feature.kyc.impl.b) this.f138121b.i;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                n1 n1Var = (n1) bVar.e;
                return w.z0(n1Var.A0(), new KycScreenContract$Step.USVisaDisclosure(countryCode, (KycScreenContract$Step) n1Var.A0().get()));
            default:
                a it11 = (a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                v vVar4 = this.f138121b;
                return ((iqi.b) vVar4.f138142n).O().flatMapCompletable(new fs5.d(13, new g(vVar4, 7)));
        }
    }
}
