package com.revolut.domain.models.support;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/support/TroubleshootingCardOwnerType;", "", "<init>", "(Ljava/lang/String;I)V", "PERSONAL", "JUNIOR", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TroubleshootingCardOwnerType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TroubleshootingCardOwnerType[] $VALUES;
    public static final TroubleshootingCardOwnerType PERSONAL = new TroubleshootingCardOwnerType("PERSONAL", 0);
    public static final TroubleshootingCardOwnerType JUNIOR = new TroubleshootingCardOwnerType("JUNIOR", 1);

    private static final /* synthetic */ TroubleshootingCardOwnerType[] $values() {
        return new TroubleshootingCardOwnerType[]{PERSONAL, JUNIOR};
    }

    static {
        TroubleshootingCardOwnerType[] troubleshootingCardOwnerTypeArr$values = $values();
        $VALUES = troubleshootingCardOwnerTypeArr$values;
        $ENTRIES = s.n(troubleshootingCardOwnerTypeArr$values);
    }

    private TroubleshootingCardOwnerType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TroubleshootingCardOwnerType valueOf(String str) {
        return (TroubleshootingCardOwnerType) Enum.valueOf(TroubleshootingCardOwnerType.class, str);
    }

    public static TroubleshootingCardOwnerType[] values() {
        return (TroubleshootingCardOwnerType[]) $VALUES.clone();
    }
}
