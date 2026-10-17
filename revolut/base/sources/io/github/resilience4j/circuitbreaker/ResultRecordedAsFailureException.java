package io.github.resilience4j.circuitbreaker;

import j6.a;

/* JADX INFO: loaded from: classes21.dex */
public class ResultRecordedAsFailureException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f162990a;

    public ResultRecordedAsFailureException(String str, Object obj2) {
        super(a.s("CircuitBreaker '", str, "' has recorded '", obj2.toString(), "' as a failure"));
        this.f162990a = obj2;
    }
}
