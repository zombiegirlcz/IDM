package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/statements/api/models/ContractSummaryType;", "", "<init>", "(Ljava/lang/String;I)V", "PERSONAL_CURRENT", "JOINT_CURRENT", "ELECTRONIC_BANKING", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContractSummaryType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContractSummaryType[] $VALUES;
    public static final ContractSummaryType PERSONAL_CURRENT = new ContractSummaryType("PERSONAL_CURRENT", 0);
    public static final ContractSummaryType JOINT_CURRENT = new ContractSummaryType("JOINT_CURRENT", 1);
    public static final ContractSummaryType ELECTRONIC_BANKING = new ContractSummaryType("ELECTRONIC_BANKING", 2);

    private static final /* synthetic */ ContractSummaryType[] $values() {
        return new ContractSummaryType[]{PERSONAL_CURRENT, JOINT_CURRENT, ELECTRONIC_BANKING};
    }

    static {
        ContractSummaryType[] contractSummaryTypeArr$values = $values();
        $VALUES = contractSummaryTypeArr$values;
        $ENTRIES = s.n(contractSummaryTypeArr$values);
    }

    private ContractSummaryType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ContractSummaryType valueOf(String str) {
        return (ContractSummaryType) Enum.valueOf(ContractSummaryType.class, str);
    }

    public static ContractSummaryType[] values() {
        return (ContractSummaryType[]) $VALUES.clone();
    }
}
