package com.revolut.feature.junior_profile.impl.models.domain.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/models/domain/exception/JuniorProfileNotFoundException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorProfileNotFoundException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77132a;

    public JuniorProfileNotFoundException(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f77132a = message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f77132a;
    }
}
