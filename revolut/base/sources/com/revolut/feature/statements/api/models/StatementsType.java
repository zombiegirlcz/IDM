package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/statements/api/models/StatementsType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OFFICIAL", "UNIFIED", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatementsType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StatementsType[] $VALUES;
    public static final StatementsType OFFICIAL = new StatementsType("OFFICIAL", 0, "OFFICIAL");
    public static final StatementsType UNIFIED = new StatementsType("UNIFIED", 1, "UNIFIED");

    @NotNull
    private final String value;

    private static final /* synthetic */ StatementsType[] $values() {
        return new StatementsType[]{OFFICIAL, UNIFIED};
    }

    static {
        StatementsType[] statementsTypeArr$values = $values();
        $VALUES = statementsTypeArr$values;
        $ENTRIES = s.n(statementsTypeArr$values);
    }

    private StatementsType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static StatementsType valueOf(String str) {
        return (StatementsType) Enum.valueOf(StatementsType.class, str);
    }

    public static StatementsType[] values() {
        return (StatementsType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
