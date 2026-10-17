package com.revolut.feature.shared.signin.api.models;

import a0.d;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/signin/api/models/SignInNotAllowedDueToAgeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_shared_signin_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignInNotAllowedDueToAgeException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86688a;

    public SignInNotAllowedDueToAgeException(int i) {
        super(d.n("Sign in not allowed as the person is too young, graduation age: ", i));
        this.f86688a = i;
    }
}
