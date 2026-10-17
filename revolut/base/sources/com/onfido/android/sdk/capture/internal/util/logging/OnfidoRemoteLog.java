package com.onfido.android.sdk.capture.internal.util.logging;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/OnfidoRemoteLog;", "", "level", "", "labels", "", "time", "metadata", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getLabels", "()Ljava/util/List;", "getLevel", "()Ljava/lang/String;", "getMetadata", "()Ljava/util/Map;", "getTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OnfidoRemoteLog {

    @NotNull
    private final List<String> labels;

    @NotNull
    private final String level;

    @NotNull
    private final Map<String, String> metadata;

    @NotNull
    private final String time;

    public OnfidoRemoteLog(@NotNull String level, @NotNull List<String> labels, @NotNull String time, @NotNull Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.level = level;
        this.labels = labels;
        this.time = time;
        this.metadata = metadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnfidoRemoteLog copy$default(OnfidoRemoteLog onfidoRemoteLog, String str, List list, String str2, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = onfidoRemoteLog.level;
        }
        if ((i & 2) != 0) {
            list = onfidoRemoteLog.labels;
        }
        if ((i & 4) != 0) {
            str2 = onfidoRemoteLog.time;
        }
        if ((i & 8) != 0) {
            map = onfidoRemoteLog.metadata;
        }
        return onfidoRemoteLog.copy(str, list, str2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final List<String> component2() {
        return this.labels;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.metadata;
    }

    @NotNull
    public final OnfidoRemoteLog copy(@NotNull String level, @NotNull List<String> labels, @NotNull String time, @NotNull Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new OnfidoRemoteLog(level, labels, time, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnfidoRemoteLog)) {
            return false;
        }
        OnfidoRemoteLog onfidoRemoteLog = (OnfidoRemoteLog) other;
        return Intrinsics.f(this.level, onfidoRemoteLog.level) && Intrinsics.f(this.labels, onfidoRemoteLog.labels) && Intrinsics.f(this.time, onfidoRemoteLog.time) && Intrinsics.f(this.metadata, onfidoRemoteLog.metadata);
    }

    @NotNull
    public final List<String> getLabels() {
        return this.labels;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.metadata.hashCode() + a.c(a.d(this.level.hashCode() * 31, 31, this.labels), 31, this.time);
    }

    @NotNull
    public String toString() {
        return "OnfidoRemoteLog(level=" + this.level + ", labels=" + this.labels + ", time=" + this.time + ", metadata=" + this.metadata + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
