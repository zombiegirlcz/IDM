package com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails;

import ang.f;
import b55.b;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m35.c;
import oki.h;
import r35.e;
import y45.i;
import y45.k;
import y4f.o;
import y65.d;
import y65.g;
import y65.q;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements g {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f15.a f70433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f70434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f70435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f70436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f70437t;
    public final c u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ky4.e f70438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f70439x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70440y;

    public a(b loanHelpRequestProvider, f15.a getCreditHelpExtension, i loanProductInteractor, k loanStatementDocumentInteractor, f userInteractor, e repaymentNavigationHelper, c loanAutopayAccountMapper, LoanInstalmentDetailsScreenContract$InputData inputData, q stateMapper) {
        String str;
        d dVar;
        Intrinsics.checkNotNullParameter(loanHelpRequestProvider, "loanHelpRequestProvider");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanStatementDocumentInteractor, "loanStatementDocumentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(repaymentNavigationHelper, "repaymentNavigationHelper");
        Intrinsics.checkNotNullParameter(loanAutopayAccountMapper, "loanAutopayAccountMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = loanHelpRequestProvider;
        this.f70433p = getCreditHelpExtension;
        this.f70434q = loanProductInteractor;
        this.f70435r = loanStatementDocumentInteractor;
        this.f70436s = userInteractor;
        this.f70437t = repaymentNavigationHelper;
        this.u = loanAutopayAccountMapper;
        boolean z = inputData instanceof LoanInstalmentDetailsScreenContract$InputData.LoadContent;
        if (z) {
            str = ((LoanInstalmentDetailsScreenContract$InputData.LoadContent) inputData).f70424a;
        } else {
            if (!(inputData instanceof LoanInstalmentDetailsScreenContract$InputData.PreloadedContent)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((LoanInstalmentDetailsScreenContract$InputData.PreloadedContent) inputData).f70426a.f70144a.f70108a;
        }
        this.v = str;
        this.f70438w = new ky4.e(0);
        if (z) {
            dVar = new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null);
        } else {
            if (!(inputData instanceof LoanInstalmentDetailsScreenContract$InputData.PreloadedContent)) {
                throw new NoWhenBranchMatchedException();
            }
            LoanInstalmentDetailsScreenContract$InputData.PreloadedContent preloadedContent = (LoanInstalmentDetailsScreenContract$InputData.PreloadedContent) inputData;
            dVar = new d(zi0.c.P(preloadedContent.f70426a, false, null, 3), zi0.c.P(preloadedContent.f70427b, false, null, 3), null);
        }
        this.f70439x = mra.d.b(this, dVar, stateMapper, null, false, 12);
        this.f70440y = hx7.e.a(this, new xwd.a(this, 24));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, vkm.q.Q(this.f70438w, new o(null, this, 4)), null, null, new wh3.h(this, (Continuation) null, 23), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70440y;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f70439x;
    }
}
