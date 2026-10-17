package com.revolut.domain.models.topup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revolut/domain/models/topup/AlternativeTopUpType;", "", "method", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "IDEAL", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AlternativeTopUpType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlternativeTopUpType[] $VALUES;
    public static final AlternativeTopUpType IDEAL = new AlternativeTopUpType("IDEAL", 0, "ideal");

    @NotNull
    private final String method;

    private static final /* synthetic */ AlternativeTopUpType[] $values() {
        return new AlternativeTopUpType[]{IDEAL};
    }

    static {
        AlternativeTopUpType[] alternativeTopUpTypeArr$values = $values();
        $VALUES = alternativeTopUpTypeArr$values;
        $ENTRIES = s.n(alternativeTopUpTypeArr$values);
    }

    private AlternativeTopUpType(String str, int i, String str2) {
        this.method = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AlternativeTopUpType valueOf(String str) {
        return (AlternativeTopUpType) Enum.valueOf(AlternativeTopUpType.class, str);
    }

    public static AlternativeTopUpType[] values() {
        return (AlternativeTopUpType[]) $VALUES.clone();
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }
}
