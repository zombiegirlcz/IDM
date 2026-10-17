package com.revolut.sso.impl.ui.revolut_id.documents;

import com.revolut.sso.impl.ui.revolut_id.documents.DocumentsFlowContract$Step;
import hx7.e;
import oki.h;
import qki.d;
import qpl.c;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements c {
    public final d o = e.b(this, new DocumentsFlowContract$State(0));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f106739p;

    public a() {
        qm2.c cVar = new qm2.c(this, 7);
        this.f106739p = cp5.d.a(this, DocumentsFlowContract$Step.IdentityDocuments.f106738a, f0.f322471a, cVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.o;
    }

    @Override // yki.g
    public final b s() {
        return this.f106739p;
    }
}
