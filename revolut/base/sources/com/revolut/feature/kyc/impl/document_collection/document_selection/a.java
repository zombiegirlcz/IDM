package com.revolut.feature.kyc.impl.document_collection.document_selection;

import a2c.c;
import ap7.k;
import av8.j;
import av8.l;
import av8.p;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import my8.r;
import oki.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements l {

    @NotNull
    private static final p Companion = new p();
    public final DocumentSelectionControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ot8.a f77625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f77626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f77627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f77628s;

    public a(n stateMapper, DocumentSelectionControllerContract$InputData inputData, ot8.a kycDocsInteractor, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycDocsInteractor, "kycDocsInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f77625p = kycDocsInteractor;
        this.f77626q = uriHelper;
        this.f77627r = d.b(this, new j(inputData.f77618a, new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        this.f77628s = e.a(this, new av8.n(this, 0));
    }

    @Override // yji.l
    public final void I1() {
        List list = this.o.f77621g;
        if (list.isEmpty()) {
            I2();
        } else {
            H2(this.f77627r, new a26.j(list, 16));
        }
    }

    public final void I2() {
        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = this.o;
        r rVar = documentSelectionControllerContract$InputData.f77620c;
        Continuation continuation = null;
        yji.l.b1(this, nim.a.u(new c(2, 8, continuation), this.f77625p.a(rVar, zi0.c.B(rVar) ? documentSelectionControllerContract$InputData.f77618a : null, documentSelectionControllerContract$InputData.d, documentSelectionControllerContract$InputData.e, false)), null, new k(this, continuation, 25), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f77628s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f77627r;
    }
}
