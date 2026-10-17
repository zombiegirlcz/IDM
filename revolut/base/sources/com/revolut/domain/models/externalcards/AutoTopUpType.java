package com.revolut.domain.models.externalcards;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/domain/models/externalcards/AutoTopUpType;", "", "text", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getText", "()Ljava/lang/String;", "ENABLED", "AVAILABLE", "UNAVAILABLE", "UNKNOWN", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoTopUpType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AutoTopUpType[] $VALUES;

    @NotNull
    private final String text;
    public static final AutoTopUpType ENABLED = new AutoTopUpType("ENABLED", 0, "ENABLED");
    public static final AutoTopUpType AVAILABLE = new AutoTopUpType("AVAILABLE", 1, "AVAILABLE");
    public static final AutoTopUpType UNAVAILABLE = new AutoTopUpType("UNAVAILABLE", 2, "UNAVAILABLE");
    public static final AutoTopUpType UNKNOWN = new AutoTopUpType("UNKNOWN", 3, "UNKNOWN");

    private static final /* synthetic */ AutoTopUpType[] $values() {
        return new AutoTopUpType[]{ENABLED, AVAILABLE, UNAVAILABLE, UNKNOWN};
    }

    static {
        AutoTopUpType[] autoTopUpTypeArr$values = $values();
        $VALUES = autoTopUpTypeArr$values;
        $ENTRIES = s.n(autoTopUpTypeArr$values);
    }

    private AutoTopUpType(String str, int i, String str2) {
        this.text = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AutoTopUpType valueOf(String str) {
        return (AutoTopUpType) Enum.valueOf(AutoTopUpType.class, str);
    }

    public static AutoTopUpType[] values() {
        return (AutoTopUpType[]) $VALUES.clone();
    }

    @NotNull
    public final String getText() {
        return this.text;
    }
}
