package com.revolut.domain.models.externalcards;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/externalcards/CrossProfileStatus;", "", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "RESTRICTED", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrossProfileStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CrossProfileStatus[] $VALUES;
    public static final CrossProfileStatus AVAILABLE = new CrossProfileStatus("AVAILABLE", 0);
    public static final CrossProfileStatus RESTRICTED = new CrossProfileStatus("RESTRICTED", 1);

    private static final /* synthetic */ CrossProfileStatus[] $values() {
        return new CrossProfileStatus[]{AVAILABLE, RESTRICTED};
    }

    static {
        CrossProfileStatus[] crossProfileStatusArr$values = $values();
        $VALUES = crossProfileStatusArr$values;
        $ENTRIES = s.n(crossProfileStatusArr$values);
    }

    private CrossProfileStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CrossProfileStatus valueOf(String str) {
        return (CrossProfileStatus) Enum.valueOf(CrossProfileStatus.class, str);
    }

    public static CrossProfileStatus[] values() {
        return (CrossProfileStatus[]) $VALUES.clone();
    }
}
