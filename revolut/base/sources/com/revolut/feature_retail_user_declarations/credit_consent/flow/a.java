package com.revolut.feature_retail_user_declarations.credit_consent.flow;

import com.revolut.feature_retail_user_declarations.credit_consent.CreditConsentInputData;
import com.revolut.feature_retail_user_declarations.credit_consent.flow.CreditConsentFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import lai.b;
import lai.c;
import lai.f;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {

    @NotNull
    public static final c Companion = new c();
    public final CreditConsentInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f97543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ivh.c f97544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f97545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f97546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f97547t;

    public a(CreditConsentInputData inputData, jvh.a workflowInteractor, ivh.c workflowsErrorHandlerExtension, mre.c termsNavigationFactory, f promptProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowsErrorHandlerExtension, "workflowsErrorHandlerExtension");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(promptProvider, "promptProvider");
        this.o = inputData;
        this.f97543p = workflowInteractor;
        this.f97544q = workflowsErrorHandlerExtension;
        this.f97545r = termsNavigationFactory;
        this.f97546s = promptProvider;
        v vVar = new v(this, 25);
        this.f97547t = d.a(this, CreditConsentFlowContract$Step.ApplicationConsent.f97542a, f0.f322471a, vVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97547t;
    }
}
