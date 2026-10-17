package pyc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f240772b;

    public /* synthetic */ d0(g0 g0Var, int i) {
        this.f240771a = i;
        this.f240772b = g0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        j jVar;
        switch (this.f240771a) {
            case 0:
                t tVar = (t) this.f240772b.f240776c;
                if (tVar.l3() != null) {
                    rfm.e eVar = new rfm.e(rfm.h.f253943a, tVar.f240802h.c(Unit.f186387a), 0);
                    Intrinsics.checkNotNullExpressionValue(eVar, "andThen(...)");
                    return eVar;
                }
                h0 h0Var = (h0) tVar.f240799b;
                List list = (List) ((od0.i) h0Var.F0().get()).c();
                DocumentType documentType = (DocumentType) ((od0.i) h0Var.E0().get()).c();
                if (Intrinsics.f(zhm.d0.m0(list), documentType)) {
                    return te0.w.f(j.SUMMARY);
                }
                int iIndexOf = list.indexOf(documentType);
                te0.e eVarE0 = h0Var.E0();
                od0.h hVar = od0.i.Companion;
                Object obj2 = list.get(iIndexOf + 1);
                hVar.getClass();
                eVarE0.set(od0.h.a(obj2));
                return te0.w.f(j.EVIDENCE_LIST);
            case 1:
                boolean zQ3 = ((t) this.f240772b.f240776c).q3();
                j jVar2 = j.OTHER_DOCUMENT;
                j jVar3 = j.EVIDENCE_LIST;
                if (!zQ3) {
                    jVar2 = jVar3;
                }
                return te0.w.f(jVar2);
            default:
                t tVar2 = (t) this.f240772b.f240776c;
                h0 h0Var2 = (h0) tVar2.f240799b;
                if (((Boolean) h0Var2.f240785m.getValue(h0Var2, h0.f240778q[11]).get()).booleanValue()) {
                    jVar = j.SUMMARY;
                } else {
                    h0 h0Var3 = (h0) tVar2.f240799b;
                    List list2 = (List) ((od0.i) h0Var3.F0().get()).c();
                    DocumentType documentType2 = (DocumentType) ((od0.i) h0Var3.E0().get()).c();
                    if (!Intrinsics.f(zhm.d0.b0(list2), documentType2)) {
                        int iIndexOf2 = list2.indexOf(documentType2);
                        te0.e eVarE02 = h0Var3.E0();
                        od0.h hVar2 = od0.i.Companion;
                        Object obj3 = list2.get(iIndexOf2 - 1);
                        hVar2.getClass();
                        eVarE02.set(od0.h.a(obj3));
                        jVar = j.EVIDENCE_LIST;
                    } else if (tVar2.q3()) {
                        jVar = j.OTHER_DOCUMENT;
                    } else if (tVar2.p3()) {
                        jVar = j.DOCUMENT_TYPE;
                    } else {
                        IncomeSource incomeSourceM3 = tVar2.m3();
                        jVar = Intrinsics.f(incomeSourceM3 != null ? incomeSourceM3.f85873a : null, "OTHER_TRANSACTION") ? j.EVIDENCE_DESCRIPTION : j.EVIDENCE_TYPES;
                    }
                }
                return te0.w.f(jVar);
        }
    }
}
