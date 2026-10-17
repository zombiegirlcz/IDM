package com.revolut.nfc_reader_documents.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/nfc_reader_documents/base/NfcException;", "", "nfc_reader_documents_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NfcException extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f98481b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcException(String str, Throwable cause) {
        super(str, cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f98480a = str;
        this.f98481b = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f98481b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f98480a;
    }
}
