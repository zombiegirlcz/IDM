package com.revolut.domain.models.moneyrequest;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/SplitMoneyRequestStatus;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "UNDEFINED", "SUCCESS", "FAIL", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitMoneyRequestStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SplitMoneyRequestStatus[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final SplitMoneyRequestStatus UNDEFINED = new SplitMoneyRequestStatus("UNDEFINED", 0, "UNDEFINED");
    public static final SplitMoneyRequestStatus SUCCESS = new SplitMoneyRequestStatus("SUCCESS", 1, "SUCCESS");
    public static final SplitMoneyRequestStatus FAIL = new SplitMoneyRequestStatus("FAIL", 2, "FAIL");

    /* JADX INFO: renamed from: com.revolut.domain.models.moneyrequest.SplitMoneyRequestStatus$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private static final /* synthetic */ SplitMoneyRequestStatus[] $values() {
        return new SplitMoneyRequestStatus[]{UNDEFINED, SUCCESS, FAIL};
    }

    static {
        SplitMoneyRequestStatus[] splitMoneyRequestStatusArr$values = $values();
        $VALUES = splitMoneyRequestStatusArr$values;
        $ENTRIES = s.n(splitMoneyRequestStatusArr$values);
        INSTANCE = new Companion();
    }

    private SplitMoneyRequestStatus(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SplitMoneyRequestStatus valueOf(String str) {
        return (SplitMoneyRequestStatus) Enum.valueOf(SplitMoneyRequestStatus.class, str);
    }

    public static SplitMoneyRequestStatus[] values() {
        return (SplitMoneyRequestStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
