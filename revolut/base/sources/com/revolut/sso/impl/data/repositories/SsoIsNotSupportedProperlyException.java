package com.revolut.sso.impl.data.repositories;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/data/repositories/SsoIsNotSupportedProperlyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SsoIsNotSupportedProperlyException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106028a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SsoIsNotSupportedProperlyException(Throwable causeThrowable) {
        super(causeThrowable);
        Intrinsics.checkNotNullParameter(causeThrowable, "causeThrowable");
        this.f106028a = "Current user can't use SSO benefits\nSee exception's documentation for more details";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f106028a;
    }
}
