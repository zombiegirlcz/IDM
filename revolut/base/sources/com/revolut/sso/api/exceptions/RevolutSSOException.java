package com.revolut.sso.api.exceptions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/exceptions/RevolutSSOException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "IllegalState", "Lcom/revolut/sso/api/exceptions/RevolutSSOException$IllegalState;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevolutSSOException extends RuntimeException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/sso/api/exceptions/RevolutSSOException$IllegalState;", "Lcom/revolut/sso/api/exceptions/RevolutSSOException;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IllegalState extends RevolutSSOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105837a;

        public IllegalState(String str) {
            super(0);
            this.f105837a = str;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f105837a;
        }
    }

    public /* synthetic */ RevolutSSOException(int i) {
        this();
    }

    private RevolutSSOException() {
    }
}
