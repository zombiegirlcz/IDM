package com.revolut.feature.workflow.engine.rfi.impl.ui.documents;

import amh.w;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import e60.s;
import iuh.e;
import iuh.k;
import kkf.r6;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import li2.f;
import lt.d;
import luh.c;
import luh.i;
import luh.m;
import vkm.j2;
import vkm.q;
import yji.l;
import zth.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends k implements c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f96546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e60.a f96547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f96548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96549t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BaseQuestionScreenContract$InputData inputData, iuh.b answerValidator, luh.k stateMapper, m documentsPopupFactory, e60.a mediaPickerControllerExtension, b interactor) {
        super(inputData, stateMapper, answerValidator);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(answerValidator, "answerValidator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(documentsPopupFactory, "documentsPopupFactory");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f96546q = documentsPopupFactory;
        this.f96547r = mediaPickerControllerExtension;
        this.f96548s = interactor;
        this.f96549t = new com.revolut.kompot.navigable.vc.modal.a(this, new lp2.c(this, 10));
    }

    @Override // yji.l
    public final void I1() {
        String questionId = ((Question.Documents) ((e) ((j2) this.f168616p.f22677a).getValue()).f168606a).f105611a;
        huh.m mVar = (huh.m) this.f96548s;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Continuation continuation = null;
        l.a1(this, q.q(new ahd.c(mVar.f155668c, questionId, 3)), null, null, new i(this, null, 1), 3);
        s sVar = (s) this.f96547r;
        l.a1(this, new d(rd0.e.b(sVar.f122868g), 2), null, null, new i(this, null, 0), 3);
        l.a1(this, new w(q.Q(new r6(new r6(new d(rd0.e.b(sVar.f122868g), 3), 18), 17), new f(continuation, this, 12)), 17), null, null, new lpl.c(this, continuation, 7), 3);
    }
}
