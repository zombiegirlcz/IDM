package com.revolut.domain.models.moneyrequest;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/SplitPayerType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "UNDEFINED", "EMAIL", "PHONE", "CODE", "USER_ID", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitPayerType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SplitPayerType[] $VALUES;

    @NotNull
    private final String value;
    public static final SplitPayerType UNDEFINED = new SplitPayerType("UNDEFINED", 0, "UNDEFINED");
    public static final SplitPayerType EMAIL = new SplitPayerType("EMAIL", 1, "EMAIL");
    public static final SplitPayerType PHONE = new SplitPayerType("PHONE", 2, "PHONE");
    public static final SplitPayerType CODE = new SplitPayerType("CODE", 3, "CODE");
    public static final SplitPayerType USER_ID = new SplitPayerType("USER_ID", 4, "USER_ID");

    private static final /* synthetic */ SplitPayerType[] $values() {
        return new SplitPayerType[]{UNDEFINED, EMAIL, PHONE, CODE, USER_ID};
    }

    static {
        SplitPayerType[] splitPayerTypeArr$values = $values();
        $VALUES = splitPayerTypeArr$values;
        $ENTRIES = s.n(splitPayerTypeArr$values);
        INSTANCE = new Companion();
    }

    private SplitPayerType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SplitPayerType valueOf(String str) {
        return (SplitPayerType) Enum.valueOf(SplitPayerType.class, str);
    }

    public static SplitPayerType[] values() {
        return (SplitPayerType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
