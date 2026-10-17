package uyc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocument;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import com.revolut.feature.selfserve.sot.impl.ui.flow.DocumentUpload;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import ip0.u00;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tjf.k0;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends oki.h implements k {
    public final SotFlowContract$Step.EvidenceList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f284154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f284155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f284156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f284157s;

    /* JADX WARN: Multi-variable type inference failed */
    public w(SotFlowContract$Step.EvidenceList step, qee.s mapper, e60.a mediaPickerControllerExtension) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        this.o = step;
        this.f284154p = mediaPickerControllerExtension;
        DocumentType documentType = step.f85924a;
        SubmissionEvidence submissionEvidence = step.f85925b;
        String str = step.f85926c;
        f0 f0Var = f0.f322471a;
        Object obj2 = null;
        if (submissionEvidence != null) {
            Iterator it8 = submissionEvidence.f85885h.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((EvidenceDocument) next).f85866b.f85859a, this.o.f85924a.f85859a)) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (EvidenceDocument) obj2;
        }
        this.f284157s = mra.d.b(this, new j(documentType, submissionEvidence, str, f0Var, obj2), mapper, null, false, 12);
    }

    public final void I2() {
        cli.y yVar = this.f284157s;
        DocumentType documentType = ((j) ((j2) yVar.f22677a).getValue()).f284137a;
        j2 j2Var = (j2) yVar.f22677a;
        List list = ((j) j2Var.getValue()).d;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((File) it8.next()).getAbsolutePath());
        }
        C2(new n(zhm.u.c(new DocumentUpload(documentType, arrayList)), ((j) j2Var.getValue()).f284139c));
    }

    public final void J2() {
        u00 u00Var = u00.BACK;
        e60.o.Companion.getClass();
        ((e60.s) this.f284154p).T(new e60.i(null, null, null, true, 0, 0, zhm.d0.E0(e60.b.f122837b, e60.b.f122838c), null, false, u00Var, null, 15799));
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.f284155q) {
            return;
        }
        this.f284155q = true;
        e60.s sVar = (e60.s) this.f284154p;
        Continuation continuation = null;
        yji.l.a1(this, new urd.n(rd0.e.b(sVar.f122868g), 19), null, null, new up2.q(this, continuation, 14), 3);
        yji.l.a1(this, new k0(vkm.q.Q(new rv6.e(new rv6.e(new urd.n(rd0.e.b(sVar.f122868g), 20), 27), 26), new uec.d(continuation, this, 12)), 2), null, null, new rp1.c(2, 13, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f284157s;
    }
}
