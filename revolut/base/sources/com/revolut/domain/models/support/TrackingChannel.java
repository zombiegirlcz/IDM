package com.revolut.domain.models.support;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/domain/models/support/TrackingChannel;", "", "<init>", "(Ljava/lang/String;I)V", "APP", "SMS", "NONE", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackingChannel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrackingChannel[] $VALUES;
    public static final TrackingChannel APP = new TrackingChannel("APP", 0);
    public static final TrackingChannel SMS = new TrackingChannel("SMS", 1);
    public static final TrackingChannel NONE = new TrackingChannel("NONE", 2);

    private static final /* synthetic */ TrackingChannel[] $values() {
        return new TrackingChannel[]{APP, SMS, NONE};
    }

    static {
        TrackingChannel[] trackingChannelArr$values = $values();
        $VALUES = trackingChannelArr$values;
        $ENTRIES = s.n(trackingChannelArr$values);
    }

    private TrackingChannel(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TrackingChannel valueOf(String str) {
        return (TrackingChannel) Enum.valueOf(TrackingChannel.class, str);
    }

    public static TrackingChannel[] values() {
        return (TrackingChannel[]) $VALUES.clone();
    }
}
