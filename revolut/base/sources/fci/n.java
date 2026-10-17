package fci;

import com.revolut.data.model.Data;
import com.revolut.feature_retail_user_declarations.purpose.model.PurposeOfAccountProductType;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f133795w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f133795w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f133795w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            default:
                n nVar2 = new n(this.f133795w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((wi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        go.g gVar;
        Object eVar;
        ?? arrayList;
        int i = this.u;
        Continuation continuation = null;
        o oVar = this.f133795w;
        switch (i) {
            case 0:
                wi0.b countryCode = (wi0.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aci.a aVar2 = oVar.f133796p;
                PurposeOfAccountProductType purposeOfAccountProductType = oVar.o.f97720b;
                aci.h hVar = (aci.h) aVar2;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(purposeOfAccountProductType, "purposeOfAccountProductType");
                if (Intrinsics.f(purposeOfAccountProductType, PurposeOfAccountProductType.Personal.f97718a)) {
                    return new v1(new aci.e(new v1(new a1a.b(new v1(new aci.e(rd0.e.d(rd0.e.b(((pfk.p0) hVar.f3156a).f235674l.f(Unit.f186387a, false)), zhm.h0.f322473a), new a1a.b(hVar, countryCode, continuation, 16), (Continuation) null)), continuation, aci.h.a(countryCode), 17)), new a26.q(hVar, countryCode, continuation, 8), (Continuation) null));
                }
                if (Intrinsics.f(purposeOfAccountProductType, PurposeOfAccountProductType.Joint.f97716a)) {
                    gVar = new go.g(zi0.c.P(new cci.d(aci.h.f3155h), false, null, 3), 2);
                } else {
                    if (!Intrinsics.f(purposeOfAccountProductType, PurposeOfAccountProductType.MultiIbanEur.f97717a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = new go.g(zi0.c.P(new cci.e(aci.h.i), false, null, 3), 2);
                }
                return gVar;
            default:
                Data originalData = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = oVar.f133800t;
                zjh.j jVar = oVar.f133798r;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(originalData, "originalData");
                if (Intrinsics.f(((PurposeOfAccountScreenContract$InputData) jVar.f322839a).f, Boolean.TRUE)) {
                    try {
                        Object content = originalData.getContent();
                        if (content != null) {
                            cci.f fVar = (cci.f) content;
                            if (fVar instanceof cci.a) {
                                List list = ((cci.a) fVar).f23110a;
                                ArrayList purposes = new ArrayList();
                                for (Object obj3 : list) {
                                    if (zjh.j.q((cci.g) obj3)) {
                                        purposes.add(obj3);
                                    }
                                }
                                Intrinsics.checkNotNullParameter(purposes, "purposes");
                                eVar = new cci.a(purposes);
                            } else if (fVar instanceof cci.b) {
                                List list2 = ((cci.b) fVar).f23111a;
                                ArrayList purposes2 = new ArrayList();
                                for (Object obj4 : list2) {
                                    if (zjh.j.q((cci.g) obj4)) {
                                        purposes2.add(obj4);
                                    }
                                }
                                Intrinsics.checkNotNullParameter(purposes2, "purposes");
                                eVar = new cci.b(purposes2);
                            } else if (fVar instanceof cci.c) {
                                List list3 = ((cci.c) fVar).f23112a;
                                ArrayList purposes3 = new ArrayList();
                                for (Object obj5 : list3) {
                                    if (zjh.j.q((cci.g) obj5)) {
                                        purposes3.add(obj5);
                                    }
                                }
                                Intrinsics.checkNotNullParameter(purposes3, "purposes");
                                eVar = new cci.c(purposes3);
                            } else if (fVar instanceof cci.d) {
                                List list4 = ((cci.d) fVar).f23113a;
                                ArrayList purposes4 = new ArrayList();
                                for (Object obj6 : list4) {
                                    if (zjh.j.q((cci.g) obj6)) {
                                        purposes4.add(obj6);
                                    }
                                }
                                Intrinsics.checkNotNullParameter(purposes4, "purposes");
                                eVar = new cci.d(purposes4);
                            } else {
                                if (!(fVar instanceof cci.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                List list5 = ((cci.e) fVar).f23114a;
                                ArrayList purposes5 = new ArrayList();
                                for (Object obj7 : list5) {
                                    if (zjh.j.q((cci.g) obj7)) {
                                        purposes5.add(obj7);
                                    }
                                }
                                Intrinsics.checkNotNullParameter(purposes5, "purposes");
                                eVar = new cci.e(purposes5);
                            }
                        } else {
                            eVar = null;
                        }
                        originalData = new Data(eVar, originalData.getError(), originalData.getLoading());
                    } catch (Throwable th10) {
                        originalData = new Data(null, th10, originalData.getLoading());
                    }
                }
                cci.f fVar2 = (cci.f) originalData.getContent();
                if (fVar2 != null) {
                    List listA = fVar2.a();
                    List list6 = ((g) ((j2) yVar.f22677a).getValue()).f133775b;
                    arrayList = new ArrayList();
                    for (Object obj8 : list6) {
                        if (listA.contains((cci.g) obj8)) {
                            arrayList.add(obj8);
                        }
                    }
                } else {
                    arrayList = ((g) ((j2) yVar.f22677a).getValue()).f133775b;
                }
                oVar.H2(yVar, new b8d.u(1, originalData, (List) arrayList));
                return Unit.f186387a;
        }
    }
}
