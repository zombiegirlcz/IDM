package pyc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocument;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import tof.r9;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends ori.a implements ori.b, f {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f240799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f240800c;
    public final kpj.f d;
    public final ks0.n e;
    public final kza.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zq.a f240801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v60.g f240802h;
    public final v60.i i;

    public t(i state, com.revolut.domain.interactors.transactions.a transactionsInteractor, kpj.f sotInteractor, ks0.n instructionsInteractor, kza.a remoteStoriesInteractor, zq.a sotTransactionsDelegate, ifm.b flowDisposable) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(sotInteractor, "sotInteractor");
        Intrinsics.checkNotNullParameter(instructionsInteractor, "instructionsInteractor");
        Intrinsics.checkNotNullParameter(remoteStoriesInteractor, "remoteStoriesInteractor");
        Intrinsics.checkNotNullParameter(sotTransactionsDelegate, "sotTransactionsDelegate");
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        this.f240799b = state;
        this.f240800c = transactionsInteractor;
        this.d = sotInteractor;
        this.e = instructionsInteractor;
        this.f = remoteStoriesInteractor;
        this.f240801g = sotTransactionsDelegate;
        this.f240802h = new v60.g(flowDisposable, new o(this, 1));
        this.i = new v60.i();
    }

    @Override // ori.b
    public final void c1(Object obj2) {
        j step = (j) obj2;
        Intrinsics.checkNotNullParameter(step, "step");
        ((h0) this.f240799b).x0().set(step);
    }

    @Override // ori.b
    public final Object getStep() {
        return (j) te0.w.O(((h0) this.f240799b).x0());
    }

    public final void j3(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        h0 h0Var = (h0) this.f240799b;
        te0.e eVarZ0 = h0Var.z0();
        Map map = (Map) h0Var.z0().get();
        DocumentType documentTypeN3 = n3();
        Object obj2 = map.get(documentTypeN3);
        if (obj2 == null) {
            obj2 = zhm.f0.f322471a;
        }
        eVarZ0.set(r0.q(map, new Pair(documentTypeN3, zhm.d0.F0(file, (Collection) obj2))));
    }

    public final void k3() {
        h0 h0Var = (h0) this.f240799b;
        h0Var.z0().set(r0.g());
        te0.e eVarY0 = h0Var.y0();
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        eVarY0.set("");
        te0.e eVarD0 = h0Var.D0();
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        eVarD0.set("");
        te0.e eVarA0 = h0Var.A0();
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        eVarA0.set("");
        te0.e eVarC0 = h0Var.C0();
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        eVarC0.set(iVar);
        h0Var.B0().set(iVar);
        te0.e eVarW0 = h0Var.w0();
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        eVarW0.set("");
        h0Var.F0().set(iVar);
        h0Var.E0().set(iVar);
        h0Var.H0().set(iVar);
    }

    public final SubmissionEvidence l3() {
        return (SubmissionEvidence) ((od0.i) ((h0) this.f240799b).B0().get()).f224257a;
    }

    public final IncomeSource m3() {
        return (IncomeSource) ((od0.i) ((h0) this.f240799b).C0().get()).f224257a;
    }

    public final DocumentType n3() {
        return (DocumentType) ((od0.i) ((h0) this.f240799b).E0().get()).c();
    }

    public final EvidenceDocument o3() {
        SubmissionEvidence submissionEvidenceL3 = l3();
        Object obj2 = null;
        if (submissionEvidenceL3 == null) {
            return null;
        }
        Iterator it8 = submissionEvidenceL3.f85885h.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((EvidenceDocument) next).f85866b.f85859a, n3().f85859a)) {
                obj2 = next;
                break;
            }
        }
        return (EvidenceDocument) obj2;
    }

    public final boolean p3() {
        List list;
        IncomeSource incomeSource = (IncomeSource) ((od0.i) ((h0) this.f240799b).C0().get()).g();
        return (incomeSource == null || (list = incomeSource.e) == null || list.size() <= 1) ? false : true;
    }

    public final boolean q3() {
        DocumentType documentType;
        List list = (List) ((od0.i) ((h0) this.f240799b).F0().get()).g();
        return Intrinsics.f((list == null || (documentType = (DocumentType) zhm.d0.d0(list)) == null) ? null : documentType.f85859a, "OTHER");
    }

    public final boolean r3() {
        h0 h0Var = (h0) this.f240799b;
        return ((Boolean) h0Var.i.getValue(h0Var, h0.f240778q[7]).get()).booleanValue();
    }

    public final efm.r s3() {
        return nim.a.w(com.revolut.domain.interactors.transactions.a.d(this.f240800c, new r9((String) ((h0) this.f240799b).G0().get()), null, null, null, null, 30), new px0.a(28));
    }

    public final efm.r t3() {
        h0 h0Var = (h0) this.f240799b;
        te0.e eVarZ0 = h0Var.z0();
        te0.s sVar = te0.s.f270018a;
        efm.r rVarC = eVarZ0.c(sVar);
        efm.r map = h0Var.E0().c(sVar).filter(new r(2, new p(3))).map(new pva.c(22, new px0.a(26)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = te0.w.l(rVarC, map).map(new pva.c(23, new px0.a(27)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    public final efm.r u3() {
        return ((h0) this.f240799b).x0().c(te0.s.f270018a);
    }

    public final efm.b v3(IncomeSource incomeSource, List documentGroup) {
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        Intrinsics.checkNotNullParameter(documentGroup, "documentGroup");
        efm.b bVarFlatMapCompletable = efm.r.fromIterable(documentGroup).flatMapCompletable(new pva.c(27, new pth.m(this, incomeSource, 11)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        return bVarFlatMapCompletable;
    }

    public final void w3(IncomeSource incomeSource) {
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        h0 h0Var = (h0) this.f240799b;
        te0.e eVarC0 = h0Var.C0();
        od0.i.Companion.getClass();
        eVarC0.set(od0.h.a(incomeSource));
        if (incomeSource.e.size() == 1) {
            List list = (List) zhm.d0.b0(incomeSource.e);
            h0Var.F0().set(od0.h.a(list));
            h0Var.E0().set(od0.h.a(zhm.d0.b0(list)));
        }
    }
}
