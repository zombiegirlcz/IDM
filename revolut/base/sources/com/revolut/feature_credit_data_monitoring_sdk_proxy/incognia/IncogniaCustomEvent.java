package com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\bR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/incognia/IncogniaCustomEvent;", "", "eventName", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/incognia/IncogniaCustomEvent;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getEventName", "Ljava/util/Map;", "getParameters", "feature_credit_data_monitoring_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncogniaCustomEvent {

    @NotNull
    private final String eventName;

    @NotNull
    private final Map<String, String> parameters;

    public IncogniaCustomEvent(@NotNull String eventName, @NotNull Map<String, String> parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.eventName = eventName;
        this.parameters = parameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IncogniaCustomEvent copy$default(IncogniaCustomEvent incogniaCustomEvent, String str, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = incogniaCustomEvent.eventName;
        }
        if ((i & 2) != 0) {
            map = incogniaCustomEvent.parameters;
        }
        return incogniaCustomEvent.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.parameters;
    }

    @NotNull
    public final IncogniaCustomEvent copy(@NotNull String eventName, @NotNull Map<String, String> parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new IncogniaCustomEvent(eventName, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncogniaCustomEvent)) {
            return false;
        }
        IncogniaCustomEvent incogniaCustomEvent = (IncogniaCustomEvent) other;
        return Intrinsics.f(this.eventName, incogniaCustomEvent.eventName) && Intrinsics.f(this.parameters, incogniaCustomEvent.parameters);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.eventName.hashCode() * 31);
    }
}
