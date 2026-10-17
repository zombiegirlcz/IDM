package com.revolut.feature.widgets.api.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/widgets/api/exception/WidgetNotAvailableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "()Ljava/lang/String;", "feature_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetNotAvailableException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96347a;

    public WidgetNotAvailableException() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WidgetNotAvailableException) && Intrinsics.f(this.f96347a, ((WidgetNotAvailableException) obj2).f96347a);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f96347a;
    }

    public final int hashCode() {
        String str = this.f96347a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WidgetNotAvailableException(String str, int i) {
        str = (i & 1) != 0 ? null : str;
        super(str, null);
        this.f96347a = str;
    }
}
