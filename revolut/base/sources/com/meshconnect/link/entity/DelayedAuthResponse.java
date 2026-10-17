package com.meshconnect.link.entity;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meshconnect/link/entity/DelayedAuthResponse;", "", "payload", "Lcom/meshconnect/link/entity/DelayedAuthPayload;", "<init>", "(Lcom/meshconnect/link/entity/DelayedAuthPayload;)V", "getPayload", "()Lcom/meshconnect/link/entity/DelayedAuthPayload;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DelayedAuthResponse {

    @NotNull
    private final DelayedAuthPayload payload;

    public DelayedAuthResponse(@NotNull DelayedAuthPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.payload = payload;
    }

    public static /* synthetic */ DelayedAuthResponse copy$default(DelayedAuthResponse delayedAuthResponse, DelayedAuthPayload delayedAuthPayload, int i, Object obj2) {
        if ((i & 1) != 0) {
            delayedAuthPayload = delayedAuthResponse.payload;
        }
        return delayedAuthResponse.copy(delayedAuthPayload);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DelayedAuthPayload getPayload() {
        return this.payload;
    }

    @NotNull
    public final DelayedAuthResponse copy(@NotNull DelayedAuthPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new DelayedAuthResponse(payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DelayedAuthResponse) && Intrinsics.f(this.payload, ((DelayedAuthResponse) other).payload);
    }

    @NotNull
    public final DelayedAuthPayload getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    @NotNull
    public String toString() {
        return "DelayedAuthResponse(payload=" + this.payload + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
