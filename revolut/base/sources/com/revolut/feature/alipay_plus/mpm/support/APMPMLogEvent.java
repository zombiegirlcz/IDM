package com.revolut.feature.alipay_plus.mpm.support;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogEvent;", "", "level", "Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogLevel;", "category", "Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogCategory;", "name", "", "message", "metadata", "", "<init>", "(Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogLevel;Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogCategory;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getLevel", "()Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogLevel;", "getCategory", "()Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogCategory;", "getName", "()Ljava/lang/String;", "getMessage", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMLogEvent {

    @NotNull
    private final APMPMLogCategory category;

    @NotNull
    private final APMPMLogLevel level;

    @NotNull
    private final String message;

    @NotNull
    private final Map<String, String> metadata;

    @NotNull
    private final String name;

    public APMPMLogEvent(@NotNull APMPMLogLevel level, @NotNull APMPMLogCategory category, @NotNull String name, @NotNull String message, @NotNull Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.level = level;
        this.category = category;
        this.name = name;
        this.message = message;
        this.metadata = metadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APMPMLogEvent copy$default(APMPMLogEvent aPMPMLogEvent, APMPMLogLevel aPMPMLogLevel, APMPMLogCategory aPMPMLogCategory, String str, String str2, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            aPMPMLogLevel = aPMPMLogEvent.level;
        }
        if ((i & 2) != 0) {
            aPMPMLogCategory = aPMPMLogEvent.category;
        }
        if ((i & 4) != 0) {
            str = aPMPMLogEvent.name;
        }
        if ((i & 8) != 0) {
            str2 = aPMPMLogEvent.message;
        }
        if ((i & 16) != 0) {
            map = aPMPMLogEvent.metadata;
        }
        Map map2 = map;
        String str3 = str;
        return aPMPMLogEvent.copy(aPMPMLogLevel, aPMPMLogCategory, str3, str2, map2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final APMPMLogLevel getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final APMPMLogCategory getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Map<String, String> component5() {
        return this.metadata;
    }

    @NotNull
    public final APMPMLogEvent copy(@NotNull APMPMLogLevel level, @NotNull APMPMLogCategory category, @NotNull String name, @NotNull String message, @NotNull Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new APMPMLogEvent(level, category, name, message, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMLogEvent)) {
            return false;
        }
        APMPMLogEvent aPMPMLogEvent = (APMPMLogEvent) other;
        return this.level == aPMPMLogEvent.level && this.category == aPMPMLogEvent.category && Intrinsics.f(this.name, aPMPMLogEvent.name) && Intrinsics.f(this.message, aPMPMLogEvent.message) && Intrinsics.f(this.metadata, aPMPMLogEvent.metadata);
    }

    @NotNull
    public final APMPMLogCategory getCategory() {
        return this.category;
    }

    @NotNull
    public final APMPMLogLevel getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.metadata.hashCode() + a.c(a.c((this.category.hashCode() + (this.level.hashCode() * 31)) * 31, 31, this.name), 31, this.message);
    }

    public /* synthetic */ APMPMLogEvent(APMPMLogLevel aPMPMLogLevel, APMPMLogCategory aPMPMLogCategory, String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aPMPMLogLevel, aPMPMLogCategory, str, str2, (i & 16) != 0 ? r0.g() : map);
    }
}
