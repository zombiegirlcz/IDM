package kj0;

import ch.qos.logback.core.net.SyslogConstants;
import java.time.Duration;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f184275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f184276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f184277c;

    public o() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f184275a, oVar.f184275a) && Intrinsics.f(this.f184276b, oVar.f184276b) && Intrinsics.f(this.f184277c, oVar.f184277c);
    }

    public final int hashCode() {
        return this.f184277c.hashCode() + ((this.f184276b.hashCode() + (this.f184275a.hashCode() * 31)) * 31);
    }

    public o(int i) {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        b globalCircuitBreakerProperties = new b(SyslogConstants.LOG_CLOCK, 10, durationOfSeconds);
        Duration durationOfSeconds2 = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "ofSeconds(...)");
        p serviceConfig = new p(new b(30, 2, durationOfSeconds2), v.k("user", "trading"));
        List domains = v.k("revolut.com", "revolut.codes");
        Intrinsics.checkNotNullParameter(globalCircuitBreakerProperties, "globalCircuitBreakerProperties");
        Intrinsics.checkNotNullParameter(serviceConfig, "serviceConfig");
        Intrinsics.checkNotNullParameter(domains, "domains");
        this.f184275a = globalCircuitBreakerProperties;
        this.f184276b = serviceConfig;
        this.f184277c = domains;
    }
}
