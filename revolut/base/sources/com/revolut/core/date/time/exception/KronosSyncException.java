package com.revolut.core.date.time.exception;

import a10.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/date/time/exception/KronosSyncException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "()Ljava/lang/String;", "core_date_time_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KronosSyncException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f51361b;

    public KronosSyncException(String str, Throwable th10) {
        super(b.t(str, "host", "Error getting synchronized time. host= ", str), th10);
        this.f51360a = str;
        this.f51361b = th10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KronosSyncException)) {
            return false;
        }
        KronosSyncException kronosSyncException = (KronosSyncException) obj2;
        return Intrinsics.f(this.f51360a, kronosSyncException.f51360a) && Intrinsics.f(this.f51361b, kronosSyncException.f51361b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f51361b;
    }

    public final int hashCode() {
        int iHashCode = this.f51360a.hashCode() * 31;
        Throwable th10 = this.f51361b;
        return iHashCode + (th10 == null ? 0 : th10.hashCode());
    }
}
