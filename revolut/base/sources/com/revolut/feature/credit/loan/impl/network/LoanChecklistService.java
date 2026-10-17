package com.revolut.feature.credit.loan.impl.network;

import efm.b;
import i55.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/network/LoanChecklistService;", "", "Li55/h;", "request", "Lefm/b;", "markStepCompleted", "(Li55/h;)Lefm/b;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanChecklistService {
    @POST("/credit-checklist/step-completion")
    @NotNull
    b markStepCompleted(@Body @NotNull h request);
}
