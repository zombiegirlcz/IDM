package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/domain/models/openbanking/OpenBankingConsentsFilter;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "ACTIVE", "INACTIVE", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OpenBankingConsentsFilter {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OpenBankingConsentsFilter[] $VALUES;
    public static final OpenBankingConsentsFilter ALL = new OpenBankingConsentsFilter("ALL", 0);
    public static final OpenBankingConsentsFilter ACTIVE = new OpenBankingConsentsFilter("ACTIVE", 1);
    public static final OpenBankingConsentsFilter INACTIVE = new OpenBankingConsentsFilter("INACTIVE", 2);

    private static final /* synthetic */ OpenBankingConsentsFilter[] $values() {
        return new OpenBankingConsentsFilter[]{ALL, ACTIVE, INACTIVE};
    }

    static {
        OpenBankingConsentsFilter[] openBankingConsentsFilterArr$values = $values();
        $VALUES = openBankingConsentsFilterArr$values;
        $ENTRIES = s.n(openBankingConsentsFilterArr$values);
    }

    private OpenBankingConsentsFilter(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static OpenBankingConsentsFilter valueOf(String str) {
        return (OpenBankingConsentsFilter) Enum.valueOf(OpenBankingConsentsFilter.class, str);
    }

    public static OpenBankingConsentsFilter[] values() {
        return (OpenBankingConsentsFilter[]) $VALUES.clone();
    }
}
