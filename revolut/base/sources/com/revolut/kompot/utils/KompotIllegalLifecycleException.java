package com.revolut.kompot.utils;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/utils/KompotIllegalLifecycleException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KompotIllegalLifecycleException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98445a;

    public KompotIllegalLifecycleException(String str) {
        this.f98445a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f98445a;
    }
}
