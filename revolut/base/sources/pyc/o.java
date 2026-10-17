package pyc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe0.a;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f240793b;

    public /* synthetic */ o(t tVar, int i) {
        this.f240792a = i;
        this.f240793b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        efm.r rVarN;
        switch (this.f240792a) {
            case 0:
                od0.i documents = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(documents, "documents");
                t tVar = this.f240793b;
                te0.e eVarF0 = ((h0) tVar.f240799b).F0();
                od0.h hVar = od0.i.Companion;
                List list = (List) documents.f224257a;
                ArrayList arrayList = null;
                if (list != null) {
                    i iVar = tVar.f240799b;
                    List list2 = list;
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((DocumentType) next).f85859a, "OTHER")) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    DocumentType documentType = (DocumentType) next;
                    if (documentType != null) {
                        h0 h0Var = (h0) iVar;
                        DocumentType documentTypeA = DocumentType.a(documentType, (String) ((od0.i) h0Var.H0().get()).g());
                        te0.w.s0(h0Var.E0(), documentTypeA);
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (Object obj3 : list2) {
                            if (Intrinsics.f(((DocumentType) obj3).f85859a, "OTHER")) {
                                obj3 = documentTypeA;
                            }
                            arrayList2.add(obj3);
                        }
                        arrayList = arrayList2;
                    }
                }
                hVar.getClass();
                break;
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                final t tVar2 = this.f240793b;
                i iVar2 = tVar2.f240799b;
                kpj.f fVar = tVar2.d;
                h0 h0Var2 = (h0) iVar2;
                if (((od0.i) h0Var2.B0().get()).d()) {
                    SubmissionEvidence evidence = (SubmissionEvidence) ((od0.i) h0Var2.B0().get()).c();
                    String actionToDoId = (String) h0Var2.w0().get();
                    Map documentsToUpload = (Map) h0Var2.z0().get();
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(evidence, "evidence");
                    Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
                    Intrinsics.checkNotNullParameter(documentsToUpload, "documentsToUpload");
                    rVarN = fVar.p(evidence.f85881a, actionToDoId, documentsToUpload);
                } else {
                    kpj.f fVar2 = tVar2.d;
                    String str = (String) h0Var2.G0().get();
                    IncomeSource incomeSourceA = (IncomeSource) ((od0.i) h0Var2.C0().get()).c();
                    List list3 = (List) ((od0.i) h0Var2.F0().get()).g();
                    if (list3 != null) {
                        incomeSourceA = IncomeSource.a(incomeSourceA, zhm.u.c(list3));
                    }
                    rVarN = fVar2.n(str, incomeSourceA, m70.a.l((String) h0Var2.D0().get()), m70.a.l((String) h0Var2.y0().get()), (Map) h0Var2.z0().get());
                }
                efm.r rVarDoOnNext = rVarN.doOnNext(new pva.c(28, new o(tVar2, 2)));
                Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
                efm.b bVarIgnoreElements = ue0.e.q(rVarDoOnNext, zhm.h0.f322473a).doOnError(new pva.c(29, new o(tVar2, 3))).ignoreElements();
                SubmissionEvidence submissionEvidenceL3 = tVar2.l3();
                final int i = 1;
                efm.b hVar2 = new pfm.h(new kfm.a() { // from class: pyc.q
                    @Override // kfm.a
                    public final void run() {
                        switch (i) {
                            case 0:
                                tVar2.i.onNext(new a.C1250a());
                                break;
                            default:
                                tVar2.k3();
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                if (submissionEvidenceL3 != null) {
                    efm.d0 d0VarFirstOrError = m70.a.g(fVar.l(), null, null, 3).doOnNext(new r(0, new pth.m(tVar2, submissionEvidenceL3, 12))).firstOrError();
                    d0VarFirstOrError.getClass();
                    hVar2 = hVar2.e(new pfm.a(new pfm.h(d0VarFirstOrError, 4), mfm.f.f205044g, 1));
                }
                final int i2 = 0;
                rfm.f0 f0VarF = bVarIgnoreElements.e(hVar2).l(new kfm.a() { // from class: pyc.q
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                tVar2.i.onNext(new a.C1250a());
                                break;
                            default:
                                tVar2.k3();
                                break;
                        }
                    }
                }).f(te0.w.j(Unit.f186387a));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                break;
            case 2:
                Float f = (Float) obj2;
                v60.i iVar3 = this.f240793b.i;
                Intrinsics.h(f);
                iVar3.onNext(new oe0.c(f.floatValue()));
                break;
            default:
                Throwable th10 = (Throwable) obj2;
                v60.i iVar4 = this.f240793b.i;
                Intrinsics.h(th10);
                iVar4.onNext(new oe0.b(th10));
                break;
        }
        return Unit.f186387a;
    }
}
