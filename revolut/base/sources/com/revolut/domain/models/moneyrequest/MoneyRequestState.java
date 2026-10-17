package com.revolut.domain.models.moneyrequest;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestState;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "UNDEFINED", "ACTIVE", "ACCEPTED", "REJECTED", "EXPIRED", "CANCELLED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoneyRequestState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MoneyRequestState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final MoneyRequestState UNDEFINED = new MoneyRequestState("UNDEFINED", 0, "UNDEFINED");
    public static final MoneyRequestState ACTIVE = new MoneyRequestState("ACTIVE", 1, "ACTIVE");
    public static final MoneyRequestState ACCEPTED = new MoneyRequestState("ACCEPTED", 2, "ACCEPTED");
    public static final MoneyRequestState REJECTED = new MoneyRequestState("REJECTED", 3, "REJECTED");
    public static final MoneyRequestState EXPIRED = new MoneyRequestState("EXPIRED", 4, "EXPIRED");
    public static final MoneyRequestState CANCELLED = new MoneyRequestState("CANCELLED", 5, "CANCELLED");

    /* JADX INFO: renamed from: com.revolut.domain.models.moneyrequest.MoneyRequestState$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static MoneyRequestState a(String type) {
            MoneyRequestState moneyRequestState;
            Intrinsics.checkNotNullParameter(type, "type");
            MoneyRequestState[] moneyRequestStateArrValues = MoneyRequestState.values();
            int length = moneyRequestStateArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    moneyRequestState = null;
                    break;
                }
                moneyRequestState = moneyRequestStateArrValues[i];
                if (Intrinsics.f(type, moneyRequestState.getValue())) {
                    break;
                }
                i++;
            }
            return moneyRequestState == null ? MoneyRequestState.UNDEFINED : moneyRequestState;
        }
    }

    private static final /* synthetic */ MoneyRequestState[] $values() {
        return new MoneyRequestState[]{UNDEFINED, ACTIVE, ACCEPTED, REJECTED, EXPIRED, CANCELLED};
    }

    static {
        MoneyRequestState[] moneyRequestStateArr$values = $values();
        $VALUES = moneyRequestStateArr$values;
        $ENTRIES = s.n(moneyRequestStateArr$values);
        INSTANCE = new Companion();
    }

    private MoneyRequestState(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MoneyRequestState valueOf(String str) {
        return (MoneyRequestState) Enum.valueOf(MoneyRequestState.class, str);
    }

    public static MoneyRequestState[] values() {
        return (MoneyRequestState[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
