package com.revolut.feature.insurance_common.ui.screen.documents;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData;
import jki.g;
import jki.i;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import up2.q;
import ur7.c;
import ur7.d;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DocumentListScreenContract$InputData f75726p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final or7.a f75727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f75728r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p stateMapper, DocumentListScreenContract$InputData inputData, or7.a insuranceCommonRepository) {
        c cVar;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insuranceCommonRepository, "insuranceCommonRepository");
        this.f75726p = inputData;
        this.f75727q = insuranceCommonRepository;
        if (inputData instanceof DocumentListScreenContract$InputData.Policy) {
            cVar = new c(new Data(null, null, true, 3, null));
        } else {
            if (!(inputData instanceof DocumentListScreenContract$InputData.Preloaded)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new c(new Data(((DocumentListScreenContract$InputData.Preloaded) inputData).d, null, false, 6, null));
        }
        this.f75728r = cVar;
    }

    @Override // yji.l
    public final void I1() {
        DocumentListScreenContract$InputData documentListScreenContract$InputData = this.f75726p;
        if (documentListScreenContract$InputData instanceof DocumentListScreenContract$InputData.Policy) {
            String policyId = ((DocumentListScreenContract$InputData.Policy) documentListScreenContract$InputData).d;
            or7.c cVar = (or7.c) this.f75727q;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            l.a1(this, cVar.f.c(policyId, true), null, null, new q(this, null, 3), 3);
        }
    }

    @Override // jki.g
    public final i r2() {
        return this.f75728r;
    }
}
