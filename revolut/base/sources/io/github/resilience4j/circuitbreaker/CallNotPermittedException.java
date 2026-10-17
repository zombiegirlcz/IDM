package io.github.resilience4j.circuitbreaker;

import lbm.f;
import lbm.j;

/* JADX INFO: loaded from: classes13.dex */
public class CallNotPermittedException extends RuntimeException {
    public static CallNotPermittedException a(j jVar) {
        return new CallNotPermittedException("CircuitBreaker '" + jVar.f193725a + "' is " + ((f) jVar.f193726b.get()).getState() + " and does not permit further calls", null, false, jVar.f193727c.k);
    }
}
